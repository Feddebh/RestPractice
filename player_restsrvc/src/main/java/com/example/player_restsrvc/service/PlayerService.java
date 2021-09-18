package com.example.player_restsrvc.service;
import com.example.player_restsrvc.domain.Player;
import java.util.ArrayList;
import java.util.List;

@org.springframework.stereotype.Service

public class PlayerService {
    List<Player> list = new ArrayList<>();
    public PlayerService() {
        System.out.println("Service layer has been created.");
        list.add(new Player(1, "Kamero"));
        list.add(new Player(2, "Pakin"));
        list.add(new Player(3, "Miguel"));
        list.add(new Player(4, "Christian"));
        list.add(new Player(5, "Kike"));
        list.add(new Player(6, "Barrientos"));
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
            list.remove(id);
            }
    }


