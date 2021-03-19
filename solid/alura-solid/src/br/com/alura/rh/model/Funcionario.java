package br.com.alura.rh.model;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;

import br.com.alura.rh.ValidacaoException;

public class Funcionario {

	private DadosPessoais dadosPessoais;
	private BigDecimal salario;
	private Cargo cargo;
	private LocalDate dataUltimoReajuste;

	public Funcionario(DadosPessoais dadosPessoais, BigDecimal salario) {
		this.dadosPessoais = dadosPessoais;
		this.salario = salario;
	}

	public void atualizaSalario(BigDecimal novoSalario) {
		this.salario = novoSalario;
		dataUltimoReajuste = LocalDate.now();
	}

	public BigDecimal getSalario() {
		return salario;
	}

	public void setSalario(BigDecimal salario) {
		this.salario = salario;
	}

	public LocalDate getDataUltimoReajuste() {
		return dataUltimoReajuste;
	}

	public void setDataUltimoReajuste(LocalDate dataUltimoReajuste) {
		this.dataUltimoReajuste = dataUltimoReajuste;
	}

	public DadosPessoais getDadosPessoais() {
		return dadosPessoais;
	}

	public void setDadosPessoais(DadosPessoais dadosPessoais) {
		this.dadosPessoais = dadosPessoais;
	}

	public Cargo getCargo() {
		return cargo;
	}

	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}

	public void promover(Cargo novoCargo) {
		this.cargo = novoCargo;
	}
}
