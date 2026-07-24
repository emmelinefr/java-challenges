````md
# Salário com Bônus

## Descrição do Problema

Faça um programa que leia o primeiro nome de um vendedor, seu salário fixo e o valor total das vendas realizadas durante o mês.

Sabendo que o vendedor recebe **15% de comissão** sobre o total de vendas, calcule e informe o valor total que ele deverá receber ao final do mês.

---

## Entrada

A entrada é composta por:

- Uma string representando o primeiro nome do vendedor.
- Um número de ponto flutuante (`double`) representando o salário fixo.
- Um número de ponto flutuante (`double`) representando o valor total das vendas realizadas.

---

## Saída

Imprima a mensagem:

```text
TOTAL = R$ valor
```

onde `valor` corresponde ao salário total do vendedor, formatado com **duas casas decimais**.

---

## Fórmula

```text
TOTAL = salário_fixo + (total_vendas × 0.15)
```

---

## Exemplo de Entrada 1

```text
JOAO
500.00
1230.30
```

### Exemplo de Saída 1

```text
TOTAL = R$ 684.54
```

---

## Exemplo de Entrada 2

```text
PEDRO
700.00
0.00
```

### Exemplo de Saída 2

```text
TOTAL = R$ 700.00
```

---

## Exemplo de Entrada 3

```text
MANGOJATA
1700.00
1230.50
```

### Exemplo de Saída 3

```text
TOTAL = R$ 1884.58
```
````
