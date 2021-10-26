package com.example.player_restsrvc.service;

import com.example.player_restsrvc.domain.Player;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.springframework.test.util.AssertionErrors.*;

public class PlayerServiceTest {

    public PlayerService playerService = new PlayerService();

    @Test
    public void testCreateSixStartingPlayers(){
        List<Player> allThePlayers = playerService.getAllThePlayers();
        assertEquals("No hay 6 jugadores", 6, allThePlayers.size());
    }

    @Test
    public void testSavePlayer() {
        Player pedrito = new Player(7, "Pedrito");
        playerService.savePlayer(pedrito);
        List<Player> allThePlayers = playerService.getAllThePlayers();
        assertTrue("No se guardo Pedrito.", allThePlayers.contains(pedrito));
    }

    @Test
    public void testDeletePlayer() {
        Player kike = new Player(5, "Kike");
        playerService.deletePlayer(5);
        List<Player> allThePlayers = playerService.getAllThePlayers();
        assertFalse("No se borro a kike", allThePlayers.contains(kike));

    }

    @Test
    public void testDeletePlayerThatDoesNotExist() {
        playerService.deletePlayer(100);
    }
}
