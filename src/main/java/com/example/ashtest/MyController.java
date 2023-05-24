package com.example.ashtest;

import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class MyController {

    @GetMapping("/")
    public String hello() {

        log.trace("hello info");
        log.debug("hello info");
        log.info("hello info");
        log.warn("hello info");
        log.error("hello info");

        return "ok";
    }


//    private static int errorCount = 0;

//    @GetMapping("/health-check")
//    public String hello(HttpServletResponse response) {
//        log.info("errorCount = {}", errorCount);
//        errorCount++;
//        if (errorCount % 5 == 0) {
//            response.setStatus(500);
//        } else {
//            response.setStatus(200);
//        }
//        return "error";
//    }



}
