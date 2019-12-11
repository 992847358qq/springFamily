package com.example.bootFight.el;

import io.micrometer.core.instrument.util.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;

import javax.annotation.Resource;

/**
 * @Author: wgl
 * @Date: 2019/12/11 11:55
 * @Description:
 */
@Configuration
@ComponentScan("com.example.bootFight.el")
@PropertySource("classpath:com/example/bootFight/el/test.properties")
public class ElConfig {
    @Value("IIII")
    private String normal;
    @Value("#{systemProperties['os.name']}")
    private String osName;
    @Value("#{T(java.lang.Math).random() * 100.0}")
    private Double randomNumber;
    @Value("#{demoService.another}")
    private String fromAnother;
    @Value("classpath:com/example/bootFight/el/test.txt")
    private Resource testFile;
    @Value("www.baidu.com")
    private Resource url;
    @Value("${book.name}")
    private String bookName;
    @Autowired
    private Environment environment;

    public static PropertySourcesPlaceholderConfigurer propertyConfigure(){
        return  new PropertySourcesPlaceholderConfigurer();
    }
    public void outputResource(){
        System.out.println(normal);
        System.out.println(osName);
        System.out.println(randomNumber);
        System.out.println(fromAnother);
        System.out.println();
        System.out.println(randomNumber);
    }
}
