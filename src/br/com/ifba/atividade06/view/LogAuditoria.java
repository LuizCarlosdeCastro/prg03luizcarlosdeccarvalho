/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade06.view;

import java.time.LocalDateTime;

/**
 *
 * @author Arkins
 */
public class LogAuditoria {
    private Long id;
    private Usuario usuario;
    private String acao;
    private LocalDateTime dataHora;
    private String ip;

    
    public LogAuditoria(Usuario usuario, String acao, String ip){
    
       this.id = usuario.getId();
       this.usuario = usuario;
       this.acao = acao;
       this.ip = ip;
       this.dataHora = LocalDateTime.now();
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

    public String getAcao() {
        return acao;
    }

    public void setAcao(String acao) {
        this.acao = acao;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }
    
    
    @Override
    public String toString(){
        
    return "LogAuditoria" + "\n id = " +id+ "\n usuario = " + usuario.getNomeUsuario() + "\n acao = " + acao + "\n data e hora da sessao = " + dataHora.toString().substring(0,19)+ "\n ip = " + ip;
    }
    
}
