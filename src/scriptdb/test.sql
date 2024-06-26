CREATE DATABASE TEST

USE TEST
categoria
CREATE TABLE IF NOT EXISTS usuarios (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    email VARCHAR(100) NOT NULL UNIQUE,
    contraseña VARCHAR(255) NOT NULL,
    fecha_registro TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    fecha_nacimiento DATE,
    genero ENUM('masculino', 'femenino', 'otro') DEFAULT 'otro',
    telefono VARCHAR(20),
    direccion VARCHAR(255)
);

select * from usuarios
-- Ejemplo de inserción de datos en la tabla usuarios
INSERT INTO usuarios (nombre, email, contraseña, fecha_nacimiento, genero, telefono, direccion) 
VALUES 
('Juan Perez', 'juan.perez@example.com', 'hashed_password1', '1990-05-14', 'masculino', '555-1234', 'Calle Falsa 123'),
('Ana Gomez', 'ana.gomez@example.com', 'hashed_password2', '1985-07-22', 'femenino', '555-5678', 'Avenida Siempreviva 456');

CREATE TABLE IF NOT EXISTS credenciales_usuarios (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre_usuario VARCHAR(100) NOT NULL UNIQUE,
    contraseña VARCHAR(255) NOT NULL
);

select * from credenciales_usuarios

CREATE TABLE IF NOT EXISTS users_details (
    id INT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(100) NOT NULL UNIQUE,
    passuser VARCHAR(255) NOT NULL
);

-- Ejemplo de inserción de datos en la tabla credenciales_usuarios
INSERT INTO users_details (username, passuser) 
VALUES 
('test', 'test');

select * from users_details;

##Eliminar esta tabla y crearla nuevamente
CREATE TABLE IF NOT EXISTS especie (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(50) NOT NULL UNIQUE
);


CREATE TABLE Empleados (
    id_employee INT PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(50) NOT NULL,
    apellido VARCHAR(50) NOT NULL,
    Telefono VARCHAR(15)
);
DROP TABLE categoria;

CREATE TABLE cliente (
	id INT PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(50) NOT NULL,
    apellido VARCHAR(50) NOT NULL,
    telefono VARCHAR(15),
    correo VARCHAR(100),
    direccion VARCHAR(200)
);

SELECT * FROM cliente;
DELETE FROM cliente WHERE id = 6;


CREATE TABLE Categorias (
    id_categoria INT PRIMARY KEY AUTO_INCREMENT,
    nombre_categoria VARCHAR(50) NOT NULL
);

CREATE TABLE categoria (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(50) NOT NULL
);

INSERT INTO categoria (nombre) VALUES ('Electrónica');
SELECT * FROM categoria


##----------------------------------------------------------

-- Crear la tabla 'categoria'
CREATE TABLE categoria (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(50) NOT NULL
);

select * from categoria

-- Crear la tabla 'subcategoria'
CREATE TABLE subcategoria (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(50) NOT NULL,
    id_categoria INT,
    FOREIGN KEY (id_categoria) REFERENCES categoria(id)
);

select * from subcategoria

-- Crear la tabla 'productos'
CREATE TABLE productos (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    cantidad INT NOT NULL,
    precio INT NOT NULL,
    id_subcategoria INT,
    id_categoria INT,
    FOREIGN KEY (id_subcategoria) REFERENCES subcategoria(id),
    FOREIGN KEY (id_categoria) REFERENCES categoria(id)
);
select * from productos
-- Insertar categorías principales
INSERT INTO categoria (nombre) VALUES 
('Productos Alimenticios'),
('Accesorio para mascotas'),
('Productos de Higiene y cuidado'),
('Medicamentos y Productos de Salud');
select * from categoria

-- Insertar subcategorías referenciando las categorías principales
INSERT INTO subcategoria (nombre, id_categoria) VALUES 
('Alimento para perros y gatos', 1), 
('Alimento para otras mascotas', 1), 
('Suplementos Alimenticios', 1) , 
#acesorios para mascotas
('Juguetes', 2),
('Camas y mantas', 2),
('Collates,arneses y correas,placas', 2),
('Ropa y accesorios de moda', 2),
('Transportadoras y jaulas', 2);

#acesorios para mascotas
INSERT INTO subcategoria (nombre, id_categoria) VALUES 
('Juguetes', 2),
('Camas y mantas', 2),
('Collates,arneses y correas,placas', 2),
('Ropa y accesorios de moda', 2),
('Transportadoras y jaulas', 2);

INSERT INTO subcategoria (nombre, id_categoria) VALUES 
('Juguetes', 2),
('Camas y mantas', 2),
('Collates,arneses y correas,placas', 2),
('Ropa y accesorios de moda', 2),
('Transportadoras y jaulas', 2);

UPDATE subcategoria
SET nombre = 'Joyeria para mascota'
WHERE id = 8;

select * from cliente

select * from subcategoria

-- Insertar productos referenciando las subcategorías y categorías
INSERT INTO productos (nombre, cantidad, precio, id_subcategoria, id_categoria) VALUES 
('Croquetas para mascota pequeña (Seco)', 999, 95, 1, 1),        -- Producto en la subcategoría Smartphones (categoría Electrónica)
('Croquetas para mascota mediana (Seco)', 999, 200, 1, 1),
('Croquetas para mascota grande (Seco)', 999, 350, 1, 1), 
('Alimento para Aves', 999, 40, 2, 1),
('Alimento para Reptiles', 999, 80, 2, 1),
('Alimento para Roedores', 999, 40, 2, 1),
('Alimento para Peces', 999, 85, 2, 1),
('Vitaminas y minerales', 999, 120, 3, 1),
('Suplementos para articulaciones', 999, 40, 3, 1),
('Probioticos', 999, 180, 3, 1);    

CREATE TABLE mascota (
    id INT PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(50) NOT NULL,
    especie VARCHAR(50),
    raza VARCHAR(50),
    edad INT,
    cliente_id INT,
    FOREIGN KEY (cliente_id) REFERENCES cliente(id)
);

select * from mascota
INSERT INTO cliente (nombre, apellido, telefono, correo, direccion) VALUES
('Juan', 'Pérez', '555-1234', 'juan.perez@example.com', 'Calle Falsa 123'),
('María', 'Gómez', '555-5678', 'maria.gomez@example.com', 'Avenida Siempre Viva 456'),
('Carlos', 'Ramírez', '555-8765', 'carlos.ramirez@example.com', 'Boulevard de los Sueños 789');

select * from cliente

-- Insertar datos de prueba en la tabla mascota
INSERT INTO mascota (nombre, especie, raza, edad, cliente_id) VALUES
('Firulais', 'Perro', 'Labrador', 3, 1),
('Misi', 'Gato', 'Siames', 2, 1),
('Rex', 'Perro', 'Pastor Alemán', 5, 2),
('Luna', 'Gato', 'Persa', 1, 3),
('Nemo', 'Pez', 'Payaso', 1, 3);

select * from mascota

select * from productos









