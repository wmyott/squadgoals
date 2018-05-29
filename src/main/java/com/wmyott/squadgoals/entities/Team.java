package com.wmyott.squadgoals.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Team
{

    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable=false)
    private String teamName;

    @Column(nullable=false)
    private int teamSize;

    protected Team()
    {

    }

    public Team(String teamName, int teamSize)
    {
        this.teamName = teamName;
        this.teamSize = teamSize;
    }

    public String getTeamName()
    {
        return teamName;
    }

    public int getTeamSize()
    {
        return teamSize;
    }
}
