package com.yonyou.day08.bank;

import com.yonyou.day08.bank.BankCard;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 * @Author 王佳鹏
 * @Date 2022/1/5 18:18
 * @Description
 *  用户
 */
public class User {

    //用户的姓名 只读
    private String name;

    //用户的性别  只读
    private String sex;

    //用户的身份证号  只读
    private String idCard;

    //用户的电话
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
     * 插卡操作
     * @return  银行卡卡号
     */
    public BankCard insertCard(){
        return bankCard;
    }

    /**
     * 输入密码
     * @return 用户的密码
     */
    public String inputPassword() {
        Scanner input = new Scanner(System.in);
        return input.next();
    }

    /**
     * 输入交易金额
     * @return 交易金额
     */
    public BigDecimal inputMoney() {
        Scanner input = new Scanner(System.in);
        double v = input.nextDouble();
        return new BigDecimal(v);
    }

    /**
     * 输入账户(转账操作)
     * @return 账号
     */
    public String inputAccountId() {
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }


    /**
     * 拔卡操作
     */
    public void cardPulling(){
        System.out.println("欢迎下次光临");
    }









}
