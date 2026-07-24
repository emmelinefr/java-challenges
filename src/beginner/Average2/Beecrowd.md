# Average 2

## Problem Description

Read three double-precision floating-point values, **A**, **B**, and **C**, representing a student's grades.

Calculate the student's weighted average using the following weights:

- Grade **A** → weight **2**
- Grade **B** → weight **3**
- Grade **C** → weight **5**

Each grade ranges from **0.0** to **10.0**, with one digit after the decimal point.

---

## Input

The input consists of **three double-precision floating-point numbers**, each with one digit after the decimal point:

- `A`
- `B`
- `C`

---

## Output

Print the message:

```text
MEDIA = value
```

where `value` is the student's weighted average formatted with **one digit after the decimal point**.

---

## Formula

```text
MEDIA = (A × 2 + B × 3 + C × 5) / 10.0
```

---

## Sample Input 1

```text
5.0
6.0
7.0
```

### Sample Output 1

```text
MEDIA = 6.3
```

---

## Sample Input 2

```text
5.0
10.0
10.0
```

### Sample Output 2

```text
MEDIA = 9.0
```

---

## Sample Input 3

```text
10.0
10.0
5.0
```

### Sample Output 3

```text
MEDIA = 7.5
```