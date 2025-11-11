# 🌳 Árvores Binárias e Recursividade

---

## 🎯 Objetivo
Compreender o conceito de **recursividade** e aplicá-lo na implementação de uma **árvore binária de busca (BST)**, incluindo as operações de **inserção**, **busca** e **percursos** (pré-ordem, em ordem e pós-ordem).

---

## 🧠 Parte 1 – Conceito e Explicação

**1. O que é recursividade?**  
Recursividade é uma técnica onde uma função chama a si mesma para resolver um problema menor até alcançar um caso base.  
Exemplo: o cálculo de fatorial ou a travessia de uma árvore.

**2. Como a recursividade é usada na travessia de uma árvore binária?**  
A recursão permite visitar todos os nós de uma árvore sem precisar de laços `for` ou `while`.  
Cada chamada recursiva visita um nó e chama a função novamente para a subárvore esquerda e direita.

**3. Qual a diferença entre recursão e laço (for/while)?**  
Laços repetem uma sequência de instruções de forma iterativa, enquanto a recursão divide o problema em partes menores, fazendo chamadas a si mesma até atingir uma condição de parada (caso base).

---

## 💻 Parte 2 – Implementação

O projeto foi desenvolvido em **Java** e contém três classes principais:

- **Node.java:** representa um nó da árvore.  
- **ArvoreBinaria.java:** contém os métodos de inserção, busca e percursos, todos implementados com recursividade.  
- **Main.java:** realiza os testes de inserção, busca e impressão da árvore.

---

## 📂 Estrutura do Projeto
```
src/
├── Node.java
├── ArvoreBinaria.java
└── Main.java
```

---

## 🧪 Exemplo de Saída
```
Busca 40: true
Busca 90: false
Pré-ordem: 50 30 20 40 70 60 80 
Em ordem: 20 30 40 50 60 70 80 
Pós-ordem: 20 40 30 60 80 70 50 
```
