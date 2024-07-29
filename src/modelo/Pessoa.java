/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.Date;

/**
 *
 * @author CHARLES
 */
//classe "Pessoa" foi tornada abstrada, sendo assim, impede que seja instanciada diretamente.
public abstract class Pessoa {
    protected String nome;
    protected Date dataNascimento;
    private String CPF;
    
    public Pessoa(String nome) {
        this.nome = nome;
    }
    
    public String getNome() {
        return nome;
    }
    public String getCPF() {
        return CPF;
    }
    public Date getDataNascimento() {
        return dataNascimento;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setCPF(String CPF) {
        this.CPF = CPF;
    }
    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    
    public String mostraInfo() {
        
        String texto = "Nome: " +nome;
        texto += "\nData Nascimento: " +dataNascimento;
        texto += "\nCPF: " +CPF;
        
        return texto;
    }
    
    @Override
    public String toString() {
        
        String texto = nome;
        if (CPF != null) {
            texto += "\nCPF: " + getCPF();
        }
        return texto;
    }
}
