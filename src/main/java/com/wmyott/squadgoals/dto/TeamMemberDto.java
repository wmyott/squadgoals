package com.wmyott.squadgoals.dto;

public class TeamMemberDto
{
    private final String name;
    private final String number;

    public TeamMemberDto(String name, String number)
    {
        this.name = name;
        this.number = number;
    }

    public String getName()
    {
        return name;
    }

    public String getNumber()
    {
        return number;
    }
}
