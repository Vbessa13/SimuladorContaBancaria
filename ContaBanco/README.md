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
  ```
- Saída final exibida de forma amigável ao usuário.

---

## 📂 Estrutura de Pastas

O projeto segue a seguinte organização padrão do **Java no VS Code**:

```
ContaBanco/
│
├── src/                # Código-fonte Java
│   └── ContaTerminal.java
│
├── lib/                # Dependências externas (se houver)
│
├── bin/                # Arquivos compilados (.class)
│
├── .vscode/            # Configurações do VS Code
│
└── README.md           # Documentação do projeto
```

---

## 🛠️ Tecnologias e Bibliotecas Utilizadas
- **Java JDK 17+** (ou versão compatível)
- **Classe Scanner** (`java.util.Scanner`) → Entrada de dados via terminal
- **Classe NumberFormat** (`java.text.NumberFormat`) → Formatação de números decimais
- **Locale (pt-BR)** (`java.util.Locale`) → Padrão de idioma e formato numérico

---

## 📖 Sintaxe Importante no Projeto

### Declaração de Variáveis
```java
int numero;
String agencia;
String nomeCliente;
double saldo;
```

### Entrada de Dados com Scanner
```java
Scanner scanner = new Scanner(System.in);
int numero = scanner.nextInt();
String agencia = scanner.next();
scanner.nextLine(); // limpar buffer
String nomeCliente = scanner.nextLine();
double saldo = scanner.nextDouble();
```

### Saída Formatada
```java
String mensagem = "Olá " + nomeCliente +
                  ", obrigado por criar uma conta em nosso banco, sua agência é " +
                  agencia + ", conta " + numero +
                  " e seu saldo " + saldoFormatado +
                  " já está disponível para saque.";
System.out.println(mensagem);
```

---

## ▶️ Como Rodar o Projeto

1. **Clonar o repositório**
   ```bash
   git clone https://github.com/Vbessa13/SimuladorContaBancaria/tree/main/ContaBanco
   cd ContaBanco
   ```

2. **Compilar o código**
   ```bash
   javac -d bin src/ContaTerminal.java
   ```

3. **Executar o programa**
   ```bash
   java -cp bin ContaTerminal
   ```

4. **Exemplo de execução**
   ```
   Por favor, digite o número da Conta: 
   1021
   Por favor, digite o número da Agência: 
   067-8
   Por favor, digite o nome do Cliente: 
   MARIO ANDRADE
   Por favor, digite o saldo: 
   1500.25
   ```

   **Saída:**
   ```
   Olá MARIO ANDRADE, obrigado por criar uma conta em nosso banco, sua agência é 067-8, conta 1021 e seu saldo 1.500,25 já está disponível para saque.
   ```

---

## 📚 Referências
- [Documentação oficial do Java](https://docs.oracle.com/en/java/)
- [Scanner (Java Docs)](https://docs.oracle.com/javase/8/docs/api/java/util/Scanner.html)
- [NumberFormat (Java Docs)](https://docs.oracle.com/javase/8/docs/api/java/text/NumberFormat.html)

---

## 🚀 Melhorias Futuras
Este projeto poderá evoluir para incluir:
- ✅ Criação de uma classe `Conta` com atributos e métodos (POO)  
- ✅ Implementação de métodos como `depositar`, `sacar` e `consultarSaldo`  
- ✅ Validações de entrada (ex.: impedir saldo negativo, validar número da agência)  
- ✅ Uso de tratamento de exceções (`try/catch`) para entradas inválidas  
- ✅ Interface gráfica simples (JavaFX ou Swing) para simular um aplicativo bancário  
- ✅ Integração futura com banco de dados para persistência das contas  

---

👨‍💻 Projeto desenvolvido como exercício prático de sintaxe e boas práticas em Java.
