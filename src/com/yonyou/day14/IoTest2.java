package com.yonyou.day14;

import java.io.*;

/**
 * @Author Õıº—≈Ù
 * @Date 2022/1/13 12:00
 * @Description
 */
public class IoTest2 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("a.txt",false);
        fileOutputStream.write(new byte[]{'a','b','c'});
        fileOutputStream.write("\r\n".getBytes());
        fileOutputStream.write(new byte[]{'a','b','c'});
        fileOutputStream.write("\r".getBytes());
        fileOutputStream.write(new byte[]{'a','b','c'});
        fileOutputStream.close();
    }
}
