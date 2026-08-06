# AnaliseVendasLoja

## 📝 Descrição
Uma rede de lojas precisa analisar o desempenho de vendas de $N$ produtos em uma filial ao longo do mês.

O programa deve:
1. Ler um valor inteiro $N$ ($N > 0$), representando a quantidade de produtos analisados.
2. Criar um **array de decimais (`double[]`)** de tamanho $N$ para armazenar os valores de venda de cada produto.
3. Ler os $N$ valores de vendas e armazenar no array.
4. Caso o valor de venda de um produto seja menor ou igual a `0.00`, a entrada deve ser considerada **inválida** (o produto não teve vendas válidas). O programa deve exibir uma mensagem de erro e **não considerar esse produto** para o cálculo da média nem para o total de produtos acima da média.
5. Ao final, calcular:
    * A **média de vendas** dos produtos válidos.
    * A quantidade de produtos que tiveram vendas **estritamente maiores que a média**.
    * O **maior valor de venda** entre os produtos válidos e a **posição (1-based)** do produto que registrou essa maior venda.

---

## 📥 Entrada (Input)
1. Um número inteiro $N$ (quantidade de produtos).
2. $N$ números decimais (`double`), representando o valor total de vendas de cada produto de $1$ a $N$.

---

## 📤 Saída (Output)
* Para cada produto com valor de venda $\le 0$:  
  `Produto [NumeroProduto] invalido: valor R$ [Valor] deve ser maior que zero.`

* Se houver pelo menos 1 produto válido:  
  `Vendas Validas: [QtdValidas] | Media: R$ [Media] | Maior Venda: R$ [MaiorVenda] (Produto [PosicaoProduto]) | Produtos Acima da Media: [QtdAcimaMedia]`

* Se NENHUM produto for válido:  
  `Nenhum produto registrou vendas validas.`

*(Todos os valores monetários devem ter **2 casas decimais**).*

---

## 🧪 Exemplos de Teste

### Exemplo 1
* **Entrada:**
  ```text
  4
  150.00
  300.00
  450.00
  100.00
  ```
* **Saída:**
  ```text
  Vendas Validas: 4 | Media: R$ 250.00 | Maior Venda: R$ 450.00 (Produto 3) | Produtos Acima da Media: 2
  ```

---

### Exemplo 2
* **Entrada:**
  ```text
  3
  200.00
  -50.00
  400.00
  ```
* **Saída:**
  ```text
  Produto 2 invalido: valor R$ -50.00 deve ser maior que zero.
  Vendas Validas: 2 | Media: R$ 300.00 | Maior Venda: R$ 400.00 (Produto 3) | Produtos Acima da Media: 1
  ```