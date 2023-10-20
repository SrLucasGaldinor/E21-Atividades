CREATE SCHEMA produtos;

CREATE TABLE tb_clientes (
	id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
	nome VARCHAR(45) NOT NULL,
	telefone VARCHAR(14),
	email VARCHAR(100)
);

CREATE TABLE tb_vendas (
	id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
	data DATE NOT NULL,
	hora VARCHAR(5) NOT NULL,
	tb_clientes_id INT NOT NULL,
    CONSTRAINT fk_vendas_clientes
    FOREIGN KEY (tb_clientes_id)
    REFERENCES tb_clientes(id)
);

CREATE TABLE tb_produtos (
	id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
	produto VARCHAR(45) NOT NULL,
	tb_categorias_id INT NOT NULL,
    
    CONSTRAINT fk_produtos_categorias
    FOREIGN KEY (tb_categorias_id)
    REFERENCES tb_categorias(id)
);

CREATE TABLE tb_categorias (
	id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
	categoria VARCHAR(45) NOT NULL
);

CREATE TABLE tb_fornecedores (
	id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
    fornecedor VARCHAR(45) NOT NULL
);

CREATE TABLE tb_compras (
	id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
    comprador VARCHAR(45) NOT NULL
);

CREATE TABLE tb_produtos_vendidos (
	id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
    quantidadeVendida INT NOT NULL,
    valorVendido FLOAT NOT NULL,
	tb_vendas_id INT NOT NULL,
    tb_produtos_id INT NOT NULL,
    
    CONSTRAINT fk_vendas_pv
    FOREIGN KEY (tb_vendas_id)
    REFERENCES tb_vendas(id),
    
	CONSTRAINT fk_produtos_pv
    FOREIGN KEY (tb_produtos_id)
    REFERENCES tb_produtos(id)
);

CREATE TABLE tb_produtos_fornecidos (
	id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
    
);

CREATE TABLE tb_produtos_comprados (
	id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
    
);

