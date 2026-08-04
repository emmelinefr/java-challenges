# CalculadoraComissaoVendas

## 📝 Descrição
Uma loja de eletrodomésticos precisa calcular a comissão total e o bônus de metas dos seus vendedores no final do mês.

Para isso, o sistema deve receber a meta mensal de vendas (em Reais), o valor total vendido pelo funcionário no mês (em Reais) e a sua categoria profissional.

As regras de negócio para a comissão e bônus são:
* **Categoria 1 (Júnior):** Comissão base de `5%` sobre o total vendido.
* **Categoria 2 (Pleno):** Comissão base de `8%` sobre o total vendido.
* **Categoria 3 (Sênior):** Comissão base de `12%` sobre o total vendido.
* **Qualquer outra categoria:** Inválida.

**Regra do Bônus de Meta:**
* Se o valor vendido for **maior ou igual à meta mensal**, o vendedor ganha um bônus extra fixo de `R$ 500.00` somado à sua comissão base.
* Se a meta não for atingida, o vendedor recebe apenas a comissão base.

---

## 📥 Entrada (Input)
O programa deverá ler da entrada padrão:
1. Um valor decimal (`double`) representando a **meta de vendas** (em R$).
2. Um valor decimal (`double`) representando o **total vendido** pelo vendedor (em R$).
3. Um valor inteiro (`int`) representando a **categoria do vendedor** (1, 2 ou 3).

---

## 📤 Saída (Output)
O programa deve imprimir na tela uma única linha contendo a mensagem formatada de acordo com as regras de validação (os valores numéricos de dinheiro devem ter **2 casas decimais**):

* **Para categoria válida:**
  `Vendedor Categoria [Categoria] - Total a receber: R$ [ValorTotal]`

* **Para categoria inválida:**
  `Categoria de vendedor inválida. Processamento cancelado.`

---

## 🧪 Exemplos de Teste

### Exemplo 1
* **Entrada:**
  ```text
  10000.00
  12000.00
  2
  ```
* **Saída:**
  ```text
  Vendedor Categoria 2 - Total a receber: R$ 1460.00
  ```
  *(Explicação: Categoria 2 = 8% de 12000.00 = 960.00. Como 12000 >= 10000, soma + 500.00 de bônus. Total = 1460.00)*

---

### Exemplo 2
* **Entrada:**
  ```text
  5000.00
  3000.00
  1
  ```
* **Saída:**
  ```text
  Vendedor Categoria 1 - Total a receber: R$ 150.00
  ```
  *(Explicação: Categoria 1 = 5% de 3000.00 = 150.00. Não bateu a meta, sem bônus.)*

---

### Exemplo 3
* **Entrada:**
  ```text
  8000.00
  9000.00
  5
  ```
* **Saída:**
  ```text
  Categoria de vendedor inválida. Processamento cancelado.
  ```