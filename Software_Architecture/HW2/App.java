package Software_Architecture.HW2;

import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import Software_Architecture.HW2.Fabric.*;

import static Software_Architecture.HW2.Interface.FabricGenerator.initGenerators;

public class App {

    public static void main(String[] args) {

        List<ItemGenerator> generators = initGenerators();
        Random random = ThreadLocalRandom.current();
        for (int i = 0; i < 100; i++) {
            int index = random.nextInt(generators.size());
            generators.get(index).openReward();
        }
    }
}