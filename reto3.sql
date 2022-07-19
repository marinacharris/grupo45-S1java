--Obtener el listado de los identificadores (id) de los materiales de construcción
--importados, incluyendo: sus nombres y precios (ordenados por nombre). Utilice los
--siguientes alias: ID_MATERIALCONSTRUCCION como ID,
--NOMBRE_MATERIAL como NOMBRE y PRECIO_UNIDAD como PRECIO.

SELECT ID_MATERIALCONSTRUCCION AS ID, NOMBRE_MATERIAL AS NOMBRE, PRECIO_UNIDAD AS PRECIO
FROM MaterialConstruccion WHERE Importado = 'Si' ORDER BY NOMBRE;

/*
 Se necesita conocer el listado de los proyectos, incluyendo la siguiente información:
id del proyecto, constructora, ciudad, clasificación, estrato y nombre completo del
líder de los proyectos que fueron financiados por el banco “Conavi”. Ordenados
desde el proyecto más reciente hasta el más antiguo, por nombre de la ciudad (de
forma ascendente) y por constructora. Para construir el listado mencionado, se debe
realizar un JOIN entre las tablas Proyecto y Tipo, Proyecto Líder. Utilice los
siguientes alias: ID_PROYECTO como ID y la unión del nombre + apellido del
líder como LIDER, el resto, queda en su forma natural.
 */

select p.ID_Proyecto as ID, p.Constructora, p.Ciudad, p.Clasificacion, t.Estrato, 
l.Nombre ||' '||l.Primer_Apellido ||' '||l.Segundo_Apellido as LIDER 
FROM Proyecto p
JOIN Tipo t ON (p.ID_Tipo = t.ID_Tipo)
JOIN Lider l ON (p.ID_Lider = l.ID_Lider)
where p.Banco_Vinculado = 'Conavi'
order by Fecha_Inicio desc, Ciudad, Constructora;


/*
Se desea conocer por cada ciudad y clasificación: el total de proyectos, la fecha del
proyecto más antiguo y la fecha del proyecto más reciente (ordenados por ciudad y
clasificación). No se deben incluir los proyectos tipo “Casa Campestre” ni
“Condominio”
*/

select Ciudad, Clasificacion, count(*) TOTAL, MIN(Fecha_Inicio) VIEJO, MAX(Fecha_Inicio) RECIENTE
from Proyecto p 
WHERE Clasificacion NOT IN ('Casa Campestre', 'Condominio')
GROUP by Ciudad, Clasificacion 
ORDER by Ciudad, Clasificacion;

/*
 Se debe presentar el total adeudado en cada proyecto (por las compras no pagadas a
los proveedores). Se debe agrupar los datos por el ID_proyecto y el valor total de la
deuda, siempre y cuando esta última sea superior a $50.000. Ordene los datos de
mayor a menor deuda.
 */

select p.ID_Proyecto, SUM(c.Cantidad*mc.Precio_Unidad) as VALOR  
from Proyecto p 
join Compra c on (p.ID_Proyecto= c.ID_Proyecto)
join MaterialConstruccion mc  on ( c.ID_MaterialConstruccion = mc.ID_MaterialConstruccion)
where c.Pagado = 'No'
GROUP by p.ID_Proyecto 
HAVING SUM(c.Cantidad*mc.Precio_Unidad) > 50000
order by VALOR desc;

/*
 Seleccione los 10 líderes que han realizado más compras en sus proyectos. Se debe
presentar el nombre completo del líder y el valor total de las compras realizadas.
Para limitar el número de registros, usar al final de la consulta la instrucción LIMIT
<numero>. 
 */
 
SELECT L.NOMBRE ||' '||L.PRIMER_APELLIDO ||' '||L.SEGUNDO_APELLIDO AS LIDER, SUM(C.CANTIDAD * MC.PRECIO_UNIDAD) AS VALOR
FROM LIDER L
JOIN PROYECTO P ON (P.ID_LIDER = L.ID_LIDER)
JOIN COMPRA C ON (P.ID_PROYECTO = C.ID_PROYECTO)
JOIN MATERIALCONSTRUCCION MC ON (C.ID_MATERIALCONSTRUCCION = MC.ID_MATERIALCONSTRUCCION)
GROUP BY L.NOMBRE ||' '||L.PRIMER_APELLIDO ||' '||L.SEGUNDO_APELLIDO
ORDER BY VALOR DESC
LIMIT 10;








