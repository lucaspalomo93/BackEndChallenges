CREATE DATABASE personasmascotas;

USE personasmascotas;

DROP TABLE IF EXISTS persona;
DROP TABLE IF EXISTS mascota;

CREATE TABLE persona(
	idpersona INT NOT NULL AUTO_INCREMENT,
	nombre VARCHAR(45),
    apellido VARCHAR(45),
    PRIMARY KEY (idpersona)
);


CREATE TABLE mascota(
	idmascota INT NOT NULL AUTO_INCREMENT,
    duenioid INT,
    nombre VARCHAR(45),
    raza VARCHAR(45),
    PRIMARY KEY(idmascota),
    FOREIGN KEY(duenioid) REFERENCES persona(idpersona)
);

DELIMITER $$ 
CREATE TRIGGER delete_persona 
AFTER DELETE ON persona
FOR EACH ROW BEGIN
	SET FOREIGN_KEY_CHECKS=0; -- to disable them	
	INSERT INTO mascota (duenioid) VALUES(null);
    SET FOREIGN_KEY_CHECKS=1; -- to re-enable them
END;$$

/*
DELIMITER $$
create or replace trigger comercio 
before delete on cliente
for each row begin 
	insert into deleteCliente(id, nombre, apellido, dni, direccion, fechaNacimiento, vendedor_id) values (null, old.nombre, old.apellido, old.dni, old.direccion, old.fechaNacimiento, old.vendedor_id);
end;$$
*/