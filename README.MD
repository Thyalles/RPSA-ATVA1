# Pesquisa de Padrões de Projeto Criacionais

## Pesquisa Teórica

Os padrões criacionais abstraem o processo de instanciação. Eles ajudam a tornar um sistema independente de como seus objetos são criados, compostos e representados.

### 1. Factory Method
* **Quais problemas o padrão resolve?**
  Resolve o problema de quando uma classe não pode antecipar a classe exata de objetos que deve criar, ou quando quer que suas subclasses especifiquem os objetos que criam. Ele evita o acoplamento direto entre o criador e os produtos concretos.
* **Como o padrão resolve esses problemas?**
  Define uma interface (método) para criar um objeto, mas deixa as subclasses decidirem qual classe instanciar. O "método de fábrica" adia a instanciação para as subclasses.

### 2. Abstract Factory
* **Quais problemas o padrão resolve?**
  Resolve a necessidade de criar famílias de objetos relacionados ou dependentes sem especificar suas classes concretas. É ideal para sistemas que precisam ser independentes de como seus produtos são criados (ex: uma interface que precisa mudar o estilo de botões e janelas de acordo com o Sistema Operacional).
* **Como o padrão resolve esses problemas?**
  Fornece uma interface que funciona como uma "fábrica de fábricas". Você chama a fábrica abstrata, e ela te entrega um conjunto de produtos que combinam entre si, garantindo a compatibilidade.

### 3. Builder
* **Quais problemas o padrão resolve?**
  Resolve o problema do "construtor telescópico" (quando uma classe tem muitos parâmetros e o desenvolvedor se perde na ordem ou no que cada um faz) e a necessidade de criar objetos complexos passo a passo.
* **Como o padrão resolve esses problemas?**
  Separa a construção de um objeto complexo da sua representação. Através de uma interface fluida (métodos encadeados), permite que o mesmo processo de construção crie diferentes representações e configurações do objeto.

### 4. Prototype
* **Quais problemas o padrão resolve?**
  Resolve casos onde o custo de criar um novo objeto do zero é muito alto (em termos de recursos ou tempo) ou quando você precisa de uma cópia exata de um objeto cujo estado atual é complexo e importante.
* **Como o padrão resolve esses problemas?**
  Permite copiar objetos existentes sem tornar seu código dependente de suas classes. O objeto original (protótipo) implementa uma interface que expõe um método `clone()`, que duplica a si mesmo.

### 5. Singleton
* **Quais problemas o padrão resolve?**
  Garante que uma classe tenha apenas uma única instância em todo o ciclo de vida da aplicação e fornece um ponto de acesso global a ela. É muito usado para gerenciadores de log, conexões com banco de dados ou configurações de sistema.
* **Como o padrão resolve esses problemas?**
  Torna o construtor da classe privado (impedindo o uso do `new` fora da classe) e cria um método estático que gerencia a criação da instância. Se a instância já existir, ele apenas a retorna; se não, ele a cria.

---

## Implementação Prática: Singleton

Para esta atividade, implementei o padrão **Singleton** em Java. O código simula um **Gerenciador de Configurações** onde todas as partes do sistema devem ler as mesmas definições.

### Estrutura do Código
* **`Configurador.java`**: Possui o construtor privado e o método `getInstancia()`.
* **`Main.java`**: Realiza o teste de sanidade, comparando os endereços de memória de duas variáveis para provar que são o mesmo objeto.
