package view;

import controller.Carro;

import java.util.concurrent.Semaphore;

public class Cruzamento {
    public static void main(String[] args) {
        Semaphore semaforo = new Semaphore(1);

        Carro carro1 = new Carro("Norte -> Sul", semaforo);
        Carro carro2 = new Carro("Sul -> Norte", semaforo);
        Carro carro3 = new Carro("Leste -> Oeste", semaforo);
        Carro carro4 = new Carro("Oeste -> Leste", semaforo);

        carro1.start();
        carro2.start();
        carro3.start();
        carro4.start();
    }
}
