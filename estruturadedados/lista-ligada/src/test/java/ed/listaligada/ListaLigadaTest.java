package ed.listaligada;

import junit.framework.TestCase;
import org.junit.Test;

public class ListaLigadaTest extends TestCase {


    @Test
    public void testa_Insercao_No_Comeco(){
        ListaLigada2 lista = new ListaLigada2();

        lista.adicionaNoComeco("Maurício");
        lista.adicionaNoComeco("Paulo");
        lista.adicionaNoComeco("Guilherme");

        String retorno = "[Guilherme, Paulo, Maurício, ]";

        assertEquals( retorno, lista.toString() );
    }

    @Test
    public void testa_Insercao_No_Final(){
        ListaLigada lista = new ListaLigada();

        lista.adicionaNoFim("Maurício");
        lista.adicionaNoFim("Paulo");
        lista.adicionaNoFim("Guilherme");

        String retorno = "[Maurício, Paulo, Guilherme, ]";

        assertEquals( retorno, lista.toString() );
    }

    @Test
    public void testa_Insercao_Na_Posicao_Escolhida(){
        ListaLigada lista = new ListaLigada();

        lista.adicionaNoComeco("Maurício");
        lista.adicionaNoComeco("Paulo");
        lista.adiciona(1,"Guilherme");

        String retorno = "[Paulo, Guilherme, Maurício, ]";
        String list = lista.toString();

        assertEquals( retorno, list  );
    }

}