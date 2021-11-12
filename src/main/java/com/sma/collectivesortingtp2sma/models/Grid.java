package com.sma.collectivesortingtp2sma.models;

public class Grid implements IGrid{

    private int width;
    private int height;

    private Cell[][] grid;

    public Grid(int width, int height){
        this.width = width;
        this.height = height;
        this.grid = new Cell[width][height];

        for (int y = 0; y < this.height; y++) {
            for (int x = 0; x < this.width; x++) {
                this.grid[x][y] = new Cell(new Coordinates(x, y));
            }
        }

    }

    @Override
    public int getWidth() {
        return this.width;
    }

    @Override
    public int getHeight() {
        return this.height;
    }

    @Override
    public IElement getElement(int x, int y) {
        return this.grid[x][y].getElement();
    }

    @Override
    public IElement getElement(Coordinates coordinates) {
        return getElement(coordinates.getX(), coordinates.getY());
    }

    @Override
    public void setElement(int x, int y, IElement element) {
        this.grid[x][y].setElement(element);
    }

    @Override
    public void setElement(Coordinates coordinates, IElement element) {
        setElement(coordinates.getX(), coordinates.getY(), element);
    }
}
