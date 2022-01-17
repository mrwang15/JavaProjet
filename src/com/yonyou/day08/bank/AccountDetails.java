package com.yonyou.day08.bank;

import java.math.BigDecimal;

/**
 * @Author ������
 * @Date 2022/1/5 18:17
 * @Description
 *      �����˻�����ϸ��
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
