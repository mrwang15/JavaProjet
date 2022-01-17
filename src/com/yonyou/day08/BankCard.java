package com.yonyou.day08;

/**
 * @Author 王佳鹏
 * @Date 2022/1/5 16:08
 * @Description
 * 银行卡类
 */
public class BankCard {
    //交易的账户
    private Account account;

    public BankCard() {
    }

    public BankCard(Account account) {
        this.account = account;
    }

    public Account getAccount() {
        return account;
    }
}