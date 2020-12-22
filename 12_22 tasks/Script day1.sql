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
select team_id, sum(jersey_num) from player p2 
group by team_id 

--counts the teams that have more that 2 players 
select count(id), team_id
from player p2 
group by team_id 
having count(id)>2;
