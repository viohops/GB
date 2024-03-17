package Software_Architecture.HW2.Interface;

import Software_Architecture.HW2.Fabric.*;

import java.util.ArrayList;
import java.util.List;

public interface FabricGenerator {

    public static List<ItemGenerator> initGenerators() {
        List<ItemGenerator> generators = new ArrayList<>();

        generators.add(new GemGenerator());

        for (int i = 0; i < 3; i++) {
            generators.add(new GoldGenerator());
        }
        for (int i = 0; i < 10; i++) {
            generators.add(new SilverGenerator());
            generators.add(new BronzeGenerator());
            generators.add(new ExtraFoodGenerator());
            generators.add(new MagicArmorGenerator());
            generators.add(new MagicWeaponGenerator());
        }
        return generators;
    }
}
