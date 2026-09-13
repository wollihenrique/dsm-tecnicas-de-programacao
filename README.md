# Atividade de Autoestudo: Java e Programação Orientada a Objetos (POO)

* **Aluno:** Wallace Henrique Batista Santos
* **Curso / Turma:** Desenvolvimento de Software Multiplataforma (2º DSM) - Técnicas de Programação
* **Linguagem:** Java (JDK 17+)

---

## 📌 Descrição dos Exercícios

### Exercício 1: Cofrinho Digital (Foco em Encapsulamento)
Desenvolvimento de uma classe `Cofrinho` voltada para o acúmulo de reservas financeiras com um objetivo estipulado.
* **Objetivo:** Proteger o estado do objeto impedindo que o saldo seja alterado diretamente de forma inadequada.
* **Regras de Domínio:** O saldo inicial é zero; o método `depositar` aceita apenas quantias estritamente positivas; e o método `retirar` exige saldo suficiente e valores positivos. O resumo exibe objetivo e saldo atualizado.

### Exercício 2: Plataforma de Conteúdos Educacionais (Foco em Herança)
Implementação de uma hierarquia educacional composta pela superclasse `Conteudo` e pelas subclasses `VideoAula` e `Podcast`.
* **Objetivo:** Reaproveitar membros comuns (`titulo`, `duracaoMinutos` e o método `exibirResumo()`) por meio de herança direta.
* **Regras de Domínio:** As subclasses invocam o construtor da superclasse via `super(...)` e acrescentam comportamentos específicos (`reproduzirVideo()` e `ouvirPodcast()`), sem sobrescrever o método herdado de resumo.

### Exercício 3: Calculadora Multifuncional (Foco em Polimorfismo por Sobrecarga)
Construção da classe `Calculadora` demonstrando o polimorfismo estático em tempo de compilação.
* **Objetivo:** Disponibilizar múltiplas variações do método `somar(...)` sob o mesmo identificador.
* **Regras de Domínio:** Suporte para soma de dois números inteiros (`int, int`), dois números de ponto flutuante (`double, double`) e três inteiros (`int, int, int`).

### Exercício 4: Sistema de Pagamentos (Integração de Conceitos)
Construção de um ecossistema de checkout envolvendo a superclasse abstrata/base `Pagamento` e as especializações `PagamentoPix` e `PagamentoCartao`.
* **Objetivo:** Integrar encapsulamento, herança e polimorfismo dinâmico (tempo de execução).
* **Regras de Domínio:** O Pix não cobra taxas adicionais, enquanto o pagamento com cartão aplica taxa de 3% sobre o valor base e registra a quantidade de parcelas. O método `processar()` exibe a discriminação customizada conforme o tipo em execução.

---

## 🛠️ Onde Cada Conceito Foi Utilizado

| Conceito | Exercício | Arquivos e Implementação Prática |
| :--- | :--- | :--- |
| **Encapsulamento** | Ex. 1 e Ex. 4 | Atributos com visibilidade restrita (`private String objetivo;`, `private double saldo;`, `private double valor;`, `private int parcelas;`). A manipulação do saldo e das taxas ocorre unicamente por meio de métodos de controle com validações de regra de negócio (`depositar`, `retirar`, `calcularTaxa`), impedindo atribuições diretas inconsistentes via `Main`. |
| **Herança** | Ex. 2 e Ex. 4 | As subclasses `VideoAula` e `Podcast` estendem `Conteudo` usando `extends` e repassam dados comuns via `super(titulo, duracaoMinutos)`. No exercício 4, `PagamentoPix` e `PagamentoCartao` estendem a classe base `Pagamento`. |
| **Polimorfismo por Sobrecarga** *(Estático / Sobrecarga)* | Ex. 3 | Definição de três assinaturas distintas para o método `somar` na mesma classe `Calculadora`. A resolução de qual método executar ocorre durante a compilação a partir da quantidade e tipos dos argumentos passados. |
| **Polimorfismo por Sobrescrita** *(Dinâmico / Subtipagem)* | Ex. 4 | Utilização da anotação `@Override` nas subclasses `PagamentoPix` e `PagamentoCartao` para redefinir o comportamento de `calcularTaxa()` e `processar()`. No `Main`, referências declaradas do tipo mais genérico (`Pagamento pag = new PagamentoCartao(...)`) invocam dinamicamente os métodos da subclasse em tempo de execução (*dynamic binding*). |

---

## 💻 Instruções para Compilar e Executar

Certifique-se de ter o **JDK (Java Development Kit)** configurado no seu terminal. Para rodar qualquer um dos exercícios individualmente:

### Exercício 1 (Cofrinho)
```bash
cd atividades_encapsulamento/exercicio1
javac *.java
java Main
