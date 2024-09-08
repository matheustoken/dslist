package com.devsuperior.dslist.dto;


import com.devsuperior.dslist.entities.GameList;

public class GameListDTO {
    private Long id;
    private String Name;

    public GameListDTO(){
    }

    public GameListDTO(GameList entity) {
        id = entity.getId();
        Name = entity.getName();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}
