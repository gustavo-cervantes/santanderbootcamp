package edu.gustavo.escola;

public class Aluno {
	private String nome;
	private int idade;
	
    @SuppressWarnings("unused")
	private String sexo;
    
	public String getNome() {
		return nome;
	}
	public void setNome(String newNome) {
		nome = newNome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int newIdade) {
		this.idade = newIdade;
	}
}
