package com.yonyou.day12.homework;

import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @Author 王佳鹏
 * @Date 2022/1/11 16:39
 * @Description
 *
 * 1、	创建图书类，包含图书编号、图书名称、作者姓名、图书价格、出版社。编写测试类完成如下功能：
 * a)	创建集合保存所有的图书，注意图书编号不能重复
 * b)	输出一共有几个出版社，注意相同的出版社只能算一个。
 * c)	统计出每个出版社所有的图书总价格
 * d)	根据图书编号查找图书
 * e)	根据图书名称查找图书（注意相同的图书名称可能有重复的）
 * f)	查找图书名称当中所有带“java”字样的图书
 * g)	图书价格可以变更，每次变更需要有变更记录并把变更记录查找出来
 * h)	查找指定日期的图书价格变更记录
 * i)	查找所有姓张的作者并且出版社是带有“清华”字样的图书
 * j)	图书商店做促销活动，需要找到价格最低的前三本图书，并且要在原有价格的基础上再打八折，要求输出这本书的原价和促销价
 * k)	根据价格进行降序排序，如果价格相同就根据作者姓名进行升序排序，如果作者姓名也相同则根据出版社进行降序排序。
 */
public class Homework {
    public static void main(String[] args) {
        Set<Books> booksSet = new TreeSet(new BookComparator());
        booksSet.add(new Books(1001,"唐诗三百首","王1",100,"王氏出出版社1"));
        booksSet.add(new Books(1002,"唐诗4百首","王2",500,"王氏出出版社1"));
        booksSet.add(new Books(1003,"唐诗5百首","王3",600,"王氏出出版社1"));
        booksSet.add(new Books(1004,"唐诗5百首","张1",900,"清华出出版社2"));
        booksSet.add(new Books(1005,"唐诗6百首","王4",200,"清华出出版社2"));
        booksSet.add(new Books(1001,"java7百首","王2",400,"王氏出出版社2"));
        booksSet.add(new Books(1008,"java8百首","王2",110,"王氏出出版社3"));
        booksSet.add(new Books(1009,"唐诗9百首","王3",100,"王氏出出版社3"));

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

        //根据图书编号查找图书
        System.out.println("输入图书编号");
        int youId = scanner.nextInt();
        booksSet.forEach(e->{if (youId==e.getId()){
            System.out.println(e);
        }
        });


        //根据图书名称查找图书
        System.out.println("输入图书名字");
        String youBookName = scanner.next();
        booksSet.forEach(e->{if (e.getBookName().equals(youBookName)){
            System.out.println(e);
            System.out.println("是否修改价格:1修改，2不修改");
            int b = scanner.nextInt();
            if (b==1){
                modifyPrice(e);
            }else if(b==2){
                System.out.println("收到");
            }else{
                System.out.println("输入不正确");
            }
        }
        });





        //根据图书名称带有java的
        booksSet.forEach(e->{if (e.getBookName().contains("java")){
            System.out.println(e);
        }
        });

        //查找
        System.out.println("请输入时间，格式为：yyyy-MM-dd HH:mm:ss");
        String time = scanner.next();
        booksSet.forEach(e->{
            findPrice(e,time);
        });

        System.out.println("符合姓张的作者并且出版社是带有“清华”字样的图书为");
        booksSet.forEach(e->{
            if (e.getPress().contains("清华")&&e.getWriterName().contains("张")){
                System.out.println(e);
            }
        });


        Set<Books> booksSet4 = new TreeSet(new BookComparator4());
        booksSet.forEach(e->booksSet4.add(e));
        System.out.println("=========================");
        booksSet4.forEach(e-> System.out.println(e));

        //促销
        promotion(booksSet4);




    }





    //修改价格
    public static void modifyPrice(Books books){
        System.out.println("请输入修改后的价格");
        Scanner scanner = new Scanner(System.in);
        Double newPrice = scanner.nextDouble();
        ArrayList<String> priceS = books.getPriceS();
        String xiugai ="书"+books.getId()+ books.getBookName()+"时间："+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date())+"修改价格为"+newPrice;
        priceS.add(xiugai);
        System.out.println(xiugai);
        books.setPrice(newPrice);


    }

    //查找变更
    public static void findPrice(Books books,String time){
        ArrayList<String> priceS = books.getPriceS();
        priceS.forEach(e-> {
            if(e.contains(time)){
            System.out.println(e);
            }
        });
    }

    //促销
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
                System.out.println(e.getId() + e.getBookName() + "的原来价格为" + old + "打折后的价格为" + newPrice);
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
 * 按图书编号进行比较
 */
class BookComparator implements Comparator<Books>{

    @Override
    public int compare(Books o1, Books o2) {
        return o1.getId()-o2.getId();
    }
}

/**
 * 按出版社进行比较
 *
 */
class BookComparator2 implements Comparator<Books>{

    @Override
    public int compare(Books o1, Books o2) {
        return o1.getPress().compareTo(o2.getPress());
    }
}


/**
 * 按出版社进行比较
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
 * 根据价格进行降序排序，如果价格相同就根据作者姓名进行升序排序，如果作者姓名也相同则根据出版社进行降序排序。
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



