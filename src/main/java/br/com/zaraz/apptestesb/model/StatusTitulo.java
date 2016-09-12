package br.com.zaraz.apptestesb.model;

public enum StatusTitulo {
	
	
	PENDENTE("Pendente"),
	RECEBIDO("REcebido");
	
	private String descricao;
	
	private StatusTitulo(String descricao) {
		this.descricao = descricao;
	}
	
	public String getDescricao(){
		return this.descricao; 
	}
	
	

}
