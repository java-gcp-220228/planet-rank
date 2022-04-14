

insert into user_roles (user_id, user_role)
values(1,'emploe');

insert into users (users_username,users_password,role_user_id)
values(
	'username', 'password', 1);

insert into exoplanets (exoplanet_id, discover_year,distance_from_earth,host_name,number_of_planets,number_of_stars,planet_mass,planet_name)
values(1,2020,31.7,'AU Mic', 2,1,17,'AU Mic b'),
(2,2018,259.5,'HD 1397', 1,1,132,'HD 1397 b'),
(3,2021,30.7,'host3', 1,1,.55,'GJ 367 b');


--insert into exoplanet_comments (exoplanet_comment_id, comment,author_user_id,exoplanet_exoplanet_id)
--values(1,'sweet',1,1),
--(2,'sweet2',1,1),
--(3,'sweet3',1,2),
--(4,'sweet4',1,2),
--(5,'sweet5',1,3);


