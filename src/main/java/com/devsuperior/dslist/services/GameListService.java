package com.devsuperior.dslist.services;
//service é um componente do sistema, tem que ser registrado, para o framework comentar

import com.devsuperior.dslist.dto.GameDTO;
import com.devsuperior.dslist.dto.GameListDTO;
import com.devsuperior.dslist.dto.GameMinDTO;
import com.devsuperior.dslist.entities.Game;
import com.devsuperior.dslist.entities.GameList;
import com.devsuperior.dslist.repositories.GameListRepository;
import com.devsuperior.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameListService {

    //proprio spring resolve pra vc a dependencia, puxar uma instancia do GameRepository dentro do game Service
    @Autowired
    private GameListRepository gameListRepository;
    // consulta por padrão no banco de dados, feito de maneira automatica pelo framework

    public List<GameListDTO> findAll(){
        List<GameList> result= gameListRepository.findAll();
       return result.stream().map(x ->new GameListDTO(x)).toList();


    }
}
