package com.example.player_restsrvc.player.controller;

import com.example.player_restsrvc.domain.Player;
import com.example.player_restsrvc.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class Controller {
    @Autowired
    private PlayerService playerService;

    //GET
    @RequestMapping (value = "/players", method = RequestMethod.GET)
    public List<Player> getPlayers(){
        return playerService.getAllThePlayers();
    }

    @RequestMapping (value = "/players/{id}", method = RequestMethod.GET)
    public Player getPlayerById(@PathVariable int id){
        return playerService.getPlayer(id);
    }

    //POST
    @RequestMapping (value = "/players/save", method = RequestMethod.POST)
    public void savePlayer(@RequestBody Player player){
        playerService.savePlayer(player);
    }

    //PUT

    @RequestMapping (value = "/players/update", method = RequestMethod.PUT)
    public void updatePlayer(@RequestBody Player player){
        playerService.updatePlayer(player);
    }

    @RequestMapping (value = "/players/delete", method = RequestMethod.DELETE)
    public void deletePlayer(int id){
        playerService.deletePlayer(id);
    }
}
