package org.example.model;

public class FireMagician extends Magician {

    public FireMagician(Planet planet) {
        super(planet);
    }

    @Override
    public void run() {
        sendRocket();
    }
}