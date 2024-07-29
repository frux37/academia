/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.Date;
import java.text.SimpleDateFormat;
/**
 *
 * @author CHARLES
 */
public class Professor extends Pessoa {
    
    //esse "final" garante que a data de admissão não possa ser alterada após a criação do objeto
    private final Date dataAdmissao;
    private double salarioHora;
    
    public Professor(String nome, double salarioHora) {
        super(nome);
        this.dataAdmissao = new Date(); //data atual do sistema
        this.salarioHora = salarioHora;
    }
    
    public Date getDataAdmissao() {
        return dataAdmissao;
    }
    
    public double getSalarioHora() {
        return salarioHora;
    }
    
    public void setSalarioHora(double salarioHora) {
        this.salarioHora = salarioHora;
    }
    
    /*@Override
    public String mostraInfo() {
        SimpleDateFormat mascaraData = new SimpleDateFormat("dd/MM/yyyy");
        return super.mostraInfo() + 
               "\nData Admissao: " + mascaraData.format(dataAdmissao) +
               "\nSalario por Hora: " + salarioHora;
    }*/
    
    @Override
    public String toString() {
        return getNome();
    }
}
