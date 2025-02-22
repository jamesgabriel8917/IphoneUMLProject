package com.iphone;

import com.iphone.iphone.iPhone;

public class Main {
    public static void main(String[] args) {
        iPhone meuIphone = new iPhone("iPhone X", "iOS", 64);

        // Testando o reprodutor musical
        meuIphone.tocarMusica();
        meuIphone.pausarMusica();

        // Testando o aparelho telefônico
        meuIphone.fazerChamada();
        meuIphone.receberChamada();

        // Testando o navegador
        meuIphone.abrirPagina("www.apple.com");
        meuIphone.fecharPagina();
    }
}
