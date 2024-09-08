package com.devsuperior.dslist.dto;

import com.devsuperior.dslist.entities.Game;

public class GameMinDTO {


    private Long id;
    private String title;
    private Integer year;
    private String imgUrl;
    private String shortDescription;

    public GameMinDTO(){

    }

    // Construtor com e sem argumentos
    // Construtor que recebe a entidade, gerar um GameMinDTO recebendo os dados da entidade
    // GameMinDTO instanciando via objeto Game, copiando os dados do game para O DTO
    //Salvo o ID da entidade e salvo la no ID do DTO
    // não tem mais ambiguidade não precisa do this
    //arquitetura de camadas, consulta o banco traz pro service e devolve pro DTO equivalente ao controlador.
    // repository consulta ao banco de dados.
    public GameMinDTO(Game entity) {
        id = entity.getId();
        title = entity.getTitle();
        year = entity.getYear();
        imgUrl = entity.getImgUrl();
        shortDescription = entity.getShortDescription();
    }

    public String getTitle() {
        return title;
    }

    public Long getId() {
        return id;
    }

    public Integer getYear() {
        return year;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public String getShortDescription() {
        return shortDescription;
    }
}
