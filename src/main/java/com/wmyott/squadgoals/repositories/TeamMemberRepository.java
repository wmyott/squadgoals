package com.wmyott.squadgoals.repositories;

import com.wmyott.squadgoals.entities.TeamMember;
import org.springframework.data.repository.CrudRepository;

public interface TeamMemberRepository extends CrudRepository<TeamMember, Long>
{

}
