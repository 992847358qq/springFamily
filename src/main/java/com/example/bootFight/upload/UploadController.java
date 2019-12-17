package com.example.bootFight.upload;

import org.apache.commons.io.FileUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

/**
 * @Author: wgl
 * @Date: 2019/12/16 15:26
 * @Description:
 */
@RestController
@RequestMapping(value = "geek")
public class UploadController {

    @RequestMapping(value = "/upload",method = RequestMethod.POST)
    public String upload(MultipartFile file){
        try {
            FileUtils.writeByteArrayToFile(new File("G:\\7zFile\\"+file.getOriginalFilename()),file.getBytes());
            return "上传成功";
        } catch (IOException e) {
            e.printStackTrace();
            return "上传失败";
        }
    }
}
