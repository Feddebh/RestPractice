package com.example.player_restsrvc.domain;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Player {

    private Integer id;
    private String playerName;

    public Player(Integer id, String playerName) {
        this.id = id;
        this.playerName = playerName;
    }
}
