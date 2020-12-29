package com.app.service.impl;

import java.util.List;

import com.app.dao.PlayerSearchDAO;
import com.app.dao.impl.PlayerSearchDAOImpl;
import com.app.exception.BusinessException;
import com.app.model.Player;
import com.app.service.PlayerSearchService;

public class PlayerSearchServiceImpl implements PlayerSearchService {

	private PlayerSearchDAO playerSearchDAO = new PlayerSearchDAOImpl();
	@Override
	public Player getPlayerById(int id) throws BusinessException {
		Player player =null;
		if(id>0 && id<100) {
			player = playerSearchDAO.getPlayerById(id);
		}else{
			throw new BusinessException("Entered Player ID "+id+" is invalid");
		}
		return player;
	}

	@Override
	public List<Player> getAllPlayers() throws BusinessException {
		List<Player> allPlayersList =null;
		allPlayersList = playerSearchDAO.getAllPlayers();
		return allPlayersList;
	}

	@Override
	public List<Player> getPlayersAge(int age) throws BusinessException {
		List<Player> getPlayersAge = null;
		if(age>18 && age<40) {
			getPlayersAge = playerSearchDAO.getPlayersAge(age);
		}else {
			throw new BusinessException("Entered Player age "+age+" is invalid");
		}
		
		return getPlayersAge;
	}

	@Override
	public List<Player> getPlayersTeam(String team) throws BusinessException {
		List<Player> getPlayersTeam = null;
		if(team.length()>=0 && team.length()<25) {
			getPlayersTeam = playerSearchDAO.getPlayersTeam(team);
		}else {
			throw new BusinessException("Entered team "+ team+" is invalid");
		}
		
		return getPlayersTeam;
	}

	@Override
	public List<Player> getPlayersJerseyNum(int jersey_num) throws BusinessException {
		List<Player> getPlayersJerseyNum = null;
		if(jersey_num>=0 && jersey_num<99) {
			getPlayersJerseyNum = playerSearchDAO.getPlayersJerseyNum(jersey_num);
		}else {
			throw new BusinessException("Entered Jersey Number "+ jersey_num+" is invalid");
		}
		
		return getPlayersJerseyNum;
	}

	@Override
	public List<Player> getPlayersName(String name) throws BusinessException {
		List<Player> getPlayersName = null;
		if(name.length()>=0 && name.length()<25) {
			getPlayersName = playerSearchDAO.getPlayersName(name);
		}else {
			throw new BusinessException("Entered name "+ name+" is invalid");
		}
		
		return getPlayersName;
	}

}
