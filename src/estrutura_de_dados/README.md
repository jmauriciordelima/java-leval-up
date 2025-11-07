Perfeito, José Maurício! 🌱
Agora entraremos num dos pilares da **estrutura de dados em Java** — os **Arrays**.
Eles são fundamentais para armazenar **coleções de valores** do mesmo tipo e trabalhar com **repetição, busca, e
processamento em massa**.

A seguir, preparei **4 exercícios práticos** (do básico ao intermediário), com **descrição, objetivos e desafios extras
**, no mesmo formato de suas aulas anteriores.
Nenhum contém resposta direta — apenas o enunciado e exemplos para você praticar. 💪

---

## 🧩 **Exercício 1 – Soma de elementos de um Array**

### 📝 Descrição

Crie um programa que some todos os elementos de um array de inteiros.

### 🎯 Objetivos

* Declarar e inicializar um array
* Percorrer o array com `for`
* Somar valores acumulativamente

### 🧱 Requisitos

1. Crie uma classe chamada `SomaArray`.
2. Declare um array de inteiros com 5 valores (ex: `{2, 4, 6, 8, 10}`).
3. Use um `for` para percorrer o array e somar todos os valores.
4. Ao final, exiba a soma total.

### ✅ Exemplo de saída esperada

```
Soma total: 30
```

### 🌟 Desafio Extra

* Exiba também a média dos elementos do array.

---

## 🧩 **Exercício 2 – Encontrar o maior e o menor número**

### 📝 Descrição

Crie um programa que encontre o **maior** e o **menor** número de um array.

### 🎯 Objetivos

* Trabalhar com lógica condicional dentro de um loop
* Comparar elementos consecutivos

### 🧱 Requisitos

1. Crie uma classe chamada `MaiorMenorArray`.
2. Crie um array de inteiros com valores variados (ex: `{3, 9, 2, 15, 6}`).
3. Inicialize duas variáveis: `maior` e `menor` com o primeiro valor do array.
4. Percorra o array e atualize os valores conforme encontra números maiores ou menores.

### ✅ Exemplo de saída esperada

```
Maior número: 15  
Menor número: 2
```

### 🌟 Desafio Extra

* Exiba também o **índice** onde cada um foi encontrado.

---

## 🧩 **Exercício 3 – Nomes em ordem inversa**

### 📝 Descrição

Crie um programa que leia um conjunto fixo de nomes e os mostre **de trás para frente**.

### 🎯 Objetivos

* Usar arrays de `String`
* Trabalhar com índice inverso (`for` decrescente)

### 🧱 Requisitos

1. Crie uma classe chamada `NomesInversos`.
2. Declare um array de nomes, por exemplo:

   ```java
   String[] nomes = {"Ana", "Bruno", "Carla", "Diego", "Eva"};
   ```
3. Exiba os nomes em ordem inversa, um por linha.

### ✅ Exemplo de saída esperada

```
Eva  
Diego  
Carla  
Bruno  
Ana
```

### 🌟 Desafio Extra

* Peça ao usuário para digitar os nomes (usando `Scanner`) antes de exibi-los ao contrário.

---

## 🧩 **Exercício 4 – Contagem de números pares e ímpares**

### 📝 Descrição

Crie um programa que conte quantos números pares e ímpares há em um array.

### 🎯 Objetivos

* Usar o operador módulo `%`
* Controlar duas contagens simultâneas

### 🧱 Requisitos

1. Crie uma classe chamada `ContagemParImpar`.
2. Crie um array de inteiros (ex: `{1, 2, 3, 4, 5, 6}`).
3. Percorra o array e conte quantos números são pares e quantos são ímpares.
4. Exiba o resultado ao final.

### ✅ Exemplo de saída esperada

```
Números pares: 3  
Números ímpares: 3
```

### 🌟 Desafio Extra

* Mostre também a **porcentagem** de pares e ímpares em relação ao total.

---

## 🧩 **Exercício 5 – Busca de elemento**

### 📝 Descrição

Crie um programa que verifique se um número informado existe dentro de um array.

### 🎯 Objetivos

* Trabalhar com busca linear
* Usar lógica condicional e flag (booleano)

### 🧱 Requisitos

1. Crie uma classe chamada `BuscaElemento`.
2. Declare um array de inteiros (ex: `{10, 20, 30, 40, 50}`).
3. Defina um número a procurar (por exemplo, `30`).
4. Use um `for` para verificar se o número existe.
5. Exiba se foi **encontrado** ou **não encontrado**.

### ✅ Exemplo de saída esperada

```
O número 30 foi encontrado no array.
```

### 🌟 Desafio Extra

* Peça o número ao usuário com `Scanner`.
* Mostre também o **índice** do elemento, se ele existir.

---

## 📜 Parábola do dia

> **O jardineiro e as sementes** 🌾
> Um jardineiro tinha várias sementes (como elementos em um array).
> Ele as plantava em fileiras, cuidando para que cada uma recebesse o mesmo sol e a mesma água.
>
> Quando uma crescia mais que as outras, ele observava e aprendia — assim como fazemos ao percorrer nossos arrays em
> busca de padrões.
>
> Em Java, os arrays são como jardins de dados: simples, ordenados e férteis para quem cuida deles com lógica e
> paciência.

---

Quer que eu monte a **versão com classes Java completas** (como você fez com os pacotes `estruturaderepeticao`),
separando **cada exercício com `Test` e classe principal** para prática real no Eclipse ou IntelliJ?
