drop table if exists users
drop table if exists messages
drop table if exists images
drop table if exists user_roles



--CREATE TABLES--
CREATE TABLE user_roles (
	user_role_id INTEGER PRIMARY KEY,
	user_role VARCHAR(50) NOT NULL
	
);

CREATE TABLE users (
	users_id SERIAL PRIMARY KEY,
	user_username VARCHAR(50) NOT null UNIQUE,
	user_password VARCHAR(50) NOT null,
	user_role_id not null,

	
	constraint fk_user_role_id foreign key(user_role_id) REFERENCES user_roles(user_role_id) on delete cascade
	
);

create table images(
	images_id INTEGER PRIMARY key,
	images_image bytea
	);

create table messages(
	messages_id INTEGER PRIMARY key,
	messages_message varchar(250) not null,
	messages_author INTEGER not null,
	messages_image_id INTEGER not null,
	
	constraint fk_messages_author foreign key(messages_author) REFERENCES users(users_id) on delete cascade,
	constraint fk_messages_image_id foreign key(messages_image_id) REFERENCES images(images_id) on delete cascade
	);

--POPULATE TABLES 
insert into user_roles (user_role_id, user_role)
values
(1, 'member'),
(2, 'admin');

insert into users(users_username,users_password,user_role_id)
values 
('jack','password',2),
('bryce','password',2),
('jay','password',2),
('ankur','password',2),
('user1','password',2),
('user2','password',2);


