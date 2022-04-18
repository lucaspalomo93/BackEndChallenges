CREATE DATABASE academia;

USE academia;

CREATE TABLE estudiantes(
	id INT NOT NULL AUTO_INCREMENT,
	nro_identificacion INT NOT NULL,
	nombre VARCHAR(45) NOT NULL,
	apellido VARCHAR(45) NOT NULL,
	estado_civil VARCHAR(13),
	PRIMARY KEY (id)
);

CREATE TABLE profesor(
	id INT NOT NULL AUTO_INCREMENT,
	nro_identificacion INT NOT NULL,
	anio_incorporacion INT NOT NULL,
	nombre VARCHAR(45) NOT NULL,
	apellido VARCHAR(45) NOT NULL,
	estado_civil VARCHAR(13),
	PRIMARY KEY (id)

);

CREATE TABLE personalServicio(
	id INT NOT NULL AUTO_INCREMENT,
	nro_identificacion INT NOT NULL,
	anio_incorporacion INT NOT NULL,
	nombre VARCHAR(45) NOT NULL,
	apellido VARCHAR(45) NOT NULL,
	estado_civil VARCHAR(13),
	PRIMARY KEY (id)
);
