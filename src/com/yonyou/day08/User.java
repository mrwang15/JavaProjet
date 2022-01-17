package com.yonyou.day08;

import com.sun.deploy.security.SandboxSecurity;
import java.math.BigDecimal;
import java.util.Scanner;

/**
 * @Author ������
 * @Date 2022/1/5 16:10
 * @Description
 * �û���
 */
public class User {
    //�û������� ֻ��
    private String name;
    //�û����Ա�  ֻ��
    private String sex;
    //�û������֤��  ֻ��
    private String idCard;
    //�û��ĵ绰 ��д
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
     * �������п�
     * @param bankCard
     */
    public void setBankCard(BankCard bankCard) {
        this.bankCard = bankCard;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    /**
     * �������п�
     * @return
     */
    public BankCard insertCard(){
        return bankCard;
    }

    /**
     * �û���������
     * @return �����û����������
     */
    public String inputPassword() {
        Scanner input = new Scanner(System.in);
        return input.next();
    }

    /**
     * ���뽻�׽��
     * @return
     */
    public BigDecimal inputMoney() {
        Scanner input = new Scanner(System.in);
        double v = input.nextDouble();
        return new BigDecimal(v);
    }

    /**
     * �����˻�
     * @return
     */
    public String inputAccountId() {
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }

}
