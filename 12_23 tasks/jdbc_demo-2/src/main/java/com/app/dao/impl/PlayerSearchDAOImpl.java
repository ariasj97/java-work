package com.app.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.app.dao.PlayerSearchDAO;
import com.app.dao.dbutil.PostresqlConnection;
import com.app.exception.BusinessException;
import com.app.model.Player;

public class PlayerSearchDAOImpl implements PlayerSearchDAO {

	@Override
	public List<Player> getPlayerByAge(int age) throws BusinessException {
		List<Player> playersList = new ArrayList<>();
		try(Connection connection = PostresqlConnection.getConnection()){
				String sql= "select id,name,age,team,jersey_num from public.player where age=?";
				PreparedStatement preparedStatement = connection.prepareStatement(sql);
				preparedStatement.setInt(1,age);
				ResultSet resultSet= preparedStatement.executeQuery();
				
				while(resultSet.next()) {
					Player player = new Player();
					player.setId(resultSet.getInt("id"));
					player.setName(resultSet.getString("name"));
					player.setAge(age);
					player.setTeam(resultSet.getString("team"));
					player.setAge(resultSet.getInt("age"));
					player.setJersey_num(resultSet.getInt("jersey_num"));
					playersList.add(player);
				}
				
				if(playersList.size()==0) {
					throw new BusinessException("No players in the database with that age ");
				}
			}catch (ClassNotFoundException | SQLException e) {
				System.out.println(e);
				throw new BusinessException("internal error occured contact sysadmin");
			}
			
		return playersList;
	}

	@Override
	public List<Player> getPlayersByTeam(String team) throws BusinessException {
		List<Player> playersList = new ArrayList<>();
		try(Connection connection = PostresqlConnection.getConnection()){
				String sql= "select id,name,age,team,jersey_num from public.player where team=?";
				PreparedStatement preparedStatement = connection.prepareStatement(sql);
				preparedStatement.setString(1,team);
				ResultSet resultSet= preparedStatement.executeQuery();
				
				while(resultSet.next()) {
					Player player = new Player();
					player.setId(resultSet.getInt("id"));
					player.setName(resultSet.getString("name"));
					player.setAge(resultSet.getInt("age"));
					player.setTeam(team);
					player.setAge(resultSet.getInt("age"));
					player.setJersey_num(resultSet.getInt("jersey_num"));
					playersList.add(player);
				}
				
				if(playersList.size()==0) {
					throw new BusinessException("No players in the database on that team ");
				}
			}catch (ClassNotFoundException | SQLException e) {
				System.out.println(e);
				throw new BusinessException("internal error occured contact sysadmin");
			}
			
		return playersList;
		
	}

	
}
