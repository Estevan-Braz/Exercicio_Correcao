create database spring_correcao;

use spring_correcao;

create table pessoa(
	id bigint auto_increment primary key,
	nome text,
	email text,
	data_nascimento date,
	created_at timestamp default current_timestamp,
	updated_at timestamp default current_timestamp on update current_timestamp
);

create table professor(
    id bigint auto_increment primary key,
    SIAPE text,
    data_inicio_trabalho date,
    senha text,
    fk_id_pessoa bigint not null,
	created_at timestamp default current_timestamp,
	updated_at timestamp default current_timestamp on update current_timestamp,
	foreign key fk_professor_pessoa (fk_id_pessoa) references pessoa(id)
);

create table aluno(
    id bigint auto_increment primary key,
    numero_matricula text,
    curso text,
    fk_id_pessoa bigint not null,
    created_at timestamp default current_timestamp,
    updated_at timestamp default current_timestamp on update current_timestamp,
    foreign key fk_aluno_pessoa (fk_id_pessoa) references pessoa(id)
);



