package com.sz.ruiji;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Auther: sz
 * @Date: 2022/7/29 - 07 - 29 - 16:54
 * @Description: com.sz.ruiji
 * @version: 1.0
 * @description：这个类或接口是 启动类
 */
@Slf4j
@SpringBootApplication
public class RuijiApplication {
    public static void main(String[] args) {
        SpringApplication.run(RuijiApplication.class,args);
        log.info("启动成功");
    }
}
