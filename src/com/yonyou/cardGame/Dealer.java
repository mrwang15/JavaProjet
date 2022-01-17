package com.yonyou.cardGame;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
 * @Author ������
 * @Date 2022/1/6 11:46
 * @Description
 *  ����Ա
 */
public class Dealer {
    private Person person ;
    private Person Computer ;
    private Poker poker;
    int i=0;
    List  listPlay= new ArrayList();

    public Dealer(Person person, Person computer, Poker poker) {
        this.person = person;
        Computer = computer;
        this.poker = poker;
    }

    public Dealer() {
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Person getComputer() {
        return Computer;
    }

    public void setComputer(Person computer) {
        Computer = computer;
    }

    public Poker getPoker() {
        return poker;
    }

    public void setPoker(Poker poker) {
        this.poker = poker;
    }

    /**
     * ���Ƹ���
     */
    public void licensing(){
        boolean fa =true;
        //���˿�
        poker.getCars();
        //ϴ��
        Object[] cars = poker.shuffle();
        //����
        do{
            Car cari= (Car)cars[i];
            i++;
            person.wantCar(cari);
            System.out.println(cari.toString());
            System.out.println("�Ƿ���Ҫ��(1����2): 1.���ƣ�2.����");
            while(true) {
                Scanner scanner = new Scanner(System.in);
                int faa = scanner.nextInt();
                if (faa == 2) {
                    fa = false;
                    return;
                } else if (faa != 1) {
                    System.out.println("�����쳣,���²���");
                }
                break;
            }

        }while (fa);

    }

    /**
     * ���������
     */

    public void licensingPC(){
        boolean fa =true;
        //���˿�
        poker.getCars();
        //ϴ��
        Object[] cars = poker.shuffle();
        //����
        do{
            Car cari= (Car)cars[i];
            Computer.wantCar(cari);
            i++;
            if (Computer.getCount()>=15){
               return;
            }

        }while (true);

    }


    public String compare(){
        person.jiSuan();
        Computer.jiSuan();
        if (person.getCount()>Computer.getCount()){
            person.setMoney(person.getMoney()+2*person.getZhu());
            Computer.setMoney(Computer.getMoney()-Computer.getZhu());

            return "��һ�ʤ";
        }else if(person.getCount()<Computer.getCount()){
            Computer.setMoney(Computer.getMoney()+2*Computer.getZhu());
            person.setMoney(person.getMoney()-person.getZhu());
            return "�������ʤ";
        }else {
            return "ƽ��";
        }
    }

    /**
     * ���ƻ�����
     */
    public void play(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("�������������");
        String personName = scanner.next();
        System.out.println("�������������");
        String computerName = scanner.next();

        person.setName(personName);
        Computer.setName(computerName);

        while(true) {
            System.out.println("��������Ҫ���еĲ�����1.��ʼ��Ϸ��2.�鿴������3���˳�");
            int i = scanner.nextInt();
            String compare1 = "";
            switch (i) {
                case 1:
                    if (person.getMoney()>0){
                        System.out.println("���������");
                        Double zhu = scanner.nextDouble();
                        person.setZhu(zhu);
                        Computer.setZhu(zhu);
                        if (zhu<=person.getMoney()) {
                            licensing();
                            licensingPC();
                            compare1 = compare();
                            listPlay.add("�������" + person.getName() + "��������" + Computer.getName() + "��ǰʱ��" + new SimpleDateFormat("yyyy-MM-dd :hh:mm:ss").format(new Date())
                                    + "������е���" + person.getCars() + "�������е���" + Computer.getCars() + "��ҵ���" + person.getCount() + "���������" + Computer.getCount() + "���" + compare1 + "  ����ʽ�ʣ��" + person.getMoney());

                        }else {
                            System.out.println("�ʽ𲻹�֧������");
                        }
                    }else {
                        System.out.println("�ʽ���");
                    }
                    person.setCount(0);
                    Computer.setCount(0);
                    person.setCars(new ArrayList<Car>());
                    Computer.setCars(new ArrayList<Car>());

                    break;
                case 2:
                    for (Object o : listPlay) {
                        System.out.println(o);
                    }break;
                case 3:
                    System.out.println("��ӭ�´ι���");
                    return;
            }
        }
    }

}
