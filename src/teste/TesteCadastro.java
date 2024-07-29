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
        
        Professor prof1 = new Professor("Dr. Pauno Cuzy", 150.00);
        Professor prof2 = new Professor("Dr. Neaderthal", 200.00);
        
        AvaliacaoFisica af1 = new AvaliacaoFisica(a1, prof1);
        af1.setPeso(70);
        af1.setAltura(1.75);
        af1.setPercGordura(15.5);

        AvaliacaoFisica af2 = new AvaliacaoFisica(a1, prof2);
        af2.setPeso(80);
        af2.setAltura(1.75);
        af2.setPercGordura(20.0);
        
        a1.addAvaliacaoFisica(af1);
        a1.addAvaliacaoFisica(af2);
        
        System.out.println(a1.mostraInfo());
        
        //System.out.println("\nAvaliacoes Fisicas");
        //System.out.println(af1.mostraAvaliacao());
        //System.out.println(af2.mostraAvaliacao());
        
    }
    
}
