# ☕ Java OOP — Orientação a Objetos

Repositório dedicado ao aprendizado prático de **Orientação a Objetos em Java**, construindo progressivamente um sistema de loja completo do zero.

---

## 🎯 Objetivo

Consolidar os quatro pilares do POO — encapsulamento, herança, polimorfismo e abstração — através de um sistema real e crescente, preparando a base para desenvolvimento back-end com Spring Boot.

---

## 🛠️ Tecnologias

- Java 25 LTS
- Visual Studio Code
- Extension Pack for Java (Microsoft)

---

## 🏗️ Arquitetura do Sistema

O projeto é um sistema de loja construído de forma incremental, onde cada exercício adiciona uma nova camada:

```
java-OOP/
└── src/
    ├── Desconto.java       # Interface — contrato de desconto
    ├── Produto.java        # Classe base — encapsulamento e getters/setters
    ├── Eletronico.java     # Herança de Produto — polimorfismo
    ├── Cliente.java        # Classe independente com validação de CPF
    ├── Pedido.java         # Associação entre Cliente e lista de Produtos
    ├── Estoque.java        # Gerenciamento de lista de Produtos
    ├── Relatorio.java      # Classe utilitária com método estático
    └── Loja.java           # Main — integração de todo o sistema
```

---

## 📝 Exercícios

### 1. Produto — Encapsulamento
Primeira classe do sistema. Define atributos privados com getters, setters com validação e construtor obrigatório.

**Destaques:**
- Atributos `private` protegidos
- `setPreco()` rejeita valores negativos
- Construtor garante que nenhum produto nasce sem dados

**Conceitos:** encapsulamento, `private`, getters, setters, `this`, construtor

---

### 2. Eletronico — Herança e Polimorfismo
Herda tudo de `Produto` e adiciona o atributo `voltagem`. Sobrescreve o método `exibir()` para incluir a voltagem.

**Destaques:**
- `extends Produto` — herança completa
- `super(nome, preco, quantidade)` — chama o construtor pai
- `@Override exibir()` — usa `super.exibir()` e adiciona a voltagem

**Conceitos:** herança, `extends`, `super`, `@Override`, polimorfismo

---

### 3. Interface Desconto
Contrato que obriga qualquer classe que o implemente a ter o método `aplicarDesconto(double percentual)`.

**Destaques:**
- `Produto` aceita até 20% de desconto
- `Eletronico` limita a no máximo 10% — regra de negócio protegida dentro da classe
- Mesmo método, comportamentos diferentes — polimorfismo real

**Conceitos:** `interface`, `implements`, contrato, regra de negócio

---

### 4. Cliente — Validação com Regex
Classe independente com validação de CPF usando expressão regular.

**Destaques:**
- `setCpf()` valida se o CPF tem exatamente 11 dígitos numéricos com `matches("\\d{11}")`
- Construtor chama o setter para reaproveitar a validação
- CPF inválido é rejeitado e definido como `null`

**Conceitos:** validação, expressão regular, reaproveitamento de lógica

---

### 5. Pedido — Objeto dentro de Objeto
Associa um `Cliente` a uma lista de `Produto`. Primeiro exercício onde um objeto contém outro objeto.

**Destaques:**
- `Cliente` passado como parâmetro no construtor
- `calcularTotal()` itera pela lista multiplicando preço pela quantidade
- Estrutura base de qualquer sistema de e-commerce real

**Conceitos:** composição, `ArrayList`, iteração com `for-each`

---

### 6. Estoque — Gerenciamento de Lista
Gerencia o inventário da loja com busca, listagem e alertas de estoque baixo.

**Destaques:**
- `buscarPorNome()` retorna um objeto `Produto` inteiro, não apenas uma String
- `exibirAbaixoDoEstoque(int limite)` filtra produtos abaixo do limite informado
- `getProdutos()` retorna `new ArrayList<>(p)` — cópia defensiva que protege o estoque original

**Conceitos:** retorno de objetos, cópia defensiva, encapsulamento avançado

---

### 7. Relatorio — Projeto Final da Fase 2
Consolida todo o sistema num relatório completo gerado por um método estático.

**Destaques:**
- Método estático `gerarRelatorio(Estoque, Pedido)` — sem precisar instanciar a classe
- Itera pelo estoque e calcula desconto real de cada produto
- Integra todas as classes do sistema numa única saída organizada

**Conceitos:** método estático, integração de classes, visão de sistema

---

## 📊 Saída do Sistema

```
===== RELATÓRIO DO SISTEMA =====

--- ESTOQUE ---
Produtos em estoque:
- Notebook - Preço: R$ 3500.0 - Quantidade: 10
- Smartphone Pro - Preço: R$ 1500.0 - Quantidade: 20
- Tablet Pro - Preço: R$ 1000.0 - Quantidade: 15
- Smartphone - Preço: R$ 1500.0 - Quantidade: 20
- Tablet - Preço: R$ 1000.0 - Quantidade: 15

--- PRODUTOS ABAIXO DE 12 UNIDADES ---
- Notebook - Quantidade: 10

--- PEDIDO ---
Cliente: Yuri
Produtos:
- Notebook (10 x R$ 3500.0)
- Smartphone (20 x R$ 1500.0)
Total: R$ 65000.0

--- DESCONTOS DISPONÍVEIS ---
- Notebook: Preço com desconto de 10%: R$ 3150.0
- Smartphone Pro: Preço com desconto de 10%: R$ 1350.0
- Tablet Pro: Preço com desconto de 10%: R$ 900.0
- Smartphone: Preço com desconto de 10%: R$ 1350.0
- Tablet: Preço com desconto de 10%: R$ 900.0
```

---

## 🚀 Como Executar

1. Clone o repositório
```bash
git clone https://github.com/yurimarvila/java-OOP.git
```

2. Abra no VS Code com o **Extension Pack for Java** instalado

3. Execute `Loja.java` para rodar o sistema completo

---

## 📈 Próximos Passos — Fase 3

- Collections avançadas (HashMap, List, Set)
- Tratamento de exceções (try/catch personalizado)
- Introdução ao Spring Boot
- APIs REST com endpoints GET e POST
- SQL e JPA/Hibernate
- Primeiro projeto back-end completo

> **Foco:** 100% back-end Java com objetivo de conquistar a primeira vaga como Desenvolvedor Java Júnior.

---

## 👨‍💻 Autor

**Yuri Fernandes Marvila** — estudante de Ciência da Computação, focado em desenvolvimento back-end com Java e Spring Boot.

[![LinkedIn](https://img.shields.io/badge/LinkedIn-Yuri_Fernandes-blue)](https://www.linkedin.com/in/yuri-fernandes-marvila)
[![GitHub](https://img.shields.io/badge/GitHub-yurimarvila-black)](https://github.com/yurimarvila)
