DROP TABLE IF EXISTS PRODUCTO;
CREATE TABLE PRODUCTO (
    Id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(50) NOT NULL,
    descripcion VARCHAR(150) NOT NULL,
    precio NUMERIC NOT NULL,
    categoria VARCHAR(50) NOT NULL,
);


INSERT INTO PRODUCTO (id,nombre,descripcion,precio,categoria) VALUES (1,"teclado","dispositivo entrada",1500,"periferico");
INSERT INTO PRODUCTO (id,nombre,descripcion,precio,categoria) VALUES (2,"mouse","dispositivo entrada",1200,"periferico");
INSERT INTO PRODUCTO (id,nombre,descripcion,precio,categoria) VALUES (3,"monitor","dispositivo salida",1200,"periferico");
