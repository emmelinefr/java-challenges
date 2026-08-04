# Desafio: ControleDeEstoque

**Package:** `desafios.estruturas_de_repeticao`

## 📝 O Enredo (As Regras de Negócio)
O almoxarifado de uma empresa de tecnologia recebeu um lote com uma quantidade fixa de novos notebooks. O sistema precisa registrar o peso de cada um deles para o relatório de logística.

As regras são:
1. O programa deve ler primeiro a **quantidade total de notebooks** do lote (`int`).
2. Depois, o sistema deve pedir o peso (em kg) de cada notebook, um por um.
3. **Validação Importante:** Um notebook corporativo não pode pesar menos que `1.0` kg e nem mais que `5.0` kg. Se o usuário digitar um peso fora dessa faixa, o sistema deve exibir: `"Peso inválido! O peso deve ser entre 1.0kg e 5.0kg. Digite novamente."` e **não** pode avançar para o próximo notebook até que um peso válido seja inserido.
4. No final, o sistema deve exibir a média de peso dos notebooks válidos.

## 💻 O Problema
Escreva um programa em Java que receba:
* A quantidade de notebooks (`int`).
* O peso de cada um (`double`), garantindo a validação.

A saída final deve ser exatamente no formato:
`"Média de peso dos notebooks: [MediaCalculada] kg."`