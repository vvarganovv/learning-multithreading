package org.example.model;

import java.util.concurrent.atomic.AtomicInteger;

public abstract class Magician implements Runnable {

    private static final AtomicInteger total = new AtomicInteger(0);

    private final Planet planet;

    public Magician(Planet planet) {
        this.planet = planet;
    }

    public AtomicInteger getTotal() {
        return total;
    }

    public Integer sendRocket() {
        return 1;
    }
}
