package com.yonyou.day08.bank;

/**
 * @Author 王佳鹏
 * @Date 2022/1/5 18:17
 * @Description
 *      银行卡类
 */
public class BankCard {
    //银行卡账号
    private Account account;

    public BankCard(Account account) {
        this.account = account;
    }

    public BankCard() {
    }

    public Account getAccount() {
        return account;
    }
}
