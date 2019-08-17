/**
 * Author:  Francisco Lucas Sens e Patrick Nascimento
 * Created: 16/08/2019
 */

DROP DATABASE IF EXISTS teste_sql_injection;
CREATE DATABASE IF NOT EXISTS teste_sql_injection;
USE teste_sql_injection;

CREATE TABLE clientes(
    id INT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(100),
    cpf VARCHAR(14),
    registro_ativo BIT
);

INSERT INTO clientes (nome, cpf, registro_ativo) VALUES 
('Eliane Louise Helena Nunes', '855.131.713-09', 1),
('Malu Aparecida Milena Baptista', '943.739.193-99', 1),
('Arthur César Diogo da Silva', '678.306.686-04', 0),
('Raul Enrico Viana', '333.792.315-17', 0),
('Camila Regina Ana Campos', '284.221.099-99', 0);