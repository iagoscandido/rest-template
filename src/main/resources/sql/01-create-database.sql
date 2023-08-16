create database db_viacep;


create table address (
	id integer not null,
	cep varchar(8) not null,
	logradouro varchar(20),
	complemento varchar(20),
	bairro varchar(15),
	localidade varchar (20),
	uf varchar(2),
	ibge varchar(7),
	gia varchar(4),
	ddd varchar(2),
	siafi varchar(4),
	constraint pk_address primary key (id)
);