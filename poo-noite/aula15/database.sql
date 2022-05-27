create database videodb;

use videodb;

create table filmes(
    id int,
    titulo char(100),
    lancamento date,
    tempo int
);


create database eventosdb;

use eventosdb;

create table eventos(
    id int,
    nome char(100),
    data date
);