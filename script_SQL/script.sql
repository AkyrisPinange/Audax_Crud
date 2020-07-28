create database audax;
create table login
(
	id serial primary key
	,login varchar(100) not null unique
	,senha varchar(50)
);
create table cliente
(
	id serial primary key 
	,nome varchar(100) not null
	,cpf varchar(20) not null unique
	,dataNascimento date not null
	,sexo varchar(1)
);

create table filme
(
	id serial primary key
	,titulo varchar(100) not null
	,dataLancamento date not null
	,sinopse varchar(255)
	,genero varchar(100) not null
);
create  table aluguel
(
	id serial primary key
	,dataInicio date not null
	,dataFim date
	,alugado bit not null
	,idCliente int not null
	,idFilme int not null
	,foreign key(idCliente) references cliente(id)
	,foreign key(idFilme) references filme(id)
	
)
