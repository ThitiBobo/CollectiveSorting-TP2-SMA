package com.sma.collectivesortingtp2sma.models;

public class Cell {

    protected IElement element;
    protected Coordinates coordinates;

    public Cell(Coordinates coordinates) {
        this.coordinates = coordinates;
        this.element = null;
    }
    public Cell(Coordinates coordinates, IElement element) {
        this.coordinates = coordinates;
        this.element = element;
    }

    public IElement getElement() {
        return element;
    }

    public void setElement(IElement element) {
        this.element = element;
    }

    public IElement popElement(){
        IElement popedElement = this.element;
        this.element = null;
        return popedElement;
    }
}
