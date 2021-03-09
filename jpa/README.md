JPA

### Relacionamento Muitos para um
    
```java
    @Entity
    public class Movimentacao {
    
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
    
        @Enumerated(EnumType.STRING)
        private TipoMovimentacao tipoMovimentacao;
        private LocalDateTime data;
        private String descricao;
        private BigDecimal valor;
        
        @ManyToOne
        private Conta conta;
    
        //Getters e Setters dos atributos privados omitidos
    }
```
  
* Para esse tipo de relacionamento, sempre que eu adicionar uma movimentação, eu obrigatóriamente preciso ter uma conta salva no banco, ou no estado de **managed** do JPA.
  

### Relacionamento Muitos para Muitos
    
```java
    @Entity
    public class Movimentacao {
    
        @Id
        @GeneratedValue
        private Long id;
    
        @Enumerated
        private TipoMovimentacao tipoMovimentacao;
        private LocalDateTime data;
        private String descricao;
        private BigDecimal valor;
        @ManyToMany
        private List<Categoria> categoria;
    
        //Getters e Setters dos atributos privados omitidos
    }
```
* Esse relacionamento criará uma outra tabela, chamada geralmente de tabela de relacionamento; 
* O objetivo dessa tabela, é manter/associar os identificadores das tabelas *movimentacao* e *categoria*;
* Exemplo:
  
    id_movimentacao | id_categoria
    :---:           | :---: 
    1               | 2
    1               | 3
    5               | 2
    5               | 3


### Relacionamento um para um
```java
@Entity 
public class Cliente {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String nome;
  private String profissao;
  private String endereco;

  @JoinColumn(unique = true)
  @OneToOne
  private Conta conta;
}
```

* A anotação *@JoinColumn(unique = true)* cria uma *constraint* que não permite valores iguais. Logo eu evito que uma conta possa ser de mais de um cliente.