

insert into user_roles (user_id, user_role)
values(1,'emploe');

insert into users (users_username,users_password,role_user_id)
values(
	'username', 'password', 1);

insert into exoplanets (exoplanet_id, discover_year,distance_from_earth,host_name,number_of_planets,number_of_stars,planet_mass,planet_name)
values(1,2019,1000,'host', 2,3,1901,'planet');


insert into exoplanet_comments (exoplanet_comment_id, comment,author_user_id,exoplanet_exoplanet_id)
values(1,'sweet',1,1);


