package com.knoldus.chat_application.controller;

import com.knoldus.chat_application.model.GroupMessage;
import com.knoldus.chat_application.model.GroupMessageRepository;
import com.knoldus.chat_application.service.GroupMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping (path = "/group")
public class GroupMessageController {
    @Autowired
    GroupMessageService groupMessageService;

//    @GetMapping("/messageTest")
//    public String test() {
//        return "Hello this is my first microservice";
//    }
    @PostMapping (path = "/send/message")
    public @ResponseBody String fromUserOneToAllUser(@RequestBody GroupMessage groupMessage)
    {
        return  groupMessageService.sendData(groupMessage);
    }
    @GetMapping (path ="/fetch/messages")
    public @ResponseBody Iterable<GroupMessage> fetchGroupMessages(@RequestBody GroupMessage groupMessage)
    {
        return groupMessageService.fetchGroupMessages(groupMessage);
    }
}
