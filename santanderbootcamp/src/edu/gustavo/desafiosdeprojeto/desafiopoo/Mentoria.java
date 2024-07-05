package edu.gustavo.desafiosdeprojeto.desafiopoo;

import java.time.LocalDate;

public class Mentoria {
    private String titulo;
    private String descricao;
    private int cargaHoraria;


    public Mentoria() {
    }

    
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
    public int getCargaHoraria() {
        return cargaHoraria;
    }
    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
    @Override
    public String toString() {
        return "Curso [titulo=" + titulo + ", descricao=" + descricao + ", cargaHoraria=" + cargaHoraria + "]";
    }


    public void setData(LocalDate now) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setData'");
    }

}
