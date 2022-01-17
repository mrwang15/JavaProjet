package com.yonyou.day08.bank;

import com.yonyou.day08.bank.AccountDetails;

import java.math.BigDecimal;

/**
 * @Author 王佳鹏
 * @Date 2022/1/5 18:17
 * @Description
 *   银行账户类
 */
public class Account {

    //银行账号(只读)
    private String account;
    //密码

    private String password;

    //余额
    private BigDecimal balance;

    //交易明细（只读）
    private AccountDetails[] accountDetails;

    //明细下标 (读写都不行)
    private int index=0;

    public Account(String account, String password, BigDecimal balance, AccountDetails[] accountDetails) {
        this.account = account;
        this.password = password;
        this.balance = balance;
        this.accountDetails = accountDetails;
    }

    public Account() {
    }

    public String getAccount() {
        return account;
    }

    public String getPassword() {
        return password;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public AccountDetails[] getAccountDetails() {
        return accountDetails;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    /**
     * 交易明细添加
     * @param accountDetail 添加的明细
     */
    public void addDetails(AccountDetails accountDetail){
        if (index<accountDetails.length){
            accountDetails[index] =accountDetail;
            index++;
        }else {
            int length= (accountDetails.length)*2;
            AccountDetails[] accountDetails1= new AccountDetails[length];
            for (int a=0; a<accountDetails.length;a++){
                accountDetails1[a]= accountDetails[a];
            }
            accountDetails1[index] =accountDetail;
            accountDetails =accountDetails1;
            index++;
        }

    }

}
