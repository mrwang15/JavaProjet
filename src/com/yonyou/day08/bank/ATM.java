package com.yonyou.day08.bank;

import com.yonyou.day08.bank.Account;
import com.yonyou.day08.bank.AccountDetails;
import com.yonyou.day08.bank.BankCard;
import com.yonyou.day08.bank.User;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * @Author ������
 * @Date 2022/1/5 18:17
 * @Description
 *      ATM����
 */
public class ATM {
    //�����˻�����  ֻ��
    private Account[] account;

    //���е�����  ֻ��
    private String bankName;

    //���׵����� ֻ��
    private String address;

    public ATM() {

        System.out.println("�������ʼ���˺�����");
        Scanner scanner= new Scanner(System.in);
        int count = scanner.nextInt();
        account = new Account[count];
        //��ʼ�������˻�����
        for (int i=0;i<count;i++){
            account[i]= new Account("6217 0000 0000 000"+i,"000000",new BigDecimal(0),new AccountDetails[1]);
        }
        System.out.println("��������������");
        String bankName = scanner.next();
        this.bankName = bankName;
        System.out.println("�����뽻������");
        String address = scanner.next();
        this.address = address;

    }

    public Account[] getAccount() {
        return account;
    }

    public String getBankName() {
        return bankName;
    }

    public String getAddress() {
        return address;
    }

    /**
     * ��ӭҳ��
     */
    private static void welcome() {
        System.out.println("*********************************");
        System.out.println();
        System.out.println("��ӭ�����ڴ��ι���ATM��ϵͳ������");
        System.out.println();
        System.out.println("*********************************");
    }

    /**
     *  ��¼��֤
     * @param bankCard ��������п�
     * @param user   �û�
     * @return
     */
    private boolean validatePassword(BankCard bankCard, User user) {
        System.out.println("��������������");
        //������Ĵ���
        for (int count=0;count<3;count++){
            String password = user.inputPassword();
            if (bankCard.getAccount().getPassword().equals(password)){
                return true;
            }else {
                System.out.println("�����������������");
            }
        }
        System.out.println("������������󳬹�3�Σ������˺ű�������");
        return  false;


    }

    /**
     * ��ӡ���
     * @param bankCard ���п�
     */
    public void print(BankCard bankCard){
        System.out.println("�˻������"+bankCard.getAccount().getBalance());
    }

        /**
         * ȡ���
         * @param bankCard ���п�
         * @param user      �û�
         */
    private void withdraw(BankCard bankCard, User user) {
        System.out.println("������ȡ����");
        BigDecimal money = user.inputMoney();
        BigDecimal balance = bankCard.getAccount().getBalance();
        if (balance.compareTo(money) > -1){
            BigDecimal balance1 = balance.subtract(money);
            bankCard.getAccount().setBalance(balance1);
            AccountDetails accountDetails = new AccountDetails(new SimpleDateFormat("yyyy-MM-dd :hh:mm:ss").format(new Date()), money, "ȡ��",bankCard.getAccount().getBalance());
            bankCard.getAccount().addDetails(accountDetails);
        }else {
            System.out.println("����");
        }

    }

    /**
     * ����
     * @param bankCard ���п�
     * @param user      �û�
     */
    private void deposit(BankCard bankCard, User user) {
        System.out.println("����������");
        BigDecimal money = user.inputMoney();
        BigDecimal balance = bankCard.getAccount().getBalance();
        BigDecimal bigDecimal =balance.add(money);
        bankCard.getAccount().setBalance(bigDecimal);
        AccountDetails accountDetails = new AccountDetails(new SimpleDateFormat("yyyy-MM-dd :hh:mm:ss").format(new Date()), money, "���",bankCard.getAccount().getBalance());
        bankCard.getAccount().addDetails(accountDetails);

    }

    /**
      * ��ӡ������ϸ
     * @param bankCard ���п�
     */
    private void queryDetails(BankCard bankCard) {
        Account account = bankCard.getAccount();
        AccountDetails[] accounts = account.getAccountDetails();
        for(AccountDetails ad : accounts) {
            if(ad == null) {
                return;
            }
            //�������ڡ����׽��������͡��˻����
            System.out.println("�������ڣ�" + ad.getDate() + "   ���׽�" +
                    ad.getMoney() + "�������ͣ�" + ad.getType() + "   �˻���" + ad.getAfterBalance());
        }
    }

    /**
     * ת��
     * @param bankCard ���п�
     */
    private void transfer(BankCard bankCard,User user) {
        System.out.println("������ת���˺�:");
        String accountId = user.inputAccountId();
        if(accountId==null){
            System.out.println("��������˺�Ϊ��");
        }
        for (int i=0;i<account.length;i++){
        if (account[i].getAccount().equals(accountId)){
            System.out.println("������ת�˽��:");
            BigDecimal money = user.inputMoney();

            if(bankCard.getAccount().getBalance().compareTo(money) == -1) {
                System.out.println("�������㣬����ת��");
            }else {
                BigDecimal balance = bankCard.getAccount().getBalance().subtract(money);
                bankCard.getAccount().setBalance(balance);
                BigDecimal targetAccountBalance = account[i].getBalance().add(money);
                account[i].setBalance(targetAccountBalance);
                System.out.println("ת�˳ɹ���");

                AccountDetails accountDetails = new AccountDetails(new SimpleDateFormat("yyyy-MM-dd :hh:mm:ss").format(new Date()), money, "ת��",bankCard.getAccount().getBalance());
                bankCard.getAccount().addDetails(accountDetails);
            }
        }
        }
        System.out.println("û������˺�");
    }

    /**
     * �޸�����
     * @param bankCard ���п�
     * @param user  ����
     */

    private void changePassword(BankCard bankCard,User user) {
        System.out.println("������ԭ��������:");
        boolean yanZheng = validatePassword(bankCard, user);
        while (true) {
            if (yanZheng) {
                System.out.println("������������");
                String password1 = user.inputPassword();
                System.out.println("��������һ��");
                String passward2 = user.inputPassword();
                if (passward2.equals(password1)) {
                    bankCard.getAccount().setPassword(password1);
                    System.out.println("�޸ĳɹ�");
                    return;
                } else {
                    System.out.println("��������������벻һ��������������");
                }

            }
        }
    }

    /**
     *����
     */
    public void work(BankCard bankCard,User user) {
        welcome();
        boolean b = validatePassword(bankCard, user);
        while (b){
            System.out.println("��ѡ����Ҫ���еĲ�����");
            System.out.println("1����ӡ������ϸ\n2����ӡ���\n3�����\n4��ȡ��\n5��ת��\n6���޸�����\n7���˿�");
            Scanner scanner = new Scanner(System.in);
            int cuozuo = scanner.nextInt();
            switch (cuozuo){
                case 1:queryDetails(bankCard);
                break;
                case 2:print(bankCard);
                break;
                case 3:deposit(bankCard,user);
                break;
                case 4:withdraw(bankCard,user);
                break;
                case 5:transfer(bankCard,user);
                break;
                case 6:changePassword(bankCard,user);
                break;
                case 7:
                    return;
                default:
                    System.out.println("�������ɹ�������������");

            }

        }

    }





    }
