CREATE DATABASE CadastroNFe;
USE CadastroNFe;


CREATE TABLE notas_fiscais (
  numero_nota INT AUTO_INCREMENT PRIMARY KEY,
  cnpj VARCHAR(18) UNIQUE,
  endereco VARCHAR(255),
  razao_social VARCHAR(255),
  valor DECIMAL(10,2),
  numero_serie INT
);

INSERT INTO notas_fiscais (cnpj, endereco, razao_social, valor, numero_serie) 
VALUES ('11.222.333/0004-55', 'Rua X', 'Empresa Y', 10000, 001);
INSERT INTO notas_fiscais (cnpj, endereco, razao_social, valor, numero_serie) 
VALUES ('22.333.111/0006-77', 'Avenida K', 'Sorveteria H', 20000, 002);
INSERT INTO notas_fiscais (cnpj, endereco, razao_social, valor, numero_serie) 
VALUES ('10.200.300/4000-50', 'Estrada Q', 'Rancho S', 20000, 002);
INSERT INTO notas_fiscais (cnpj, endereco, razao_social, valor, numero_serie) 
VALUES ('99.888.777/0006-55', 'BR 1', 'Banco L', 30500, 002);
INSERT INTO notas_fiscais (cnpj, endereco, razao_social, valor, numero_serie) 
VALUES ('12.334.445/5556-66', 'BR 1', 'Supermercado P', 40222, 001);
INSERT INTO notas_fiscais (cnpj, endereco, razao_social, valor, numero_serie) 
VALUES ('13.243.546/5768-79', 'BR 1', 'Loterica M', 81010, 003);
INSERT INTO notas_fiscais (cnpj, endereco, razao_social, valor, numero_serie) 
VALUES ('12.345.678/0009-99', 'Avenida K', 'Shopping F', 1234, 003);
INSERT INTO notas_fiscais (cnpj, endereco, razao_social, valor, numero_serie) 
VALUES ('98.765.432/0001-11', 'Rua X', 'Farmacia N', 252627, 001);

select * from notas_fiscais;
