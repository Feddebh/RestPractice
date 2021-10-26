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
    @GetMapping(value = "/players")
    public List<Player> getPlayers(){
        return playerService.getAllThePlayers();
    }

    @GetMapping (value = "players/{id}")
    public Player getPlayerById(@PathVariable int id){
        return playerService.getPlayer(id);
    }

    //POST
    @PostMapping (value = "players/save")
    public void savePlayer(@RequestBody Player player){
        playerService.savePlayer(player);
    }

    //PUT

    @PutMapping (value = "playerservice/players/update")
    public void updatePlayer(@RequestBody Player player){
        playerService.updatePlayer(player);
    }


    @DeleteMapping (value = "players/delete")
    public void deletePlayer(int id){
        playerService.deletePlayer(id);
    }
}
