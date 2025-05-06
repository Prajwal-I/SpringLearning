create table course (
	id bigint not null,
	name varchar(225) not null,
	author varchar(225) not null,
	primary key (id)
);

insert into course (id, name, author) values (1,'React', 'me');
