package org.example.model;

public class WaterMagician extends Magician {

    public WaterMagician(Planet planet) {
        super(planet);
    }

    @Override
    public void run() {
        sendRocket();
    }
}