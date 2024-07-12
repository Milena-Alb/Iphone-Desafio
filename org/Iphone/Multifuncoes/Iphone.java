package org.Iphone.Multifuncoes;

import org.Iphone.Internet.NavergadorInternet;
import org.Iphone.Musical.ReprodutorMusical;
import org.Iphone.Telefone.AparelhoTelefonico;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavergadorInternet {
    public void tocarMusuca(){
        System.out.println("Tocando musica no Iphone");
    }
    public void selecionarMusica(){
        System.out.println("Musica selecionada no Iphone");
    }
    public void pausarMusica(){
        System.out.println("Musica pausada no Iphone");
    }
    public void ligar(){
        System.out.println("Chamando... no Iphone");
    }
    public void atender(){
        System.out.println("Alo, Iphone!!");
    }
    public void iniciarCorreioDeVoz(){
        System.out.println("Iniciando correio de voz do Iphone");
    }
    public void exibirPagina(){
        System.out.println("Exibindo pagina web no Iphone");
    }
    public void adicionarNovaAba(){
        System.out.println("Nova pagina adicionada no Iphone");
    }
    public void atualizarPagina(){
        System.out.println("Pagina atualizada com sucesso no Iphone");
    }
}
