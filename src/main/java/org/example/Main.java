package org.example;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Semafaro semafaroVermelho = new Semafaro();
        semafaroVermelho.setCorAtual(CorSemaforoEnum.VERMELHO);

        Semafaro semafaroVerde = new Semafaro();
        semafaroVerde.setCorAtual(CorSemaforoEnum.VERDE);
        semafaroVerde.setCorProxima(semafaroVermelho);

        Semafaro semafaroAmarelo = new Semafaro();
        semafaroAmarelo.setCorAtual(CorSemaforoEnum.AMARELO);
        semafaroAmarelo.setCorProxima(semafaroVerde);

        semafaroVermelho.setCorProxima(semafaroAmarelo);

        semafaroVermelho.executar();

    }
}
