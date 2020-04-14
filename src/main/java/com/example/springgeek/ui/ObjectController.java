package com.example.springgeek.ui;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @Author: wgl
 * @Date: 2020/03/13 11:03
 * @Description:
 */
@RestController
public class ObjectController {

    @RequestMapping(value = "list",method = RequestMethod.POST)
    public List dataController(@RequestBody List<Map<String,Object>> list){
        List newList = new ArrayList();
        newList.addAll(list);
        return newList;
    }
}
