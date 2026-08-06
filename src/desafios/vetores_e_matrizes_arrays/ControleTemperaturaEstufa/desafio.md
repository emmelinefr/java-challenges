# ControleTemperaturaEstufa

## 📝 Descrição
Uma estufa agrícola monitora a temperatura ambiente ao longo de $N$ medições sequenciais no dia.

O programa deve:
1. Ler um inteiro $N$ ($N > 0$), representando o número de medições que serão lidas.
2. Criar um array de decimais (`double[]`) de tamanho $N$.
3. Ler as $N$ temperaturas registradas (em graus Celsius).
4. **Validação:** Temperaturas válidas para a estufa estão no intervalo entre **$-10.0$ e $60.0$** (inclusive). Caso a temperatura lida esteja fora dessa faixa (menor que $-10.0$ ou maior que $60.0$), a medição é considerada **inválida/sensor com falha**. O programa deve exibir uma mensagem de erro e **não considerar essa medição** para os cálculos de média ou extremos.
5. Ao final, se houver pelo menos uma medição válida, calcular:
    * A **média** das temperaturas válidas.
    * A **menor temperatura válida** registrada e a **posição (1-based)** de onde ela ocorreu no histórico.
    * A quantidade de medições válidas que ficaram **abaixo da média**.

---

## 📥 Entrada (Input)
1. Um número inteiro $N$ (quantidade de medições).
2. $N$ números decimais (`double`), representando as leituras de temperatura.

---

## 📤 Saída (Output)
* Para cada medição fora da faixa $[-10.0, 60.0]$:  
  `Medicao [NumeroMedicao] invalida: [Temperatura] C fora da faixa permitida.`

* Se houver pelo menos 1 medição válida:  
  `Medicoes Validas: [QtdValidas] | Media: [Media] C | Menor Temp: [MenorTemp] C (Medicao [Posicao]) | Medicao Abaixo da Media: [QtdAbaixoMedia]`

* Se NENHUMA medição for válida:  
  `Nenhuma medicao valida registrada.`

*(Todas as temperaturas e a média devem ser exibidas com **1 casa decimal**, ex: `23.5`).*

---

## 🧪 Exemplos de Teste

### Exemplo 1
* **Entrada:**
  ```text
  4
  22.5
  -15.0
  18.0
  30.5
  ```
* **Saída:**
  ```text
  Medicao 2 invalida: -15.0 C fora da faixa permitida.
  Medicoes Validas: 3 | Media: 23.7 C | Menor Temp: 18.0 C (Medicao 3) | Medicao Abaixo da Media: 2
  ```

*(Explicação: As leituras válidas foram 22.5, 18.0 e 30.5. A média é 23.666... -> 23.7. A menor é 18.0 na medição 3. Valores abaixo da média 23.7 são 22.5 e 18.0, totalizando 2).*

---

### Exemplo 2
* **Entrada:**
  ```text
  2
  75.0
  -20.0
  ```
* **Saída:**
  ```text
  Medicao 1 invalida: 75.0 C fora da faixa permitida.
  Medicao 2 invalida: -20.0 C fora da faixa permitida.
  Nenhuma medicao valida registrada.
  ```