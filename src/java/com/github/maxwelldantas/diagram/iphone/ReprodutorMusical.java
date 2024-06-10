package com.github.maxwelldantas.diagram.iphone;

public class ReprodutorMusical implements Dispositivo {
    @Override
    public void ligar(Long numero) {
        System.out.println("Reproduzindo música...");
    }

    @Override
    public void desligar() {
        System.out.println("Música pausada.");
    }

    public void tocarMusica(String musica) {
        System.out.println("Tocando música: " + musica);
    }
}
