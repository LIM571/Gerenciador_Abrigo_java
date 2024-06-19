# Abrigou

## Descrição

**Abrigou** é uma aplicação de console em Java para gerenciar abrigos. A aplicação permite que você crie e gerencie abrigos, adicione e remova pessoas (voluntários e abrigados) e gerencie itens essenciais.

## Funcionalidades

- **Gerenciamento de Abrigos**: Crie e visualize abrigos.
- **Voluntários**: Adicione e remova voluntários.
- **Abrigados**: Adicione e remova abrigados.
- **Itens**: Adicione, remova e liste itens em várias categorias.

## Pré-requisitos

- Java Runtime Environment (JRE) instalado no seu sistema. [Baixe aqui](https://www.oracle.com/java/technologies/javase-jre8-downloads.html) se ainda não tiver.

## Instruções para Uso

Para utilizar o aplicativo, siga os passos abaixo:

1. **Baixe o Arquivo JAR:**
   - Baixe o arquivo `abrigou.jar` fornecido.

2. **Mover para a Área de Trabalho:**
   - Coloque o arquivo `abrigou.jar` na sua área de trabalho.

3. **Abrir o Prompt de Comando:**
   - Pressione `Win + R`, digite `cmd` e pressione `Enter` para abrir o Prompt de Comando.

4. **Acessar o Diretório da Área de Trabalho:**
   - No Prompt de Comando, digite o comando abaixo e pressione `Enter`:
     ```sh
     cd %USERPROFILE%\Desktop
     ```

5. **Executar o Aplicativo:**
   - Ainda no Prompt de Comando, execute o aplicativo com o comando:
     ```sh
     java -jar abrigou.jar
     ```

## Como Funciona

- **Interface do Usuário**: Após iniciar o aplicativo, você será apresentado a um menu onde pode escolher entre consultar abrigos, criar novos abrigos, gerenciar um abrigo existente ou sair.
- **Gerenciamento de Abrigos**: Permite visualizar detalhes de abrigos, adicionar ou remover voluntários e abrigados, e gerenciar itens associados ao abrigo.
- **Itens**: Adicione, remova e mostre itens em várias categorias, como higiene, alimentação, roupas, brinquedos e outros.

## Estrutura do Código

### main.java
- **Funcionalidade Principal**: O ponto de entrada da aplicação, que apresenta um menu para o usuário interagir.
- **Menu Principal**:
  - **Consultar abrigos**: Lista todos os abrigos criados.
  - **Criar abrigos**: Permite a criação de novos abrigos.
  - **Gerenciar meu Abrigo**: Permite gerenciar um abrigo específico, onde se pode:
    - Adicionar ou remover voluntários.
    - Adicionar ou remover abrigados.
    - Gerenciar itens (adicionar, remover e mostrar itens).
  - **Sair**: Encerra a aplicação.

### Voluntarios.java
- **Gerenciamento de Voluntários**: Fornece métodos para adicionar e remover voluntários, além de retornar o número atual de voluntários.

### abrigo.java
- **Representação do Abrigo**: Define a estrutura de um abrigo, incluindo nome, localização, número de voluntários e abrigados.
- **Métodos**:
  - `criarAbrigo()`: Cria uma nova instância de um abrigo.
  - `mostrarInformacoes()`: Exibe as informações do abrigo.
  - Métodos para adicionar e remover abrigados.

### itensabrigos.java
- **Gerenciamento de Itens**: Permite adicionar, remover e mostrar itens em várias categorias (higiene, alimentação, roupas, brinquedos, outros).


