package com.yonyou.day15;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @Author Õıº—≈Ù
 * @Date 2022/1/14 13:13
 * @Description
 */
public class FileWriteTest11 {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = new FileWriter("dddd.txt");
        fileWriter.write("adfskljljljljljljljljljljljljljljjjlfjkd;as");
    }
}
