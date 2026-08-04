# Desafio: CalculadoraOrcamentoProjetos

**Package:** `desafios.estruturas_de_repeticao`

## 📝 O Enredo (As Regras de Negócio)
A diretoria da DBC Company estipulou um teto de orçamento máximo para investimentos em novos softwares internos. O sistema deve acumular o valor dos orçamentos dos projetos que os gestores forem digitando.

As regras de parada e funcionamento são:
1. O programa deve ler primeiro o valor do **Teto Máximo do Orçamento** (`double`).
2. Em seguida, usando um loop, o programa lerá o valor de cada projeto (`double`).
3. O loop deve continuar recebendo valores de projetos por tempo indeterminado.
4. **Critério de Parada 1:** Se o usuário digitar um valor menor ou igual a zero (ex: `0` ou `-5`), o programa entende que a inserção de dados acabou por vontade do usuário.
5. **Critério de Parada 2:** Se a soma dos projetos digitados **ultrapassar** o Teto Máximo do Orçamento, o loop deve ser interrompido imediatamente (*dica: use o comando `break`*), e o último projeto que causou o estouro **não** deve ser contabilizado na soma válida.

## 💻 O Problema
Escreva um programa em Java que receba:
* O teto do orçamento total (`double`).
* Vários valores de projetos (`double`), até que um dos critérios de parada seja atingido.

No final, o programa deve exibir exatamente o total acumulado aceito e a quantidade de projetos válidos que foram incluídos:
`"Total acumulado: R$ [SomaValida]. Projetos aceitos: [ContadorProjetos]."`