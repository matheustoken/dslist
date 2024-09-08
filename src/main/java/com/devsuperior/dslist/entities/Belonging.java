package com.devsuperior.dslist.entities;


import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.Objects;


@Entity
@Table(name="tb_belonging")
public class Belonging {

    @EmbeddedId
    private Belongingpk id = new Belongingpk();

    private Integer position;

    public Belonging (){
    }

    public Belonging(Integer position, Game game, GameList list) {
        this.position = position;
        id.setGame(game);
        id.setList(list);
    }

    public Belongingpk getId() {
        return id;
    }

    public void setId(Belongingpk id) {
        this.id = id;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Belonging belonging = (Belonging) o;
        return Objects.equals(id, belonging.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
