--Selects all the collums on player table
select * from player p ;

--Selects the whole team_id column 
select team_id 
from player p ;

--Selects players with team_id = 100;
select team_id
from player p2 
where team_id =100;

--Finds the sum of all of jersey numbers and groups them by team_id
select team_id , sum(jersey_num) from player p2 
group by  team_id;

--counts the teams that have more that 2 players 
select count(id), team_id
from player p2 
group by team_id 
having count(id)>2;

--Selects all players from player table and joins them with team id from team table 
--orders them in decsending order 
select * 
from player 
inner join team 
on player.team_id = team.team_id
order by player.team_id desc; 

--left join combines all of player table with team_id's from team table
select * 
from player 
left join team 
on player.team_id = team.team_id
order by player.team_id desc; 

--right join combines all of team table with team_id that are in common on player table
select * 
from player 
right join team 
on player.team_id = team.team_id
order by player.team_id desc; 

--full join combines both the tables of player
select * 
from player 
full join team 
on player.team_id = team.team_id
order by player.team_id desc; 

--Cross join generates a paired combination of each row of the first table with each row of the second table
select player.name, player.jersey_num, team.team_name, team.sport 
from player 
cross join team;
