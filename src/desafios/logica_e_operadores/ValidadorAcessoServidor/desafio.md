# Desafio: ValidadorAcessoServidor

**Package:** `desafios.logica_e_operadores`

## 📝 O Enredo (As Regras de Negócio)
Segurança da informação é um tema crítico na DBC. Você foi encarregado de criar o sistema de validação de acesso a um servidor de arquivos confidenciais.

Para um colaborador ter acesso ao servidor, as regras lógicas são:
1. Ele **deve** possuir a credencial de nível `"ADMIN"` **OU** `"GESTOR"`.
2. Além do cargo, o acesso **só é permitido** se ele estiver acessando de uma VPN corporativa interna **OU** se ele possuir um token de autenticação de dois fatores (2FA) ativo.
3. Por questões de segurança, contas marcadas como suspensas **não podem entrar de jeito nenhum**, independentemente de qualquer outra condição.

## 💻 O Problema
Escreva um programa em Java que receba:
* O cargo do colaborador (`String`).
* Se está conectado via VPN (`boolean`).
* Se possui o token 2FA ativo (`boolean`).
* Se a conta está suspensa (`boolean`).

Utilizando uma **única expressão lógica** no seu `if`, verifique se o acesso é concedido.

* Se o acesso for permitido, exiba:
  `"Acesso concedido ao servidor confidencial."`
* Se for negado, exiba:
  `"Acesso negado. Credenciais inválidas ou conta suspensa."`