package com.yonyou.day4;

/**
 * ¼ÆËãÆ÷
 */
public class Method {
    public static void main(String[] args) {
        Cals cals = new Cals(1, '+', 1);
        int calccc = cals.calccc();
        System.out.println(calccc);
    }
}

class Cals {
    private char sym;
    private  int  num1;
    private  int num2;

    public Cals() {
    }

    public Cals(int num1,char sym,  int num2) {
        this.sym = sym;
        this.num1 = num1;
        this.num2 = num2;
    }

    public char getSym() {
        return sym;
    }

    public void setSym(char sym) {
        this.sym = sym;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int sum(){
        return num1+num2;
    }
    public int sub(){
        return num1-num2;
    }
    private int mul(){
        return num1*num2;
    }
    public int div(){
        return num1/num2;
    }

    public int calccc(){
        switch (sym){
            case '+':
                return sum();
            case '-':
                return sub();
            case '*':
                return mul();
            case '/':
                return div();
            default:
                return -1;
        }
    }

}
