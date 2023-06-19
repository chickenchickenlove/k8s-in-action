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
        System.out.println("hello ash");
        log.trace("hello info");
        log.debug("hello info");
        log.info("hello info");
        log.warn("hello info");
        log.error("hello info");
        return "ok";
    }
}
