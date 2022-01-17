package com.yonyou.day08;

import java.math.BigDecimal;
/**
 * @Author ������
 * @Date 2022/1/5 16:07
 * @Description
 * �����˻���
 */
public class Account {
    //�˺ţ�ֻ����
    private String account;
    //����
    private String password;
    //���
    private BigDecimal balance;
    //���׵���ϸ��ֻ����
    private AccountDetails[] accountDetails;
    //��ϸ�±�
    private int i=0;

    public Account() {
    }

    public Account(String account, String password, BigDecimal balance, AccountDetails[] accountDetails) {
        this.account = account;
        this.password = password;
        this.balance = balance;
        this.accountDetails = accountDetails;
    }

    public String getAccount() {
        return account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public AccountDetails[] getAccountDetails() {
        return accountDetails;
    }

    /**
     * ������ϸ���
     * @param accountDetail ��ӵ���ϸ
     */
    public void addDetails(AccountDetails accountDetail){
        if (i<accountDetails.length){
            accountDetails[i] =accountDetail;
            i++;
        }else {
            int length= accountDetails.length*2;
            AccountDetails[] accountDetails1= new AccountDetails[length];
            for (int a=0; a<accountDetails.length;a++){
                accountDetails1[a]= accountDetails1[a];
            }
            accountDetails[i] =accountDetail;
            i++;
        }

    }

}

