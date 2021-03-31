package ed.listaligada;

public class ListaLigada2 {

    private Celula primeira = null;
    private int totalElementos = 0;

    public void adicionaNoComeco(Object element){
        Celula novaPrimeira = new Celula(element, primeira);

        primeira = novaPrimeira;

        this.totalElementos++;
    }
}
