/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade06.view;

/**
 *
 * @author Arkins
 */
public class PerfilUsuario {
    private Long id;
    private String descricao;
    private String permissoes;

    
    public PerfilUsuario(Long id, String descricao, String permissoes){
    
        this.id = id;
        this.descricao = descricao;
        this.permissoes = permissoes;
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getPermissoes() {
        return permissoes;
    }

    public void setPermissoes(String permissoes) {
        this.permissoes = permissoes;
    }
    
    @Override
    public String toString(){
        
    return "\n" + id + descricao  + permissoes;
    }
    
}
