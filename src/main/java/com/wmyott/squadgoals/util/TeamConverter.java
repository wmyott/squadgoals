package com.wmyott.squadgoals.util;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

import com.wmyott.squadgoals.dto.TeamDto;
import com.wmyott.squadgoals.dto.TeamMemberDto;
import com.wmyott.squadgoals.entities.Team;
import com.wmyott.squadgoals.entities.TeamMember;

public class TeamConverter
{
    public static Team convertToEntity(TeamDto teamDto)
    {
        String teamName = teamDto.getName();
        Set<TeamMember> roster = teamDto.getRoster().stream().map(TeamConverter::convertToEntity).collect(Collectors.toSet());
        return new Team(teamName, roster);
    }

    public static TeamMember convertToEntity(TeamMemberDto teamMemberDto)
    {
        return new TeamMember(teamMemberDto.getName(), teamMemberDto.getNumber());
    }

}
