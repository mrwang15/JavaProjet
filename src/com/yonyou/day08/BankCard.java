package com.yonyou.day08;

/**
 * @Author ������
 * @Date 2022/1/5 16:08
 * @Description
 * ���п���
 */
public class BankCard {
    //���׵��˻�
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