package org.example;

public class Semafaro {

    private CorSemaforoEnum corAtual;
    private Semafaro corProxima;

    public CorSemaforoEnum getCorAtual() {
        return corAtual;
    }

    public void setCorAtual(CorSemaforoEnum corAtual) {
        this.corAtual = corAtual;
    }

    public Semafaro getCorProxima() {
        return corProxima;
    }

    public void setCorProxima(Semafaro corProxima) {
        this.corProxima = corProxima;
    }

    public void executar() throws InterruptedException {
        System.out.println(corAtual.name());
        Thread.sleep(corAtual.getTempo());
        corProxima.executar();
    }
}
