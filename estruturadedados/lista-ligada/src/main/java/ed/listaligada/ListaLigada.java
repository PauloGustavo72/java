package ed.listaligada;

public class ListaLigada {

    private Celula primeira = null;
    private Celula ultima = null;
    private int totalDeElementos = 0;

    public void adicionaNoComeco(Object elemento){
        Celula nova = new Celula(elemento, primeira);
        this.primeira = nova;

        if(totalDeElementos == 0){
            this.ultima = primeira;
        }

        this.totalDeElementos++;
    }

    public void adicionaNoFim(Object elemento){
        if(this.totalDeElementos == 0) {
            adicionaNoComeco(elemento);
        }else {
            Celula nova = new Celula(elemento, null);
            this.ultima.setProximo(nova);
            this.ultima = nova;

            this.totalDeElementos++;
        }
    }

    public void adiciona(int posicao, Object elemento){
        if(posicao == 0){
            adicionaNoComeco(elemento);
        }else if(posicao == this.totalDeElementos){
            adicionaNoFim(elemento);
        }else {
            Celula celulaAnterior = this.pegaCelula(posicao - 1);
            Celula novaCelula = new Celula(elemento, celulaAnterior.getProximo());
            celulaAnterior.setProximo(novaCelula);
            this.totalDeElementos++;
        }
    }



    public void remove(int posicao){}
    public int tamanho(){return 0;}
    public boolean contem(Object o) {return false;}


    private Celula pegaCelula(int posicao){
        if(posicao > totalDeElementos){
            throw new IllegalArgumentException("Posição inválida");
        }
        Celula atual = this.primeira;

        for(int i = 0; i < posicao; i++){
            atual = atual.getProximo();
        }

        return atual;
    }

    @Override
    public String toString() {
        if(this.totalDeElementos == 0){
            return "[]";
        }

        Celula atual = primeira;

        StringBuilder builder = new StringBuilder("[");

        for(int i = 0; i< totalDeElementos; i++){
            builder.append(atual.getElement());
            builder.append(", ");

            atual = atual.getProximo();
        }

        builder.append("]");

        return builder.toString();
    }
}
