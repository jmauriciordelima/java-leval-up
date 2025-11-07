
---

## 🧩 **Nível 1 – Básico: Abstração Simples**

### 📝 Desafio: “O Som dos Animais”

Crie um sistema que utilize **uma classe abstrata** chamada `Animal` para representar o conceito genérico de um animal.

### 🎯 Objetivos:

* Praticar o uso de classes abstratas e métodos abstratos.
* Compreender como as subclasses concretas devem sobrescrever os métodos.

### 📦 Requisitos:

1. Crie uma **classe abstrata** `Animal` com:

    * Um atributo `nome` (`String`).
    * Um **método abstrato** `emitirSom()`.
    * Um **método concreto** `apresentar()` que exibe:
      `"Olá, eu sou um [tipo de animal] chamado [nome]."`

2. Crie as classes concretas:

    * `Cachorro`
    * `Gato`

   Ambas devem herdar de `Animal` e implementar o método `emitirSom()`:

    * O cachorro deve emitir “Au au!”
    * O gato deve emitir “Miau!”

3. No método `main`, crie objetos de `Cachorro` e `Gato` e chame:

    * `apresentar()`
    * `emitirSom()`

---

## ⚙️ **Nível 2 – Intermediário: Interface e Polimorfismo**

### 📝 Desafio: “Dispositivos Eletrônicos”

Implemente um sistema que simule diferentes dispositivos eletrônicos controlados por uma interface comum.

### 🎯 Objetivos:

* Aplicar interfaces para definir comportamentos obrigatórios.
* Demonstrar polimorfismo entre objetos diferentes que seguem o mesmo contrato.

### 📦 Requisitos:

1. Crie uma **interface** chamada `Dispositivo` com os métodos:

    * `ligar()`
    * `desligar()`
    * `status()`

2. Crie as classes concretas:

    * `Televisao`
    * `Radio`

   Ambas devem implementar `Dispositivo`, exibindo mensagens apropriadas (por exemplo: “A televisão está ligada”, “O
   rádio foi desligado”).

3. No `main`, crie um array ou lista de `Dispositivo` e percorra com um laço `for` chamando `ligar()` e `status()` para
   cada elemento.

---

## 🚀 **Nível 3 – Avançado: Abstração + Interface Combinadas**

### 📝 Desafio: “Veículos Inteligentes”

Você foi contratado para desenvolver um sistema que gerencie diferentes tipos de veículos modernos. Alguns são
elétricos, outros movidos a combustível, mas todos compartilham características básicas.

### 🎯 Objetivos:

* Utilizar **classe abstrata** e **interface** em conjunto.
* Demonstrar herança, polimorfismo e implementação múltipla.
* Encapsular comportamento comum e especializado.

### 📦 Requisitos:

1. Crie uma **interface** `Eletrico` com o método:

   ```java
   void carregarBateria();
   ```

2. Crie uma **classe abstrata** `Veiculo` com:

    * Atributos: `marca`, `modelo`, `ano`.
    * Um **método abstrato** `mover()`.
    * Um método concreto `exibirInformacoes()` que imprime os atributos.

3. Crie as classes concretas:

    * `CarroEletrico` (herda de `Veiculo` e implementa `Eletrico`)
    * `MotoCombustao` (herda de `Veiculo`)

   Cada uma deve sobrescrever `mover()` de forma distinta:

    * `CarroEletrico` → “O carro elétrico está se movendo silenciosamente.”
    * `MotoCombustao` → “A moto a combustão está acelerando com força!”

   E no caso do carro elétrico, também implementar `carregarBateria()`.

4. No método `main`, crie um pequeno menu (ou apenas chamadas diretas) para testar ambos os tipos de veículos.

---

## 💡 Dica de Evolução

Depois de dominar esses três níveis, você pode:

* Criar uma **interface adicional** chamada `Autonomo` (com método `dirigirSozinho()`).
* Fazer o `CarroEletrico` implementá-la.
* Simular um cenário com múltiplas interfaces (como um “carro elétrico autônomo”).

---

## 🧙‍♂️ Parábola do Dia

> Um arquiteto e um engenheiro foram desafiados a construir uma ponte.
> O arquiteto desenhou o **modelo ideal** — essa é a **abstração**.
> O engenheiro criou o **manual de montagem e regras** — essa é a **interface**.
>
> Quando os dois trabalharam juntos, construíram algo firme e belo.
> Assim também é o código: quando abstraímos o conceito e definimos bons contratos, criamos sistemas sólidos e
> elegantes.

---

Posso preparar agora a **versão com código completo** (soluções dos três níveis), mas mantendo explicações passo a
passo, para você testar e comparar com seus resultados. Quer que eu monte assim?
