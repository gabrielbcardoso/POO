/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cervejaria;

/**
 *
 * @author Gabriel
 */
public class Pessoa {
    String nome;
    int idade;
    String localidade;
    String cor;
    String estadoCivil;
    int codigo;
    
    
    static int codigoUltimaPessoa = 0;
    
    
    public Pessoa(){    
    }
    
    public Pessoa (int codigo, String nome, int idade, String localidade, String cor, String estadoCivil){
        this.codigo = codigo;
        this.nome = nome;
        this.idade = idade;
        this.localidade = localidade;
        this.cor = cor;
        this.estadoCivil = estadoCivil;  
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getLocalidade() {
        return localidade;
    }

    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public static int getCodigoUltimaPessoa() {
        return codigoUltimaPessoa;
    }

    public static void setCodigoUltimaPessoa(int codigoUltimaPessoa) {
        Pessoa.codigoUltimaPessoa = codigoUltimaPessoa;
    }
    @Override
    public String toString(){
        return "Ola meu nome e:"+this.getNome()+".\n"
        + "Tenho "+this.getIdade()+"anos.\n"
        + "Vivo em:"+this.getLocalidade()+".\n"
        + "Meu Estado civil é"+this.getEstadoCivil()+".\n"
        + "Minha cor favorita é :"+this.getCor();    
    }    
    
}
