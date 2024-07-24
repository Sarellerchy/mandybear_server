package com.example.mandybear_server;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class UserContentController {

    @PostMapping("/send")
    public int receiveContent(@RequestBody UserContent userContent) {
//        String content = userContent.getContent();
        int userscnt = userContent.getUsersCnt();
//        return "Received content: " + content + ", users count: " + userscnt;
        return userscnt;
    }
}
