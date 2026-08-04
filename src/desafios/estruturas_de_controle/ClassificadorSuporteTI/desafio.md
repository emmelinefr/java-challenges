# ClassificadorSuporteTI

## 📝 Descrição
O setor de suporte técnico de uma empresa de tecnologia recebe chamados internos classificados por códigos numéricos de 1 a 4. Para otimizar o atendimento, o sistema deve processar o chamado, identificar o número do chamado, redirecioná-lo para a equipe correspondente e informar o tempo estimado de atendimento (SLA) com base na gravidade ou tipo do problema.

As regras de negócio para triagem são:
* **Código 1 (Hardware):** Encaminhar para a `"Equipe de Infraestrutura"` com SLA de `48` horas.
* **Código 2 (Software/Acessos):** Encaminhar para a `"Equipe de Segurança"` com SLA de `24` horas.
* **Código 3 (Bugs no Sistema):** Encaminhar para a `"Equipe de Desenvolvimento"` com SLA de `12` horas.
* **Código 4 (Plantão Urgente):** Encaminhar para a `"Equipe de DevOps"` com SLA de `2` horas.
* **Qualquer outro código:** Considerado inválido. O chamado deve ser retido na triagem.

---

## 📥 Entrada (Input)
O programa deverá ler da entrada padrão:
1. Um valor inteiro (`int`) representando o **número do chamado**.
2. Um valor inteiro (`int`) representando o **código do tipo de problema**.

---

## 📤 Saída (Output)
O programa deve imprimir na tela uma única linha contendo a mensagem formatada de acordo com a validação do código:

* **Para códigos válidos (1 a 4):**
  `Chamado #[NumeroChamado] direcionado para [NomeDaEquipe]. SLA: [Tempo]h.`

* **Para códigos inválidos:**
  `Código de problema inválido. Chamado #[NumeroChamado] retido na triagem.`

---

## 🧪 Exemplos de Teste

### Exemplo 1
* **Entrada:**
  1024
  3
* **Saída:**
  Chamado #1024 direcionado para Equipe de Desenvolvimento. SLA: 12h.

---

### Exemplo 2
* **Entrada:**
  5050
  9
* **Saída:**
  Código de problema inválido. Chamado #5050 retido na triagem.