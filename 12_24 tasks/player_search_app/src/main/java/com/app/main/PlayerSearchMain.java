package com.app.main;

import java.util.List;
import java.util.Scanner;

import com.app.exception.BusinessException;
import com.app.model.Player;
import com.app.service.PlayerSearchService;
import com.app.service.impl.PlayerSearchServiceImpl;

public class PlayerSearchMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Welcome to the Player Search App V1.0");
		System.out.println("----------------------------------------------------");
		
		int ch = 0;
		PlayerSearchService playerSearchService = new PlayerSearchServiceImpl();
		do {
			System.out.println("PLAYER SEARCH MENU");
			System.out.println("-------------------------------------------");
			System.out.println("1)By ID");
			System.out.println("2)By Age");
			System.out.println("3)By Team");
			System.out.println("4)By Jersey Number");
			System.out.println("5)By Player Name");
			System.out.println("6)List all players in the database");
			System.out.println("7)Exit");
			try {
			ch = Integer.parseInt(sc.nextLine());
			}catch(NumberFormatException e) {}
			
			switch(ch) {
			case 1:
				System.out.println("Enter Player ID to get player details: ");
				try {
					int id = Integer.parseInt(sc.nextLine());
					Player player = playerSearchService.getPlayerById(id);
					
					if(player!=null) {
						System.out.println("Player found with ID: "+id+" details is: ");
						System.out.println(player);
						}
					}catch(NumberFormatException e) {
						System.out.println("Player ID cannot include special character, symbols, or white spaces");
					} catch (BusinessException e) {
						System.out.println(e.getMessage());
					}
				break;
				
			case 2:
				System.out.println("Enter age to get all players with that age: ");
				
				try {
					int age = Integer.parseInt(sc.nextLine());
					List<Player> getPlayersAge = playerSearchService.getPlayersAge(age);
					if(getPlayersAge!=null && getPlayersAge.size()>0) {
						System.out.println("There are "+getPlayersAge.size()+" players in the database. Printing their details now.");
						for(Player p:getPlayersAge) {
							System.out.println(p);
						}
					}	
				}catch(NumberFormatException e) {
					System.out.println("Age cannot include special character, symbols, or white spaces");
					
				} catch (BusinessException e) {
					System.out.println(e.getMessage());
				}
				break;
				
			case 3:
				System.out.println("Enter team you want to see the all the players details of:  ");
				try {
					String team = sc.nextLine();
					List<Player> getPlayersTeam = playerSearchService.getPlayersTeam(team);
					if(getPlayersTeam!=null && getPlayersTeam.size()>0) {
						System.out.println("Found "+getPlayersTeam.size()+" players on this team in the database. Printing their details now.");
						for(Player p:getPlayersTeam) {
							System.out.println(p);
						}
					}
				} catch (BusinessException e) {
					System.out.println(e.getMessage());
				}
				break;
				
			case 4:
				System.out.println("Enter a jersey number to get all matching players and their details:  ");
				try {
					int jersey_num = Integer.parseInt(sc.nextLine());
					List<Player> getPlayersJerseyNum = playerSearchService.getPlayersJerseyNum(jersey_num);
					if(getPlayersJerseyNum!=null && getPlayersJerseyNum.size()>0) {
						System.out.println("There are "+getPlayersJerseyNum.size()+" players in the database. Printing their details now.");
						for(Player p:getPlayersJerseyNum) {
							System.out.println(p);
						}
					}	
				}catch(NumberFormatException e) {
					System.out.println("Jersey Number cannot include special character, symbols, or white spaces");
					
				} catch (BusinessException e) {
					System.out.println(e.getMessage());
				}
				
				break;
				
			case 5:
				System.out.println("Enter a name that you wish to see the details of: ");
				try {
					String name = sc.nextLine();
					List<Player> getPlayersName = playerSearchService.getPlayersName(name);
					if(getPlayersName!=null && getPlayersName.size()>0) {
						System.out.println("Found "+getPlayersName.size()+" players in the database. Printing their details now.");
						for(Player p:getPlayersName) {
							System.out.println(p);
						}
					}
				} catch (BusinessException e) {
					System.out.println(e.getMessage());
				}
				break;
				
			case 6:
				System.out.println("Retrieving all of the players in the database");
				try {
					List<Player> allPlayersList = playerSearchService.getAllPlayers();
					if(allPlayersList!=null && allPlayersList.size()>0) {
						System.out.println("There are "+allPlayersList.size()+" players in the database. Printing their details now.");
						for(Player p:allPlayersList) {
							System.out.println(p);
						}
					}
				} catch (BusinessException e) {
					System.out.println(e.getMessage());
				}
				
				break;
				
			case 7: 
				System.out.println("Thank you for using the Player APP V1.0. Have a good day");
				break;
				
			default:
				System.out.println("Invalid menu option. Input a valid menu choice");
			
			}
		}while(ch!=7);

	}

}
