package com.example.player_restsrvc.service;
import com.example.player_restsrvc.domain.Player;
import com.example.player_restsrvc.repository.PlayersRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

@org.springframework.stereotype.Service

public class PlayerService {
    @Autowired
    private PlayersRepository repository;


    public PlayerService() {
        System.out.println("Service layer has been created.");
    }
//Return all the players
        public List<Player> getAllThePlayers(){
            return (List<Player>) repository.findAll();

        }
//Return a Single Player
        public Player getPlayer(int id){
           return repository.findById(id).get();
        }

        public void savePlayer(Player player){
        repository.save(player);
        }

        public void updatePlayer(Player player) {
            if (repository.findById(player.getId())!=null) {
                repository.save(player);
            }
        }

        public void deletePlayer(int id){
         try {
             repository.deleteById(id);
         } catch (Exception e) {
             System.out.println("Fallo!!");
         }
        }
    }


