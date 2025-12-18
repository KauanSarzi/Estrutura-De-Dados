# 📚 Estrutura de Dados em Java

Repositório completo com implementações práticas de estruturas de dados fundamentais em Java, desenvolvidas durante a disciplina de Estrutura de Dados.

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![VS Code](https://img.shields.io/badge/VS_Code-007ACC?style=for-the-badge&logo=visual-studio-code&logoColor=white)

---

## 📋 Sobre o Repositório

Este repositório contém implementações detalhadas das principais estruturas de dados estudadas em ciência da computação, incluindo listas encadeadas, árvores binárias de busca e aplicações práticas. Cada projeto foi desenvolvido com foco em clareza, eficiência e boas práticas de programação.

---

## 🗂️ Estrutura do Repositório

```
estrutura-dados/
│
├── ATIVIDADE LISTA LIGADA/          # Lista ligada com operações avançadas
├── Lista Encadeada/No/              # Implementação básica de lista encadeada
├── lista duplamente ligada/         # Lista duplamente ligada (Playlist)
├── Projeto2 Arvore Binaria De Busca/  # Árvore binária de busca com análise de texto
└── sistema verde/                    # Sistema de locação de bicicletas
```

---

## 🚀 Projetos Implementados

### 1️⃣ Lista Ligada com Operações Avançadas

**Localização:** `ATIVIDADE LISTA LIGADA/`

Implementação completa de uma lista ligada genérica com operações sofisticadas.

**Funcionalidades:**
- ✅ Inserção ordenada de elementos
- ✅ Inversão da lista
- ✅ Verificação de palíndromo
- ✅ Mesclagem de duas listas ordenadas
- ✅ Remoção de elementos duplicados

**Arquivos principais:**
- `ListaLigada.java` - Estrutura principal com todos os métodos
- `Node.java` - Classe do nó genérico
- `App.java` - Demonstração de todas as funcionalidades

**Exemplo de uso:**
```java
ListaLigada<Integer> lista = new ListaLigada<>();
lista.inserirOrdenado(5);
lista.inserirOrdenado(2);
lista.inserirOrdenado(8);
lista.inverter();
ListaLigada.imprimir(lista); // Saída: 8 5 2
```

---

### 2️⃣ Lista Encadeada Simples

**Localização:** `Lista Encadeada/No/`

Implementação fundamental de lista encadeada com operações básicas de inserção e remoção.

**Funcionalidades:**
- ✅ Inserção no início
- ✅ Inserção no fim
- ✅ Remoção de elementos
- ✅ Impressão da lista

**Conceitos abordados:**
- Ponteiros e referências
- Alocação dinâmica de memória
- Travessia de listas

---

### 3️⃣ Sistema de Playlist (Lista Duplamente Ligada)

**Localização:** `lista duplamente ligada/`

Sistema de gerenciamento de playlist musical utilizando lista duplamente ligada.

**Funcionalidades:**
- 🎵 Adicionar músicas à playlist
- ⏭️ Avançar para próxima música
- ⏮️ Retroceder para música anterior
- 🔍 Buscar música por título
- 🗑️ Remover música da playlist
- 📋 Exibir playlist em ordem normal e inversa

**Classes implementadas:**
- `Playlist.java` - Gerenciador da lista duplamente ligada
- `NoDuplo.java` - Nó com referências anterior e próxima
- `Musica.java` - Modelo de dados da música

**Exemplo de uso:**
```java
Playlist playlist = new Playlist();
playlist.adicionarMusica(new Musica("FE!N", "Travis Scott", 178));
playlist.avancar();
playlist.retroceder();
playlist.exibirOrdemNormal();
```

---

### 4️⃣ Árvore Binária de Busca - Analisador de Texto

**Localização:** `Projeto2 Arvore Binaria De Busca/`

Sistema avançado de análise textual utilizando Árvore Binária de Busca (ABB).

**Funcionalidades:**
- 📄 Carregar e processar arquivos de texto (.txt)
- 📊 Estatísticas detalhadas do texto
  - Total de linhas e palavras
  - Palavras distintas
  - Média de caracteres por palavra
  - Taxa de redundância
- 🔍 Busca exata de palavras
- 🔎 Busca parcial (substring)
- 📋 Exibição em ordem reversa
- 📈 Análise de frequência de letras

**Classes implementadas:**
- `ArvoreBinariaBusca.java` - Estrutura da ABB com operações
- `Palavra.java` - Modelo de palavra com ocorrências
- `No.java` - Nó da árvore
- `Principal.java` - Interface do usuário com menu interativo

**Menu do sistema:**
```
1 - Carregar texto
2 - Estatísticas
3 - Busca por palavra (exata)
4 - Busca por parte da palavra
5 - Exibir ABB (ordem reversa)
6 - Frequência de letras
7 - Sair
```

**Complexidade das operações:**
- Inserção: O(log n) em média, O(n) no pior caso
- Busca: O(log n) em média, O(n) no pior caso
- Travessia: O(n)

---

### 5️⃣ Sistema Verde - Locação de Bicicletas

**Localização:** `sistema verde/`

Sistema completo de gerenciamento de locação de bicicletas utilizando arrays e algoritmos de ordenação.

**Funcionalidades:**
- 👤 Cadastro de clientes (máximo 10)
- 🚴 Alugar bicicleta (R$ 5,00 por locação)
- ✅ Devolver bicicleta
- 🗑️ Remover cliente
- 📊 Exibir dados completos do cliente
- 📋 Listar clientes por ordem decrescente de gastos
- 💰 Identificar cliente mais rentável

**Classes implementadas:**
- `Cliente.java` - Modelo de dados do cliente
- `Aplicacao.java` - Sistema completo com menu e operações

**Validações implementadas:**
- ✅ CPF único por cliente
- ✅ Limite máximo de clientes
- ✅ Verificação de bicicleta já alugada
- ✅ Controle de estado (alugada/disponível)

**Algoritmos utilizados:**
- Bubble Sort para ordenação por gastos
- Busca linear para localização de clientes

---

## 🛠️ Tecnologias Utilizadas

- **Java 11+** - Linguagem de programação
- **VS Code** - IDE de desenvolvimento
- **Estruturas de Dados:**
  - Listas Encadeadas Simples
  - Listas Duplamente Ligadas
  - Árvores Binárias de Busca
  - Arrays

---

## 🚀 Como Executar os Projetos

### Pré-requisitos

- Java Development Kit (JDK) 11 ou superior
- VS Code com Java Extension Pack (opcional)
- Git

### Passo a Passo

1. **Clone o repositório:**
```bash
git clone https://github.com/KauanSarzi/estrutura-dados.git
cd estrutura-dados
```

2. **Navegue até o projeto desejado:**
```bash
cd "ATIVIDADE LISTA LIGADA"
# ou
cd "lista duplamente ligada"
# ou
cd "Projeto2 Arvore Binaria De Busca"
# ou
cd "sistema verde"
```

3. **Compile o projeto:**
```bash
javac -d bin src/*.java
```

4. **Execute a aplicação:**
```bash
# Para projetos com App.java
java -cp bin App

# Para o sistema de análise de texto
java -cp bin AplicacaoABB

# Para o sistema verde
java -cp bin Aplicacao
```

### Usando VS Code

1. Abra a pasta do projeto no VS Code
2. Pressione `F5` para compilar e executar
3. Ou clique com botão direito em `App.java` → "Run Java"

---

## 📊 Complexidade das Estruturas

| Estrutura | Busca | Inserção | Remoção | Espaço |
|-----------|-------|----------|---------|--------|
| Lista Encadeada | O(n) | O(1)* | O(n) | O(n) |
| Lista Duplamente Ligada | O(n) | O(1)* | O(n) | O(n) |
| Árvore Binária de Busca | O(log n)** | O(log n)** | O(log n)** | O(n) |

\* Inserção no início/fim  
\** Em média, O(n) no pior caso (árvore desbalanceada)

---

## 🎯 Conceitos Abordados

### Estruturas de Dados
- ✅ Listas encadeadas (simples e duplas)
- ✅ Árvores binárias de busca
- ✅ Nós e ponteiros
- ✅ Alocação dinâmica de memória

### Algoritmos
- ✅ Ordenação (Bubble Sort)
- ✅ Busca (linear e binária)
- ✅ Travessia de estruturas
- ✅ Recursão

### Boas Práticas
- ✅ Programação orientada a objetos
- ✅ Genéricos (Generics)
- ✅ Encapsulamento
- ✅ Separação de responsabilidades
- ✅ Código limpo e documentado

---

## 📈 Melhorias Futuras

- [ ] Implementar árvores balanceadas (AVL, Red-Black)
- [ ] Adicionar testes unitários (JUnit)
- [ ] Implementar estruturas como:
  - [ ] Pilhas (Stack)
  - [ ] Filas (Queue)
  - [ ] Tabelas Hash
  - [ ] Grafos
- [ ] Criar visualizações gráficas das estruturas
- [ ] Adicionar análise de complexidade em tempo real
- [ ] Documentação JavaDoc completa

---

## 📚 Recursos de Aprendizado

### Tópicos para Estudo
- Análise de complexidade (Big O)
- Estruturas de dados avançadas
- Algoritmos de ordenação eficientes
- Árvores balanceadas

---

## 👨‍💻 Autor

**Kauan Sarzi**

- GitHub: [@KauanSarzi](https://github.com/KauanSarzi)
- LinkedIn: [Kauan Sarzi](https://linkedin.com/in/kauan-sarzi)
- Email: kauansarzi24@gmail.com

---

## 📝 Licença

Este projeto foi desenvolvido para fins educacionais durante a disciplina de Estrutura de Dados.



