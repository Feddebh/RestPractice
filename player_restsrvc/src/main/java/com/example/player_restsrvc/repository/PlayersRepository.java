package com.example.player_restsrvc.repository;

import com.example.player_restsrvc.domain.Player;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
    public interface PlayersRepository extends CrudRepository<Player, Integer> {}

