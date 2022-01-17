package com.yonyou.day5.HomeworkAfternoon;

import java.util.Scanner;

/**
 *选民投票
 * 模拟实现选民投票过程：一群选民进行投票，每个选民只允许投一次票，并且当投票总数达到100时，就停止投票
 * 演示代码。。。
 */
public class Homework1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean check=true;
        while(check){
            System.out.println("请输入你的姓名:");
            String name = scanner.next();
            System.out.println("你想选谁:");
            String next = scanner.next();
            Ticket ticket = new Ticket(next);
            new Villager(name,ticket);
            check = Agency.check();
        }
        System.out.println("投票结束");
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
     * 村名投票方法
     * @param TicketName 给谁头得票
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
            System.out.println("票数达到上限");
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
    检票方法
     */
    public static boolean check(){
        if(num<=100){
            System.out.println("还可以再投"+(99-num));
            num++;
            return true;
        }else {
            return false;
        }
    }
}
