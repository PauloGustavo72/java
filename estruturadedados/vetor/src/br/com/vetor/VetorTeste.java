package br.com.vetor;

public class VetorTeste {

    public static void main(String[] args) {
        Aluno joao = new Aluno("Joao");
        Aluno jose = new Aluno("José");
        Aluno pedro = new Aluno("Pedro");

        Vetor lista = new Vetor();

        System.out.println(lista.tamanho());
        lista.adiciona(joao);
        System.out.println(lista.tamanho());
        lista.adiciona(jose);
        System.out.println(lista.tamanho());
        lista.adiciona(pedro);
        System.out.println(lista.tamanho());

        System.out.println(lista);

        Aluno danilo = new Aluno("Danilo");
        System.out.println(lista.contem(danilo));

        lista.remove(0);

        System.out.println(lista);
//        Aluno pega = lista.pega(158);
//        System.out.println(pega);
    }
}
