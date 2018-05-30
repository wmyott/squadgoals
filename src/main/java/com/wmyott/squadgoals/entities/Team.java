package com.wmyott.squadgoals.entities;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Team
{

    protected Team()
    {
        // Required for JPA
    }

    public Team(String teamName, Set<TeamMember> roster)
    {
        this.teamName = teamName;
        this.roster = roster;

    }

    public Set<TeamMember> getRoster()
    {
        return roster;
    }

    public String getTeamName()
    {
        return teamName;
    }

    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private String teamName;

    @JoinTable(name = "TEAM_MEMBER", joinColumns = @JoinColumn(name = "TEAM_ID", referencedColumnName = "ID"),
            inverseJoinColumns = @JoinColumn(name = "MEMBER_ID", referencedColumnName = "ID"))
    @ManyToMany
    private Set<TeamMember> roster;
}
