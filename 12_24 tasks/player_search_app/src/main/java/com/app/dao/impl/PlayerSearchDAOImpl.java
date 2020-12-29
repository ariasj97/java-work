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
	public Player getPlayerById(int id) throws BusinessException {
		Player player = null;
		try(Connection connection = PostresqlConnection.getConnection()){
			String sql= "select name,age,team,jersey_num from public.player where id=?";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, id);
			ResultSet resultSet= preparedStatement.executeQuery();
			if(resultSet.next()) {
				player = new Player();
				player.setId(id);
				player.setName(resultSet.getString("name"));
				player.setAge(resultSet.getInt("age"));
				player.setTeam(resultSet.getString("team"));
				player.setJersey_num(resultSet.getInt("jersey_num"));
			}else {
				throw new BusinessException("No playert found with ID "+id);
			}
		}catch (ClassNotFoundException | SQLException e) {
			System.out.println(e);
			throw new BusinessException("internal error occured contact sysadmin");
		}
		
		return player;
	}

	@Override
	public List<Player> getAllPlayers() throws BusinessException {
		List<Player> playersList = new ArrayList<>();
		try(Connection connection = PostresqlConnection.getConnection()){
				String sql= "select id,name,age,team,jersey_num from public.player";
				PreparedStatement preparedStatement = connection.prepareStatement(sql);
				ResultSet resultSet= preparedStatement.executeQuery();
				
				while(resultSet.next()) {
					Player player = new Player();
					player.setId(resultSet.getInt("id"));
					player.setName(resultSet.getString("name"));
					player.setAge(resultSet.getInt("age"));
					player.setTeam(resultSet.getString("team"));
					player.setJersey_num(resultSet.getInt("jersey_num"));
					playersList.add(player);
				}
				
				if(playersList.size()==0) {
					throw new BusinessException("No players in the database so far ");
				}
			}catch (ClassNotFoundException | SQLException e) {
				System.out.println(e);
				throw new BusinessException("internal error occured contact sysadmin");
			}
			
		return playersList;
	}

	@Override
	public List<Player> getPlayersAge(int age) throws BusinessException {
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
	public List<Player> getPlayersTeam(String team) throws BusinessException {
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
					player.setTeam(team);
					player.setAge(resultSet.getInt("age"));
					player.setJersey_num(resultSet.getInt("jersey_num"));
					playersList.add(player);
				}
				
				if(playersList.size()==0) {
					throw new BusinessException("No players in the database on that team or this team does not exist. Please check spelling and case sensitivity. ");
				}
			}catch (ClassNotFoundException | SQLException e) {
				System.out.println(e);
				throw new BusinessException("internal error occured contact sysadmin");
			}
			
		return playersList;

	}

	@Override
	public List<Player> getPlayersJerseyNum(int jersey_num) throws BusinessException {
		List<Player> playersList = new ArrayList<>();
		try(Connection connection = PostresqlConnection.getConnection()){
				String sql= "select id,name,age,team,jersey_num from public.player where jersey_num=?";
				PreparedStatement preparedStatement = connection.prepareStatement(sql);
				preparedStatement.setInt(1,jersey_num);
				ResultSet resultSet= preparedStatement.executeQuery();
				
				while(resultSet.next()) {
					Player player = new Player();
					player.setId(resultSet.getInt("id"));
					player.setName(resultSet.getString("name"));
					player.setTeam(resultSet.getString("team"));
					player.setAge(resultSet.getInt("age"));
					player.setJersey_num(jersey_num);
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
	public List<Player> getPlayersName(String name) throws BusinessException {
		List<Player> playersList = new ArrayList<>();
		try(Connection connection = PostresqlConnection.getConnection()){
				String sql= "select id,name,age,team,jersey_num from public.player where name=?";
				PreparedStatement preparedStatement = connection.prepareStatement(sql);
				preparedStatement.setString(1,name);
				ResultSet resultSet= preparedStatement.executeQuery();
				
				while(resultSet.next()) {
					Player player = new Player();
					player.setId(resultSet.getInt("id"));
					player.setName(name);
					player.setTeam(resultSet.getString("team"));
					player.setAge(resultSet.getInt("age"));
					player.setJersey_num(resultSet.getInt("jersey_num"));
					playersList.add(player);
				}
				
				if(playersList.size()==0) {
					throw new BusinessException("No players in the database with that name. Please check spelling and case sensitivity ");
				}
			}catch (ClassNotFoundException | SQLException e) {
				System.out.println(e);
				throw new BusinessException("internal error occured contact sysadmin");
			}
			
		return playersList;
	}

}
