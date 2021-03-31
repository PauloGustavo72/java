package ed.listaligada;

public class Celula {

    private Object element;
    private Celula proximo;

    public Celula(Object element, Celula proximo) {
        this.element = element;
        this.proximo = proximo;
    }

    public Object getElement() {
        return element;
    }

    public void setElement(Object element) {
        this.element = element;
    }

    public Celula getProximo() {
        return proximo;
    }

    public void setProximo(Celula proximo) {
        this.proximo = proximo;
    }
}
