package com.iphone.iphone;

import com.iphone.interfaces.AparelhoTelefonico;
import com.iphone.interfaces.NavegadorInternet;
import com.iphone.interfaces.ReprodutorMusical;

public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    private String modelo;
    private String sistemaOperacional;
    private int memoria;

    // Construtor
    public iPhone(String modelo, String sistemaOperacional, int memoria) {
        this.modelo = modelo;
        this.sistemaOperacional = sistemaOperacional;
        this.memoria = memoria;
    }

    // Métodos de ReprodutorMusical
    @Override
    public void tocarMusica() {
        System.out.println("Tocando música no " + modelo);
    }

    @Override
    public void pausarMusica() {
        System.out.println("Música pausada no " + modelo);
    }

    // Métodos de AparelhoTelefonico
    @Override
    public void fazerChamada() {
        System.out.println("Fazendo uma chamada no " + modelo);
    }

    @Override
    public void receberChamada() {
        System.out.println("Recebendo uma chamada no " + modelo);
    }

    // Métodos de NavegadorInternet
    @Override
    public void abrirPagina(String url) {
        System.out.println("Abrindo a página: " + url + " no navegador do " + modelo);
    }

    @Override
    public void fecharPagina() {
        System.out.println("Fechando a página no navegador do " + modelo);
    }
}
