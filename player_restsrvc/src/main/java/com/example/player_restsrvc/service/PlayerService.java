package com.example.player_restsrvc.service;
import com.example.player_restsrvc.domain.Player;
import java.util.ArrayList;
import java.util.List;

@org.springframework.stereotype.Service

public class PlayerService {
    List<Player> list = new ArrayList<>();
    public PlayerService() {
        System.out.println("Service layer has been created.");
    }
//Return all the players
        public List<Player> getAllThePlayers(){
            return list;
        }
//Return a Single Player
        public Player getPlayer(int id){
            for (Player p : list) {
                if (p.getId() == id) {
                    return p;
                }
            }
            return null;
        }

        public void savePlayer(Player player){
        this.list.add(player);
        }

        public void updatePlayer(Player player) {
            for (Player p : list) {
                if (p.getId() == player.getId()) {
                    p.setPlayerName(player.getPlayerName());
                }
            }
        }

        public void deletePlayer(int id){
         try {
             list.remove(id);
         } catch (Exception e) {
             System.out.println("Fallo!!");
         }
        }
    }


