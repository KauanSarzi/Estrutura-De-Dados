# Estrutura de Dados

Este repositório reúne exercícios e pequenos projetos desenvolvidos em Java para a disciplina de Estrutura de Dados. Cada pasta contém uma implementação focada em uma estrutura específica ou em uma aplicação que combina diferentes conceitos, desde listas encadeadas até árvores de busca binária e gerenciamento de clientes em memória.

## Estrutura do repositório

| Pasta | Descrição |
| ----- | --------- |
| `ATIVIDADE LISTA LIGADA/` | Implementa uma lista simplesmente encadeada genérica com operações avançadas, como inserção ordenada, inversão in-place, verificação de palíndromos, mesclagem de listas ordenadas e remoção de duplicatas, acompanhadas de um `App` que demonstra cada funcionalidade. |
| `Lista Encadeada/No/` | Versão introdutória de uma lista simplesmente encadeada de inteiros, com métodos para inserir no início e no final, remover a primeira ocorrência de um valor e imprimir o conteúdo da estrutura. |
| `lista duplamente ligada/` | Modelo de playlist musical baseado em lista duplamente encadeada, permitindo inserir músicas, navegar para frente e para trás, buscar por título, remover elementos e exibir a lista em ordem normal ou inversa. |
| `Projeto2 Arvore Binaria De Busca/` | Aplicação de linha de comando que indexa textos em uma árvore binária de busca. Permite carregar arquivos `.txt`, calcular estatísticas (linhas, total de palavras, média de caracteres, redundância), buscar palavras exatas ou parciais, exibir a árvore em ordem reversa e contabilizar a frequência de letras. |
| `sistema verde/` | Sistema completo de locação de bicicletas em console, armazenando até 10 clientes e oferecendo cadastro, locação, devolução, remoção, exibição, ordenação por gasto (bubble sort) e identificação do cliente mais rentável. |


## Como executar os exemplos

1. **Instale o JDK** – Qualquer versão recente (Java 11+) é suficiente para compilar os projetos.
2. **Entre na pasta desejada** – Por exemplo, `cd "ATIVIDADE LISTA LIGADA"`.
3. **Compile os arquivos** – Utilize `javac -d bin src/*.java`. Ajuste o caminho quando houver subpacotes ou mais de um diretório fonte.
4. **Execute o programa** – Rode `java -cp bin NomeDaClassePrincipal`. Verifique a classe `App` ou `Aplicacao` correspondente em cada pasta.

Algumas pastas já possuem um diretório `bin/` com classes compiladas.
