package com.example.bootFight.conditional;

import org.springframework.stereotype.Service;

/**
 * @Author: wgl
 * @Date: 2019/12/13 16:48
 * @Description:
 */
@Service
public class WindowsService implements TypeService {
    @Override
    public String showOperationCmd() {
        return "dir";
    }
}
