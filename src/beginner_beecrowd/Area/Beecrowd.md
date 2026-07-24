# Área

## Descrição do Problema

Escreva um programa que leia três valores de ponto flutuante (`double`): **A**, **B** e **C**.

Em seguida, calcule e apresente as seguintes áreas:

- A área de um **triângulo retângulo** com base **A** e altura **C**.
- A área de um **círculo** de raio **C**. Considere **π = 3.14159**.
- A área de um **trapézio** com bases **A** e **B**, e altura **C**.
- A área de um **quadrado** de lado **B**.
- A área de um **retângulo** com lados **A** e **B**.

---

## Entrada

A entrada contém **três números de ponto flutuante**, cada um com uma casa decimal:

- `A`
- `B`
- `C`

---

## Saída

Imprima **cinco linhas**, uma para cada área calculada, no seguinte formato:

```text
TRIANGULO: valor
CIRCULO: valor
TRAPEZIO: valor
QUADRADO: valor
RETANGULO: valor
```

Todos os valores devem ser apresentados com **três casas decimais**.

---

## Fórmulas

### Triângulo Retângulo

```text
Área = (A × C) / 2
```

### Círculo

```text
Área = π × C²
```

com:

```text
π = 3.14159
```

### Trapézio

```text
Área = ((A + B) × C) / 2
```

### Quadrado

```text
Área = B²
```

### Retângulo

```text
Área = A × B
```

---

## Exemplo de Entrada 1

```text
3.0 4.0 5.2
```

### Exemplo de Saída 1

```text
TRIANGULO: 7.800
CIRCULO: 84.949
TRAPEZIO: 18.200
QUADRADO: 16.000
RETANGULO: 12.000
```

---

## Exemplo de Entrada 2

```text
12.7 10.4 15.2
```

### Exemplo de Saída 2

```text
TRIANGULO: 96.520
CIRCULO: 725.833
TRAPEZIO: 175.560
QUADRADO: 108.160
RETANGULO: 132.080
```