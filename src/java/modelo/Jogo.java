/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;


import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 *
 * @author Victor
 */

//dizendo que a classe vai pro banco de dados
@Entity 
//dizendo que a tabela será jogos
@Table(name="jogos")
public class Jogo implements Serializable {
    
    @Id
    @GeneratedValue
    private int id;
    private String nome;
    private String genero;
    private int faixaEtaria;
    private double preco;
    private String descricao;

   
    public Jogo(int id, String nome, String genero, int faixaEtaria, double preco, String descricao) {
        this.id = id;
        this.nome = nome;
        this.genero = genero;
        this.faixaEtaria = faixaEtaria;
        this.preco = preco;
        this.descricao = descricao;
    }

    public Jogo() {
        
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getFaixaEtaria() {
        return faixaEtaria;
    }

    public void setFaixaEtaria(int faixaEtaria) {
        this.faixaEtaria = faixaEtaria;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    
    
}
