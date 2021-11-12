package com.sma.collectivesortingtp2sma.models;

public class Object implements IElement {

    private Coordinates coordinates;
    private int type;

    public Object(Coordinates coordinates){
        this.coordinates = coordinates;
    }
    public Object(Coordinates coordinates, int type){
        this.coordinates = coordinates;
        this.type = type;
    }

    @Override
    public Coordinates getCoordinates() {
        return null;
    }

    @Override
    public void move(Coordinates coordinates) {
        this.coordinates = coordinates;
    }
}
