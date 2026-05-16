# Atividade - Aplicando os Princípios SOLID

Atividade prática para aplicação dos cinco princípios SOLID em Java puro, simulando funcionalidades de um sistema de delivery.

## Estrutura do projeto

```
SOLID-PEDROANTONIO/
├── S/   - Single Responsibility Principle
├── O/   - Open/Closed Principle
├── L/   - Liskov Substitution Principle
├── I/   - Interface Segregation Principle
└── D/   - Dependency Inversion Principle
```

---

## 1. Single Responsibility Principle (SRP)

Implementação de funcionalidades relacionadas ao gerenciamento de pedidos do sistema de delivery.

O sistema deverá:
- criar um pedido
- salvar um pedido
- exibir as informações de um pedido

O primeiro princípio do SOLID deverá ser respeitado. As responsabilidades deverão ser separadas corretamente entre as classes.

### Classes implementadas

- `Pedido` - representa os dados de um pedido
- `SalvarPedido` - responsável por salvar o pedido
- `ExibirPedido` - responsável por exibir as informações do pedido
- `Main` - faz a chamada das funcionalidades

---

## 2. Open/Closed Principle (OCP)

Implementação de diferentes formas de pagamento para o sistema.

O sistema deverá possuir pelo menos:
- pagamento via cartão
- pagamento via PIX
- pagamento via dinheiro

O sistema deverá permitir adicionar novos tipos de pagamento futuramente sem alterar o código já existente.

### Classes implementadas

- `Pagamento` - interface que define o contrato de pagamento
- `PagamentoCartao` - implementação de pagamento via cartão
- `PagamentoPix` - implementação de pagamento via PIX
- `PagamentoDinheiro` - implementação de pagamento via dinheiro
- `Main` - faz a chamada das funcionalidades

Para adicionar um novo tipo de pagamento, basta criar uma nova classe que implemente a interface `Pagamento`, sem alterar o código existente.

---

## 3. Liskov Substitution Principle (LSP)

Implementação de diferentes tipos de produtos do restaurante.

O sistema deverá possuir uma classe principal de produto e subclasses como:
- Pizza
- Hamburguer
- Bebida

Todas as subclasses deverão poder ser utilizadas normalmente no lugar da classe principal sem causar comportamentos incorretos.

### Classes implementadas

- `Produto` - classe principal de produto
- `Pizza` - subclasse de Produto
- `Hamburguer` - subclasse de Produto
- `Bebida` - subclasse de Produto
- `Main` - faz a chamada das funcionalidades

Todas as subclasses respeitam o contrato da classe pai e podem ser usadas no lugar de `Produto` sem causar comportamento inesperado.

---

## 4. Interface Segregation Principle (ISP)

Implementação de diferentes responsabilidades do sistema utilizando interfaces específicas.

O sistema deverá possuir funcionalidades como:
- envio de notificações
- geração de relatórios
- gerenciamento de pedidos
- gerenciamento de entregas

As classes não deverão implementar métodos que não utilizam.

### Interfaces implementadas

- `Notificador` - contrato para envio de notificações
- `GeradorRelatorio` - contrato para geração de relatórios
- `GerenciadorPedido` - contrato para gerenciamento de pedidos
- `GerenciadorEntrega` - contrato para gerenciamento de entregas

### Classes implementadas

- `ServicoEmail` - implementa apenas `Notificador`
- `ServicoRelatorio` - implementa apenas `GeradorRelatorio`
- `ServicoPedido` - implementa apenas `GerenciadorPedido`
- `ServicoEntrega` - implementa apenas `GerenciadorEntrega`
- `Main` - faz a chamada das funcionalidades

Cada classe implementa somente os métodos que de fato utiliza.

---

## 5. Dependency Inversion Principle (DIP)

Implementação de um sistema de notificações desacoplado.

O sistema deverá permitir o envio de notificações utilizando diferentes meios, como:
- Email
- SMS
- WhatsApp

A classe principal do sistema não poderá depender diretamente de implementações concretas, mas sim de abstrações/interfaces.

### Classes implementadas

- `Notificacao` - interface (abstração) para envio de notificações
- `EmailNotificacao` - implementação concreta para Email
- `SmsNotificacao` - implementação concreta para SMS
- `WhatsappNotificacao` - implementação concreta para WhatsApp
- `SistemaNotificacao` - classe principal que depende da abstração `Notificacao`
- `Main` - faz a injeção da implementação concreta no sistema

A classe `SistemaNotificacao` recebe a implementação pelo construtor, dependendo apenas da interface, e não de classes concretas.

---

## Como executar

1. Abrir o projeto no IntelliJ IDEA
2. Marcar a pasta de código-fonte como `Sources Root`
3. Executar a classe `Main` de cada pacote (S, O, L, I, D) individualmente

## Tecnologias

- Java
- IntelliJ IDEA

## Autor

Pedro Antônio
