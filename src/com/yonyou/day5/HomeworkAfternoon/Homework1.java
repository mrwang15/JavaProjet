package com.yonyou.day5.HomeworkAfternoon;

import java.util.Scanner;

/**
 *ѡ��ͶƱ
 * ģ��ʵ��ѡ��ͶƱ���̣�һȺѡ�����ͶƱ��ÿ��ѡ��ֻ����Ͷһ��Ʊ�����ҵ�ͶƱ�����ﵽ100ʱ����ֹͣͶƱ
 * ��ʾ���롣����
 */
public class Homework1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean check=true;
        while(check){
            System.out.println("�������������:");
            String name = scanner.next();
            System.out.println("����ѡ˭:");
            String next = scanner.next();
            Ticket ticket = new Ticket(next);
            new Villager(name,ticket);
            check = Agency.check();
        }
        System.out.println("ͶƱ����");
    }
}

class Villager{
    private String name;
    private Ticket ticket;

    public Villager() {
    }

    public Villager(String name, Ticket ticket) {
        this.name = name;
        this.ticket = ticket;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    /**
     * ����ͶƱ����
     * @param TicketName ��˭ͷ��Ʊ
     */
    public void ticketing(String TicketName){
        ticket.setTicketName(TicketName);
    }
}

class Ticket{
    private String ticketName;

    public Ticket() {
    }

    public Ticket(String ticketName) {
        this.ticketName = ticketName;
    }

    public String getTicketName() {
        return ticketName;
    }

    public void setTicketName(String ticketName) {
        this.ticketName = ticketName;
    }
}

class Agency{
    private static int num;
    private Villager villager;

    public Agency(Villager villager) {
        this.villager = villager;
    }

    public Agency() {
    }

    public static int getNum() {
        return num;
    }

    public static void setNum(int num) {
        if (num>100){
            System.out.println("Ʊ���ﵽ����");
            return;
        }
        Agency.num = num;
    }

    public Villager getVillager() {
        return villager;
    }

    public void setVillager(Villager villager) {
        this.villager = villager;
    }

    /*
    ��Ʊ����
     */
    public static boolean check(){
        if(num<=100){
            System.out.println("��������Ͷ"+(99-num));
            num++;
            return true;
        }else {
            return false;
        }
    }
}
