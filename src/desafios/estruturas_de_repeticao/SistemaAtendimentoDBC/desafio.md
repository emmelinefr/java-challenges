# Desafio: SistemaAtendimentoDBC

**Package:** `desafios.estruturas_de_repeticao`

## 📝 O Enredo (As Regras de Negócio)
Você está desenvolvendo o menu inicial do sistema de atendimento ao colaborador da DBC. O sistema deve exibir um menu numérico e executar a ação que o usuário escolher.

O menu possui as seguintes opções:
* `1` - Falar com o RH
* `2` - Falar com o TI
* `3` - Modificar Dados Cadastrais
* `0` - Sair do Sistema

As regras de funcionamento são:
1. O menu **deve ser exibido pelo menos uma vez** assim que o programa inicia.
2. Se o usuário digitar `1`, `2` ou `3`, o sistema deve imprimir a mensagem correspondente (ex: `"Conectando ao RH..."`) e **mostrar o menu novamente** para uma nova escolha.
3. Se o usuário digitar `0`, o sistema deve imprimir `"Sistema encerrado. Até logo!"` e finalizar o programa.
4. Se o usuário digitar qualquer outro número, deve exibir `"Opção inválida! Tente novamente."` e **mostrar o menu novamente**.

## 💻 O Problema
Escreva um programa em Java que fique em loop exibindo o menu e lendo a opção do usuário (`int`).

Mensagens a serem impressas para cada opção:
* `1`: `"Direcionando para o RH..."`
* `2`: `"Direcionando para o TI..."`
* `3`: `"Abrindo painel de cadastro..."`