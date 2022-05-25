package com.project.team.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.team.Repository.PlayerRepository;
import com.project.team.entity.Player;


@Service
public class PlayerService 
{
	@Autowired
	private PlayerRepository playerRepo;
	
	public Player createPlayer(Player player)
	{
		return playerRepo.save(player);
	}
	
	public Integer sumOfPlayerBiddingBudget(String teamName)
	{
		
		return playerRepo.sumOfBiddingBudget(teamName);
		
	}
	
	public List<Player> FetchPlayerByTeamName(String TeamName)
	{
		return playerRepo.findByPlayerTeamName(TeamName);
	}
	
	public List<Player> playerDetails(String playerName)
	{
		return playerRepo.findByPlayerName(playerName);
	}
	
}
