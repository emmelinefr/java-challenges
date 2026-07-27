# Desafio: AlocacaoDesenvolvedor

**Package:** `desafios.estruturas_de_controle`

## 📝 O Enredo (As Regras de Negócio)
A DBC Company precisa automatizar a alocação de profissionais em novos projetos. Cada projeto exige uma **Pontuação de Experiência (PX)** mínima. Essa pontuação é calculada cruzando os anos de experiência do desenvolvedor com a quantidade de tecnologias que ele domina.

A regra para calcular a PX é baseada em três faixas de experiência:
1. **Júnior (Menos de 2 anos):** $PX = (\text{anos} \times 10) + (\text{tecnologias} \times 5)$
2. **Pleno (De 2 a 5 anos):** $PX = (\text{anos} \times 15) + (\text{tecnologias} \times 8)$
3. **Sênior (Mais de 5 anos):** $PX = (\text{anos} \times 20) + (\text{tecnologias} \times 10)$

## 💻 O Problema
Escreva um programa em Java que receba:
* O nome do desenvolvedor (`String`)
* Os anos de experiência (`int`)
* A quantidade de tecnologias que domina (`int`)
* A pontuação mínima exigida pelo projeto (`int`)

O sistema deve calcular a PX do desenvolvedor e gerar **exatamente** as seguintes saídas com base nas condições:
* **Condição A:** Se a PX for maior ou igual à pontuação do projeto:
  `"Dev [Nome] aprovado para o projeto com [PX] pontos!"`
* **Condição B:** Se a PX for menor que a do projeto, mas a diferença for de **no máximo 5 pontos**:
  `"Dev [Nome] ficou em lista de espera (Faltaram apenas [X] pontos)."`
* **Condição C:** Em qualquer outro caso (diferença maior que 5 pontos):
  `"Dev [Nome] reprovado para este projeto."`