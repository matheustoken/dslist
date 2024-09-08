package com.devsuperior.dslist.projections;

public interface GameMinProjection {

    Long getID();
    String getTitle();
    Integer getYear();
    String getImgUrl();
    String getShortDescription();
    String getLongDescription();
    Integer getPosition();

}
