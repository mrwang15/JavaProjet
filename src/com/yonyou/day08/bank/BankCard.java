package com.yonyou.day08.bank;

/**
 * @Author ������
 * @Date 2022/1/5 18:17
 * @Description
 *      ���п���
 */
public class BankCard {
    //���п��˺�
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
