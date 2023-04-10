package org.example;

import org.example.model.BlueCristal;
import org.example.model.Planet;
import org.example.model.RedCristal;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    final static ExecutorService threadPool = Executors.newFixedThreadPool(1);

    public static void main(String[] args) throws InterruptedException {

        var redCristal = new RedCristal();
        var blueCristal = new BlueCristal();

        var planet = new Planet(redCristal, blueCristal);

        while (true) {
            threadPool.submit(planet);
            Thread.sleep(5000L);
        }

    }

}