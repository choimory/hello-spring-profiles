package com.choimory.hellospringprofiles;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class HomeController {
    @Value("${global.print}")
    private String globalPrint;
    @Value("${profile.print}")
    private String profilePrint;

    @GetMapping
    public String home(){
        log.info("GLOBAL PROPS -> {}", globalPrint);
        log.info("PROFILE PROPS -> {}", profilePrint);
        return "CHECK LOG!";
    }
}
