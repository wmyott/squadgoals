package com.wmyott.squadgoals.controllers;

import java.util.Map;

import com.wmyott.squadgoals.dto.TeamDto;
import com.wmyott.squadgoals.repositories.TeamRepository;
import com.wmyott.squadgoals.entities.Team;
import com.wmyott.squadgoals.util.TeamConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class AppController
{
    @PostMapping("app/register")
    public String register(@ModelAttribute TeamDto teamDto)
    {
        Team team = TeamConverter.convertToEntity(teamDto);
        teamRepository.save(team);
        return "redirect:/index.html";
    }

    @GetMapping("app/register")
    public String registrationPage()
    {
        return "register";
    }

    @PostMapping("app/view")
    public String viewTeam(@RequestParam("team-name") String name, Map<String, Object> model)
    {
        return "redirect:/teams/" + name;
    }

    @RequestMapping("/teams/{team-name}")
    public String teamDetails(@PathVariable("team-name") String teamName, Map<String, Object> model)
    {
        Team team = teamRepository.getByTeamName(teamName);
        model.put("team", team);
        return "teamDetails";
    }

    @Autowired
    TeamRepository teamRepository;
}
