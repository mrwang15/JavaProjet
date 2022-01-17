package com.yonyou.day08;

import java.math.BigDecimal;

/**
 * @Author 王佳鹏
 * @Date 2022/1/5 16:12
 * @Description
 * 程序入口类
 */
public class Main {

    public static void main(String[] args) {
        welcome();
        ATM atm = initBank();
        User user = initUser(atm);
        BankCard bankCard = user.insertCard();
        atm.work(bankCard,user);
    }

    /**
     * 打印欢迎信息
     */
    private static void welcome() {
        System.out.println("*********************************");
        System.out.println();
        System.out.println("欢迎光临众创梦工厂ATM机系统。。。");
        System.out.println();
        System.out.println("*********************************");
    }

    /**
     * 初始化银行
     */
    private static ATM initBank() {
        Account[] accounts = new Account[10];
        //初始化银行账户数组
        accounts[0] = new Account("6217 0001 3001 8671","000000",new BigDecimal(0),new AccountDetails[100]);
        accounts[1] = new Account("6217 0001 3001 8672","000000",new BigDecimal(0),new AccountDetails[100]);
        accounts[2] = new Account("6217 0001 3001 8673","000000",new BigDecimal(0),new AccountDetails[100]);
        accounts[3] = new Account("6217 0001 3001 8674","000000",new BigDecimal(0),new AccountDetails[100]);
        accounts[4] = new Account("6217 0001 3001 8675","000000",new BigDecimal(0),new AccountDetails[100]);
        accounts[5] = new Account("6217 0001 3001 8676","000000",new BigDecimal(0),new AccountDetails[100]);
        accounts[6] = new Account("6217 0001 3001 8677","000000",new BigDecimal(0),new AccountDetails[100]);
        accounts[7] = new Account("6217 0001 3001 8678","000000",new BigDecimal(0),new AccountDetails[100]);
        accounts[8] = new Account("6217 0001 3001 8679","000000",new BigDecimal(0),new AccountDetails[100]);
        accounts[9] = new Account("6217 0001 3001 8670","000000",new BigDecimal(0),new AccountDetails[100]);
        //创建一个ATM机器对象
        ATM atm = new ATM(accounts,"中国建设银行石家庄桥西区众创梦工厂分行","桥西区众创梦工厂205");
        return atm;
    }

    /**
     * 初始化银行的账户
     * @param atm atm柜员机
     * @return 返回被初始化的用户
     */
    public static User initUser(ATM atm) {
        //我取出atm当中的第一个账户存入到Account对象当中
        Account account = atm.getAccount()[0];
        BankCard bankCard = new BankCard(account);
        //String name, String sex, String idCard, String tel, BankCard bankCard
        User user = new User("张三","男","130102198605060319","13833215967",bankCard);
        return user;
    }
}
