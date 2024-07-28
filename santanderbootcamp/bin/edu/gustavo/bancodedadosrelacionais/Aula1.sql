CREATE TABLE usuarios (
  id INT,
  nome VARCHAR(255) NOT NULL COMMENT 'Nome do usuário',
  email VARCHAR(255) NOT NULL UNIQUE COMMENT 'Endereço de e-mail do usuário',
  data_nascimento DATE NOT NULL COMMENT 'Data de nascimento do usuário',
  endereco VARCHAR(50) NOT NULL COMMENT 'Endereço do Cliente'
);

CREATE TABLE viagens.destinos (
  id INT,
  nome VARCHAR(255) NOT NULL UNIQUE COMMENT 'Nome do destino',
  descricao VARCHAR(255) NOT NULL COMMENT 'Descrição do destino'
);

CREATE TABLE viagens.reservas (
  id INT COMMENT 'Identificador único da reserva',
  id_usuario INT COMMENT 'Referência ao ID do usuário que fez a reserva',
  id_destino INT COMMENT 'Referência ao ID do destino da reserva',
  data DATE COMMENT 'Data da reserva',
  status VARCHAR(255) DEFAULT 'pendente' COMMENT 'Status da reserva (confirmada, pendente, cancelada, etc.)'
);

-- INSERTS --
INSERT INTO viagens.usuarios (id, nome, email, data_nascimento, endereco) VALUES 
(1, 'João Silva', 'joao@example.com', '1990-05-15', 'Rua A, 123, Cidade X, Estado Y'),
(2, 'Maria Santos', 'maria@example.com', '1985-08-22', 'Rua B, 456, Cidade Y, Estado Z'),
(3, 'Pedro Souza', 'pedro@example.com', '1998-02-10', 'Avenida C, 789, Cidade X, Estado Y');
(4, 'Gustavo', 'gustavo@example.com', '2006-05-29', 'Rua A, 123, Cidade 1, Estado 2');

INSERT INTO viagens.destinos (id, nome, descricao) VALUES 
(1, 'Praia da cal', 'Uma das belas praias do litoral gaúcho'),
(2, 'Prainha', 'Uma praia familiar, e aconchegante, perfeita para tomar um chimarrão em família'),
(3, 'Orla', 'Uma orla gastronômica com paisagem para o rio mampituba, repleta de opções culinárias.');

INSERT INTO viagens.reservas (id, id_usuario, id_destino, data, status) VALUES 
(1, 1, 2, '2023-07-10', 'confirmada'),
(2, 2, 1, '2023-08-05', 'pendente'),
(1, 1,1, 'pendente', '2024-11-11');

-- SELECTS --

-- Selecionar todos os registros da tabela "usuarios"
SELECT * FROM usuarios;

-- Selecionar apenas o nome e o email dos usuários
SELECT nome, email FROM usuarios;

-- Selecionar os usuários que possuem o nome "João Silva"
SELECT * FROM usuarios WHERE nome = 'João Silva';

-- Selecionar os usuários que nasceram antes de uma determinada data
SELECT * FROM usuarios WHERE data_nascimento < '1990-01-01';

-- Like
SELECT * FROM usuarios WHERE nome LIKE '%Silva%';
SELECT * FROM usuarios WHERE nome LIKE 'Jo_o%';

-- Update --
UPDATE usuarios SET endereco = 'Nova Rua, 123' WHERE email = 'joao@example.com';

-- delete --
DELETE FROM reservas WHERE status = 'cancelada';