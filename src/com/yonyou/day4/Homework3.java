package com.yonyou.day4;

/**
 * 1��һ�������������˵�������ȡ��ͬ�۸����Ʊ�����д�����࣬��������ξ����ܹ��������Ʊ�۸����
 * 2��ģ��ʵ���û������������ɵ��û��������룬�����ȷ������Ȩ�޸��£��Ӽ��̻�ȡ�µ����룬���и���
 */
public class Homework3 {
    public static void main(String[] args) {
        Guests guest1 = new Guests(10, "ludoudan");
        guest1.setprice();
        System.out.println(guest1.getPrice());
    }
}
class Guests{
    private Integer age;
    private String name;
    private Integer price;

    public Guests() {
    }

    public Guests(Integer age, String name) {
        this.age = age;
        this.name = name;
    }
    public Guests(Integer age, String name, Integer price) {
        this.age = age;
        this.name = name;
        this.price = price;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public  void setprice(){
        if (age<0){
            setPrice(0);
        }else if (getAge()<3){
            setPrice(10);
        }else if (getAge()<18){
            setPrice(20);
        }else if (getAge()<60){
            setPrice(100);
        }else{
            setPrice(10);
        }
    }

}
