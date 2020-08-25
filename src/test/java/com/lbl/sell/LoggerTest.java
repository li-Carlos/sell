package com.lbl.sell;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
public class LoggerTest {

    @Test
    public void test1(){
        String name="lbl";
        String passwd="123456";
        log.info("name{},passwd{}",name,passwd);
        log.info("info.....");
        log.debug("debug.....");
        log.error("error.....");
    }
}
