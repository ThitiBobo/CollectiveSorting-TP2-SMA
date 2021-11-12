package com.sma.collectivesortingtp2sma.models;

public interface IGrid {

    int getWidth();

    int getHeight();

    IElement getElement(int x, int y);
    IElement getElement(Coordonate coordonate);

    void setElement(int x, int y, IElement element);
    void setElement(Coordonate coordonate, IElement element);
}
