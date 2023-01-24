package org.example;

public enum CorSemaforoEnum {

    VERMELHO(5000),
    AMARELO(2000),
    VERDE(3500);

    private int tempo;

    CorSemaforoEnum(int tempo) {
        this.tempo = tempo;
    }

    public int getTempo() {
        return tempo;
    }
}

