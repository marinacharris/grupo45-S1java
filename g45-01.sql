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