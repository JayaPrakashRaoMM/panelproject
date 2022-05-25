package com.project.team.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.team.Repository.TeamRepository;
import com.project.team.entity.Team;
@Service
public class TeamService 
{
	@Autowired
	private TeamRepository teamRepo;
	
	public Team saveTeam(Team team)
	{
		return teamRepo.save(team);
	}
	
	public Team fetchTeamByName(String teamName)
	{
		return teamRepo.findByTeamName(teamName);
	}
	
	public List<String> allTeamName()
	{
		return teamRepo.TeamNames();
	}
}
