package com.project.team.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


import com.project.team.entity.Player;


public interface PlayerRepository  extends JpaRepository<Player,Integer>
{
	@Query(value="select sum(playerBiddingBudget) FROM Player where playerTeamName=?1")
	public Integer sumOfBiddingBudget(String teamName);
	
	
	public List<Player> findByPlayerTeamName(String teamName);
	
	public List<Player> findByPlayerName(String playerName);

}
