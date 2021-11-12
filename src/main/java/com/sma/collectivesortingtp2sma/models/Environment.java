package com.sma.collectivesortingtp2sma.models;

import com.sma.collectivesortingtp2sma.models.agents.IAgent;

import java.util.List;

public class Environment {

    private IGrid resourceGrid;
    private IGrid agentGrid;

    private List<IAgent> agents;
    private List<Object> objects;

    public IGrid getAgentGrid(){
        // TODO copy() ??
        return agentGrid;
    }

    public IGrid getResourceGrid(){
        // TODO copy() ??
        return resourceGrid;
    }

    public Environment(){
        //TODO
    }

    public void step(){
        //TODO implement step method
    }


}
