# Implementação de um Formulário com Exibição de Nome

Este projeto consiste na implementação de um formulário com um campo para preenchimento de nome. O nome digitado é exibido logo abaixo do campo de preenchimento.

## Tecnologias Utilizadas

- JavaServer Faces (JSF)
- HTML5
- CSS3

## Estrutura do Projeto

O projeto foi estruturado utilizando o Maven para gerenciamento de dependências e foi dividido em pacotes model e controller para uma melhor organização do código.

No pacote `br.com.cadUser.controller`, foi criada a classe `PessoaController` que é responsável por gerenciar as ações do formulário.

No pacote `br.com.cadUser.model`, foi criada a classe `Pessoa` que representa o modelo de dados do formulário.

## Dependências

As dependências necessárias para o projeto, incluindo `javax.faces`, `cdi-api` e `jandex`, foram adicionadas ao arquivo `pom.xml` do Maven.

## Como Executar

1. Clone este repositório para a sua máquina local.
2. Importe o projeto para o Eclipse.
3. Execute o servidor WildFly.
5. No navegador, acesse:<http://localhost:8080/Cadastro-0.0.1-SNAPSHOT/cadastro.jsf>

