package com.yonyou.day08.bank;

import com.yonyou.day08.bank.BankCard;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 * @Author ������
 * @Date 2022/1/5 18:18
 * @Description
 *  �û�
 */
public class User {

    //�û������� ֻ��
    private String name;

    //�û����Ա�  ֻ��
    private String sex;

    //�û������֤��  ֻ��
    private String idCard;

    //�û��ĵ绰
    private String tel;

    //�û������п� ֻ��
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
     * �忨����
     * @return  ���п�����
     */
    public BankCard insertCard(){
        return bankCard;
    }

    /**
     * ��������
     * @return �û�������
     */
    public String inputPassword() {
        Scanner input = new Scanner(System.in);
        return input.next();
    }

    /**
     * ���뽻�׽��
     * @return ���׽��
     */
    public BigDecimal inputMoney() {
        Scanner input = new Scanner(System.in);
        double v = input.nextDouble();
        return new BigDecimal(v);
    }

    /**
     * �����˻�(ת�˲���)
     * @return �˺�
     */
    public String inputAccountId() {
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }


    /**
     * �ο�����
     */
    public void cardPulling(){
        System.out.println("��ӭ�´ι���");
    }









}
