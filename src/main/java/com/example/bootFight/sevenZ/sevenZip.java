package com.example.bootFight.sevenZ;

import org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry;
import org.apache.commons.compress.archivers.sevenz.SevenZOutputFile;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

/**
 * @Author: wgl
 * @Date: 2019/12/16 10:50
 * @Description:
 */
public class sevenZip {

   /**
     * 压缩 7z
     * @param orgPath
     * @param tarPath
     */
    public  static void apache7Z(String orgPath, String tarPath) {
        try {
            File orgFile = new File(orgPath);
            if (!orgFile.exists()) {
                return;
            }
            SevenZOutputFile sevenZOutput = new SevenZOutputFile(new File(tarPath));
            zip7z(orgFile, sevenZOutput, tarPath);
            sevenZOutput.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

   public static void zip7z(File orgFile, SevenZOutputFile sevenZOutput, String basePath) throws IOException {
        BufferedInputStream bis;
        if (orgFile.isDirectory()) {
            SevenZArchiveEntry entry = sevenZOutput.createArchiveEntry(orgFile, orgFile.getPath().substring(basePath.length()));
            sevenZOutput.putArchiveEntry(entry);
            for (File file : orgFile.listFiles()) {
                zip7z(file, sevenZOutput, basePath);
            }
        } else {
            bis = new BufferedInputStream(new FileInputStream(orgFile));
            SevenZArchiveEntry entry = sevenZOutput.createArchiveEntry(orgFile, orgFile.getPath().substring(basePath.length()));
            sevenZOutput.putArchiveEntry(entry);
            byte[] buffer = new byte[1024];
            int len;
            while ((len = bis.read(buffer)) > 0) {
                sevenZOutput.write(buffer, 0, len);
            }
            sevenZOutput.closeArchiveEntry();
            bis.close();
        }
    }
    /**
     * 7z文件压缩
     *
     * @param inputFile  待压缩文件夹/文件名
     * @param outputFile 生成的压缩包名字
     */

    public static void Compress7z(String inputFile, String outputFile) throws Exception {
        File input = new File(inputFile);
        if (!input.exists()) {
            throw new Exception(input.getPath() + "待压缩文件不存在");
        }
        SevenZOutputFile out = new SevenZOutputFile(new File(outputFile));

        compress(out, input, null);
        out.close();
    }


    public static void compress(SevenZOutputFile out, File input, String name) throws IOException {
        if (name == null) {
            name = input.getName();
        }
        SevenZArchiveEntry entry = null;
        //如果路径为目录（文件夹）
        if (input.isDirectory()) {
            //取出文件夹中的文件（或子文件夹）
            File[] flist = input.listFiles();

            if (flist.length == 0)//如果文件夹为空，则只需在目的地.7z文件中写入一个目录进入
            {
                entry = out.createArchiveEntry(input,name + "/");
                out.putArchiveEntry(entry);
            } else//如果文件夹不为空，则递归调用compress，文件夹中的每一个文件（或文件夹）进行压缩
            {
                for (int i = 0; i < flist.length; i++) {
                    compress(out, flist[i], name + "/" + flist[i].getName());
                }
            }
        } else//如果不是目录（文件夹），即为文件，则先写入目录进入点，之后将文件写入7z文件中
        {
            FileInputStream fos = new FileInputStream(input);
            BufferedInputStream bis = new BufferedInputStream(fos);
            entry = out.createArchiveEntry(input, name);
            out.putArchiveEntry(entry);
            int len = -1;
            //将源文件写入到7z文件中
            byte[] buf = new byte[1024];
            while ((len = bis.read(buf)) != -1) {
                out.write(buf, 0, len);
            }
            bis.close();
            fos.close();
            out.closeArchiveEntry();
        }
    }

    public static void main (String[]args){
        try {
            //apache7Z("G:\\orgFile","G:\\7zFile\\seven.7z");
            System.out.println( new Date());
            Compress7z("G:\\orgFile\\smartclass", "G:\\7zFile\\newTestbyYTT.7z");
            System.out.println(new Date());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
