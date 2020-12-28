package com.app.dao;

import java.util.List;

import com.app.exception.BusinessException;
import com.app.model.Player;

public interface PlayerSearchDAO {

	public List<Player> getPlayerByAge(int age) throws BusinessException;
	public List<Player> getPlayersByTeam(String team)throws BusinessException;
	
}
