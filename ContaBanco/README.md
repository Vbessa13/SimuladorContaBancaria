# ContaBanco - Projeto Java 🚀

Este projeto foi desenvolvido como exercício de **Sintaxe em Java**, simulando a criação de uma conta bancária via **entrada de dados no terminal**.  
O programa solicita informações do usuário (Número da Conta, Agência, Nome do Cliente e Saldo) e, em seguida, exibe uma mensagem formatada confirmando a criação da conta.

---

## 📌 Funcionalidades
- Entrada de dados via terminal com a classe `Scanner`
- Manipulação de **variáveis de diferentes tipos**:
  - `int` → Número da conta
  - `String` → Agência e Nome do Cliente
  - `double` → Saldo
- Formatação de valores decimais no padrão brasileiro usando:
  ```java
  NumberFormat nf = NumberFormat.getNumberInstance(new Locale("pt", "BR"));
  nf.setMinimumFractionDigits(2);

