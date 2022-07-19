CREATE TABLE Usuarios(
	nombre text,
	clave varchar(6)	
); 
INSERT INTO Usuarios (nombre, clave) VALUES ('Ana','Ana897');
insert into Usuarios  values('Pablo','Pablo123456');
create table Agenda(
	nombre text,
	apellido text,
	direccion text,
	telefono integer
);
insert into Agenda values ('Liliana', 'Miranda', 'calle 30 89 54',123456);
insert into Agenda values ('Juan', 'Castro', 'Cra 20 89 47', 456789);
insert into Agenda values ('Sofía', 'Muñoz', 'Cra 45 78 89', 789456);

SELECT * FROM Agenda;
SELECT nombre from Agenda a ;
SELECT nombre, telefono from Agenda;
select nombre from Agenda where nombre='Juan';
select * from Agenda where nombre='Sofía';
select * from Agenda where nombre<>'Sofía';

create table articulos(
  codigo integer,
  nombre text,
  descripcion text,
  precio real,
  cantidad integer
 );
 
insert into articulos (codigo, nombre, descripcion, precio,cantidad)
  values (1,'impresora','Epson Stylus C45',400.80,20);
 insert into articulos (codigo, nombre, descripcion, precio,cantidad)
  values (2,'impresora','Epson Stylus C85',500,30);
 insert into articulos (codigo, nombre, descripcion, precio,cantidad)
  values (3,'monitor','Samsung 14',800,10);
 insert into articulos (codigo, nombre, descripcion, precio,cantidad)
  values (4,'teclado','ingles Biswal',100,50);
 insert into articulos (codigo, nombre, descripcion, precio,cantidad)
  values (5,'teclado','español Biswal',90,50);
  
select * from articulos a where precio>=400;
select codigo,nombre from articulos where cantidad<30;
-- OPERADORES RELACIONALES <>,=,<,>,>=,<=

-- DELETE BORRA TODOS LOS REGISTROS O UN REGISTRO EN ESPECIAL DE UNA TABLA
SELECT * FROM Usuarios u; 
DELETE FROM Usuarios;
DELETE FROM Usuarios WHERE nombre ='Ana';

-- DROP borra una tabla
drop table Usuarios;

--UPDATE permite actualizar un registro
SELECT * from articulos a;
UPDATE articulos set cantidad = 50 where codigo=1;
UPDATE articulos set precio=precio*1.1; --aumentamos 10% del valor;
UPDATE articulos set precio=precio*0.95 where nombre = 'impresora';

--valores null, por defecto una tabla hacepta null en sus registros
create table medicamentos (
	codigo integer not null,
	nombre text not null,
	laboratorio text,
	precio real,
	cantidad integer not null	
);

insert into medicamentos (codigo,nombre,laboratorio,precio,cantidad)
  values(1,'Sertal gotas',null,null,100); 
insert into medicamentos (codigo,nombre,laboratorio,precio,cantidad)
  values(2,'Sertal compuesto',null,8.90,150);
insert into medicamentos (codigo,nombre,laboratorio,precio,cantidad)
  values(3,'Buscapina','Roche',null,200);
insert into medicamentos values (4, 'Acetaminofén', 'MK',5000,12);

drop table medicamentos;
--Llave primaria
create table medicamentos (
	codigo integer not null, --codigo integer primary key autoincrement not null
	nombre text not null,
	laboratorio text,
	precio real,
	cantidad integer not null,
	primary key(codigo)
);
insert into medicamentos (nombre,laboratorio,precio,cantidad)
  values('Sertal gotas',null,null,100); 
insert into medicamentos (nombre,laboratorio,precio,cantidad)
  values('Sertal compuesto',null,8.90,150);
insert into medicamentos (nombre,laboratorio,precio,cantidad)
  values('Buscapina','Roche',null,200);

 --campos con autoincremento
 drop table medicamentos;
create table medicamentos (
	codigo integer primary key autoincrement not null,
	nombre text not null,
	laboratorio text,
	precio real,
	cantidad integer not null
);

--valores por defecto

create table libros(
	codigo integer primary key,
	titulo text,
	autor text not null default 'desconocido', 
	editorial text,
	precio real,
	cantidad integer default 0
 );
insert into libros (titulo, precio) values ('Algoritmos',50000);
insert into libros (titulo,autor,editorial,precio,cantidad)
  values('El aleph','Borges','Planeta',15,100);
 insert into libros (titulo,autor,editorial,precio,cantidad)
  values('Martin Fierro','Jose Hernandez','Emece',22.20,200);
 
 --columnas calculadas
select * from libros;
select titulo, precio, cantidad, precio*cantidad as total from libros l;
--columna calculada concatenada ||
select titulo||'-'||autor||'-'||editorial as Libros from libros;
select titulo, precio, precio*0.05 as descuento from libros;

--ORDER BY
SELECT * FROM libros;
SELECT * FROM LIBROS ORDER BY precio;
SELECT * FROM LIBROS ORDER BY PRECIO DESC;
SELECT * FROM LIBROS ORDER BY 3; -- EL CAMPO 3 CORRESPONDE AL AUTOR
SELECT codigo, titulo from libros order by precio;
select titulo, precio, precio*0.95 as precio_descuento 
from libros 
order by precio_descuento;

-- and, or, NOT 
drop table medicamentos;
create table medicamentos(
	codigo integer primary key,
	nombre text,
	laboratorio text,
	precio real,
	cantidad integer
);

insert into medicamentos (nombre, laboratorio, precio, cantidad)
  values('Sertal', 'Roche', 5.2, 100);
insert into medicamentos (nombre, laboratorio, precio, cantidad)
  values('Buscapina', 'Roche', 4.10, 200);
insert into medicamentos (nombre, laboratorio, precio, cantidad)
  values('Amoxidal 500', 'Bayer', 15.60, 100);
insert into medicamentos (nombre, laboratorio, precio, cantidad)
  values('Paracetamol 500', 'Bago', 1.90, 200);
insert into medicamentos (nombre, laboratorio, precio, cantidad)
  values('Bayaspirina', 'Bayer', 2.10, 150); 
insert into medicamentos (nombre, laboratorio, precio, cantidad)
  values('Amoxidal jarabe', 'Bayer', 5.10, 250); 

select * FROM  medicamentos m ; 
SELECT codigo, nombre from medicamentos where laboratorio = 'Roche' and precio < 5;
select * from medicamentos where not laboratorio = 'Bayer';
UPDATE medicamentos set cantidad = 150 where laboratorio = 'Bayer' and cantidad<=100;

--between
select * from medicamentos where precio>= 0 and precio <=5;
select * from medicamentos where precio BETWEEN 0 and 5;

-- is null, is not null
select * from libros;
select * from libros where editorial is null;
select * from libros where editorial is not null;

-- in 
select * from libros where autor = 'Borges' or autor = 'Jose Hernandez';
select * from libros where autor in ('Borges', 'Jose Hernandez');
select * from libros where autor not in ('Borges', 'Jose Hernandez');

-- funciones de agregado: count, sum, min, max y avg
select count(*) from libros; 
select count(*) from medicamentos;
select count(editorial) from libros; -- count de un campo con cuenta los valores null
select sum(cantidad) from libros;
select * from medicamentos;
select sum(cantidad) from medicamentos where laboratorio = 'Bayer';

--like y not like se utilizar para comprar cadena exclusivamente
select * from medicamentos where nombre = 'Amoxidal'; -- no trae registros porque no es la cadena identica
select * from medicamentos where nombre like "%Amoxi%";
select * from medicamentos where nombre like 'B%';

drop table libros;
create table libros(
	codigo integer primary key,
	titulo text,
	autor text not null default 'desconocido', 
	editorial text,
	precio real,
	cantidad integer default 0
 );
insert into libros (titulo, autor, editorial, precio)
  values('El aleph', 'Borges', 'Emece', null);
 insert into libros (titulo, autor, editorial, precio)
  values('Antología poética', 'Borges', 'Planeta', 39.50);
 insert into libros (titulo, autor, editorial, precio)
  values('Java en 10 minutos', 'Mario Molina', 'Planeta', 50.50);
 insert into libros (titulo, autor, editorial, precio)
  values('Alicia en el pais de las maravillas', 'Lewis Carroll', 'Emece', 19.90);
 insert into libros (titulo, autor, editorial, precio)
  values('Martin Fierro', 'Jose Hernandez', 'Emece', 25.90);
 insert into libros (titulo, autor, editorial, precio)
  values('Martin Fierro', 'Jose Hernandez', 'Paidos', 16.80);
 insert into libros (titulo, autor, editorial, precio)
  values('Aprenda PHP', 'Mario Molina', 'Emece', 19.50);
 insert into libros (titulo, autor, editorial, precio)
  values('Cervantes y el quijote','Borges', 'Paidos', 18.40);

--group by
 select * from libros;
 select count(*) from libros where editorial= 'Planeta';
 select editorial, count(*) from libros group by editorial;
 UPDATE libros set editorial = null where codigo = 1;
 select editorial, count(precio) from libros group by editorial;
 select editorial, max(precio) as mayor, min(precio) as menor 
 from libros group by editorial;
 select editorial, autor, count(*) from libros 
 group by editorial, autor order by autor;
 select * from libros;
 select titulo, autor from libros group by autor;
 
-- having, se aplica a un conjunto o grupo de registros
select editorial, count(*) from libros group by editorial;
select editorial, COUNT(*) from libros group by editorial having COUNT(*)<=2; 
select editorial, avg(precio) from libros group by editorial having avg(precio)>25;
select editorial, count(*) from libros group by editorial HAVING editorial <> 'Emece';
select editorial, count(*) from libros where editorial<>'Emece' group by editorial;

-- join
drop table libros;
create table libros(
	codigo integer primary key,
	titulo text,
	autor text, 
	precio real,
	codigoeditorial integer,
	foreign key (codigoeditorial) references editoriales(codigo)
);
create table editoriales(
	codigo integer primary key,
	nombre text
);
insert into editoriales(nombre) values('Planeta');
 insert into editoriales(nombre) values('Emece');
 insert into editoriales(nombre) values('Siglo XXI');

insert into libros (titulo, autor, codigoeditorial, precio)
  values('El aleph', 'Borges', 2, 34);
 insert into libros (titulo, autor, codigoeditorial, precio)
  values('Antología poética', 'Borges', 1, 39.50);
 insert into libros (titulo, autor, codigoeditorial, precio)
  values('Java en 10 minutos', 'Mario Molina', 1, 50.50);
 insert into libros (titulo, autor, codigoeditorial, precio)
  values('Alicia en el pais de las maravillas', 'Lewis Carroll', 2, 19.90);
 insert into libros (titulo, autor, codigoeditorial, precio)
  values('Martin Fierro', 'Jose Hernandez', 2, 25.90);
 insert into libros (titulo, autor, codigoeditorial, precio)
  values('Martin Fierro', 'Jose Hernandez', 3, 16.80);

 SELECT * from libros join editoriales e on libros.codigoeditorial  = e.codigo; 
select libros.codigo, titulo, autor, nombre from libros 
join editoriales on libros.codigoeditorial = editoriales.codigo;

select l.codigo, titulo, autor, nombre from libros l
join editoriales e on l.codigoeditorial = e.codigo;-- instruccion con alias igual a la anterior
select l.codigo, titulo, autor, nombre from libros l
join editoriales e on l.codigoeditorial = e.codigo order by titulo;
select l.codigo, titulo, autor, nombre from libros l
join editoriales e on l.codigoeditorial = e.codigo where nombre = 'Planeta';
