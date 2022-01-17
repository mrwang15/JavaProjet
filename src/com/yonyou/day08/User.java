package com.yonyou.day08;

import com.sun.deploy.security.SandboxSecurity;
import java.math.BigDecimal;
import java.util.Scanner;

/**
 * @Author 王佳鹏
 * @Date 2022/1/5 16:10
 * @Description
 * 用户类
 */
public class User {
    //用户的姓名 只读
    private String name;
    //用户的性别  只读
    private String sex;
    //用户的身份证号  只读
    private String idCard;
    //用户的电话 读写
    private String tel;
    //用户的银行卡 只读
    private BankCard bankCard;

    public User() {
    }

    public User(String name, String sex, String idCard, String tel, BankCard bankCard) {
        this.name = name;
        this.sex = sex;
        this.idCard = idCard;
        this.tel = tel;
        this.bankCard = bankCard;
    }

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public String getIdCard() {
        return idCard;
    }

    public String getTel() {
        return tel;
    }

    public BankCard getBankCard() {
        return bankCard;
    }

    /**
     * 设置银行卡
     * @param bankCard
     */
    public void setBankCard(BankCard bankCard) {
        this.bankCard = bankCard;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    /**
     * 插入银行卡
     * @return
     */
    public BankCard insertCard(){
        return bankCard;
    }

    /**
     * 用户输入密码
     * @return 返回用户输入的密码
     */
    public String inputPassword() {
        Scanner input = new Scanner(System.in);
        return input.next();
    }

    /**
     * 输入交易金额
     * @return
     */
    public BigDecimal inputMoney() {
        Scanner input = new Scanner(System.in);
        double v = input.nextDouble();
        return new BigDecimal(v);
    }

    /**
     * 输入账户
     * @return
     */
    public String inputAccountId() {
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }

}
