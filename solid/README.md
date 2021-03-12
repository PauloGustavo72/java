Solid

### Entendendo a base
Antes de começarmos a entender um pouco mais sobre o padrão de projeto, precisamos entender bem os conceitos de **Coesão**, **Encapsulamento** e **Acomplamento**. 
Um bom material de pesquisa pode ser encontrado [aqui]('https://pt.stackoverflow.com/a/81337'), mas darei uma resumida abaixo:
* Coesão:
    * Uma classe coesa faz bem uma única coisa
    * Classes coesas não devem ter várias responsabilidades

* Encapsulamento:
    * Getters e setters não são formas eficientes de aplicar encapsulamento
    * É interessante fornecer acesso apenas ao que é necessário em nossas classes
    * O encapsulamento torna o uso das nossas classes mais fácil e intuitivo

* Acoplamento:
    * Acoplamento é a dependência entre classes
    * Acoplamento nem sempre é ruim, e que é impossível criar um sistema sem nenhum acoplamento
    * Devemos controlar o nível de acoplamento na nossa aplicação
    

### Single Responsibility Principle
Princípio da responsabilidade única(letra "S" do solid) diz que nossa classe deve ter apenas um motivo para mudar.
Pensando nisso, podemos dizer que se uma classe atender a esse princípio, com certeza ela tera uma boa coesão, pois terá uma única responsabilidade;

* [Artigo contando um pouco mais sobre esse princípio]("https://medium.com/xp-inc/os-princ%C3%ADpios-do-solid-srp-princ%C3%ADpio-da-responsabilidade-%C3%BAnica-7897c55694fe")