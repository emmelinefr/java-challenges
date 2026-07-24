# Average 1

## Problem Description

Read two double-precision floating-point values, **A** and **B**, representing a student's grades.

Calculate the student's weighted average using the following weights:

- Grade **A** → weight **3.5**
- Grade **B** → weight **7.5**

Each grade ranges from **0.0** to **10.0**, with one digit after the decimal point.

---

## Input

The input consists of **two double-precision floating-point numbers**, each with one digit after the decimal point:

- `A`
- `B`

---

## Output

Print the message:

```text
MEDIA = value
```

where `value` is the student's weighted average formatted with **exactly five digits after the decimal point**.

> **Important:** Print a line break (`endline`) after the result to avoid a **Presentation Error**.

---

## Formula

```text
MEDIA = (A × 3.5 + B × 7.5) / 11.0
```

---

## Sample Input 1

```text
5.0
7.1
```

### Sample Output 1

```text
MEDIA = 6.43182
```

---

## Sample Input 2

```text
0.0
7.1
```

### Sample Output 2

```text
MEDIA = 4.84091
```

---

## Sample Input 3

```text
10.0
10.0
```

### Sample Output 3

```text
MEDIA = 10.00000
```