package org.heranca.polimorfismo;

	public class Animal{
	
		private String nome;
		private String idade;
		private String som;
		private String correr;
		public String getNome(){
		return nome;
		}
		
	public void setNome(String nome){
		this.nome = nome;
	}
	
	public String getIdade(){
		return idade;
	}
	
	public void setIdade(String idade){
		this.idade = idade;
	}
	
	public String getSom(){
		return som;
	}
	
	public void Som(){
		System.out.println();
	}
	
	public void correr(){
		System.out.println("Correndo...");
	}
	
	public void subir(){
		System.out.println("Subindo...");
	}

}
