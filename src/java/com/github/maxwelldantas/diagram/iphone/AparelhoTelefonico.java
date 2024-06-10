package com.github.maxwelldantas.diagram.iphone;

public class AparelhoTelefonico implements Dispositivo {
    @Override
    public void ligar(Long numero) {
        System.out.println("Ligando para " + numero);
    }

    @Override
    public void desligar() {
        System.out.println("Chamada encerrada.");
    }

    public void atenderChamada() {
        System.out.println("Chamada atendida.");
    }
}
