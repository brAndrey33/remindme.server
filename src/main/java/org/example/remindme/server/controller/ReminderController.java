package org.example.remindme.server.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/Remind")
public class ReminderController {

    @RequestMapping(value = "/get",method = RequestMethod.GET)
    public String getReminder(){
        return "May Reminder";
    }


}
