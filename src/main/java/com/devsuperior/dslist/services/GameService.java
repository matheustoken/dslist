package com.devsuperior.dslist.services;
//service é um componente do sistema, tem que ser registrado, para o framework comentar

import com.devsuperior.dslist.dto.GameDTO;
import com.devsuperior.dslist.dto.GameMinDTO;
import com.devsuperior.dslist.repositories.GameRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.devsuperior.dslist.entities.Game;

import java.util.List;

@Service
public class GameService {

    //proprio spring resolve pra vc a dependencia, puxar uma instancia do GameRepository dentro do game Service
    @Autowired
    private GameRepository gameRepository;
    // consulta por padrão no banco de dados, feito de maneira automatica pelo framework

    public GameDTO findById(Long id){
       Game result = gameRepository.findById(id).get();
        GameDTO  dto = new GameDTO(result);
        return dto;


    }

    public List<GameMinDTO> findAll(){
        List<Game> result= gameRepository.findAll();
        List<GameMinDTO> dto = result.stream().map(x ->new GameMinDTO(x)).toList();
        return dto;

    }
}
