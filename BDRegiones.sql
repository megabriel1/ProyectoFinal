create database Rest;
use Rest;

create table Regiones(
region_id int primary key auto_increment not null,
codigo varchar(30) not null,
nombre varchar(30) not null,
padre int
);


create table Regiones_historico(
historico_id int primary key auto_increment not null,
codigo varchar(30) not null,
nombre varchar(30) not null,
tipo varchar(5) not null,
fecha_creado timestamp not null,
padre int,
region_id int,
foreign key (region_id) references regiones(region_id) on delete set null
);
