/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.fabricadeinstrumentos;

/**
 *
 * @author 55649
 */
public class FabricaDeInstrumentos {

    public static void main(String[] args) {
        Violoes violao = new Violoes("Universal", "6 cordas - (feitas de nylon)");
        System.out.println("Modelo do violão: " + violao.getModelo());
        System.out.println("Descrição do violão: " + violao.getBreve_descricao());
        System.out.println(violao.hashCode());
        System.out.println("\n");
        
        Violoes violao1 = violao.clone();
        violao1.setModelo("Clássico");
        System.out.println("Modelo do violão: " + violao1.getModelo());
        System.out.println("Descrição do violão: " + violao1.getBreve_descricao());
        System.out.println(violao1.hashCode());
        System.out.println("\n");
        
        Violoes violao2 = violao1.clone();
        violao2.setModelo("Folk");
        violao2.setBreve_descricao("Tem o corpo maior e mais “acinturado”");
        System.out.println("Modelo do violão: " + violao2.getModelo());
        System.out.println("Descrição do violão: " + violao2.getBreve_descricao());
        System.out.println(violao2.hashCode());
        System.out.println("\n");

        
        Violoes violao3 = violao2.clone();
        violao3.setModelo("Flet");
        violao3.setBreve_descricao("Sua caixa acústica é bastante fina!");
        System.out.println("Modelo do violão: " + violao3.getModelo());
        System.out.println("Descrição do violão: " + violao3.getBreve_descricao());
        System.out.println(violao3.hashCode());
        System.out.println("\n");
        
        
        Violoes violao4 = violao3.clone();
        violao4.setModelo("Jumbo");
        violao4.setBreve_descricao("Tem o seu corpo mais largo e na base mais arredondada");
        System.out.println("Modelo do violão: " + violao4.getModelo());
        System.out.println("Descrição do violão: " + violao4.getBreve_descricao());
        System.out.println(violao4.hashCode());
        System.out.println("\n");
        
        
        Violoes violao5 = violao4.clone();
        violao5.setModelo("7 cordas");
        violao5.setBreve_descricao("Violão brasileiro");
        System.out.println("Modelo do violão: " + violao5.getModelo());
        System.out.println("Descrição do violão: " + violao5.getBreve_descricao());
        System.out.println(violao5.hashCode());
        System.out.println("\n");
        
        Violoes violao6 = violao5.clone();
        violao6.setModelo("12 cordas");
        violao6.setBreve_descricao("Traz o dobro de cordas do que o clássico");
        System.out.println("Modelo do violão: " + violao6.getModelo());
        System.out.println("Descrição do violão: " + violao6.getBreve_descricao());
        System.out.println(violao6.hashCode());
        System.out.println("\n");
        
        Violoes violao7 = violao6.clone();
        violao7.setModelo("12 cordas");
        violao7.setBreve_descricao("Traz o dobro de cordas do que o clássico");
        System.out.println("Modelo do violão: " + violao7.getModelo());
        System.out.println("Descrição do violão: " + violao7.getBreve_descricao());
        System.out.println(violao7.hashCode());
        System.out.println("\n");
        
        Violoes violao8 = violao7.clone();
        violao8.setModelo("Violão zero");
        violao8.setBreve_descricao("É o menor");
        System.out.println("Modelo do violão: " + violao8.getModelo());
        System.out.println("Descrição do violão: " + violao8.getBreve_descricao());
        System.out.println(violao8.hashCode());
        System.out.println("\n");
        
        Violoes violao9 = violao8.clone();
        violao9.setModelo("Violão Duplo zero");
        violao9.setBreve_descricao("Apresenta uma boa sonoridade e é indicado para técnicas de fingerstyle");
        System.out.println("Modelo do violão: " + violao9.getModelo());
        System.out.println("Descrição do violão: " + violao9.getBreve_descricao());
        System.out.println(violao9.hashCode());
        System.out.println("\n");
        
        Violoes violao10 = violao9.clone();
        violao10.setModelo("Violão Triplo zero");
        violao10.setBreve_descricao("Possui tamanho intermediário e gera um timbre mais peculiar");
        System.out.println("Modelo do violão: " + violao10.getModelo());
        System.out.println("Descrição do violão: " + violao10.getBreve_descricao());
        System.out.println(violao10.hashCode());
        
         
        
        
    }
}











































