# Desafio: AnaliseCreditoDBC

**Package:** `desafios.logica_e_operadores`

## 📝 O Enredo (As Regras de Negócio)
A DBC Company está desenvolvendo um módulo de automação financeira para um cliente bancário. O objetivo é avaliar se um cliente tem direito a uma linha de crédito especial para expansão de empresas.

Para receber o crédito, o cliente precisa atender a critérios estritos de saúde financeira. As regras são:
1. O cliente **deve** ter faturamento anual superior a R$ 500.000.
2. O cliente **deve** ter mais de 2 anos de fundação da empresa **OU** possuir uma garantia real (como um imóvel ou veículo homologado).
3. O cliente **não pode** ter restrições ativas no CPF/CNPJ (nome sujo).

## 💻 O Problema
Escreva um programa em Java que receba:
* O nome da empresa (`String`).
* O faturamento anual em reais (`double`).
* O tempo de fundação em anos (`int`).
* Se possui garantia real (`boolean`: `true` ou `false`).
* Se possui restrição ativa no nome (`boolean`: `true` ou `false`).

Utilizando uma **única expressão lógica complexa** dentro de um `if`, o sistema deve avaliar os dados e exibir a saída exatamente como abaixo:

* Se a empresa passar em todos os critérios:
  `"Empresa [Nome] APROVADA para a linha de crédito."`
* Caso contrário:
  `"Empresa [Nome] REPROVADA. Não atende aos critérios de elegibilidade."`