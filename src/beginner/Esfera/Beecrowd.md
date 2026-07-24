# Esfera

## Descrição do Problema

Faça um programa que leia o valor do raio (**R**) de uma esfera e calcule o seu volume.

Considere o valor de:

```text
π = 3.14159
```

> **Dica:** Ao implementar a fórmula, utilize `(4.0 / 3.0)` ou `(4 / 3.0)` para garantir que a divisão seja realizada em ponto flutuante.

---

## Entrada

A entrada contém um único número de ponto flutuante (`double`):

- `R` — o raio da esfera.

---

## Saída

Imprima a mensagem:

```text
VOLUME = valor
```

onde `valor` corresponde ao volume da esfera, formatado com **três casas decimais**.

---

## Fórmula

```text
VOLUME = (4.0 / 3.0) × π × R³
```

com:

```text
π = 3.14159
```

---

## Exemplo de Entrada 1

```text
3
```

### Exemplo de Saída 1

```text
VOLUME = 113.097
```

---

## Exemplo de Entrada 2

```text
15
```

### Exemplo de Saída 2

```text
VOLUME = 14137.155
```

---

## Exemplo de Entrada 3

```text
1523
```

### Exemplo de Saída 3

```text
VOLUME = 14797486501.627
```