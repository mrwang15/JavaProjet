package com.yonyou.day08;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
/**
 * @Author 王佳鹏
 * @Date 2022/1/5 16:08
 * @Description
 * ATM机类
 */
public class ATM {
    //银行账户数组  只读
    private Account[] account;
    //银行的名称  只读
    private String bankName;
    //交易的网点 只读
    private String address;

    //默认无参构造方法
    public ATM() {
    }

    /**
     * 带参数的构造方法
     * @param account
     * @param bankName
     * @param address
     */
    public ATM(Account[] account, String bankName, String address) {
        this.account = account;
        this.bankName = bankName;
        this.address = address;
    }

    public Account[] getAccount() {
        return account;
    }

    public String getBankName() {
        return bankName;
    }

    public String getAddress() {
        return address;
    }

    /**
     * 查询该银行卡的交易明细
     * @param bankCard
     */
    private void queryDetails(BankCard bankCard) {
        Account account = bankCard.getAccount();
        AccountDetails[] accounts = account.getAccountDetails();
        for(AccountDetails ad : accounts) {
            if(ad == null) {
                return;
            }
            //交易日期、交易金额、交易类型、账户余额
            System.out.println("交易日期：" + ad.getDate() + "交易金额：" +
                    ad.getMoney() + "交易类型：" + ad.getType() + "账户余额：" + ad.getAfterBalance());
        }
    }

    /**
     * 存款
     * @param bankCard
     */
    private void deposit(BankCard bankCard,User user) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入存款的金额：");
        BigDecimal money = user.inputMoney();
        BigDecimal bigDecimal = bankCard.getAccount().getBalance().add(money);
        bankCard.getAccount().setBalance(bigDecimal);
        AccountDetails accountDetails = new AccountDetails(new SimpleDateFormat("yyyy-MM-dd :hh:mm:ss").format(new Date()), money, "存款",bankCard.getAccount().getBalance());
        bankCard.getAccount().addDetails(accountDetails);
    }

    /**
     * 取款
     * @param bankCard
     */
    private void withdrawal(BankCard bankCard,User user) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入取款的金额：");
        BigDecimal money = user.inputMoney();
        if(bankCard.getAccount().getBalance().compareTo(money) == -1) {
            System.out.println("余额不足，无法取款");
        }else {
            BigDecimal bigDecimal = bankCard.getAccount().getBalance().subtract(money);
            bankCard.getAccount().setBalance(bigDecimal);
            AccountDetails accountDetails = new AccountDetails(new SimpleDateFormat("yyyy-MM-dd :hh:mm:ss").format(new Date()), money, "取款",bankCard.getAccount().getBalance());
            bankCard.getAccount().addDetails(accountDetails);
        }


    }

    /**
     * 转账
     * @param bankCard
     */
    private void transfer(BankCard bankCard,User user) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入要转账的账户");
        String accountId = user.inputAccountId();
        Account targetAccount = getTargetAccount(accountId);
        if(targetAccount == null) {
            System.out.println("目标账户不存在");
        }else {
            System.out.println("请输入要转账的金额");
            BigDecimal money = user.inputMoney();
            if(bankCard.getAccount().getBalance().compareTo(money) == -1) {
                System.out.println("您的余额不足，不能转账");
            }else {
                BigDecimal balance = bankCard.getAccount().getBalance().subtract(money);
                bankCard.getAccount().setBalance(balance);
                BigDecimal targetAccountBalance = targetAccount.getBalance().add(money);
                targetAccount.setBalance(targetAccountBalance);
                System.out.println("转账成功！");

                AccountDetails accountDetails = new AccountDetails(new SimpleDateFormat("yyyy-MM-dd :hh:mm:ss").format(new Date()), money, "转账",bankCard.getAccount().getBalance());
                bankCard.getAccount().addDetails(accountDetails);

            }
        }


    }

    /**
     * 查找目标账户
     * @param accountId
     * @return
     */
    private Account getTargetAccount(String accountId) {
        //遍历账户的数组，如果找到则返回对应的账户
        for(Account acc : account) {
            if(acc.getAccount().equals(accountId)) {
                return acc;
            }
        }
        return null;
    }

    /**
     * 修改密码
     * 1、先输入原始的密码
     * 2、判断输入的原始密码是否正确
     * 3、如果密码正确则修改密码
     *     a、输入新密码
     *     b、再次输入新密码
     *     c、新密码不能与之前的密码相同
     * @param bankCard
     */
    private void changePassword(BankCard bankCard,User user) {
        Scanner input = new Scanner(System.in);
        //验证密码是否正确
        boolean valdatePassword = validatePassword(bankCard,user);
        if (!valdatePassword) {
            System.out.println("您三次输入密码均为错误，无法修改密码");
        }else {
            String newPass = null;
            String newPass1 = null;
            boolean tag = false;
            do {
                int cnt = 0;  //计数器变量
                do {
                    if (cnt > 0) {
                        System.out.println("新密码与原密码不能一致");
                    }
                    System.out.println("请输入新密码");
                    newPass = user.inputPassword();
                    cnt++;
                } while (bankCard.getAccount().getPassword().equals(newPass));
                System.out.println("请再次输入一遍密码：");
                newPass1 = user.inputPassword();
                if(!newPass.equals(newPass1)) {
                    System.out.println("两次密码不一致，请重新输入");
                    tag = true;
                }else {
                    tag = false;
                }
            }while(tag);
            bankCard.getAccount().setPassword(newPass);
            System.out.println("修改密码成功！");
        }
    }

    /**
     * ATM机工作的方法
     * 查询交易明细
     * 打印
     * 展示菜单
     * 存款
     * 取款
     * 转账
     * 修改密码
     */
    public void work(BankCard bankCard,User user) {
        Scanner input = new Scanner(System.in);
        if(login(bankCard,user)) {
            end:
            while(true) {
                System.out.println("请选择您要进行的操作：");
                System.out.println("1、查询交易明细\n2、打印\n3、存款");
                System.out.println("4、取款\n5、转账\n6、修改密码\n7、退卡");
                int select = input.nextInt();
                switch (select) {
                    case 1:
                        //查询明细
                        System.out.println("查询明细");
                        queryDetails(bankCard);
                        break;
                    case 2:
                        //打印
                        System.out.println("打印余额");
                        System.out.println(bankCard.getAccount().getBalance());
                        break;
                    case 3:
                        //存款
                        System.out.println("存款");
                        deposit(bankCard,user);
                        break;
                    case 4:
                        //取款
                        System.out.println("取款");
                        withdrawal(bankCard,user);
                        break;
                    case 5:
                        //转账
                        System.out.println("转账");
                        transfer(bankCard,user);
                        break;
                    case 6:
                        //修改密码
                        System.out.println("修改密码");
                        changePassword(bankCard,user);
                        break;
                    case 7:
                        //退出菜单
                        System.out.println("欢迎下次再来");
                        break end;
                    default:
                        System.out.println("您输入的操作不正确,请重新输入");
                }
            }
        }
    }

    /**
     * 完成用户的登录功能
     * 场景：
     * 1、要求用户输入密码
     * 2、验证密码
     * 3、如果密码不正确则提示用户重新输入
     * 4、如果登录成功则返回true，否则返回false
     * 5、如果用户三次登录都失败则吞卡（没收用户手里的卡）
     * @param bankCard 要插入的银行卡
     * @param user 要登录的用户
     * @return
     */
    public boolean login(BankCard bankCard,User user) {
        String inputPassword = null;
        if (validatePassword(bankCard, user)) return true;
        System.out.println("您三次密码输入都是错误的，您的卡被吞了");
        user.setBankCard(null);
        return false;
    }

    /**
     * 验证密码的方法
     * @param bankCard
     * @param user
     * @return
     */
    private boolean validatePassword(BankCard bankCard, User user) {
        String inputPassword;
        int cnt = 0; //计数器变量，用来判断用户输入的密码次数
        while(cnt < 3) {
            if(cnt == 0) {
                System.out.println("请输入密码：");
            }else {
                System.out.println("您输入的密码不正确，请重新输入");
            }
            inputPassword = user.inputPassword();
            if(bankCard.getAccount().getPassword().equals(inputPassword)) {
                return true;
            }
            cnt++;
        }
        return false;
    }
}
