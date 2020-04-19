package com.example.springgeek.oneBoot.controller;

import com.example.springgeek.exception.BusinessErrorException;
import com.example.springgeek.exception.BusinessMsgEnum;
import com.example.springgeek.result.JsonResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

/**
 * @author MR.Wang
 * @dept
 * @description TODO
 * @date 2020/4/19 17:35
 **/
@RestController
@RequestMapping("/exception")
public class ExceptionController {
    private static final Logger logger = LoggerFactory.getLogger(ExceptionController.class);

    @GetMapping("/null/point/exception")
    public JsonResult testNullPointException() {
        String str = null;
        str.length();
        return new JsonResult();
    }

    @PostMapping("/test")
    public JsonResult test(@RequestParam("name") String name,
                           @RequestParam("pass") String pass) {

        logger.info("name：{}", name);
        logger.info("pass：{}", pass);
        return new JsonResult();
    }

    @GetMapping("/business")
    public JsonResult testException() {
        try {
            int i = 1 / 0;
        } catch (Exception e) {
            throw new BusinessErrorException(BusinessMsgEnum.UNEXPECTED_EXCEPTION);
        }
        return new JsonResult();
    }
}
