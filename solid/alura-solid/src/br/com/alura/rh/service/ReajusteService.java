package br.com.alura.rh.service;

import br.com.alura.rh.interfaces.ValidacaoReajuste;
import br.com.alura.rh.model.Funcionario;

import java.math.BigDecimal;
import java.util.List;

public class ReajusteService {

    private List<ValidacaoReajuste> validacaoReajusteList;

    public ReajusteService(List<ValidacaoReajuste> validacaoReajusteList) {
        this.validacaoReajusteList = validacaoReajusteList;
    }

    public void reajustarSalario(Funcionario funcionario, BigDecimal aumento){
        validacaoReajusteList.forEach(v -> v.validar(funcionario, aumento));

        BigDecimal salarioReajustado = funcionario.getSalario().add(aumento);
        funcionario.atualizaSalario(salarioReajustado);
    }
}
