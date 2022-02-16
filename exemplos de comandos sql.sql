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

select * from gafanhotos;

INSERT INTO gafanhotos VALUES
-- (DEFAULT, "Godofredo", "1984-01-02", "M", "78.5", "1.83", DEFAULT),
-- (DEFAULT, "Maria", "1999-12-30", "F", "55.2", "1.65", "Portugal"),
-- (DEFAULT, "Creuza", "1920-12-30", "F", "55.2", "1.65", DEFAULT),
(DEFAULT, "Adalgiza", "1930-11-12", "F", "63.2", "1.75", "Irlanda"),
(DEFAULT, "Ana", "1975-12-22", "F", "52.3", "1.55", "EUA"),
(DEFAULT, "Pedro", "2000-07-15", "M", "52.3", "1.45", "Brasil"),
(DEFAULT, "Maria", "1999-05-30", "F", "75.9", "1.7", "Portugal"),
(DEFAULT, "Cláudio", "1975-4-22", "M", "99", "2.15", DEFAULT),
(DEFAULT, "Pedro", "1999-12-3", "M", "87", "2", DEFAULT),
(DEFAULT, "Janaína", "1987-11-12", "F", "75.4", "1.66", "EUA");

alter table gafanhotos
drop column prof;

select * from pessoas;

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

desc pessoas;
desc cursos;
select * from teste;

SELECT * FROM cursos;

alter table cursos
modify column idcurso int unsigned not null auto_increment;

alter table cursos
modify ano int unsigned default '2016';

desc cursos;

insert into cursos values
('1', 'HTML 4', 'Curso de HTML 5', '40', '37', '2014'),
('2', 'Algoritmos', 'Lógica de programação', '20', '15', '2014'),
('3', 'Photoshop', 'Dicas de Photoshop CC', '10', '8', '2014'),
('4', 'PGP', 'Curso de PHP para iniciantes', '40', '20', '2010'),
('5', 'Jarva', 'Curso de introdução à Linguagem Java', '10', '29', '2000'),
('6', 'MySQL', 'Banco de Dados MySQL', '30', '15', '2016'),
('7', 'Word', 'Curso completo de Word', '40', '30', '2016'),
('8', 'Sapateado', 'Danças Rítmicas', '40', '30', '2018'),
('9', 'Cozinha Árabe', 'Aprenda a fazer kibe', '40', '30', '2018'),
('10', 'YouTuber', 'Gerar polêmica e ganhar inscritos', '5', '2', '2018');

update cursos
set nome='HTML 5'
where idcurso='1';

update cursos
set nome='PHP', ano='2015'
where idcurso='4';

update cursos
set nome='Java', carga='40', ano='2015'
where idcurso='5'
limit 1;

delete from cursos
where ano='2018'
limit 3;

truncate table cursos;

select * from pessoas;

drop table clientes;