package com.k1oud.leetcode.util;

import java.io.File;
import java.io.IOException;

/**
 * 文件工具类
 */

public class FileUtil {

    private static String absolutePath = "D:\\1projects\\LeetcodeSolutions\\src\\main\\java\\com\\k1oud\\leetcode";

    public static void main(String[] args) throws IOException{

        //makeDirs();

        createFile();

    }

    /**
     * 创建对应的若干个包
     */
    private static void makeDirs(){
        for(int i =1 ;i<1500;i++){
            new File(absolutePath+"\\num"+i).mkdir();
        }
    }

    /**
     * 为每个包下创建对应的solution.java
     */
    private static void createFile() throws IOException {
        for (int i = 1; i < 1500; i++) {
            new File(absolutePath+"\\num"+i+"\\Solution.java").createNewFile();
        }

    }
}
