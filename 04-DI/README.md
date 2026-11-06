# Desafio: Componentes e injeção de dependência

Exercício do curso Spring Boot do professor Nélio Alves.

Calcula o valor total de um pedido (valor básico − desconto + frete) usando serviços do Spring (`OrderService` e `ShippingService`) ligados por injeção de dependência pelo construtor.

Regras do frete, pelo valor básico:

- abaixo de R$ 100,00: R$ 20,00
- de R$ 100,00 até R$ 200,00: R$ 12,00
- R$ 200,00 ou mais: grátis

## Como rodar

```bash
./gradlew bootRun
```

## Saída

```
Pedido código 1034
Valor total: R$ 132.00
Pedido código 2282
Valor total: R$ 720.00
Pedido código 1309
Valor total: R$ 115.90
```

Tecnologias: Java 25, Spring Boot 4, Gradle.
