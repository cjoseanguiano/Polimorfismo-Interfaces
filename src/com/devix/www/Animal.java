package com.devix.www;

/**
 * Created by carlosjoseanguiano on 19/06/17.
 */
public abstract class Animal implements Habla {
    public abstract void habla();

}

class Perro extends Animal {


    @Override
    public void habla() {
        System.out.println("¡Guau!");

    }
}

class Gato extends Animal {

    @Override
    public void habla() {
        System.out.println("¡Miau!");

    }
}


