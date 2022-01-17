package com.yonyou.day13.homework;

import java.util.*;

/**
 * @Author 王佳鹏
 * @Date 2022/1/12 15:02
 * @Description
 */
public class Homework {
    public static void main(String[] args) {
        Class class1 =new Class("1001");
        Map<String, Student> map1 = class1.getStudentMap();
        map1.put("1001",new Student("zhangsan",'男',100,20));
        map1.put("1002",new Student("zhangsan1",'男',15,20));
        map1.put("1003",new Student("zhangsan",'男',13,21));
        Class class2 =new Class("1002");
        Map<String, Student> map2 = class2.getStudentMap();
        map2.put("1004",new Student("zhangsan",'男',15,20));
        map2.put("1005",new Student("zhangsan1",'男',15,20));
        map2.put("1006",new Student("zhangsan",'男',15,20));

        School school = new School("农大");
        school.getClassMap().put("001",class1);
        school.getClassMap().put("002",class2);
        //转班级
        school.shift("1001","002");
        //总成绩
        school.getClassMap().forEach((s,c)->{
            double num = num(c);
            System.out.println(s+"总成绩为"+num);
        });

        //语文总成绩
        school.getClassMap().forEach((s,c)->{
            double num = languageNum(c);
            double vge = vge(c);
            System.out.println(s+"语文总成绩为"+num);
            System.out.println(s+"语文平均分为"+vge);
        });

        //语文总成绩
        school.getClassMap().forEach((s,c)->{
            double num = shuxue(c);
            double v = vge1(c);
            System.out.println(s+"数学总成绩为"+num);
            System.out.println(s+"数学平均分为"+v);

        });

        school.getClassMap().forEach((s,c)->{
            sumFen(c);
        });


        //排序

        Map<String, Class> classMap = school.getClassMap();
        Set<Map.Entry<String, Class>> entries = classMap.entrySet();
        for (Map.Entry<String, Class> entry : entries) {
            System.out.println("班级"+entry.getKey());
            Set<Student> studentSet = new TreeSet<>(new StudentComparator());
            Map<String, Student> studentMap = entry.getValue().getStudentMap();
            Set<Map.Entry<String, Student>> entries1 = studentMap.entrySet();
            for (Map.Entry<String, Student> stringStudentEntry : entries1) {
                Student value = stringStudentEntry.getValue();
                value.setName(value.getName()+stringStudentEntry.getKey());
                studentSet.add(value);
            }
            for (Student student : studentSet) {
                System.out.println(student);
            }

        }

    }

    /**
     * 计算总成绩
     * @param class1 班级
     * @return 总成绩
     */
    public static double num(Class class1){
        double zongChengJi=0;
        Set<Map.Entry<String, Student>> entries = class1.getStudentMap().entrySet();
        for (Map.Entry<String, Student> entry : entries) {
            zongChengJi+= entry.getValue().getLanguageGrade()+entry.getValue().getMathGrade();
        }
        class1.getStudentMap().forEach((s,c)->{

        });

        return  zongChengJi;
    }

    /**
     * 计算语文成绩
     * @param class1 班级
     * @return 语文成绩
     */
    public static double languageNum(Class class1){
        double yuwen=0;
        Set<Map.Entry<String, Student>> entries = class1.getStudentMap().entrySet();
        for (Map.Entry<String, Student> entry : entries) {
            yuwen+= entry.getValue().getLanguageGrade();
        }
        class1.getStudentMap().forEach((s,c)->{

        });

        return  yuwen;
    }

    /**
     * 计算总成绩
     * @param class1 班级
     * @return 总成绩
     */
    public static double shuxue(Class class1){
        double shuxue=0;
        Set<Map.Entry<String, Student>> entries = class1.getStudentMap().entrySet();
        for (Map.Entry<String, Student> entry : entries) {
            shuxue+= entry.getValue().getMathGrade();
        }
        class1.getStudentMap().forEach((s,c)->{

        });

        return  shuxue;
    }

    /**
     * 语文平均成绩
     */

    public static double vge(Class class1){
        double v = languageNum(class1);
        v= v/class1.getStudentMap().size();
        return v;
    }

    /**
     * 数学平均成绩
     */

    public static double vge1(Class class1){
        double v = shuxue(class1);
        v= v/class1.getStudentMap().size();
        return v;
    }

    /**
     * 加分
     */
    public static void sumFen(Class class1){

        Set<Map.Entry<String, Student>> entries = class1.getStudentMap().entrySet();
        System.out.println(class1.getClassName()+"加分之前：");
        for (Map.Entry<String, Student> entry : entries) {
            Student value = entry.getValue();
            System.out.println("学生姓名:"+value.getName()+" 学生性别："+value.getSex()+" 学生语文成绩："+value.getLanguageGrade()+"  学生数学成绩："+value.getMathGrade());
        }
        boolean bo=true;
        while (bo) {
            for (Map.Entry<String, Student> entry : entries) {
                bo=false;
                if (entry.getValue().getLanguageGrade() < 60) {
                            for (Map.Entry<String, Student> stringStudentEntry : entries) {
                                String key = stringStudentEntry.getKey();
                                Student value = stringStudentEntry.getValue();
                                value.setLanguageGrade(value.getLanguageGrade() + 2);
                            }
                            bo=true;
                            break;
                }

            }


        }


        System.out.println(class1.getClassName()+"加分之后：");
        for (Map.Entry<String, Student> entry : entries) {
            if (entry.getValue().getLanguageGrade()>100){
                entry.getValue().setLanguageGrade(100);
            }
            Student value = entry.getValue();
            System.out.println("学生姓名:"+value.getName()+" 学生性别："+value.getSex()+" 学生语文成绩："+value.getLanguageGrade()+"  学生数学成绩："+value.getMathGrade());
        }

    }

}

class Student{
    private String name;
    private Character sex;
    private double languageGrade;
    private double mathGrade;

    public Student(String name, Character sex, double languageGrade, double mathGrade) {
        this.name = name;
        this.sex = sex;
        this.languageGrade = languageGrade;
        this.mathGrade = mathGrade;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Character getSex() {
        return sex;
    }

    public void setSex(Character sex) {
        this.sex = sex;
    }

    public double getLanguageGrade() {
        return languageGrade;
    }

    public void setLanguageGrade(double languageGrade) {
        this.languageGrade = languageGrade;
    }

    public double getMathGrade() {
        return mathGrade;
    }

    public void setMathGrade(double mathGrade) {
        this.mathGrade = mathGrade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Double.compare(student.languageGrade, languageGrade) == 0 &&
                Double.compare(student.mathGrade, mathGrade) == 0 &&
                Objects.equals(name, student.name) &&
                Objects.equals(sex, student.sex);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, sex, languageGrade, mathGrade);
    }

    @Override
    public String toString() {
        return "姓名='" + name + ' ' +
                ", 性别=" + sex +
                ", 语文成绩=" + languageGrade +
                ", 数学成绩=" + mathGrade +"总成绩"+(languageGrade+mathGrade);
    }
}

/**
 * 比较器
 */
class  StudentComparator implements Comparator{
    @Override
    public int compare(Object o1, Object o2) {
        Student student1= (Student)o1;
        Student student2= (Student)o2;
        int re =(int)((student2.getLanguageGrade()+student2.getMathGrade()-(student1.getLanguageGrade()+student1.getMathGrade())));
         re =(int)(re==0?student2.getLanguageGrade()-student1.getLanguageGrade():re);
         re =(int)(re==0?student2.getMathGrade()-student1.getMathGrade():re);
         re=re==0?student1.getName().compareTo(student2.getName()):re;
        return re;
    }
}


class Class{
    private String className;
    private Map<String,Student> studentMap;

    public Class(String className) {
        this.className = className;
        studentMap = new TreeMap<>();
    }

    public Class() {
        studentMap = new TreeMap<>();

    }


    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public Map<String, Student> getStudentMap() {
        return studentMap;
    }

    public void setStudentMap(Map<String, Student> studentMap) {
        this.studentMap = studentMap;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Class aClass = (Class) o;
        return Objects.equals(className, aClass.className) &&
                Objects.equals(studentMap, aClass.studentMap);
    }

    @Override
    public int hashCode() {
        return Objects.hash(className, studentMap);
    }
}

class School{
    private Map<String,Class> classMap = new HashMap<>();
    private String schoolName ;

    public School( String schoolName) {
        this.schoolName = schoolName;
    }

    public School() {
    }

    public Map<String, Class> getClassMap() {
        return classMap;
    }

    public void setClassMap(Map<String, Class> classMap) {
        this.classMap = classMap;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    /**
     * 换班
     * @param StudentID1 学生id
     * @param classID2  转移后的班级
     */
    public void shift(String StudentID1,String classID2){
        Set<Map.Entry<String, Class>> entries = classMap.entrySet();
        Student student =null;
        for (Map.Entry<String, Class> entry : entries) {
            if(entry.getValue().getStudentMap().containsKey(StudentID1)){
                 student = entry.getValue().getStudentMap().get(StudentID1);
                entry.getValue().getStudentMap().remove(StudentID1);
            }
        }

        for (Map.Entry<String, Class> entry : entries){
            if (entry.getKey().equals(classID2)){
                entry.getValue().getStudentMap().put(StudentID1,student);
            }
        }

        System.out.println("换班之后");
        for (Map.Entry<String, Class> entry : entries) {
            System.out.println("班级"+entry.getKey()+entry.getValue().getStudentMap());
        }



    }



}
