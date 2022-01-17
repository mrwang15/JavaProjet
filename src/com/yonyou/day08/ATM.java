package com.yonyou.day08;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
/**
 * @Author ������
 * @Date 2022/1/5 16:08
 * @Description
 * ATM����
 */
public class ATM {
    //�����˻�����  ֻ��
    private Account[] account;
    //���е�����  ֻ��
    private String bankName;
    //���׵����� ֻ��
    private String address;

    //Ĭ���޲ι��췽��
    public ATM() {
    }

    /**
     * �������Ĺ��췽��
     * @param account
     * @param bankName
     * @param address
     */
    public ATM(Account[] account, String bankName, String address) {
        this.account = account;
        this.bankName = bankName;
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
     * ��ѯ�����п��Ľ�����ϸ
     * @param bankCard
     */
    private void queryDetails(BankCard bankCard) {
        Account account = bankCard.getAccount();
        AccountDetails[] accounts = account.getAccountDetails();
        for(AccountDetails ad : accounts) {
            if(ad == null) {
                return;
            }
            //�������ڡ����׽��������͡��˻����
            System.out.println("�������ڣ�" + ad.getDate() + "���׽�" +
                    ad.getMoney() + "�������ͣ�" + ad.getType() + "�˻���" + ad.getAfterBalance());
        }
    }

    /**
     * ���
     * @param bankCard
     */
    private void deposit(BankCard bankCard,User user) {
        Scanner input = new Scanner(System.in);
        System.out.println("��������Ľ�");
        BigDecimal money = user.inputMoney();
        BigDecimal bigDecimal = bankCard.getAccount().getBalance().add(money);
        bankCard.getAccount().setBalance(bigDecimal);
        AccountDetails accountDetails = new AccountDetails(new SimpleDateFormat("yyyy-MM-dd :hh:mm:ss").format(new Date()), money, "���",bankCard.getAccount().getBalance());
        bankCard.getAccount().addDetails(accountDetails);
    }

    /**
     * ȡ��
     * @param bankCard
     */
    private void withdrawal(BankCard bankCard,User user) {
        Scanner input = new Scanner(System.in);
        System.out.println("������ȡ��Ľ�");
        BigDecimal money = user.inputMoney();
        if(bankCard.getAccount().getBalance().compareTo(money) == -1) {
            System.out.println("���㣬�޷�ȡ��");
        }else {
            BigDecimal bigDecimal = bankCard.getAccount().getBalance().subtract(money);
            bankCard.getAccount().setBalance(bigDecimal);
            AccountDetails accountDetails = new AccountDetails(new SimpleDateFormat("yyyy-MM-dd :hh:mm:ss").format(new Date()), money, "ȡ��",bankCard.getAccount().getBalance());
            bankCard.getAccount().addDetails(accountDetails);
        }


    }

    /**
     * ת��
     * @param bankCard
     */
    private void transfer(BankCard bankCard,User user) {
        Scanner input = new Scanner(System.in);
        System.out.println("������Ҫת�˵��˻�");
        String accountId = user.inputAccountId();
        Account targetAccount = getTargetAccount(accountId);
        if(targetAccount == null) {
            System.out.println("Ŀ���˻�������");
        }else {
            System.out.println("������Ҫת�˵Ľ��");
            BigDecimal money = user.inputMoney();
            if(bankCard.getAccount().getBalance().compareTo(money) == -1) {
                System.out.println("�������㣬����ת��");
            }else {
                BigDecimal balance = bankCard.getAccount().getBalance().subtract(money);
                bankCard.getAccount().setBalance(balance);
                BigDecimal targetAccountBalance = targetAccount.getBalance().add(money);
                targetAccount.setBalance(targetAccountBalance);
                System.out.println("ת�˳ɹ���");

                AccountDetails accountDetails = new AccountDetails(new SimpleDateFormat("yyyy-MM-dd :hh:mm:ss").format(new Date()), money, "ת��",bankCard.getAccount().getBalance());
                bankCard.getAccount().addDetails(accountDetails);

            }
        }


    }

    /**
     * ����Ŀ���˻�
     * @param accountId
     * @return
     */
    private Account getTargetAccount(String accountId) {
        //�����˻������飬����ҵ��򷵻ض�Ӧ���˻�
        for(Account acc : account) {
            if(acc.getAccount().equals(accountId)) {
                return acc;
            }
        }
        return null;
    }

    /**
     * �޸�����
     * 1��������ԭʼ������
     * 2���ж������ԭʼ�����Ƿ���ȷ
     * 3�����������ȷ���޸�����
     *     a������������
     *     b���ٴ�����������
     *     c�������벻����֮ǰ��������ͬ
     * @param bankCard
     */
    private void changePassword(BankCard bankCard,User user) {
        Scanner input = new Scanner(System.in);
        //��֤�����Ƿ���ȷ
        boolean valdatePassword = validatePassword(bankCard,user);
        if (!valdatePassword) {
            System.out.println("���������������Ϊ�����޷��޸�����");
        }else {
            String newPass = null;
            String newPass1 = null;
            boolean tag = false;
            do {
                int cnt = 0;  //����������
                do {
                    if (cnt > 0) {
                        System.out.println("��������ԭ���벻��һ��");
                    }
                    System.out.println("������������");
                    newPass = user.inputPassword();
                    cnt++;
                } while (bankCard.getAccount().getPassword().equals(newPass));
                System.out.println("���ٴ�����һ�����룺");
                newPass1 = user.inputPassword();
                if(!newPass.equals(newPass1)) {
                    System.out.println("�������벻һ�£�����������");
                    tag = true;
                }else {
                    tag = false;
                }
            }while(tag);
            bankCard.getAccount().setPassword(newPass);
            System.out.println("�޸�����ɹ���");
        }
    }

    /**
     * ATM�������ķ���
     * ��ѯ������ϸ
     * ��ӡ
     * չʾ�˵�
     * ���
     * ȡ��
     * ת��
     * �޸�����
     */
    public void work(BankCard bankCard,User user) {
        Scanner input = new Scanner(System.in);
        if(login(bankCard,user)) {
            end:
            while(true) {
                System.out.println("��ѡ����Ҫ���еĲ�����");
                System.out.println("1����ѯ������ϸ\n2����ӡ\n3�����");
                System.out.println("4��ȡ��\n5��ת��\n6���޸�����\n7���˿�");
                int select = input.nextInt();
                switch (select) {
                    case 1:
                        //��ѯ��ϸ
                        System.out.println("��ѯ��ϸ");
                        queryDetails(bankCard);
                        break;
                    case 2:
                        //��ӡ
                        System.out.println("��ӡ���");
                        System.out.println(bankCard.getAccount().getBalance());
                        break;
                    case 3:
                        //���
                        System.out.println("���");
                        deposit(bankCard,user);
                        break;
                    case 4:
                        //ȡ��
                        System.out.println("ȡ��");
                        withdrawal(bankCard,user);
                        break;
                    case 5:
                        //ת��
                        System.out.println("ת��");
                        transfer(bankCard,user);
                        break;
                    case 6:
                        //�޸�����
                        System.out.println("�޸�����");
                        changePassword(bankCard,user);
                        break;
                    case 7:
                        //�˳��˵�
                        System.out.println("��ӭ�´�����");
                        break end;
                    default:
                        System.out.println("������Ĳ�������ȷ,����������");
                }
            }
        }
    }

    /**
     * ����û��ĵ�¼����
     * ������
     * 1��Ҫ���û���������
     * 2����֤����
     * 3��������벻��ȷ����ʾ�û���������
     * 4�������¼�ɹ��򷵻�true�����򷵻�false
     * 5������û����ε�¼��ʧ�����̿���û���û�����Ŀ���
     * @param bankCard Ҫ��������п�
     * @param user Ҫ��¼���û�
     * @return
     */
    public boolean login(BankCard bankCard,User user) {
        String inputPassword = null;
        if (validatePassword(bankCard, user)) return true;
        System.out.println("�������������붼�Ǵ���ģ����Ŀ�������");
        user.setBankCard(null);
        return false;
    }

    /**
     * ��֤����ķ���
     * @param bankCard
     * @param user
     * @return
     */
    private boolean validatePassword(BankCard bankCard, User user) {
        String inputPassword;
        int cnt = 0; //�����������������ж��û�������������
        while(cnt < 3) {
            if(cnt == 0) {
                System.out.println("���������룺");
            }else {
                System.out.println("����������벻��ȷ������������");
            }
            inputPassword = user.inputPassword();
            if(bankCard.getAccount().getPassword().equals(inputPassword)) {
                return true;
            }
            cnt++;
        }
        return false;
    }
}
