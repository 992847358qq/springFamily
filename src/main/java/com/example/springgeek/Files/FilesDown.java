package com.example.springgeek.Files;

import org.apache.commons.io.FileUtils;

import java.io.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.Date;

/**
 * @Author: wgl
 * @Date: 2020/04/24 09:55
 * @Description:
 */
public class FilesDown {
    public static void main(String[] args) {
        String url = "https://tsn.baidu.com/text2audio?tex=%E5%A5%BD({pinyin})&tok=24.814fca41f505e453bdf8543ebcbbe927.2592000.1590284983.282335-19553203&cuid=qevfrg122erbh645534v4ghkil&ctp=1&lan=zh&spd=2.5&pit=5&vol=5&aue=3&per=1";
        //String url = "https://tsn.baidu.com/text2audio?tex=好({pinyin})&tok=24.814fca41f505e453bdf8543ebcbbe927.2592000.1590284983.282335-19553203&cuid=qevfrg122erbh645534v4ghkil&ctp=1&lan=zh&spd=3&pit=5&vol=5&aue=3";
        String filePath = "d:\\mp3\\{pinyin}.mp3";
        File file = new File("d:\\mp3\\pinyin.txt");
        ArrayList<String> arrayList = new ArrayList<>();
        try {
            FileReader fr = new FileReader(file);
            BufferedReader bf = new BufferedReader(fr);
            String str;
            // 按行读取字符串
            while ((str = bf.readLine()) != null) {
                arrayList.add(str);
            }
            bf.close();
            fr.close();
            for (String chinese:arrayList){
               String newUrl = url.replace("{pinyin}",chinese);
                String newfilePath = filePath.replace("{pinyin}",chinese);
                InputStream in = new URL(newUrl).openConnection().getInputStream();
                File files = new File(newfilePath);
                FileOutputStream f = new FileOutputStream(files);
                //接收度缓存
                byte [] bb=new byte[1024];
                int len;
                //接收
                while( (len=in.read(bb))>0){
                    //写入文件
                    f.write(bb, 0, len);
                }
                f.close();
                in.close();
                Thread.sleep(300);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
