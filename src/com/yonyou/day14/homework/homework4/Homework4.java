package com.yonyou.day14.homework.homework4;

import java.io.File;
import static com.yonyou.day14.homework.homework3.Homework3.copyDir;

/**
 * @Author 王佳鹏
 * @Date 2022/1/13 19:48
 * @Description
 *  3、	把D盘的唐诗目录复制到当前的项目目录之下，然后删除d盘的唐诗目录
 */
public class Homework4 {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\24954\\Desktop\\io");
        File file1 = new File(".");
        copyDir(file,file1);
        deleteDir(file);

    }

    private static void deleteDir(File file) {
        File[] files = file.listFiles();
        for (File file2 : files) {
            if (file2.isFile()){
                System.out.println(file2.delete());
            }else if (file2.listFiles().length==0){
                System.out.println(file2.delete());
            }else {
                deleteDir(file2);
            }
        }

        deleteDir(file);
    }
}
