package com.yonyou.day12.homework;

import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @Author ������
 * @Date 2022/1/11 16:39
 * @Description
 *
 * 1��	����ͼ���࣬����ͼ���š�ͼ�����ơ�����������ͼ��۸񡢳����硣��д������������¹��ܣ�
 * a)	�������ϱ������е�ͼ�飬ע��ͼ���Ų����ظ�
 * b)	���һ���м��������磬ע����ͬ�ĳ�����ֻ����һ����
 * c)	ͳ�Ƴ�ÿ�����������е�ͼ���ܼ۸�
 * d)	����ͼ���Ų���ͼ��
 * e)	����ͼ�����Ʋ���ͼ�飨ע����ͬ��ͼ�����ƿ������ظ��ģ�
 * f)	����ͼ�����Ƶ������д���java��������ͼ��
 * g)	ͼ��۸���Ա����ÿ�α����Ҫ�б����¼���ѱ����¼���ҳ���
 * h)	����ָ�����ڵ�ͼ��۸�����¼
 * i)	�����������ŵ����߲��ҳ������Ǵ��С��廪��������ͼ��
 * j)	ͼ���̵������������Ҫ�ҵ��۸���͵�ǰ����ͼ�飬����Ҫ��ԭ�м۸�Ļ������ٴ���ۣ�Ҫ������Ȿ���ԭ�ۺʹ�����
 * k)	���ݼ۸���н�����������۸���ͬ�͸����������������������������������Ҳ��ͬ����ݳ�������н�������
 */
public class Homework {
    public static void main(String[] args) {
        Set<Books> booksSet = new TreeSet(new BookComparator());
        booksSet.add(new Books(1001,"��ʫ������","��1",100,"���ϳ�������1"));
        booksSet.add(new Books(1002,"��ʫ4����","��2",500,"���ϳ�������1"));
        booksSet.add(new Books(1003,"��ʫ5����","��3",600,"���ϳ�������1"));
        booksSet.add(new Books(1004,"��ʫ5����","��1",900,"�廪��������2"));
        booksSet.add(new Books(1005,"��ʫ6����","��4",200,"�廪��������2"));
        booksSet.add(new Books(1001,"java7����","��2",400,"���ϳ�������2"));
        booksSet.add(new Books(1008,"java8����","��2",110,"���ϳ�������3"));
        booksSet.add(new Books(1009,"��ʫ9����","��3",100,"���ϳ�������3"));

        Set<Books> booksSet1 = new TreeSet(new BookComparator2());
        booksSet.forEach(e->{
            Books books =new Books(e.getId(),e.getBookName(),e.getWriterName(),e.getPrice(),e.getPress());
            booksSet1.add(books);

        });
        booksSet1.forEach(e-> System.out.println(e.getPress()));
        Set<Books> booksSet2 = new TreeSet(new BookComparator3());
        booksSet.forEach(e->{
            Books books =new Books(e.getId(),e.getBookName(),e.getWriterName(),e.getPrice(),e. getPress());
            booksSet2.add(books);

        });
        booksSet2.forEach(e-> System.out.println(e.getPress()+"  "+e.getPrice()));

        Scanner scanner = new Scanner(System.in);

        //����ͼ���Ų���ͼ��
        System.out.println("����ͼ����");
        int youId = scanner.nextInt();
        booksSet.forEach(e->{if (youId==e.getId()){
            System.out.println(e);
        }
        });


        //����ͼ�����Ʋ���ͼ��
        System.out.println("����ͼ������");
        String youBookName = scanner.next();
        booksSet.forEach(e->{if (e.getBookName().equals(youBookName)){
            System.out.println(e);
            System.out.println("�Ƿ��޸ļ۸�:1�޸ģ�2���޸�");
            int b = scanner.nextInt();
            if (b==1){
                modifyPrice(e);
            }else if(b==2){
                System.out.println("�յ�");
            }else{
                System.out.println("���벻��ȷ");
            }
        }
        });





        //����ͼ�����ƴ���java��
        booksSet.forEach(e->{if (e.getBookName().contains("java")){
            System.out.println(e);
        }
        });

        //����
        System.out.println("������ʱ�䣬��ʽΪ��yyyy-MM-dd HH:mm:ss");
        String time = scanner.next();
        booksSet.forEach(e->{
            findPrice(e,time);
        });

        System.out.println("�������ŵ����߲��ҳ������Ǵ��С��廪��������ͼ��Ϊ");
        booksSet.forEach(e->{
            if (e.getPress().contains("�廪")&&e.getWriterName().contains("��")){
                System.out.println(e);
            }
        });


        Set<Books> booksSet4 = new TreeSet(new BookComparator4());
        booksSet.forEach(e->booksSet4.add(e));
        System.out.println("=========================");
        booksSet4.forEach(e-> System.out.println(e));

        //����
        promotion(booksSet4);




    }





    //�޸ļ۸�
    public static void modifyPrice(Books books){
        System.out.println("�������޸ĺ�ļ۸�");
        Scanner scanner = new Scanner(System.in);
        Double newPrice = scanner.nextDouble();
        ArrayList<String> priceS = books.getPriceS();
        String xiugai ="��"+books.getId()+ books.getBookName()+"ʱ�䣺"+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date())+"�޸ļ۸�Ϊ"+newPrice;
        priceS.add(xiugai);
        System.out.println(xiugai);
        books.setPrice(newPrice);


    }

    //���ұ��
    public static void findPrice(Books books,String time){
        ArrayList<String> priceS = books.getPriceS();
        priceS.forEach(e-> {
            if(e.contains(time)){
            System.out.println(e);
            }
        });
    }

    //����
    public static void promotion(Set<Books> set){
          int aa=0;
        Iterator<Books> iterator = set.iterator();
        while (iterator.hasNext()){
            aa++;
            if (aa<=3) {
                Books e = iterator.next();
                double old = e.getPrice();
                double newPrice = old * 0.8;
                e.setPrice(newPrice);
                System.out.println(e.getId() + e.getBookName() + "��ԭ���۸�Ϊ" + old + "���ۺ�ļ۸�Ϊ" + newPrice);
            }else {
                break;
            }
        }

    }



}


class Books{
    private  Integer id;
    private String bookName;
    private String writerName;
    private double price;
    private String press;
    private ArrayList<String> priceS=new ArrayList();

    public Books(Integer id, String bookName, String writerName, double price, String press) {
        this.id = id;
        this.bookName = bookName;
        this.writerName = writerName;
        this.price = price;
        this.press = press;
    }

    public Books() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getWriterName() {
        return writerName;
    }

    public void setWriterName(String writerName) {
        this.writerName = writerName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getPress() {
        return press;
    }

    public void setPress(String press) {
        this.press = press;
    }

    public ArrayList getPriceS() {
        return priceS;
    }

    public void setPriceS(ArrayList priceS) {
        this.priceS = priceS;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Books books = (Books) o;
        return Double.compare(books.price, price) == 0 &&
                Objects.equals(id, books.id) &&
                Objects.equals(bookName, books.bookName) &&
                Objects.equals(writerName, books.writerName) &&
                Objects.equals(press, books.press);
    }



    @Override
    public int hashCode() {
        return Objects.hash(id, bookName, writerName, price, press);
    }

    @Override
    public String toString() {
        return "Books{" +
                "id=" + id +
                ", bookName='" + bookName + '\'' +
                ", writerName='" + writerName + '\'' +
                ", price=" + price +
                ", press='" + press + '\'' +
                '}';
    }
}

/**
 * ��ͼ���Ž��бȽ�
 */
class BookComparator implements Comparator<Books>{

    @Override
    public int compare(Books o1, Books o2) {
        return o1.getId()-o2.getId();
    }
}

/**
 * ����������бȽ�
 *
 */
class BookComparator2 implements Comparator<Books>{

    @Override
    public int compare(Books o1, Books o2) {
        return o1.getPress().compareTo(o2.getPress());
    }
}


/**
 * ����������бȽ�
 *
 */
class BookComparator3 implements Comparator<Books>{

    @Override
    public int compare(Books o1, Books o2) {
        if (o1.getPress().compareTo(o2.getPress())==0){
            o2.setPrice(o2.getPrice()+o1.getPrice());
        }
        return o1.getPress().compareTo(o2.getPress());
    }
}


/**
 * ���ݼ۸���н�����������۸���ͬ�͸����������������������������������Ҳ��ͬ����ݳ�������н�������
 *
 */
class BookComparator4 implements Comparator<Books>{

    @Override
    public int compare(Books o1, Books o2) {
        int re =(int)(o2.getPrice()-o1.getPrice());
         re = ((re==0)?o1.getWriterName().compareTo(o2.getWriterName()):re);
         re = ((re==0)?o1.getPress().compareTo(o2.getPress()):re);
         return re;

    }
}



