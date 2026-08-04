# Desafio: CalculadoraBonusDBC

**Package:** `desafios.estruturas_de_controle`

## 📝 O Enredo (As Regras de Negócio)
A DBC Company premia suas equipes de desenvolvimento com um bônus anual baseado na meta atingida pelo projeto e na nota de desempenho individual do colaborador (de 1 a 5).

O cálculo do bônus segue a seguinte regra de faixas sobre o salário base do colaborador:
1. **Meta do Projeto Atingida:**
    * Nota de desempenho 5: Bônus de **20%** do salário.
    * Nota de desempenho 3 ou 4: Bônus de **15%** do salário.
    * Nota de desempenho 1 ou 2: Bônus de **5%** do salário.
2. **Meta do Projeto NÃO Atingida:**
    * Nota de desempenho 4 ou 5: Bônus de **10%** do salário.
    * Nota de desempenho menor que 4: **Não há bônus (0%)**.

## 💻 O Problema
Escreva um programa em Java que receba:
* O nome do colaborador (`String`).
* O salário base em reais (`double`).
* Se a meta do projeto foi atingida (`boolean`: `true` ou `false`).
* A nota de desempenho individual (`int` de 1 a 5).

O sistema deve validar as condições usando estruturas condicionais (`if/else` ou `switch`) e exibir na tela a mensagem exata com o valor do bônus calculado:

* Se o colaborador tiver direito a bônus (maior que zero):
  `"Colaborador [Nome] receberá R$ [ValorDoBonus] de bônus."`
* Se o bônus for zero:
  `"Colaborador [Nome] não elegível para bônus este ano."`

*Observação: Não precisa se preocupar em formatar as casas decimais do R$ por enquanto, foque na precisão do cálculo.*