create database feriado;
go

use feriado;
go

create table cadastrar
	(id				int		identity(1,1)	not null,
	 dsc_feriado	varchar(150)				not null,
	 data_feriado	date					not null);
go

create table tipo_feriado
	(id_fer		int			identity(1,1)	not null,
	 tp_fer		varchar(60)						not null);
go

insert tipo_feriado (tp_fer)
values ('Municipal'),
	   ('Estadual'),
	   ('Municipal');
go		

select * from tipo_feriado