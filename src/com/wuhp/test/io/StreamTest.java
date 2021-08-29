package com.wuhp.io;

import java.io.*;

/**
 * @description:
 * 按照流的流向分，可以分为输入流和输出流；
 * 按照操作单元分，可以分为字节流和字符流（字节流可以读写任何单位的数据，字符流只可以读写txt数据）；
 * 按照流的角色分，可以分为节点流和处理流；
 *
 * BIO：Block IO 同步阻塞式IO，就是我们平时使用的传统IO，特点是模式简单使用方便，但是并发处理能力低；
 * NIO：Non IO 同步非阻塞IO，传统IO的升级，客户端与服务端通过Channel（通道）通讯，实现了多路复用；
 * AIO：Asynchronous IO 异步非阻塞IO，异步IO的操作基于事件和回调机制。
 *
 * 1.java的输入流主要是InputStream和Reader作为基类，而输出流则是主要由outputStream和Writer作为基类
 * 它们都是一些抽象基类，无法直接创建实例
 * 2.InputStream是所有输入字节流类的超类
 * 3.InputStream/Reader: 所有的输入流的基类，前者是字节输入流，后者是字符输入流
 * 4.OutputStream/Writer: 所有输出流的基类，前者是字节输出流，后者是字符输出流
 * 5.FileInputStream和FileReader:读取文件的输入流
 * 6.FileOutputStream/FileWriter:文件输出流
 * @author:Wuhp
 * @createTime:2021/8/29 15:52
 */
public class StreamTest {
    public static void main(String[] args) throws IOException {
        //fileWriter();
        //bufferWriter();
        fileOutPutStream();
    }

    /**
     * FileWriter写入文件  覆盖内容方式
     * @throws IOException
     */
    public static void fileWriter() throws IOException {
        File file = new File("D:" + File.separator + "filepath" + File.separator + "test" + File.separator + "test.txt");
        String data = "this content will override the file";
        FileWriter fileWriter = new FileWriter(file.getPath());
        fileWriter.write(data);
        System.out.println("fileWriter done");
        fileWriter.close();
    }

    /**
     * FileWriter写入文件 追加内容方式
     * @throws IOException
     */
    public static void fileWriter2() throws IOException {
        File file = new File("D:" + File.separator + "filepath" + File.separator + "test" + File.separator + "test.txt");
        String data = "this content will append to the end of the file";
        FileWriter fileWriter = new FileWriter(file.getPath(),true);
        fileWriter.write(data);
        System.out.println("fileWriter2 done");
        fileWriter.close();
    }

    /**
     * BufferedWriter写入文件
     * @throws IOException
     */
    public static void bufferWriter() throws IOException {
        File file = new File("D:" + File.separator + "filepath" + File.separator + "test" + File.separator + "test.txt");
        String data = "bufferwriter";
        FileWriter fw = new FileWriter(file.getAbsoluteFile());
        BufferedWriter bufferedWriter = new BufferedWriter(fw);
        bufferedWriter.write(data);
        bufferedWriter.close();
        System.out.println("bufferedWriter done");
    }

    /**
     * FileOutPutStream写入文件
     * @throws IOException
     */
    public static void fileOutPutStream() throws IOException{
        String data  = "fileOutPutStream";
        File file = new File("D:" + File.separator + "filepath" + File.separator + "test" + File.separator + "test.txt");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        byte[] bytes = data.getBytes();
        fileOutputStream.write(bytes);
        fileOutputStream.flush();
        fileOutputStream.close();
        System.out.println("fileOutputStream done");
    }

}
