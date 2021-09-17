package com.example.player_restsrvc.player.controller;

import com.example.player_restsrvc.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController

public class Controller {
    @Autowired
    private PlayerService playerService;

    @RequestMapping(value ="/message")//localhost:8080/message
    public String getMessage(){
        return "Hey there, I am from Controller.";

    }
}
