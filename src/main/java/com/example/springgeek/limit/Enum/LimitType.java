package com.example.springgeek.limit.Enum;

/**
 * @Author: wgl
 * @Date: 2020/06/28 16:36
 * @Description: 限流类型
 */
public enum LimitType {
    /**
     * 自定义key
     */
    CUSTOMER,

    /**
     * 请求者IP
     */
    IP;
}
