# ProcessadorLoteTransacoes

## 📝 Descrição
Um sistema bancário precisa processar um lote de $N$ transações financeiras em sequência utilizando um laço de repetição.

O programa deve ler inicialmente o número total de transações $N$ que serão processadas no lote. Em seguida, usando uma estrutura de repetição (`for` ou `while`), deve ler os dados de cada transação (de 1 até $N$) e atualizar o saldo da conta (que inicia em `R$ 0.00`).

As regras para cada transação são:
* **Tipo 1 (Depósito):** Adiciona o valor ao saldo e contabiliza no total depositado.
* **Tipo 2 (Saque):** Subtrai o valor do saldo e contabiliza no total sacado, **desde que haja saldo suficiente** (saldo atual maior ou igual ao valor do saque).
* **Validação de Valor:** Se o valor da transação for menor ou igual a `0.00`, a transação é considerada **inválida** e deve ser ignorada.
* **Validação de Saldo:** Se o tipo for Saque e o valor for maior que o saldo atual, a transação é **recusada por saldo insuficiente**.

---

## 📥 Entrada (Input)
O programa deverá ler da entrada padrão:
1. Um valor inteiro $N$ representando a **quantidade de transações no lote**.
2. Para cada transação (repetindo $N$ vezes):
    * Um valor inteiro (`int`) representando o **tipo da transação** (1 para Depósito, 2 para Saque).
    * Um valor decimal (`double`) representando o **valor da transação**.

---

## 📤 Saída (Output)
O programa deve imprimir:
* Para transações com valor $\le 0$:  
  `Transacao [NumeroTransacao] invalida: valor deve ser positivo.`
* Para saques sem saldo suficiente:  
  `Transacao [NumeroTransacao] recusada: saldo insuficiente.`
* Ao final de todo o processamento (uma única linha):  
  `Lote processado. Saldo Final: R$ [SaldoFinal] | Total Depositado: R$ [TotalDepositado] | Total Sacado: R$ [TotalSacado]`

*(Todos os valores monetários devem ter **2 casas decimais**).*

---

## 🧪 Exemplos de Teste

### Exemplo 1
* **Entrada:**
  ```text
  3
  1
  500.00
  2
  200.00
  2
  100.00
  ```
* **Saída:**
  ```text
  Lote processado. Saldo Final: R$ 200.00 | Total Depositado: R$ 500.00 | Total Sacado: R$ 300.00
  ```

---

### Exemplo 2
* **Entrada:**
  ```text
  4
  1
  100.00
  2
  150.00
  1
  -50.00
  2
  50.00
  ```
* **Saída:**
  ```text
  Transacao 2 recusada: saldo insuficiente.
  Transacao 3 invalida: valor deve ser positivo.
  Lote processado. Saldo Final: R$ 50.00 | Total Depositado: R$ 100.00 | Total Sacado: R$ 50.00
  ```