Sistema de Administração de Notas

Bem-vindo ao sistema de administração de notas! Este projeto tem como objetivo facilitar a gestão de notas de alunos, permitindo o cadastro, atualização, visualização e exclusão de notas de forma eficiente.

Funcionalidades

- Cadastro de Notas: Permite adicionar novas notas para alunos.
- Atualização de Notas: Permite atualizar notas já cadastradas.
- Visualização de Notas: Permite visualizar as notas dos alunos.
- Exclusão de Notas: Permite excluir notas cadastradas.

Tecnologias Utilizadas

- Linguagem de Programação: Java
- IDE: NetBeans
- Banco de Dados: MySQL
- Bibliotecas: JDBC para conexão com o banco de dados

Requisitos

Para rodar este projeto localmente, você precisará ter instalado:

- [Java Development Kit (JDK)](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html)
- [NetBeans IDE](https://netbeans.apache.org/)
- [MySQL](https://www.mysql.com/)
- [Git](https://git-scm.com/)

Instalação

Siga os passos abaixo para configurar o ambiente de desenvolvimento local:

1. Clone o repositório:

   ```bash
   git clone https://github.com/GabrielRN25/A3-Project.git
   cd sistema-de-administracao-de-notas
   ```

Configure o Banco de Dados MySQL:
Crie um banco de dados no MySQL:
CREATE DATABASE projetoa3;
Crie as tabelas:
USE projetoa3;
CREATE TABLE `usuario` (
`id_usuario` int NOT NULL AUTO_INCREMENT,
`nome` varchar(60) NOT NULL,
`senha` varchar(8) NOT NULL,
PRIMARY KEY (`id_usuario`)
);
USE projetoa3;
CREATE TABLE `notas` (
`id_notas` int NOT NULL AUTO_INCREMENT,
`nome` varchar(60) NOT NULL,
`a1` double DEFAULT NULL,
`a2` double DEFAULT NULL,
`a3` double DEFAULT NULL,
`total` double GENERATED ALWAYS AS (((`a1` + `a2`) + `a3`)) VIRTUAL,
PRIMARY KEY (`id_notas`) );

• Abra o projeto no NetBeans:
• Inicie o NetBeans IDE.
• Selecione File > Open Project.
• Navegue até o diretório clonado e selecione a pasta do projeto.
• Configure as variáveis de conexão com o banco de dados:
Altere as informações de login do banco de dados na Classe “DBC”
Baixe e a adicione na biblioteca do projeto o Driver jdbc Connector/J 8.4.0(https://dev.mysql.com/downloads/connector/j/).

Uso

1. Cadastro de Notas:
   o Acesse a funcionalidade de cadastro e preencha os campos com os dados do aluno e suas respectivas notas.
2. Atualização de Notas:
   o Acesse a lista de notas, selecione a nota que deseja atualizar e faça as modificações necessárias.
3. Visualização de Notas:
   o Acesse a funcionalidade de visualização para ver a lista completa de notas cadastradas.
4. Exclusão de Notas:
   o Na lista de notas, selecione a nota que deseja excluir e confirme a exclusão.
   Desenvolvido por Gabriel Rocha Nogueira, Gabriel Normanha Reis , Paulo Henrique De Souza Rocha.
