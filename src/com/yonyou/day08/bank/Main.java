package com.yonyou.day08.bank;

import com.yonyou.day08.bank.ATM;
import com.yonyou.day08.bank.Account;
import com.yonyou.day08.bank.AccountDetails;
import com.yonyou.day08.bank.BankCard;
import com.yonyou.day08.bank.User;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 * @Author ������
 * @Date 2022/1/5 18:15
 * @Description
 *  ���
 */
public class Main {

    public static void main(String[] args) {

       ATM atm = new ATM();
            User user = initUser(atm);
            BankCard bankCard = user.insertCard();
            atm.work(bankCard,user);
    }


    /**
     * ��ʼ�����е��˻�
     * @param atm atm��Ա��
     * @return ���ر���ʼ�����û�
     */
    public static User initUser(ATM atm) {
        System.out.println("===========���ע��===========");
        Scanner scanner = new Scanner(System.in);
        System.out.println("������������");
        String name = scanner.next();
        System.out.println("�������Ա�");
        String sex = scanner.next();
        System.out.println("���������֤�ţ�");
        String idCard = scanner.next();
        System.out.println("������绰���룺");
        String tel = scanner.next();
        Account account = atm.getAccount()[0];
        BankCard bankCard = new BankCard(account);
        User user = new User(name, sex, idCard, tel, bankCard);
        System.out.println("���ĳ�ʼ����Ϊ000000���뼰ʱ��������");
        return user;

    }

}
