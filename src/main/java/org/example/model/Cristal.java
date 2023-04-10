package org.example.model;

import java.util.Random;

public abstract class Cristal {

    private static final Random random = new Random();

    private static final Integer minValue = 2;
    // т.к. в рандоме не используется верхняя граница, то будет 5
    private static final Integer maxValue = 6;

    Integer grow() {
        return random.nextInt(maxValue - minValue) + minValue;
    }

}
