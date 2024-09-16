package controller;

import java.util.concurrent.Semaphore;

public class Carro extends Thread {
    private final String direcao;
    private final Semaphore semaforo;

    public Carro(String direcao, Semaphore semaforo) {
        this.direcao = direcao;
        this.semaforo = semaforo;
    }

    @Override
    public void run() {
        try {
            semaforo.acquire();
            System.out.println("Carro " + threadId() + " está passando no sentido: " + direcao);
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            semaforo.release();
        }
    }
}
