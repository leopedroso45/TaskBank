/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancodetarefas;

/**
 *
 * @author leope
 */
public class Tarefa {

    private String nome;
    private String descricao;
    private String genero;
    private String caminho;

    public Tarefa(String nome, String descricao, String genero, String caminho) {
        this.nome = nome;
        this.descricao = descricao;
        this.genero = genero;
        this.caminho = caminho;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCaminho() {
        return caminho;
    }

    public void setCaminho(String caminho) {
        this.caminho = caminho;
    }

    @Override
    public String toString() {
        return this.nome + "\r\n" + this.descricao + "\r\n" + this.genero + "\r\n" + this.caminho + "\r\n";
    }

}
