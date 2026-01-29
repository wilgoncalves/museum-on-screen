package com.williangoncalves.museumonscreen.model;

public class Principal {

    private String titulo;
    private int imagem;
    private String conteudo;

    public Principal() {

    }

    public Principal(int imagem, String titulo, String conteudo) {
        this.imagem = imagem;
        this.titulo = titulo;
        this.conteudo = conteudo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getImagem() {
        return imagem;
    }

    public void setImagem(int imagem) {
        this.imagem = imagem;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }
}
