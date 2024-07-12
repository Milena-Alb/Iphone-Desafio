package org.Iphone.Telefone;

public class Telefone implements AparelhoTelefonico{
    public void ligar(){
        System.out.println("Chamando... pelo telefone");
    }
    public void atender(){
        System.out.println("Alo, telefone!!");
    }
    public void iniciarCorreioDeVoz(){
        System.out.println("Iniciando correio de voz pelo telefone");
    }
}
