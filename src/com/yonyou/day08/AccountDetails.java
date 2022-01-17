package com.yonyou.day08;

import java.math.BigDecimal;
import java.util.Date;
/**
 * @Author 王佳鹏
 * @Date 2022/1/5 16:06
 * @Description
 * 银行账户的明细类
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

    public AccountDetails() {
    }

    public AccountDetails(String date, BigDecimal money, String type,BigDecimal afterBalance) {
        this.date = date;
        this.money = money;
        this.type = type;
        this.afterBalance=afterBalance;
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

