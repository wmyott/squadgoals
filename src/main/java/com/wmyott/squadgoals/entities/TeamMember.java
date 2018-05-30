package com.wmyott.squadgoals.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class TeamMember
{
    protected TeamMember()
    {
        // Required for JPA
    }

    public TeamMember(String playerName, String playerNumber)
    {
        this.playerName = playerName;
        this.playerNumber = playerNumber;
    }

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "name", nullable = false)
    private String playerName;

    @Column(name = "number")
    private String playerNumber;
}
