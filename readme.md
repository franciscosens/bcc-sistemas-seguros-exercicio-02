# Desenvolvimento de Sistemas Seguros - Exercício 02

Fundação da Universidade Regional de Blumenau

Alunos: 
* Francisco Lucas Sens
* Patrick Nascimento


[Enunciado](assets/L02-SQLInjection.pdf)

* [Questão 01](#questão-01---concatenação-de-informação)
* [Questão 02](#questão-02---white-list)
* [Questão 03](#questão-03---queries-parametrizáveis)

## Observação: 
Sistema deveria filtrar pela coluna de registro_ativo = 1, desta forma apresentando somente o registro 'Eliane' e 'Malu'.

## Questão 01 - Concatenação de Informação

Imagem de sucesso da execução do SQL Injection: 

![Imagem de sucesso da execução do SQL Injection](assets/imagens/questão01/sql&#32;injection&#32;sucesso.png)

Consulta no Banco de Dados:

```java
String query = "SELECT * FROM clientes WHERE registro_ativo = 1 AND nome LIKE '" + busca + "'";
Connection conexao = Conexao.conectar();
Statement st = conexao.createStatement();
ResultSet resultSet = st.executeQuery(query);
```
Foi utilizada a interface [Statement](https://docs.oracle.com/javase/8/docs/api/java/sql/Statement.html) que permite executar Queries no Banco de Dados, **porém este deve ser utilizado somente quando não tem que escapar informações.**

Arquivo: [Questao01.java](/src/dao/ClienteDAOQuestao01.java)


## Questão 02 - White List
![Imagem de tentativa de SQL Injection](assets/imagens/questão02/Falha&#32;de&#32;SQL&#32;Injection.png)

Consulta no Banco de Dados:

```java
boolean match = busca.matches("([a-zA-Zà-úÀ-Ú0-9\\s]*)");

if (match) {
    busca = String.format("%%%s%%", busca);
} else {
    busca = "";
}

String query = "SELECT * FROM clientes WHERE registro_ativo = 1 AND nome LIKE '" + busca + "'";
Connection conexao = Conexao.conectar();
Statement st = conexao.createStatement();
ResultSet resultSet = st.executeQuery(query); 
```

Foi utilizado o método [matches](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html#matches-java.lang.String-) que rebecce como parâmetro uma Expressão Regular, este método retorna um boolean, caso a busca contenha caracteres que a expressão regular não permite, automaticamente a busca é zerada, resolvendo o problema de SQL Injection.

Arquivo: [Questao02.java](/src/dao/ClienteDAOQuestao02.java)

## Questão 03 - Queries Parametrizáveis

Tentativa de consulta utilizando SQL Injection: 

![Imagem de tentativa de SQL Injection](assets/imagens/questão03/Falha&#32;de&#32;SQL&#32;Injection.png)

Consulta no Banco de Dados:

```java
String query = "SELECT * FROM clientes WHERE registro_ativo = 1 AND nome LIKE ?";
Connection conexao = Conexao.conectar();
PreparedStatement ps = conexao.prepareStatement(query);
ps.setString(1, busca);
ResultSet resultSet = ps.executeQuery();
```

Foi utilizada a interface [Prepared Statement](https://docs.oracle.com/javase/8/docs/api/java/sql/PreparedStatement.html) que é a classe que permite utilizar queries parametrizáveis no Java, resolvendo o problema de SQL Injection.

Arquivo: [Questao03.java](/src/dao/ClienteDAOQuestao03.java)