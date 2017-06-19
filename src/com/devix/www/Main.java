package com.devix.www;

public class Main {

    public static void main(String[] args) {
	Gato gato = new Gato();
	hablando(gato);
    }

    private static void hablando(Animal gato) {
        gato.habla();
    }
}
