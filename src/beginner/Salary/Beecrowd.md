````md id="q7n2lx"
# Salary

## Problem Description

Write a program that reads an employee's identification number, the total number of hours worked during a month, and the hourly wage.

Calculate the employee's monthly salary and print both the employee number and the salary.

---

## Input

The input consists of:

- An integer representing the employee's identification number.
- An integer representing the total hours worked.
- A double-precision floating-point number representing the hourly wage.

---

## Output

Print the following information:

```text
NUMBER = employee_number
SALARY = U$ salary
```

where:

- `employee_number` is the employee's identification number.
- `salary` is the calculated monthly salary formatted with **exactly two digits after the decimal point**.

> **Important:**
>
> - Print a space before and after the equal sign (`=`).
> - Print a space after `U$`.
> - Print a line break (`endline`) after the output to avoid a **Presentation Error**.

---

## Formula

```text
SALARY = worked_hours × hourly_wage
```

---

## Sample Input 1

```text
25
100
5.50
```

### Sample Output 1

```text
NUMBER = 25
SALARY = U$ 550.00
```

---

## Sample Input 2

```text
1
200
20.50
```

### Sample Output 2

```text
NUMBER = 1
SALARY = U$ 4100.00
```

---

## Sample Input 3

```text
6
145
15.55
```

### Sample Output 3

```text
NUMBER = 6
SALARY = U$ 2254.75
```
````
