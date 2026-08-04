# AnalisadorTemperaturaSensores

## 📝 Descrição
Uma central de monitoramento industrial recebe leituras contínuas de temperatura de um conjunto de $N$ sensores espalhados por uma fábrica.

O programa deve ler inicialmente o número total de medições $N$ que serão analisadas ($N > 0$). Em seguida, usando uma estrutura de repetição (`for` ou `while`), deve ler o valor decimal (`double`) de cada temperatura registrada.

Durante a leitura das $N$ temperaturas, o sistema deve:
1. Calcular a **média das temperaturas válidas**.
2. Identificar a **maior temperatura** e a **menor temperatura** registradas entre as válidas.
3. Descartar **temperaturas inválidas**: qualquer leitura **abaixo de -50.0°C** ou **acima de 100.0°C** é considerada uma falha do sensor e deve ser ignorada nos cálculos da média, do maior e do menor valor.

---

## 📥 Entrada (Input)
O programa deverá ler da entrada padrão:
1. Um valor inteiro $N$ representando o **número total de leituras**.
2. $N$ valores decimais (`double`) representando a **temperatura** de cada medição.

---

## 📤 Saída (Output)
* Para cada leitura inválida (fora do intervalo $[-50.0, 100.0]$):  
  `Leitura [NumeroLeitura] invalida: [Valor] °C fora dos limites.`

* Ao final de todo o processamento (uma única linha):
    * **Se houver pelo menos uma leitura válida:** `Leituras validas: [QtdValidas] | Media: [Media] °C | Maior: [Maior] °C | Menor: [Menor] °C`
    * **Se TODAS as leituras forem inválidas:** `Nenhuma leitura valida foi registrada.`

*(Os valores de temperatura e média devem ter **1 casa decimal**).*

---

## 🧪 Exemplos de Teste

### Exemplo 1
* **Entrada:**
  ```text
  5
  23.5
  -60.0
  30.0
  15.5
  105.0
  ```
* **Saída:**
  ```text
  Leitura 2 invalida: -60.0 °C fora dos limites.
  Leitura 5 invalida: 105.0 °C fora dos limites.
  Leituras validas: 3 | Media: 23.0 °C | Maior: 30.0 °C | Menor: 15.5 °C
  ```

---

### Exemplo 2
* **Entrada:**
  ```text
  2
  -100.0
  120.0
  ```
* **Saída:**
  ```text
  Leitura 1 invalida: -100.0 °C fora dos limites.
  Leitura 2 invalida: 120.0 °C fora dos limites.
  Nenhuma leitura valida foi registrada.
  ```