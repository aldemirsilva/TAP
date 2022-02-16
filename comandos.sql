-- Exemplo de código para criar uma tabela:

CREATE TABLE pessoas(
id int NOT NULL AUTO_INCREMENT,
nome varchar(30),
nascimento date,
sexo enum('M', 'F'),
peso decimal(5,2),
altura decimal(3,2),
nacionalidade varchar(20) DEFAULT "Brasil",
PRIMARY KEY(id)
);

-- Observação: os comandos CREATE DATABASE, CREATE TABLE, ALTER TABLE, DROP TABLE são comandos do tipo DDL (Data Definition Language).
-- O comando INSERT INTO, UPDATE, DELETE, TRUNCATE é um comando do tipo DML (Data Manipulation Language).

Exemplo de código para inserir dados em uma tabela:

INSERT INTO pessoas
(id, nome, nascimento, sexo peso, altura, nacionalidade) #opcional
VALUES
(DEFAULT, "Godofredo", "1984-01-02", "M", "78.5", "1.83", DEFAULT),
(DEFAULT, "Maria", "1999-12-30", "F", "55.2", "1.65", "Portugal"),
(DEFAULT, "Creuza", "1920-12-30", "F", "55.2", "1.65", DEFAULT),
(DEFAULT, "Adalgiza", "1930-11-12", "F", "63.2", "1.75", "Irlanda"),
(DEFAULT, "Ana", "1975-12-22", "F", "52.3", "1.55", "EUA"),
(DEFAULT, "Pedro", "2000-07-15", "M", "52.3", "1.45", "Brasil"),
(DEFAULT, "Maria", "1999-05-30", "F", "75.9", "1.7", "Portugal"),
(DEFAULT, "Cláudio", "1975-4-22", "M", "99", "2.15", DEFAULT),
(DEFAULT, "Pedro", "1999-12-3", "M", "87", "2", DEFAULT),
(DEFAULT, "Janaína", "1987-11-12", "F", "75.4", "1.66", "EUA");

ALTER TABLE pessoas
ADD COLUMN profissao varchar(10);

ALTER TABLE pessoas
DROP COLUMN profissao;

ALTER TABLE pessoas
ADD COLUMN profissao AFTER nome;

alter table pessoas
add column profissao varchar(10);

ALTER TABLE pessoas
DROP COLUMN profissao;

alter table pessoas
add nome varchar(30) after id;

ALTER TABLE pessoas
ADD COLUMN profissao varchar(30) AFTER nome;

alter table pessoas
change profissao prof varchar(30);

alter table pessoas
modify column profissao varchar(30) not null default 'a';

update pessoas
set profissao = 'a' where profissao is null;

alter table pessoas
change column profissao prof varchar(20);

alter table pessoas
rename to gafanhotos;

create table if not exists cursos(
nome varchar(30) not null unique,
descricao text,
carga int unsigned,
totaulas int unsigned,
ano year default '2021'
);

create table if not exists gafanhotos (teste int);

alter table cursos
add column idcurso int first;

alter table cursos
add primary key(idcurso);

create table if not exists teste(
id int,
nome varchar(10),
idade int unsigned
);

insert into teste values
('1', 'Pedro', '22'),
('2', 'Maria', '12'),
('3', 'Maricota', '30');

drop table if exists alunos;

drop table if exists teste;