package br.com.alura.rh.model;

public enum Cargo {

	ANALISTA{
		@Override
		public Cargo getProximo(){
			return Cargo.ASSISTENTE;
		}
	},
	ASSISTENTE{
		@Override
		public Cargo getProximo(){
			return Cargo.ESPECIALISTA;
		}
	},
	ESPECIALISTA{
		@Override
		public Cargo getProximo(){
			return Cargo.GERENTE;
		}
	},
	GERENTE{
		@Override
		public Cargo getProximo(){
			return Cargo.GERENTE;
		}
	};

	public abstract Cargo getProximo();

	;
}
