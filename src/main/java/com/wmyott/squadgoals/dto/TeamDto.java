package com.wmyott.squadgoals.dto;

import java.util.Collection;

public class TeamDto
{
    public TeamDto(String name, Collection<TeamMemberDto> roster)
    {
        this.name = name;
        this.roster = roster;
    }

    public Collection<TeamMemberDto> getRoster()
    {
        return roster;
    }

    public String getName()
    {
        return name;
    }

    private final String name;
    private final Collection<TeamMemberDto> roster;
}
