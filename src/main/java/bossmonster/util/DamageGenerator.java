package bossmonster.util;

import java.util.Random;

public class DamageGenerator {
    private static final int MAXIMUM_DAMAGE = 21;

    public static int generate() {
        Random random = new Random();
        return random.nextInt(MAXIMUM_DAMAGE);
    }
}