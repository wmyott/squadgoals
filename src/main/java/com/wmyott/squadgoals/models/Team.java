package com.wmyott.squadgoals.models;

public class Team {
    private final String name;
    private final int rosterSize;

    public String getName()
    {
        return name;
    }

    public int getRosterSize()
    {
        return rosterSize;
    }

    public Team(String name, int rosterSize)
    {
        this.name = name;
        this.rosterSize = rosterSize;
    }
}
