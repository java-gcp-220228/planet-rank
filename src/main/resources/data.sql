
insert into user_roles (user_id, user_role)
values(1,'member'),
        (2,'admin');

insert into users (users_username,users_password,role_user_id)
values('username', 'password', 1),
('jack', 'ziegler', 2),
('ankur', 'shahi', 2),
('javanshir', 'pashayev', 2),
('bryce', 'fransen', 2);

insert into exoplanets (exoplanet_id, discover_year,distance_from_earth,host_name,number_of_planets,number_of_stars,planet_mass,planet_name, card_rank)
values(1,2020,31.7,'AU Mic', 2,1,17,'AU Mic b', 'Bronze'),
      (2,2018,259.5,'HD 1397', 1,1,132,'HD 1397 b', 'Galaxy Opal'),
      (3,2021,246.5,'TOI-1278', 2,1,5880,'TOI-1278 b', 'Sapphire'),
      (4,2021,30.6,'GJ 367', 1,1,.5,'GJ 367 b', 'Gold'),
      (5,2020,619,'NGTS-11', 1,1,109,'NGTS-11 b', 'Bronze'),
      (6,2018,259.5,'TIC 257060897', 1,1,213,'TIC 257060897 b', 'Silver'),
      (7,2018,31.7,'pi Men', 2,1,59.3,'pi Men c','Bronze' ),
      (8,2019,402.5,'WASP-18', 2,2,55.2,'WASP-18 c', 'Gold'),
      (9,2006,154.9,'eps Tau', 1,1,2415.4,'eps Tau b', 'Silver');


--insert into exoplanet_comments (exoplanet_comment_id, comment,author_user_id,exoplanet_exoplanet_id)
--values(1,'sweet',1,1),
--(2,'sweet2',1,1),
--(3,'sweet3',1,2),
--(4,'sweet4',1,2),
--(5,'sweet5',1,3);


insert into gallery_images (author, date_created, description, nasa_id, orig_url, thumb_url, large_url, title) values
('Hubble', NOW(), 'this is the description', 'nasaID',
'https://images-assets.nasa.gov/image/GSFC_20171208_Archive_e001935/GSFC_20171208_Archive_e001935~orig.jpg',
'https://images-assets.nasa.gov/image/GSFC_20171208_Archive_e001935/GSFC_20171208_Archive_e001935~thumb.jpg',
'https://images-assets.nasa.gov/image/GSFC_20171208_Archive_e001935/GSFC_20171208_Archive_e001935~orig.jpg',
'title here');



insert into gallery_comments (author_id, author_name, image_comment, nasa_id, upload_date) values
(5, 'bryce', 'Nice image you got there!', 'nasaID', NOW() - interval '1 month'),
(4, 'pashayev', 'Thanks NASA!', 'nasaID', NOW() - interval '2 month'),
(3, 'ankur', 'Awesome!', 'nasaID', NOW() - interval '3 month');