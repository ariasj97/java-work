package com.app.main;

import java.util.List;

import com.app.dao.PlayerCrudDAO;
import com.app.dao.PlayerSearchDAO;
import com.app.dao.impl.PlayerCrudDAOImpl;
import com.app.dao.impl.PlayerSearchDAOImpl;
import com.app.exception.BusinessException;
import com.app.model.Player;

public class PlayerMain {

	public static void main(String[] args) {

		PlayerCrudDAO dao = new PlayerCrudDAOImpl();
		PlayerSearchDAO dao2 = new PlayerSearchDAOImpl();
		
//		Player p =  new Player(7, "Kevin Durant", 32, "Nets", 7);
//		
//		try {
//			if (dao.createPlayer(p)!=0) {
//				System.out.println("Player created successfully");
//			}
//		} catch (BusinessException e) {
//			System.out.println(e.getMessage());
//		}
//
//		try {
//			Player player = dao.getPlayerById(7);
//			if(player!=null) {
//				System.out.println("details of player with id "+player.getId());
//				System.out.println(player);
//			}
//		} catch (BusinessException e) {
//			System.out.println(e);
//		}
//		
//		try {
//			List<Player> playerList = dao.getAllPlayers();
//			if(playerList != null && playerList.size()!=0){
//				System.out.println("\n\nfound " +playerList.size()+" players in the databse... Printing them all");
//				for(Player p:playerList) { 
//					System.out.println(p);
//				}
//			}
//		} catch (BusinessException e) {
//			System.out.println(e.getMessage());
//		}
//		
		
		//Updates the players jersey number
//		try {
//			if(dao.updatePlayerJerseyNum(2, 77)!=0) {
//				System.out.println("Player jersey number has successfully updated!");
//			}
//			
//			
//		} catch (BusinessException e) {
//			System.out.println(e.getMessage());
//		}
//		
//		//Deletes a player when given the id of  that player
//		try {	
//			dao.deletePlayer(7);
//			System.out.println("Player has been  successfully deleted from the database!");
//		}catch (BusinessException e) {
//		System.out.println(e.getMessage());
//		}
		
		//Searches players with a certain age and returns the players with that age into a list
//		try {
//			List<Player> playerList = dao2.getPlayerByAge(20);
//			if(playerList != null && playerList.size()!=0){
//				System.out.println("\n\nfound " +playerList.size()+" players in the databse... Printing them all");
//				for(Player p:playerList) { 
//					System.out.println(p);
//				}
//			}
//		} catch (BusinessException e) {
//			System.out.println(e.getMessage());
//		}
		
		//Finds all the players in a given team and returns them into a list
		try {
			List<Player> playerList = dao2.getPlayersByTeam("Lakers");
			if(playerList != null && playerList.size()!=0){
				System.out.println("\n\nfound " +playerList.size()+" players in the databse... Printing them all");
				for(Player p:playerList) { 
					System.out.println(p);
				}
			}
		} catch (BusinessException e) {
			System.out.println(e.getMessage());
		}
	}

}
