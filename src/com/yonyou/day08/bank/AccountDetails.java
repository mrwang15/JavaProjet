package com.yonyou.day08.bank;

import java.math.BigDecimal;

/**
 * @Author 王佳鹏
 * @Date 2022/1/5 18:17
 * @Description
 *      银行账户的明细类
 */
public class AccountDetails {

    //交易的日期 只读
    private String date;

    //交易的金额 只读
    private BigDecimal money;

    //交易的类型 只读
    private String type;

    //交易后的余额
    private BigDecimal afterBalance;

    public AccountDetails(String date, BigDecimal money, String type, BigDecimal afterBalance) {
        this.date = date;
        this.money = money;
        this.type = type;
        this.afterBalance = afterBalance;
    }

    public AccountDetails() {
    }

    public String getDate() {
        return date;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public String getType() {
        return type;
    }

    public BigDecimal getAfterBalance() {
        return afterBalance;
    }




}
