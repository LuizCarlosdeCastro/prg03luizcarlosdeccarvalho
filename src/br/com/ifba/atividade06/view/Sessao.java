/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade06.view;

import java.util.UUID;
/**
 *
 * @author Arkins
 */
public class Sessao {
    private Long id;
    private Usuario usuario;
    private String token;

    
    public Sessao(Usuario usuario){
    
        this.id = usuario.getId();
        this.usuario = usuario;
        this.token = UUID.randomUUID().toString().toUpperCase();
    
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
    
    @Override
    public String toString(){
        
    return "\n" + id + usuario   + "sessao = "+ token;
    }
}
