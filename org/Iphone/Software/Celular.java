package org.Iphone.Software;

import org.Iphone.Internet.Chrome;
import org.Iphone.Internet.NavergadorInternet;
import org.Iphone.Multifuncoes.Iphone;
import org.Iphone.Musical.ReprodutorMusical;
import org.Iphone.Musical.Spotify;
import org.Iphone.Telefone.AparelhoTelefonico;
import org.Iphone.Telefone.Telefone;

public class Celular {
    public static void main(String[] args) {
        ReprodutorMusical reprodutorMusicalApp = new Spotify();
        reprodutorMusicalApp.selecionarMusica();
        reprodutorMusicalApp.tocarMusuca();
        reprodutorMusicalApp.pausarMusica();

        AparelhoTelefonico aparelhoTelefonicoTel = new Telefone();
        aparelhoTelefonicoTel.ligar();
        aparelhoTelefonicoTel.atender();
        aparelhoTelefonicoTel.iniciarCorreioDeVoz();

        NavergadorInternet navergadorInternetChrome = new Chrome();
        navergadorInternetChrome.exibirPagina();
        navergadorInternetChrome.adicionarNovaAba();
        navergadorInternetChrome.atualizarPagina();

        ReprodutorMusical reprodutorMusical = new Iphone();
        reprodutorMusical.selecionarMusica();
        reprodutorMusical.tocarMusuca();
        reprodutorMusical.pausarMusica();

        AparelhoTelefonico aparelhoTelefonico = new Iphone();
        aparelhoTelefonico.ligar();
        aparelhoTelefonico.atender();
        aparelhoTelefonico.iniciarCorreioDeVoz();

        NavergadorInternet navergadorInternet = new Iphone();
        navergadorInternet.exibirPagina();
        navergadorInternet.adicionarNovaAba();
        navergadorInternet.atualizarPagina();

    }

}
