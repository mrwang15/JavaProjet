package com.yonyou.day08;

import java.math.BigDecimal;
/**
 * @Author 王佳鹏
 * @Date 2022/1/5 16:07
 * @Description
 * 银行账户类
 */
public class Account {
    //账号（只读）
    private String account;
    //密码
    private String password;
    //余额
    private BigDecimal balance;
    //交易的明细（只读）
    private AccountDetails[] accountDetails;
    //明细下标
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
     * 交易明细添加
     * @param accountDetail 添加的明细
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

