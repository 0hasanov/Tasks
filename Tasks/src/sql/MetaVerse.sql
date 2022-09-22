create table Tshirt
(
id int primary key,
gender  varchar(255) not null,
brand  varchar(255) not null,
body  varchar(255) not null,
colour  varchar(255) not null,
price int ,
created date default now()
);

create table Shoes
(
gender  varchar(255) not null,
brand  varchar(255) not null,
size  varchar(255) not null,
colour  varchar(255) not null,
price int ,
created date default now()
);

