package com.yonyou.day14;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Author Õıº—≈Ù
 * @Date 2022/1/13 14:10
 * @Description
 *      ≤‚ ‘IO
 */
public class IOTest3 {
    public static void main(String[] args) {
        FileInputStream fileInputStream=null;
        try {
            int read=0;
            fileInputStream =new FileInputStream("a.txt");
            while ((read=fileInputStream.read())!=-1){

            System.out.print((char)read);}
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
