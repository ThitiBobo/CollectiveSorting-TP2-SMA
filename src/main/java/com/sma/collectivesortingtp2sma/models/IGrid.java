package com.sma.collectivesortingtp2sma.models;

public interface IGrid {

    int getWidth();

    int getHeight();

    IElement getElement(int x, int y);
    IElement getElement(Coordinates coordinates);

    void setElement(int x, int y, IElement element);
    void setElement(Coordinates coordinates, IElement element);
}
