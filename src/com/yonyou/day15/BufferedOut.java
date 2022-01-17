package com.yonyou.day15;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Author Õıº—≈Ù
 * @Date 2022/1/14 13:10
 * @Description
 */
public class BufferedOut {
    public static void main(String[] args) throws IOException {
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream("ccc.txt"),5);
        bufferedOutputStream.write("heoopheoopheoopaaa1111".getBytes());
    }
}
