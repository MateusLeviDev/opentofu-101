![Last Commit](https://img.shields.io/github/last-commit/MateusLeviDev/maven-jpa-demo)

## `JPA - QUESTIONS`

- 01. Qual o significado da sigla JPA e o que ela representa? (10%)
> Ela representa Java Persistense API. Ela representa uma especificação para ORM em Java. Um framework de mapeamento relacional. 
- 02. O que é um EntityManager e qual sua função? (20%)
> Parte da operação com o banco de dados. Trata-se da camada de persistência, ao contrário da lógica da aplicação (mapeamento) que fica por conta da classe da entidade, ou seja, @Annotations. É uma interface da API JPA. 
- 03. O que é uma entidade no contexto do JPA e como ela é representada? (30%)
> Podemos entender uma entity como um modelo de tabela em um banco de dados relacional. 
- 04. O que é o Hibernate e qual sua relação com o JPA? (20%)
> Hibernate é um de seus principais frameworks para a aplicação. 
- 05. Quais são as principais anotações usadas no JPA e para que servem? (40%)
- 06. Como configurar o JPA em uma aplicação web usando o arquivo persistence.xml? (40%)
> Crie um arquivo persistence.xml dentro do diretório "META-INF" da sua aplicação. Esse arquivo deve estar no classpath da sua aplicação. Configure o provedor de persistência (Hibernate, EclipseLink, etc.) que você deseja utilizar, informando o nome da classe do provedor e as propriedades específicas desse provedor. 
- 07. Como criar consultas usando JPQL (Java Persistence Query Language)? (50%)
- 08. O que é um relacionamento bidirecional no JPA e como é implementado? (60%)
- 09. Quais são as estratégias de geração de chaves primárias disponíveis no JPA e como configurá-las? (70%)
- 10. Como realizar operações de CRUD (Create, Read, Update, Delete) usando o JPA? (80%)
- 11. Explique sobre o DAO.
> é usado para separar a lógica de acesso a dados da lógica de negócios de uma aplicação. Ele fornece uma interface entre a camada de persistência de dados e a camada de negócios, permitindo que os desenvolvedores manipulem objetos de domínio sem precisar conhecer os detalhes do acesso aos dados subjacentes. O DAO permite que as operações de acesso a dados sejam isoladas do restante da aplicação, o que torna o código mais modular e fácil de manter. Com o DAO, é possível alterar o mecanismo de persistência sem afetar a lógica de negócios da aplicação. Por exemplo, se você decidir mudar de um banco de dados relacional para um banco de dados NoSQL, precisará apenas atualizar a implementação do DAO, sem precisar alterar a lógica de negócios.
- 12. Como resolver conflitos de dependências no Maven quando diferentes bibliotecas precisam de diferentes versões de uma mesma dependência?
- 13. Como lidar com problemas de desempenho durante a construção de projetos Maven em máquinas com recursos limitados?
- 14. Como configurar o Maven para trabalhar com um repositório de artefatos interno da empresa em vez do repositório padrão da Internet?
- 15. Como depurar problemas de compilação ou empacotamento no Maven quando ocorrem erros inesperados?
- 16. Como integrar o Maven com outras ferramentas de build ou automação, como o Jenkins ou o GitLab CI/CD, para criar pipelines de build e implantação contínuas?
- 17. O que é Maven e como ele ajuda no desenvolvimento de software?
- 18. O que é XML?
> Assim como o JSON o XML visa transmitir dados de forma estruturada. XML é uma linguagem de marcação.  


## `Breves trechos sobre JPA`
> "De forma geral, uma arquitetura de objetos distribuídos é o elemento central para qualquer servidor de aplicativos. No ambiente Java, não poderia ser diferente, como podemos observar no uso de componentes EJB (Enterprise Java Bean) em servidores como GlassFish, JBoss e WebSphere. "
"Um EJB é um componente corporativo, utilizado de forma indireta, dentro de um ambiente de objetos distribuídos, suportando transações locais e distribuídas, recursos de autenticação e segurança, acesso a banco de dados via pool de conexões, e demais elementos da plataforma JEE (Java Enterprise Edition). Todo EJB executa dentro de um pool de objetos, em que o número de instâncias irá aumentar ou diminuir, de acordo com a demanda de solicitações efetuadas, segundo um intervalo de tempo estabelecido."
- Um pool de objetos segue o padrão de desenvolvimento Flyweight, no qual o objetivo é responder a uma grande quantidade de requisições através de um pequeno conjunto de objetos.

- OneToMany: é um relacionamento em que uma entidade A pode ter vários elementos de outra entidade B. Para modelar esse relacionamento no JPA, a entidade A deve conter uma coleção de elementos da entidade B (por exemplo, uma lista de funcionários em uma empresa). A entidade B, por sua vez, deve conter uma referência para a entidade A (por exemplo, um campo empresa em cada objeto Funcionário).

- ManyToOne: é o oposto do OneToMany. Nesse caso, uma entidade B pode estar associada a apenas uma entidade A, mas a entidade A pode estar associada a vários elementos da entidade B. Para modelar esse relacionamento no JPA, a entidade B deve conter uma referência para a entidade A (por exemplo, um campo empresa em cada objeto Funcionário). A entidade A, por sua vez, não precisa ter uma coleção de elementos da entidade B.

- OneToOne: é um relacionamento em que uma entidade A tem apenas um elemento de outra entidade B e vice-versa. Esse tipo de relacionamento é mais restrito e menos comum do que os anteriores. Para modelar esse relacionamento no JPA, basta criar um campo em cada entidade que faça referência à outra entidade.

- ManyToMany: é um relacionamento em que várias entidades A estão associadas a várias entidades B. Para modelar esse relacionamento no JPA, é necessário criar uma nova entidade que represente a associação entre as entidades A e B (por exemplo, uma tabela Pedidos_Produtos para associar pedidos e produtos). Essa nova entidade deve conter referências para as entidades A e B e, por sua vez, ser referenciada por elas.

OneToMany: suponha que temos um sistema de gerenciamento de uma escola e precisamos modelar a relação entre turmas e alunos. Cada turma pode ter vários alunos, mas cada aluno só pode estar em uma turma. Podemos modelar essa relação da seguinte forma:
> A entidade Turma teria uma coleção de objetos Aluno (por exemplo, um List<Aluno> alunos).
A entidade Aluno teria um campo que faz referência à entidade Turma (por exemplo, um campo Turma turma).
  
ManyToOne: utilizando o exemplo da escola, suponha que agora precisamos modelar a relação entre alunos e escolas. Cada aluno pertence a uma escola, mas cada escola pode ter vários alunos. Podemos modelar essa relação da seguinte forma:
> A entidade Aluno teria um campo que faz referência à entidade Escola (por exemplo, um campo Escola escola).
A entidade Escola não precisaria ter uma coleção de objetos Aluno.
  
OneToOne: suponha agora que temos um sistema de vendas online e precisamos modelar a relação entre usuários e cartões de crédito. Cada usuário pode ter apenas um cartão de crédito e cada cartão de crédito só pode estar associado a um usuário. Podemos modelar essa relação da seguinte forma:
> A entidade Usuario teria um campo que faz referência à entidade CartaoCredito (por exemplo, um campo CartaoCredito cartaoCredito).
A entidade CartaoCredito teria um campo que faz referência à entidade Usuario (por exemplo, um campo Usuario usuario).
  
ManyToMany: ainda utilizando o exemplo do sistema de vendas online, suponha que agora precisamos modelar a relação entre produtos e pedidos. Cada pedido pode ter vários produtos e cada produto pode estar associado a vários pedidos. Podemos modelar essa relação da seguinte forma:
> Criamos uma nova entidade, PedidoProduto, que tem campos que fazem referência às entidades Pedido e Produto.
A entidade Pedido teria uma coleção de objetos PedidoProduto (por exemplo, um List<PedidoProduto> produtos).
A entidade Produto teria uma coleção de objetos PedidoProduto (por exemplo, um List<PedidoProduto> pedidos).

