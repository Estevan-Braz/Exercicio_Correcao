# Exercicio_Correcao
Este projeto foi feito as pressas, e eu acho que ele tem alguns erros. Por favor, corrija-os.

# Objetivo
Queremos criar um cadastro de Aluno e Professor. Apesar de entidades diferentes, eles possuem muitos campos compartilhados. Por isso, criamos uma entidade chamada Pessoa para servir comom um tabela central, e tanto Aluno quanto Professor fazem ligação com esta tabela central. A seguir, temos uma visão de como estas entidades se relacionam.

![Dados_sistema_pessoa drawio](https://github.com/GwinCorleone1/Exercicio_Correcao/assets/134980618/28bcf4fd-bcc2-453c-8383-708d677c5b77)

# Funcionalidades esperadas
 - localhost:8080/pessoa/addProfessor -> O usuário fornece os dados para registrar um professor, e a API retorna o registro do professor inserido.
 - localhost:8080/pessoa/addAluno -> O usuário fornece os dados para registrar um aluno no sistema, e a API retorna o registro do aluno inserido.
 - localhost:8080/aluno/pegarPorCurso-> O usuário fornece um nome de curso, e a API retorna todos os alunos que fazem parte daquele curso.
 - localhost:8080/professor/realizarLogin -> O usuário fornece o e-mail e senha, e a API retorna todos os registros que batem com o login e senha.
 - Sistema foi desenvolvido utilizando um banco de dados MySQL.
 - Utilizar o script.sql para criar o banco de dados e as tabelas necessárias.
 - Sistema foi desenvolvido para rodar no Java 21.




