package com.yonyou.day08;

import java.math.BigDecimal;

/**
 * @Author ������
 * @Date 2022/1/5 16:12
 * @Description
 * ���������
 */
public class Main {

    public static void main(String[] args) {
        welcome();
        ATM atm = initBank();
        User user = initUser(atm);
        BankCard bankCard = user.insertCard();
        atm.work(bankCard,user);
    }

    /**
     * ��ӡ��ӭ��Ϣ
     */
    private static void welcome() {
        System.out.println("*********************************");
        System.out.println();
        System.out.println("��ӭ�����ڴ��ι���ATM��ϵͳ������");
        System.out.println();
        System.out.println("*********************************");
    }

    /**
     * ��ʼ������
     */
    private static ATM initBank() {
        Account[] accounts = new Account[10];
        //��ʼ�������˻�����
        accounts[0] = new Account("6217 0001 3001 8671","000000",new BigDecimal(0),new AccountDetails[100]);
        accounts[1] = new Account("6217 0001 3001 8672","000000",new BigDecimal(0),new AccountDetails[100]);
        accounts[2] = new Account("6217 0001 3001 8673","000000",new BigDecimal(0),new AccountDetails[100]);
        accounts[3] = new Account("6217 0001 3001 8674","000000",new BigDecimal(0),new AccountDetails[100]);
        accounts[4] = new Account("6217 0001 3001 8675","000000",new BigDecimal(0),new AccountDetails[100]);
        accounts[5] = new Account("6217 0001 3001 8676","000000",new BigDecimal(0),new AccountDetails[100]);
        accounts[6] = new Account("6217 0001 3001 8677","000000",new BigDecimal(0),new AccountDetails[100]);
        accounts[7] = new Account("6217 0001 3001 8678","000000",new BigDecimal(0),new AccountDetails[100]);
        accounts[8] = new Account("6217 0001 3001 8679","000000",new BigDecimal(0),new AccountDetails[100]);
        accounts[9] = new Account("6217 0001 3001 8670","000000",new BigDecimal(0),new AccountDetails[100]);
        //����һ��ATM��������
        ATM atm = new ATM(accounts,"�й���������ʯ��ׯ�������ڴ��ι�������","�������ڴ��ι���205");
        return atm;
    }

    /**
     * ��ʼ�����е��˻�
     * @param atm atm��Ա��
     * @return ���ر���ʼ�����û�
     */
    public static User initUser(ATM atm) {
        //��ȡ��atm���еĵ�һ���˻����뵽Account������
        Account account = atm.getAccount()[0];
        BankCard bankCard = new BankCard(account);
        //String name, String sex, String idCard, String tel, BankCard bankCard
        User user = new User("����","��","130102198605060319","13833215967",bankCard);
        return user;
    }
}
