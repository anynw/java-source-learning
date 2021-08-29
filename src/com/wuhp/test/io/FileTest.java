package com.wuhp.io;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author:Wuhp
 * @createTime:2021/8/29 15:42
 */
public class FileTest {
    public static void main(String[] args) throws IOException {
       // createFile("test.txt");
        File file = new File("D:\\Fiddler");
        listDir(file);
    }

    public static void createFile(String fileName) throws IOException {
        System.out.println("File.separator = " + File.separator);
        File testFile = new File("D:" + File.separator + "filepath" + File.separator + "test" + File.separator + fileName);
        File parentFile = testFile.getParentFile();
        String parent = testFile.getParent();
        System.out.println("parentFile = " + parentFile);
        System.out.println("parent = " + parent);

        if (!parentFile.exists()){
            // 创建多级目录
            parentFile.mkdirs();
        }
        if (!testFile.exists()){
            // 创建文件
            testFile.createNewFile();
        }
        System.out.println("testFile.getPath() = " + testFile.getPath());
        System.out.println("testFile.getAbsolutePath() = " + testFile.getAbsolutePath());
        System.out.println("testFile.getAbsoluteFile() = " + testFile.getAbsoluteFile());
        System.out.println("testFile.getName() = " + testFile.getName());
    }

    /**
     * 遍历所有的文件
     */
    public static void listDir(File file){
        File[] files = file.listFiles();
        for (File f:
             files) {
            if(f.isDirectory()){
                listDir(f);
            }else {
                System.out.println("f.getName() = " + f.getName());
            }
        }
    }

}
