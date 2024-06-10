package com.github.maxwelldantas.diagram.iphone;

public class AplicativoMultifuncional {

    private ReprodutorMusical reprodutorMusical;
    private AparelhoTelefonico aparelhoTelefonico;
    private NavegadorInternet navegadorInternet;

    public AplicativoMultifuncional() {
        reprodutorMusical = new ReprodutorMusical();
        aparelhoTelefonico = new AparelhoTelefonico();
        navegadorInternet = new NavegadorInternet();
    }

    public void tocarMusica(String musica) {
        reprodutorMusical.tocarMusica(musica);
    }

    public void ligarPara(Long numero) {
        aparelhoTelefonico.ligar(numero);
    }

    public void atenderChamada() {
        aparelhoTelefonico.atenderChamada();
    }

    public void abrirPagina(String url) {
        navegadorInternet.abrirPagina(url);
    }

    public void criarNovaAba() {
        navegadorInternet.criarNovaAba();
    }

    public void recarregarPagina() {
        navegadorInternet.recarregarPagina();
    }
}
