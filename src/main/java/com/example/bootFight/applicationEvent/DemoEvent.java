package com.example.bootFight.applicationEvent;

import org.springframework.context.ApplicationEvent;

/**
 * @Author: wgl
 * @Date: 2019/12/12 19:55
 * @Description: 自定义事件
 */
public class DemoEvent extends ApplicationEvent {

    private static final long serialVersionUID = 8791468124652877406L;
    private String msg;

    public DemoEvent(Object source,String msg) {
        super(source);
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
