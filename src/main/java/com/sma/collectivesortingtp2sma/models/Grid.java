package com.sma.collectivesortingtp2sma.models;

import javafx.scene.control.Cell;

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
                this.grid[][] = new Cell(x, y);
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
    public void setElement(int x, int y, IElement element) {
        this.grid.setElement(element);
    }
}
