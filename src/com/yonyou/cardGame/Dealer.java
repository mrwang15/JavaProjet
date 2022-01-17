package com.yonyou.cardGame;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
 * @Author 王佳鹏
 * @Date 2022/1/6 11:46
 * @Description
 *  发牌员
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
     * 发牌给人
     */
    public void licensing(){
        boolean fa =true;
        //拿扑克
        poker.getCars();
        //洗牌
        Object[] cars = poker.shuffle();
        //发牌
        do{
            Car cari= (Car)cars[i];
            i++;
            person.wantCar(cari);
            System.out.println(cari.toString());
            System.out.println("是否还需要牌(1或者2): 1.发牌，2.不发");
            while(true) {
                Scanner scanner = new Scanner(System.in);
                int faa = scanner.nextInt();
                if (faa == 2) {
                    fa = false;
                    return;
                } else if (faa != 1) {
                    System.out.println("操作异常,重新操作");
                }
                break;
            }

        }while (fa);

    }

    /**
     * 计算机发牌
     */

    public void licensingPC(){
        boolean fa =true;
        //拿扑克
        poker.getCars();
        //洗牌
        Object[] cars = poker.shuffle();
        //发牌
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

            return "玩家获胜";
        }else if(person.getCount()<Computer.getCount()){
            Computer.setMoney(Computer.getMoney()+2*Computer.getZhu());
            person.setMoney(person.getMoney()-person.getZhu());
            return "计算机获胜";
        }else {
            return "平局";
        }
    }

    /**
     * 发牌机工作
     */
    public void play(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入玩家姓名");
        String personName = scanner.next();
        System.out.println("请输入电脑姓名");
        String computerName = scanner.next();

        person.setName(personName);
        Computer.setName(computerName);

        while(true) {
            System.out.println("请输入想要进行的操作，1.开始游戏，2.查看分数，3，退出");
            int i = scanner.nextInt();
            String compare1 = "";
            switch (i) {
                case 1:
                    if (person.getMoney()>0){
                        System.out.println("请输入赌资");
                        Double zhu = scanner.nextDouble();
                        person.setZhu(zhu);
                        Computer.setZhu(zhu);
                        if (zhu<=person.getMoney()) {
                            licensing();
                            licensingPC();
                            compare1 = compare();
                            listPlay.add("玩家姓名" + person.getName() + "电脑姓名" + Computer.getName() + "当前时间" + new SimpleDateFormat("yyyy-MM-dd :hh:mm:ss").format(new Date())
                                    + "玩家手中的牌" + person.getCars() + "电脑手中的牌" + Computer.getCars() + "玩家点数" + person.getCount() + "计算机点数" + Computer.getCount() + "结果" + compare1 + "  玩家资金剩余" + person.getMoney());

                        }else {
                            System.out.println("资金不够支付赌资");
                        }
                    }else {
                        System.out.println("资金不足");
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
                    System.out.println("欢迎下次光临");
                    return;
            }
        }
    }

}
