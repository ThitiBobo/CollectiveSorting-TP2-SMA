package com.sma.collectivesortingtp2sma.models.agents;

import com.sma.collectivesortingtp2sma.models.Cell;
import com.sma.collectivesortingtp2sma.models.Coordinates;
import com.sma.collectivesortingtp2sma.models.IElement;
import com.sma.collectivesortingtp2sma.models.Object;

public class Agent implements IElement {
    protected Coordinates coordinates;

    protected Object hold = null;

    public Agent(Coordinates coordinates){
        this.coordinates = coordinates;
    }

    @Override
    public Coordinates getCoordinates() {
        return this.coordinates;
    }

    public void setCoordinates(Coordinates coordinates) {
        this.coordinates = coordinates;
    }

    protected void step(){
        // TO DO : code strategy
    }

    protected void lift(Cell cell){
        if(this.hold == null){
            this.hold = (Object) cell.popElement();
            this.hold.setCoordinates(null);
        }
    }

    protected void drop(Cell cell){
        if(cell.getElement() == null){
            this.hold.setCoordinates(cell.getCoordinates());
            cell.setElement(this.hold);
            this.hold = null;
        }
    }
}
