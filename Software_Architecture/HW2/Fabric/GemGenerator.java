package Software_Architecture.HW2.Fabric;

import Software_Architecture.HW2.Interface.iGameItem;
import Software_Architecture.HW2.Product.Gem;

public class GemGenerator extends ItemGenerator {

    @Override
    public iGameItem createItem() {
        return new Gem();
    }

}
