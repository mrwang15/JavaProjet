package com.yonyou.day08;

import java.math.BigDecimal;
import java.util.Date;
/**
 * @Author ������
 * @Date 2022/1/5 16:06
 * @Description
 * �����˻�����ϸ��
 */
public class AccountDetails {
    //���׵����� ֻ��
    private String date;
    //���׵Ľ�� ֻ��
    private BigDecimal money;
    //���׵����� ֻ��
    private String type;
    //���׺�����
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

