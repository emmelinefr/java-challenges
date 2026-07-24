# Cálculo Simples

## Descrição do Problema

Neste problema, devem ser lidas as informações de duas peças. Para cada peça, são fornecidos:

- O código da peça.
- A quantidade de peças.
- O valor unitário.

Em seguida, calcule e apresente o valor total a ser pago pela compra.

> **Observação:** O código da peça é apenas informativo e não deve ser utilizado no cálculo.

---

## Entrada

A entrada é composta por **duas linhas**.

Cada linha contém:

- Um número inteiro representando o código da peça.
- Um número inteiro representando a quantidade de peças.
- Um número de ponto flutuante (`double`) representando o valor unitário.

---

## Saída

Imprima a mensagem:

```text
VALOR A PAGAR: R$ valor
```

onde `valor` corresponde ao valor total da compra, formatado com **duas casas decimais**.

> **Importante:**
>
> - Deve haver um espaço após os dois pontos (`:`).
> - Deve haver um espaço após `R$`.

---

## Fórmula

```text
VALOR_A_PAGAR =
(quantidade1 × valor_unitário1) +
(quantidade2 × valor_unitário2)
```

---

## Exemplo de Entrada 1

```text
12 1 5.30
16 2 5.10
```

### Exemplo de Saída 1

```text
VALOR A PAGAR: R$ 15.50
```

---

## Exemplo de Entrada 2

```text
13 2 15.30
161 4 5.20
```

### Exemplo de Saída 2

```text
VALOR A PAGAR: R$ 51.40
```

---

## Exemplo de Entrada 3

```text
1 1 15.10
2 1 15.10
```

### Exemplo de Saída 3

```text
VALOR A PAGAR: R$ 30.20
```