# Desafio: ContadorDeProjetosValidos

**Package:** `desafios.estruturas_de_repeticao`

## 📝 O Enredo (As Regras de Negócio)
O setor de qualidade da DBC Company está auditando uma lista de projetos entregues. O sistema vai receber o número total de projetos que precisam ser analisados. Para cada projeto, será informada uma nota de qualidade de 0 a 100.

As regras do sistema são:
1. O programa deve perguntar primeiro a quantidade total de projetos.
2. Em seguida, usando um loop, deve ler a nota de cada um desses projetos.
3. Se o usuário digitar uma nota inválida (menor que 0 ou maior que 100), o sistema deve exibir a mensagem `"Nota inválida! Digite novamente."` e **não** deve avançar para o próximo projeto até que uma nota válida seja informada (aqui você vai precisar de um loop dentro do outro!).
4. No final, o sistema deve contar quantos projetos foram aprovados (nota maior ou igual a 70).

## 💻 O Problema
Escreva um programa em Java que receba:
* A quantidade de projetos a serem analisados (`int`).
* A nota de cada projeto (`int`), validando para que fique entre 0 e 100.

A saída final deve seguir exatamente este padrão:
`"Total de projetos analisados: [Quantidade]. Aprovados: [ContadorAprovados]."`