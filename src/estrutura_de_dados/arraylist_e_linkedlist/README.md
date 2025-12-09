José Maurício!
Preparei **uma sequência de exercícios totalmente prática**, evolutiva e focada em preparar você para o mercado.
Inclui também desafios extras para te levar além do básico.

Vamos trabalhar primeiro com **ArrayList**, depois com **LinkedList**, e por fim exercícios que comparam as duas.

---

# 🧩 **📘 Exercício 1 – Cadastro simples com ArrayList**

### **Descrição**

Crie um cadastro de nomes usando `ArrayList`.

### **Objetivos**

* Criar e manipular um ArrayList
* Adicionar valores
* Listar valores

### **Requisitos**

1. Crie a classe `CadastroNomesArrayList`.
2. Crie uma `ArrayList<String>` chamada `nomes`.
3. Peça ao usuário (Scanner) para inserir 5 nomes.
4. Adicione-os ao ArrayList.
5. Exiba todos os nomes cadastrados.

### **Desafio Extra**

* Permitir que o usuário insira quantos nomes quiser.
* Parar quando ele digitar `"sair"`.

---

# 🧩 **📘 Exercício 2 – Remover valores da ArrayList**

### **Descrição**

Crie um programa que remova um nome informado pelo usuário.

### **Requisitos**

1. Reutilize a classe acima (ou crie uma nova).
2. Após cadastrar nomes, peça ao usuário um nome para excluir.
3. Caso exista, remova.
4. Caso não exista, informe que não foi encontrado.

### **Desafio Extra**

* Mostre quantos nomes foram cadastrados antes e depois da remoção.
* Diferencie remoção por nome e por índice.

---

# 🧩 **📘 Exercício 3 – Busca na ArrayList**

### **Descrição**

Verifique se um nome existe na lista.

### **Requisitos**

1. Após cadastrar nomes, peça ao usuário um nome para buscar.
2. Use `.contains()` ou faça busca manual.
3. Informe se foi encontrado.
4. Mostre também a **posição (índice)**.

### **Desafio Extra**

* Se houver nomes repetidos, mostrar **todos os índices**.

---

# 🧩 **📘 Exercício 4 – Contando valores com ArrayList**

### **Descrição**

Contar quantos nomes têm mais de 5 caracteres.

### **Requisitos**

* Use um laço `for` ou `for-each`.
* Conte quantos nomes têm tamanho ≥ 5.
* Exiba a quantidade.

### **Desafio Extra**

* Criar duas listas:

    * nomesCurto (≤ 5 letras)
    * nomesLongo (> 5 letras)

---

---

# 🟩 **Agora com LinkedList**

---

# 🧩 **📗 Exercício 5 – Fila com LinkedList (Queue)**

### **Descrição**

Simule uma fila de atendimento.

### **Requisitos**

1. Use `LinkedList<String> fila = new LinkedList<>();`
2. Permita adicionar pessoas à fila.
3. Permita chamar (remover) a próxima pessoa da fila.
4. Mostrar o estado atual da fila após cada operação.

### **Desafio Extra**

* Criar um menu:

    * 1 – Adicionar pessoa
    * 2 – Chamar próxima
    * 3 – Mostrar fila
    * 4 – Sair

---

# 🧩 **📗 Exercício 6 – Deque com LinkedList**

### **Descrição**

Trabalhe com inserção no início e no fim.

### **Requisitos**

1. Use `LinkedList<Integer> numeros`.
2. Peça ao usuário números.
3. Quando o número for par → adicionar no **fim**.
   Quando for ímpar → adicionar no **início**.
4. Mostre a lista final.

### **Desafio Extra**

* Mostrar também quantas inserções ocorreram no início/fim.

---

# 🧩 **📗 Exercício 7 – Removendo extremos**

### **Descrição**

Crie uma lista e permita remover:

* o primeiro elemento
* o último elemento
* um elemento do meio (índice informado)

### **Desafio Extra**

* Criar método que sempre remove o elemento do meio automaticamente.

---

---

# ⚔ **Exercícios Comparativos – ArrayList x LinkedList**

---

# 🧩 **📙 Exercício 8 – Testando desempenho (simples)**

### **Descrição**

Compare o tempo de inserção de 100 000 números na:

* ArrayList
* LinkedList

### **Requisitos**

* Use `System.currentTimeMillis()`.
* Insira sempre no **início da lista**.
* Compare os tempos.

### **Resultado esperado**

* LinkedList deve ser muito mais rápida inserindo no início.

---

# 🧩 **📙 Exercício 9 – Acesso por índice**

### **Descrição**

Acesse 10 000 vezes posições aleatórias dentro da:

* ArrayList
* LinkedList

### **Resultado esperado**

* ArrayList deve ser muito mais rápida.

---

# 🧩 **📙 Exercício 10 – Lista de objetos**

### **Descrição**

Crie a classe `Pessoa` com:

* nome
* idade

Use:

* `ArrayList<Pessoa>`

E faça:

* adicionar pessoas
* buscar por nome
* exibir todos os maiores de idade

### **Desafio Extra**

* Ordenar por idade usando `Comparator`.

---

# 📘 **Parábola final — A lição dos dois caminhos**

Um viajante tinha duas estradas para escolher:

* A estrada de pedra, sólida e rápida.
* A estrada de madeira, cheia de pontes que podia abrir e fechar.

Quando precisava correr rápido, ele escolhia a estrada de pedra.
Quando precisava acessar lugares ao redor, parando muitas vezes, preferia a estrada de madeira.

E assim entendeu que:

> *A escolha não está na estrada perfeita, mas na estrada adequada para a viagem certa.*

ArrayList é a estrada de pedra.
LinkedList é a estrada de madeira.
E você, José Maurício, está aprendendo a escolher qual caminho trilhar. 🚀

---
