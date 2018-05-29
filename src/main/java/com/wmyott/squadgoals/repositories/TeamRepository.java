package com.wmyott.squadgoals.repositories;

import java.util.Collection;

import com.wmyott.squadgoals.entities.Team;
import org.springframework.data.repository.CrudRepository;

public interface TeamRepository extends CrudRepository<Team, Long>
{

    Team getByTeamName(String teamName);

    Collection<Team> findAll();
}
