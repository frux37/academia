/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author CHARLES
 */
public class AvaliacaoFisica {
    
    private Date data;
    private double peso;
    private double altura;
    private double percGordura;
    private Aluno aluno;
    private Professor professor;
    private SimpleDateFormat mascaraData = new SimpleDateFormat("dd/MM/yyy HH:mm");
    
    public AvaliacaoFisica(Aluno aluno, Professor professor) {
        this.data = new Date();
        this.aluno = aluno;
        this.professor = professor;
    }
    
    public double getPeso() {
        return peso;
    }
    public double getAltura() {
       return altura;
    }
    public Date getData() {
        return data;
    }
    public double getPercGordura() {
        return percGordura;
    }
    public Pessoa getAluno() {
        return aluno;
    }
    public Pessoa getProfessor() {
        return professor;
    }
    
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public void setPercGordura(double percGordura) {
        this.percGordura = percGordura;
    }
    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }
    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
    public double calculaIMC() {
        return peso / (altura * altura);
    }
    
    public String mostraAvaliacao() {
        
        DecimalFormat formatoNum = new DecimalFormat("0.0#");
        
        String texto = "\nData Avaliacao: " + mascaraData.format(data);
        texto += "\nAluno: " +aluno;
        texto += "\nAvaliador: " +professor;
        texto += "\nPeso: " + ((peso != 0) ? formatoNum.format(peso) : "Sem info");
        texto += "\nAltura: " + ((altura != 0) ? formatoNum.format(altura) : "Sem info");
        texto += "\n% Gordura: " + ((percGordura != 0) ? formatoNum.format(percGordura) : "Sem info");

        if (peso != 0 && altura != 0) {
            texto += "\nIMC: " + formatoNum.format(calculaIMC());
        }

        return texto;
    }
    
    //@Override public String toString() {
    //    return mascaraData.format(data) + " -> " +calculaIMC();
    //}
    
    @Override
    public String toString() {
        DecimalFormat formatoNum = new DecimalFormat("0.0#");
        return "Data Avaliacao: " + mascaraData.format(data) + 
               ", IMC: " + formatoNum.format(calculaIMC()) + 
               ", Percentual de Gordura: " + formatoNum.format(percGordura) + "%" +
               ", Avaliador: " + professor.getNome();
    }
}
