package com.app.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.app.dao.PlayerCrudDAO;
import com.app.dao.dbutil.PostresqlConnection;
import com.app.exception.BusinessException;
import com.app.model.Player;

public class PlayerCrudDAOImpl implements PlayerCrudDAO{

	@Override
	public int createPlayer(Player player) throws BusinessException {
		int c= 0;
		try(Connection connection = PostresqlConnection.getConnection()){
			String sql ="insert into public.player(id,name,age,team,jersey_num) values(?,?,?,?,?) ";
			PreparedStatement preparedStatement =connection.prepareStatement(sql);
			preparedStatement.setInt(1, player.getId());
			preparedStatement.setString(2, player.getName());
			preparedStatement.setInt(3, player.getAge());
			preparedStatement.setString(4, player.getTeam());
			preparedStatement.setInt(5, player.getJersey_num());
			
			c= preparedStatement.executeUpdate();
			
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e);
			throw new BusinessException("internal error occured contact sysadmin");
		}
		return c;
	}

	@Override
	public void deletePlayer(int id) throws BusinessException {
		int c = 0;
		try(Connection connection = PostresqlConnection.getConnection()){
			String sql ="delete from public.player where id=? ";
			
			PreparedStatement preparedStatement =connection.prepareStatement(sql);
			preparedStatement.setInt(1, id);
			
			
			c= preparedStatement.executeUpdate();
			
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e);
			throw new BusinessException("internal error occured contact sysadmin");
		}
	}

	@Override
	public int updatePlayerJerseyNum(int id, int jersey_num) throws BusinessException {
		int c =0;

		try(Connection connection = PostresqlConnection.getConnection()){
			String sql ="update public.player set jersey_num=? where id=?"; 
			PreparedStatement preparedStatement =connection.prepareStatement(sql);
			preparedStatement.setInt(1,jersey_num);
			preparedStatement.setInt(2, id);
				
			c= preparedStatement.executeUpdate();
			
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e);
			throw new BusinessException("internal error occured contact sysadmin");
		}
		return c;
		
		
	
	}

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

}
