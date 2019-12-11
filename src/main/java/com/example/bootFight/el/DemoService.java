package com.example.bootFight.el;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * @Author: wgl
 * @Date: 2019/12/11 11:54
 * @Description:
 */
@Service
public class DemoService {
    @Value("其他类的属性")
    private String another;

    public String getAnother() {
        return another;
    }

    public void setAnother(String another) {
        this.another = another;
    }
}
