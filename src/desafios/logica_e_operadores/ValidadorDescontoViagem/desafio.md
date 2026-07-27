# Desafio: ValidadorDescontoViagem

**Package:** `desafios.logica_e_operadores`

## 📝 O Enredo (As Regras de Negócio)
Uma agência de viagens parceira da DBC Company está oferecendo um cupom de desconto especial para as férias dos colaboradores. No entanto, o sistema precisa validar quem está elegível ao desconto máximo de forma automatizada.

As regras lógicas para receber o desconto máximo são:
1. O colaborador **deve** ter mais de 1 ano de empresa **OU** ser um membro do clube de benefícios premium da empresa.
2. Além disso, ele **deve** ter comprado um pacote internacional **OU** o valor total da compra deve ser estritamente maior que R$ 4.000.
3. Por fim, o desconto **não será aplicado de forma alguma** se o colaborador possuir alguma pendência de documentação pendente na agência.

## 💻 O Problema
Escreva um programa em Java que receba:
* O nome do colaborador (`String`).
* O tempo de empresa em anos (`int`).
* Se é membro do clube premium (`boolean`).
* Se o pacote é internacional (`boolean`).
* O valor total da compra (`double`).
* Se possui pendência de documentação (`boolean`).

Utilizando uma **única expressão lógica complexa** dentro do seu `if`, valide se o colaborador tem direito ao desconto e exiba a saída exatamente como abaixo:

* Se o desconto for concedido:
  `"Colaborador [Nome] elegível para o desconto máximo!"`
* Se for negado:
  `"Colaborador [Nome] não cumpre os requisitos para o desconto."`