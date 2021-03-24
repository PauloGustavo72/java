package br.com.vetor;

import java.util.Arrays;

public class Vetor {

    private Aluno[] alunos = new Aluno[100];
    private int totalDeAlunos = 0;

    public void adiciona(Aluno aluno){
        this.garanteEspaco();
        this.alunos[totalDeAlunos] = aluno;
        totalDeAlunos++;
    }

    public void adiciona(int posicao, Aluno aluno) {
        this.garanteEspaco();
        boolean posicaoValida = posicao >= 0 && posicao <= totalDeAlunos;

        if(!posicaoValida){
            throw new IllegalArgumentException("Posição invalida");
        }

        for(int i = totalDeAlunos - 1;  i >= posicao; i--){
            alunos[i + 1] = alunos[i];
        }

        alunos[posicao] = aluno;
        totalDeAlunos++;
    }

    public Aluno pega(int posicao){
        boolean posicaoOcupada = posicao >= 0 && posicao < totalDeAlunos;

        if(!posicaoOcupada){
            throw new IllegalArgumentException("Posição invalida");
        }

        return this.alunos[posicao];
    }

    public void remove(int posicao){
        boolean posicaoValida = posicao >= 0 && posicao <= totalDeAlunos;
        if(!posicaoValida){
            throw new IllegalArgumentException("Posição Inválida");
        }

        for(int i = posicao; i < totalDeAlunos; i++){
            alunos[i] = alunos[i + 1];
        }

        totalDeAlunos--;
    }

    public boolean contem(Aluno aluno){
        for(int i = 0; i < totalDeAlunos; i++){
            if(aluno.equals( this.alunos[i] )){
                return true;
            }
        }
        return false;
    }

    public int tamanho(){
        return totalDeAlunos;
    }

    private void garanteEspaco(){
        if(totalDeAlunos == alunos.length){
            Aluno[] novoArray = new Aluno[alunos.length*2];
            for(int i = 0; i < alunos.length; i++ ){
                novoArray[i] = alunos[i];
            }
            this.alunos = novoArray;
        }
    }
    public String toString(){
        return Arrays.toString(alunos);
    }
}
