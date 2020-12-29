package com.app.service;

import java.util.List;

import com.app.exception.BusinessException;
import com.app.model.Player;

public interface PlayerSearchService {
	
	public Player getPlayerById(int id) throws BusinessException;
	public List<Player> getAllPlayers() throws BusinessException;
	public List<Player> getPlayersAge(int age) throws BusinessException;
	public List<Player> getPlayersTeam(String team) throws BusinessException;
	public List<Player> getPlayersJerseyNum(int jersey_num) throws BusinessException;
	public List<Player> getPlayersName(String name) throws BusinessException;

}
