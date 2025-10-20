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
public class Mainn {
     public static void main(String[] args) {
        //crio os tipos de perfil e mostro eles
        PerfilUsuario admin = new PerfilUsuario(1L," Perfil Administrador ", " Permissao Total ");
        PerfilUsuario guest = new PerfilUsuario(2L, " Perfil Convidado", " Somente Leitura ");
        
        System.out.println("\n Tipos de Perfis");
        System.out.println(admin);
        System.out.println(guest);
        
        //crio dois usuarios um para administrador e um para visitante, e mostro os dois
        Usuario usuario1 = new Usuario(admin, "luiz.admin ", " luiz@ifba.edu.br ", "senha");
        usuario1.setId((long)((Math.random() * 2000)+ 1));
        usuario1.setAtivo(true);
        
        Usuario usuario2 = new Usuario(guest, "bruno.guest ", " bruno@ifba.edu.br ", "senha");
        usuario2.setId((long)((Math.random() * 2000)+ 1));
        usuario2.setAtivo(true);
        
        System.out.println("\n Perfis Criados");
        System.out.println(usuario1);
        System.out.println(usuario2);
        
        //crio sessoes para os dois usuarios e mostro elas
        Sessao sessao1 = new Sessao(usuario1);
        usuario1.setUltimoLogin(LocalDateTime.now());
        
        Sessao sessao2 = new Sessao(usuario2);
        usuario2.setUltimoLogin(LocalDateTime.now());
        
        System.out.println("\n Sessões");
        System.out.println(sessao1);
        System.out.println(sessao2);
        
        //crio um log com as informações de horario data de login e ip (fiquei com preguiça de pegar o ip utilizando o metodo 
        LogAuditoria logAcesso = new LogAuditoria(usuario1," Login efetuado com sucesso ", "IP");
        LogAuditoria logCriacao = new LogAuditoria(usuario1, "Criação de perfil", "IP");
        LogAuditoria logAcessog = new LogAuditoria(usuario2," Login efetuado com sucesso ", "IP");
        LogAuditoria logCriacaog = new LogAuditoria(usuario2, "Criação de perfil", "IP");
        
        System.out.println("\n Logs");
        System.out.println(logAcesso);
        System.out.println(logCriacao);
        System.out.println(logAcessog);
        System.out.println(logCriacaog);
        
       
    }
}

