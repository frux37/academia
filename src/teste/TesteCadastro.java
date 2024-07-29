/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teste;

import modelo.AvaliacaoFisica;
import modelo.Aluno;
import modelo.Professor;

/**
 *
 * @author CHARLES
 */
public class TesteCadastro {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Charlinho", 12345);
        a1.setNome("Charlinho Batata");
        a1.setCPF("030.540.123-31");
        //a1.setDataNascimento("05/09/2001");
        
        Aluno a2 = new Aluno("Carlos", 123456);
        a2.setNome("Carlos Augusto Segala Aguirre");
        a2.setCPF("030.549.710.31");
        
        Professor prof1 = new Professor("Dr. thunder cock", 150.00);
        Professor prof2 = new Professor("Dr. Neaderthal", 200.00);
        Professor prof3 = new Professor ("Dr. Manhattan", 300.00);
        
        AvaliacaoFisica af1 = new AvaliacaoFisica(a1, prof1);
        af1.setPeso(70);
        af1.setAltura(1.75);
        af1.setPercGordura(15.5);

        AvaliacaoFisica af2 = new AvaliacaoFisica(a1, prof2);
        af2.setPeso(80);
        af2.setAltura(1.75);
        af2.setPercGordura(20.0);
        
        AvaliacaoFisica af3 = new AvaliacaoFisica(a2, prof3);
        af3.setPeso(90);
        af3.setAltura(1.90);
        af3.setPercGordura(23.0);
        
        AvaliacaoFisica af4 = new AvaliacaoFisica(a2, prof2);
        af4.setPeso(100.00);
        af4.setAltura(1.93);
        af4.setPercGordura(25.0);
        
        a1.addAvaliacaoFisica(af1);
        a1.addAvaliacaoFisica(af2);
        a2.addAvaliacaoFisica(af3);
        a2.addAvaliacaoFisica(af4);
        
        System.out.println(a1.mostraInfo());
        System.out.println(a2.mostraInfo());
        
        //System.out.println("\nAvaliacoes Fisicas");
        //System.out.println(af1.mostraAvaliacao());
        //System.out.println(af2.mostraAvaliacao());
        //System.out.println(af3.mostraAvaliacao());
        
    }
    
}
