package org.example.model;

import java.util.concurrent.atomic.AtomicInteger;

public class Planet implements Runnable {

    private final RedCristal redCristal;
    private final AtomicInteger redCristalCount = new AtomicInteger(0);
    private final BlueCristal blueCristal;
    private final AtomicInteger blueCristalCount = new AtomicInteger(0);

    public Planet(RedCristal redCristal, BlueCristal blueCristal) {
        this.redCristal = redCristal;
        this.blueCristal = blueCristal;
    }

    public void changeDay() {
        var newRedCristalCount = redCristal.grow();
        var newBlueCristalCount = blueCristal.grow();

        System.out.printf("За день выросло %d красных кристаллов.\n", newRedCristalCount);
        redCristalCount.set(redCristalCount.get() + newRedCristalCount);
        System.out.printf("За день выросло %d синих кристаллов.\n",  newBlueCristalCount);
        blueCristalCount.set(blueCristalCount.get() + newBlueCristalCount);

        System.out.printf("Всего в наличии: %d красных и %d синих.\n", redCristalCount.get(), blueCristalCount.get());
    }

    @Override
    public void run() {
        changeDay();
    }
}
