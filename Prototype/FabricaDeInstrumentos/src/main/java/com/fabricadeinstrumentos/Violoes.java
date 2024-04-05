/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fabricadeinstrumentos;

/**
 *
 * @author 55649
 */
public class Violoes implements Cloneable {
    private String modelo;
    private String breve_descricao;

    public Violoes(String modelo, String breve_descricao) {
        this.modelo = modelo;
        this.breve_descricao = breve_descricao;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getBreve_descricao() {
        return breve_descricao;
    }

    public void setBreve_descricao(String breve_descricao) {
        this.breve_descricao = breve_descricao;
    }
    
    @Override
    protected Violoes clone(){
        try {
            return (Violoes) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
    
}
