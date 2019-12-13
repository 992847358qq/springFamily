package com.example.bootFight.aware;

import io.micrometer.core.instrument.util.IOUtils;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @Author: wgl
 * @Date: 2019/12/12 21:51
 * @Description:
 */
@Service
public class AwareService implements BeanNameAware, ResourceLoaderAware {
    private String beanName;
    private ResourceLoader loader;

    @Override
    public void setBeanName(String s) {
        this.beanName = s;
    }

    @Override
    public void setResourceLoader(ResourceLoader resourceLoader) {
        this.loader = resourceLoader;
    }

    public void outputResult() throws IOException {
        System.out.println("bean的名称为：" + beanName);
        /*final String path = "F:\\githubProject\\spring-geek\\src\\main\\java\\com\\example\\bootFight\\aware\\text";
        //1、得到数据文件
        File file = new File(path);
        //2、建立数据通道
        FileInputStream fileInputStream = new FileInputStream(file);
        byte[] buf = new byte[1024];
        int length = 0;
        //循环读取文件内容，输入流中将最多buf.length个字节的数据读入一个buf数组中,返回类型是读取到的字节数。
        //当文件读取到结尾时返回 -1,循环结束。
        while ((length = fileInputStream.read(buf)) != -1) {
            System.out.print(new String(buf, 0, length));
        }
        //最后记得，关闭流
        fileInputStream.close();*/

    Resource resource = loader.getResource("classpath:com/example/bootFight/aware/text.txt");
        try {
            System.out.println("ResourceLoader加载的文件内容为："+ IOUtils.toString(resource.getInputStream()));
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    }
