package com.yonyou.day08.bank;

import com.yonyou.day08.bank.Account;
import com.yonyou.day08.bank.AccountDetails;
import com.yonyou.day08.bank.BankCard;
import com.yonyou.day08.bank.User;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * @Author 王佳鹏
 * @Date 2022/1/5 18:17
 * @Description
 *      ATM机类
 */
public class ATM {
    //银行账户数组  只读
    private Account[] account;

    //银行的名称  只读
    private String bankName;

    //交易的网点 只读
    private String address;

    public ATM() {

        System.out.println("请输入初始化账号数量");
        Scanner scanner= new Scanner(System.in);
        int count = scanner.nextInt();
        account = new Account[count];
        //初始化银行账户数组
        for (int i=0;i<count;i++){
            account[i]= new Account("6217 0000 0000 000"+i,"000000",new BigDecimal(0),new AccountDetails[1]);
        }
        System.out.println("请输入银行名字");
        String bankName = scanner.next();
        this.bankName = bankName;
        System.out.println("请输入交易网点");
        String address = scanner.next();
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
     * 欢迎页面
     */
    private static void welcome() {
        System.out.println("*********************************");
        System.out.println();
        System.out.println("欢迎光临众创梦工厂ATM机系统。。。");
        System.out.println();
        System.out.println("*********************************");
    }

    /**
     *  登录验证
     * @param bankCard 插入的银行卡
     * @param user   用户
     * @return
     */
    private boolean validatePassword(BankCard bankCard, User user) {
        System.out.println("请输入您的密码");
        //输密码的次数
        for (int count=0;count<3;count++){
            String password = user.inputPassword();
            if (bankCard.getAccount().getPassword().equals(password)){
                return true;
            }else {
                System.out.println("密码错误，请重新输入");
            }
        }
        System.out.println("您输入密码错误超过3次，您的账号被冻结了");
        return  false;


    }

    /**
     * 打印余额
     * @param bankCard 银行卡
     */
    public void print(BankCard bankCard){
        System.out.println("账户余额是"+bankCard.getAccount().getBalance());
    }

        /**
         * 取款方法
         * @param bankCard 银行卡
         * @param user      用户
         */
    private void withdraw(BankCard bankCard, User user) {
        System.out.println("请输入取款金额");
        BigDecimal money = user.inputMoney();
        BigDecimal balance = bankCard.getAccount().getBalance();
        if (balance.compareTo(money) > -1){
            BigDecimal balance1 = balance.subtract(money);
            bankCard.getAccount().setBalance(balance1);
            AccountDetails accountDetails = new AccountDetails(new SimpleDateFormat("yyyy-MM-dd :hh:mm:ss").format(new Date()), money, "取款",bankCard.getAccount().getBalance());
            bankCard.getAccount().addDetails(accountDetails);
        }else {
            System.out.println("余额不足");
        }

    }

    /**
     * 存款方法
     * @param bankCard 银行卡
     * @param user      用户
     */
    private void deposit(BankCard bankCard, User user) {
        System.out.println("请输入存款金额");
        BigDecimal money = user.inputMoney();
        BigDecimal balance = bankCard.getAccount().getBalance();
        BigDecimal bigDecimal =balance.add(money);
        bankCard.getAccount().setBalance(bigDecimal);
        AccountDetails accountDetails = new AccountDetails(new SimpleDateFormat("yyyy-MM-dd :hh:mm:ss").format(new Date()), money, "存款",bankCard.getAccount().getBalance());
        bankCard.getAccount().addDetails(accountDetails);

    }

    /**
      * 打印交易明细
     * @param bankCard 银行卡
     */
    private void queryDetails(BankCard bankCard) {
        Account account = bankCard.getAccount();
        AccountDetails[] accounts = account.getAccountDetails();
        for(AccountDetails ad : accounts) {
            if(ad == null) {
                return;
            }
            //交易日期、交易金额、交易类型、账户余额
            System.out.println("交易日期：" + ad.getDate() + "   交易金额：" +
                    ad.getMoney() + "交易类型：" + ad.getType() + "   账户余额：" + ad.getAfterBalance());
        }
    }

    /**
     * 转账
     * @param bankCard 银行卡
     */
    private void transfer(BankCard bankCard,User user) {
        System.out.println("请输入转账账号:");
        String accountId = user.inputAccountId();
        if(accountId==null){
            System.out.println("您输入的账号为空");
        }
        for (int i=0;i<account.length;i++){
        if (account[i].getAccount().equals(accountId)){
            System.out.println("请输入转账金额:");
            BigDecimal money = user.inputMoney();

            if(bankCard.getAccount().getBalance().compareTo(money) == -1) {
                System.out.println("您的余额不足，不能转账");
            }else {
                BigDecimal balance = bankCard.getAccount().getBalance().subtract(money);
                bankCard.getAccount().setBalance(balance);
                BigDecimal targetAccountBalance = account[i].getBalance().add(money);
                account[i].setBalance(targetAccountBalance);
                System.out.println("转账成功！");

                AccountDetails accountDetails = new AccountDetails(new SimpleDateFormat("yyyy-MM-dd :hh:mm:ss").format(new Date()), money, "转账",bankCard.getAccount().getBalance());
                bankCard.getAccount().addDetails(accountDetails);
            }
        }
        }
        System.out.println("没有这个账号");
    }

    /**
     * 修改密码
     * @param bankCard 银行卡
     * @param user  密码
     */

    private void changePassword(BankCard bankCard,User user) {
        System.out.println("请输入原密码密码:");
        boolean yanZheng = validatePassword(bankCard, user);
        while (true) {
            if (yanZheng) {
                System.out.println("请输入新密码");
                String password1 = user.inputPassword();
                System.out.println("请在输入一遍");
                String passward2 = user.inputPassword();
                if (passward2.equals(password1)) {
                    bankCard.getAccount().setPassword(password1);
                    System.out.println("修改成功");
                    return;
                } else {
                    System.out.println("两次输入的新密码不一样，请重新输入");
                }

            }
        }
    }

    /**
     *工作
     */
    public void work(BankCard bankCard,User user) {
        welcome();
        boolean b = validatePassword(bankCard, user);
        while (b){
            System.out.println("请选择您要进行的操作：");
            System.out.println("1、打印交易明细\n2、打印余额\n3、存款\n4、取款\n5、转账\n6、修改密码\n7、退卡");
            Scanner scanner = new Scanner(System.in);
            int cuozuo = scanner.nextInt();
            switch (cuozuo){
                case 1:queryDetails(bankCard);
                break;
                case 2:print(bankCard);
                break;
                case 3:deposit(bankCard,user);
                break;
                case 4:withdraw(bankCard,user);
                break;
                case 5:transfer(bankCard,user);
                break;
                case 6:changePassword(bankCard,user);
                break;
                case 7:
                    return;
                default:
                    System.out.println("操作不成功，请重新输入");

            }

        }

    }





    }
