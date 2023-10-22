INSERT INTO tb_clientes (nome, telefone, email) VALUES
	('Gabriela', '555', 'Gabi@gmail.com'),
	('Lucas', '455', 'Lucas@gmail.com'),
    ('Carlos', '895', 'Carlos@gmail.com');

INSERT INTO tb_categorias (categoria) VALUES
	('Cereais'), ('Frios'), ('Açougue');
    
INSERT INTO tb_vendas (data, hora, tb_clientes_id) VALUES
	('2023-05-10', '15:30', 2),
    ('2023-05-08', '08:30', 1),
    ('2023-05-05', '10:30', 3),
    ('2023-08-30', '18:30', 1);
    
INSERT INTO tb_fornecedores (fornecedor) VALUES
	('Agrojon'), ('Seara'), ('Friboi');
    
INSERT INTO tb_compras (comprador) VALUES
	('João Caires'), ('Pedro Fonseca'), ('Heric Avohay');
    
INSERT INTO tb_produtos (produto, tb_categorias_id) VALUES
	('Milho', 1), ('Queijo', 2), ('Filé Mignon', 3),
    ('Aveia', 1), ('Presunto', 2), ('Picanha', 3);
    
INSERT INTO tb_produtos_comprados (quantidade, dataCompras, tb_compras_id, tb_produtos_id) VALUES
    (7, '2023-09-01', 1, 1),
    (8, '2023-09-03', 2, 2),
    (5, '2023-09-06', 3, 3),
    (9, '2023-09-09', 2, 4),
    (10, '2023-09-01', 1, 5),
    (7, '2023-09-03', 2, 6);
    
INSERT INTO tb_produtos_fornecidos (valorUnitario, tb_fornecedores_id, tb_produtos_id) VALUES
    (4.99, 1, 1),
    (7.99, 2, 2),
    (12.99, 3, 3),
    (5.99, 1, 4),
    (2.99, 2, 5),
    (8.99, 3, 6);

INSERT INTO tb_produtos_vendidos (quantidadeVendida, valorVendido, tb_vendas_id, tb_produtos_id) VALUES
    (3, 12.99, 1, 4),
    (4, 42.90, 2, 6),
    (2, 10.50, 3, 5),
    (1, 8.30, 4, 1);
	
    
SELECT * FROM tb_vendas;
SELECT * FROM tb_compras;
SELECT * FROM tb_clientes;
SELECT * FROM tb_produtos;
SELECT * FROM tb_categorias;    
SELECT * FROM tb_fornecedores;
SELECT * FROM tb_produtos_vendidos;
SELECT * FROM tb_produtos_comprados;
SELECT * FROM tb_produtos_fornecidos;
    
ALTER TABLE tb_produtos_vendidos
MODIFY valorVendido DECIMAL(8,2) NOT NULL;

UPDATE tb_produtos_vendidos
SET valorVendido = 12.99
WHERE tb_produtos_id = 4;

UPDATE tb_produtos_vendidos
SET valorVendido = 42.90
WHERE tb_produtos_id = 6;

UPDATE tb_produtos_vendidos
SET valorVendido = 10.50
WHERE tb_produtos_id = 5;

UPDATE tb_produtos_vendidos
SET valorVendido = 8.30
WHERE tb_produtos_id = 1;

-- Criar uma consulta para listar o nome do produto, a quantidade vendida, o valor unitário de cada item. --
SELECT p.produto AS NomeProduto, pv.quantidadeVendida AS QuantidadeVendida, pf.valorUnitario AS ValorUnitario
FROM tb_produtos_vendidos AS pv
JOIN tb_produtos AS p ON pv.tb_produtos_id = p.id
JOIN tb_produtos_fornecidos AS pf ON pv.tb_produtos_id = pf.tb_produtos_id;

-- Criar uma consulta para listar a data da venda e para qual cliente foi realizada a venda. --
SELECT v.data AS DataVenda, c.nome AS Cliente
FROM tb_vendas AS v
JOIN tb_clientes AS c ON v.tb_clientes_id = c.id;

-- Listar o código, descrição, nome da categoria e nome do fornecedor de produtos. --
SELECT p.id AS Codigo, p.produto AS Descricao, cat.categoria AS Categoria, f.fornecedor AS Fornecedor
FROM tb_produtos AS p
JOIN tb_categorias AS cat ON p.tb_categorias_id = cat.id
JOIN tb_produtos_fornecidos AS pf ON p.id = pf.tb_produtos_id
JOIN tb_fornecedores AS f ON pf.tb_fornecedores_id = f.id;


