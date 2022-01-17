package com.yonyou.day14.homework.homework5;

import java.io.*;

import static com.yonyou.day14.homework.homework3.Homework3.copy;

/**
 * @Author 王佳鹏
 * @Date 2022/1/13 20:09
 * @Description
 *  4、	在d盘的根目录下保存两种图片文件，一种为.jpg格式的文件，
 *  另一种是.png格式的文件。
 *  使用File类创建两个目录，
 *  目录名分别为“jpg图片”和“png图片”。
 *  然后将扩展名为.png的图片移动到png图片目录下，
 *  将jpg格式的图片移动到jpg图片的目录下。
 */
public class Homework5 {
    public static void main(String[] args) {
        File file1 = new File("jpg文件");
        File file2 = new File("png文件");
        File file3 = new File("C:\\Users\\24954\\Desktop\\io");
        file1.mkdir();
        file2.mkdir();
        File file4 = new File(file1, "jpg文件");
        File file5 = new File(file1, "png文件");
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream=null;
        File[] files = file3.listFiles();
        for (File file : files) {


            if(file.getName().endsWith(".jpg")) {
               copy(file,file4);
                }
            else {
                copy(file,file5);

            }
            }
        }
    }

