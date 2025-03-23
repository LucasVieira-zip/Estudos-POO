# Estudos-POO
Projeto simples, criado para estudos na aula de Linguagens Orientadas a Objetos da minha faculdade!


# Explicação do código:
Classe ``Livro``:

A classe base Livro tem os atributos titulo e autor, além do método exibirInfo() para exibir as informações do livro e um método abstrato calcularPreco(), que será implementado nas subclasses.

Classe ``LivroFisico``:

A classe LivroFisico herda de Livro e possui um atributo extra: peso, que representa o peso do livro físico.

A implementação do método ``calcularPreco()`` considera o peso do livro, atribuindo um preço base de R$30,00 e adicionando R$0,50 por quilo.

A classe também sobrescreve o método ``exibirInfo()`` para incluir o peso do livro.

Classe ``LivroDigital``:

A classe ``LivroDigital`` herda de Livro e tem o atributo ``tamanhoArquivo``, que representa o tamanho do arquivo do livro digital em megabytes (MB).

O método ``calcularPreco()`` calcula o preço com base no tamanho do arquivo, usando um preço base de R$20,00 e adicionando R$0,20 por megabyte.

A classe também sobrescreve o método ``exibirInfo()`` para mostrar o tamanho do arquivo.

Classe ``Main``:

Cria dois objetos, um de ``LivroFisico`` e outro de ``LivroDigital``.

Chama os métodos ``exibirInfo()`` e ``calcularPreco()`` para exibir as informações e calcular os preços de ambos os livros.

Como funciona o ``Polimorfismo``:
A classe Livro tem o método ``calcularPreco()`` definido como abstrato, e ele é implementado de maneira diferente nas subclasses ``LivroFisico`` e ``LivroDigital``.

Quando chamamos ``calcularPreco()`` em um objeto do tipo ``Livro``, o comportamento do método será determinado pelo tipo real do objeto (se é um ``LivroFisico`` ou um ``LivroDigital``), demostrando o polimorfismo.

O método ``exibirInfo()`` também é polimórfico, pois cada classe pode exibir diferentes informações adicionais, como o peso ou o tamanho do arquivo.

Benefícios:
Herança: As classes ``LivroFisico`` e ``LivroDigital`` herdam os comportamentos e atributos da classe ``ivro``, mas também adicionam suas próprias características e comportamentos.

Polimorfismo: O método ``calcularPreco()`` é sobrescrito para cada tipo de livro, permitindo que a lógica de cálculo do preço seja diferente para cada tipo de livro.
