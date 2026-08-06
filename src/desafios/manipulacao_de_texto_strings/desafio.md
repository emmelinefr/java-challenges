# ValidadorEFormatadorCodigo

## 📝 Descrição
A empresa precisa processar um lote de **$N$ códigos de identificação de produtos** recebidos de um sistema legado.

Cada código é composto por uma **String com formato arbitrário** (pode conter letras, números e espaços nas pontas).

O programa deve:
1. Ler um inteiro $N$ ($N > 0$), representando a quantidade de códigos a serem validados.
2. Limpar a quebra de linha pendente no leitor após o número inteiro.
3. Ler os $N$ códigos (cada código em uma linha).
4. Para cada código lido, validar as regras na **seguinte ordem estrita de prioridade**:
    * **Limpeza:** Remover espaços em branco do início e do fim (`trim()`).
    * **Regra 1 (Tamanho):** O código limpo deve ter **exatamente 6 caracteres**.
    * **Regra 2 (Apenas dígitos):** O código limpo deve conter **apenas dígitos numéricos** (caracteres de `'0'` a `'9'`).
    * **Regra 3 (Soma par):** A soma de todos os dígitos do código deve ser um **número par** (`soma % 2 == 0`).

---

## 📥 Entrada (Input)
1. Um número inteiro $N$ (quantidade de códigos a processar).
2. $N$ linhas de texto (Strings) contendo os códigos a serem validados.

---

## 📤 Saída (Output)
Para cada código analisado:
* **Sucesso:** `Codigo [PRODUTO] valido! Soma dos digitos: [SOMA]`
* **Erro de tamanho (Regra 1):** `Codigo [PRODUTO] invalido: tamanho incorreto ([TAMANHO] caracteres).`
* **Erro de caracteres não numéricos (Regra 2):** `Codigo [PRODUTO] invalido: contem caracteres nao numericos.`
* **Erro de soma ímpar (Regra 3):** `Codigo [PRODUTO] invalido: soma dos digitos ([SOMA]) e impar.`

---

## 🧪 Exemplo de Teste

### Entrada
3
123402  
123A56
123451

### Saída
Codigo 123402 valido! Soma dos digitos: 12
Codigo 123A56 invalido: contem caracteres nao numericos.
Codigo 123451 invalido: soma dos digitos (16) e impar.