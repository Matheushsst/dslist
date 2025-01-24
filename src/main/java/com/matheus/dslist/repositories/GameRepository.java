package com.matheus.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.matheus.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{

}
