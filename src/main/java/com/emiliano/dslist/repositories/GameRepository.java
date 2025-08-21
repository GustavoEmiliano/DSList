package com.emiliano.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.emiliano.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
