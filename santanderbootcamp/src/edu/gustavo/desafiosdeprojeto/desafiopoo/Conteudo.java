package edu.gustavo.desafiosdeprojeto.desafiopoo;


/* classe abstrata pois ñ consigo instanciar/criar conteudo,
 foi criada para implementar atributos e metodo calcularxp nas classes filhas afim 
 de evitar repetição de código. */


public abstract class Conteudo {
    
    protected static final double XP_PADRAO = 10d;


    private String titulo;
    private String descricao;
    
    public abstract double calcularXP();

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
