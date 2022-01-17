package com.yonyou.day7.homework4;

import java.util.Scanner;

/**
 * @Author ������
 * @Date 2022/1/4 19:23
 * @Description
 *
 *  4.  ĳ�༶�ٰ�����(Instrument)������ѧ������ѡ��ͬ�������������࣬ʹ�ö�̬ģ��������̡�
 *   �����и���(Piano)��С����(Violin)������˹����(Sachs)
 *   �û��ڿ���̨����һ�����֣�1��ʾ���١�2��ʾС���١�3��ʾ����˹����ȡ��Ӧ������֮���������
 */
public class Homework4 {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        System.out.println("���������֣���1��ʾ���١�2��ʾС���١�3��ʾ����˹");
        int anInt = scanner.nextInt();
        Play play = new Play();
        play.play(anInt);
    }
}


class Piano extends Instrument{
    @Override
    public void play() {
        System.out.println("����������");
    }
}

class Violin extends Instrument{

    @Override
    public void play() {
        System.out.println("С����������");
    }
}

class Sachs extends Instrument{


    @Override
    public void play() {
        System.out.println("����˹������");
    }
}

class Instrument{
    public void play(){
        System.out.println("����");
    }
}

class Play{
    private  Instrument instrument;

    public Play(Instrument instrument) {
        this.instrument = instrument;
    }

    public Play() {
    }

    public Instrument getInstrument() {
        return instrument;
    }

    public void setInstrument(Instrument instrument) {
        this.instrument = instrument;
    }

    public void play(Integer integer){
        if (integer==1){
            instrument =new Piano();
        }else if (integer==2){
            instrument = new Violin();

        }else if (integer==3){
            instrument = new Sachs();
        }
        instrument.play();
    }
}