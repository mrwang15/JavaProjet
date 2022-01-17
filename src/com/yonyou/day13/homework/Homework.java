package com.yonyou.day13.homework;

import java.util.*;

/**
 * @Author ������
 * @Date 2022/1/12 15:02
 * @Description
 */
public class Homework {
    public static void main(String[] args) {
        Class class1 =new Class("1001");
        Map<String, Student> map1 = class1.getStudentMap();
        map1.put("1001",new Student("zhangsan",'��',100,20));
        map1.put("1002",new Student("zhangsan1",'��',15,20));
        map1.put("1003",new Student("zhangsan",'��',13,21));
        Class class2 =new Class("1002");
        Map<String, Student> map2 = class2.getStudentMap();
        map2.put("1004",new Student("zhangsan",'��',15,20));
        map2.put("1005",new Student("zhangsan1",'��',15,20));
        map2.put("1006",new Student("zhangsan",'��',15,20));

        School school = new School("ũ��");
        school.getClassMap().put("001",class1);
        school.getClassMap().put("002",class2);
        //ת�༶
        school.shift("1001","002");
        //�ܳɼ�
        school.getClassMap().forEach((s,c)->{
            double num = num(c);
            System.out.println(s+"�ܳɼ�Ϊ"+num);
        });

        //�����ܳɼ�
        school.getClassMap().forEach((s,c)->{
            double num = languageNum(c);
            double vge = vge(c);
            System.out.println(s+"�����ܳɼ�Ϊ"+num);
            System.out.println(s+"����ƽ����Ϊ"+vge);
        });

        //�����ܳɼ�
        school.getClassMap().forEach((s,c)->{
            double num = shuxue(c);
            double v = vge1(c);
            System.out.println(s+"��ѧ�ܳɼ�Ϊ"+num);
            System.out.println(s+"��ѧƽ����Ϊ"+v);

        });

        school.getClassMap().forEach((s,c)->{
            sumFen(c);
        });


        //����

        Map<String, Class> classMap = school.getClassMap();
        Set<Map.Entry<String, Class>> entries = classMap.entrySet();
        for (Map.Entry<String, Class> entry : entries) {
            System.out.println("�༶"+entry.getKey());
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
     * �����ܳɼ�
     * @param class1 �༶
     * @return �ܳɼ�
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
     * �������ĳɼ�
     * @param class1 �༶
     * @return ���ĳɼ�
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
     * �����ܳɼ�
     * @param class1 �༶
     * @return �ܳɼ�
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
     * ����ƽ���ɼ�
     */

    public static double vge(Class class1){
        double v = languageNum(class1);
        v= v/class1.getStudentMap().size();
        return v;
    }

    /**
     * ��ѧƽ���ɼ�
     */

    public static double vge1(Class class1){
        double v = shuxue(class1);
        v= v/class1.getStudentMap().size();
        return v;
    }

    /**
     * �ӷ�
     */
    public static void sumFen(Class class1){

        Set<Map.Entry<String, Student>> entries = class1.getStudentMap().entrySet();
        System.out.println(class1.getClassName()+"�ӷ�֮ǰ��");
        for (Map.Entry<String, Student> entry : entries) {
            Student value = entry.getValue();
            System.out.println("ѧ������:"+value.getName()+" ѧ���Ա�"+value.getSex()+" ѧ�����ĳɼ���"+value.getLanguageGrade()+"  ѧ����ѧ�ɼ���"+value.getMathGrade());
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


        System.out.println(class1.getClassName()+"�ӷ�֮��");
        for (Map.Entry<String, Student> entry : entries) {
            if (entry.getValue().getLanguageGrade()>100){
                entry.getValue().setLanguageGrade(100);
            }
            Student value = entry.getValue();
            System.out.println("ѧ������:"+value.getName()+" ѧ���Ա�"+value.getSex()+" ѧ�����ĳɼ���"+value.getLanguageGrade()+"  ѧ����ѧ�ɼ���"+value.getMathGrade());
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
        return "����='" + name + ' ' +
                ", �Ա�=" + sex +
                ", ���ĳɼ�=" + languageGrade +
                ", ��ѧ�ɼ�=" + mathGrade +"�ܳɼ�"+(languageGrade+mathGrade);
    }
}

/**
 * �Ƚ���
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
     * ����
     * @param StudentID1 ѧ��id
     * @param classID2  ת�ƺ�İ༶
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

        System.out.println("����֮��");
        for (Map.Entry<String, Class> entry : entries) {
            System.out.println("�༶"+entry.getKey()+entry.getValue().getStudentMap());
        }



    }



}
