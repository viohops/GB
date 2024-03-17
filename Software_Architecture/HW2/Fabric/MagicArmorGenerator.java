package Software_Architecture.HW2.Fabric;

import Software_Architecture.HW2.Interface.iGameItem;
import Software_Architecture.HW2.Product.MagicArmor;

public class MagicArmorGenerator extends ItemGenerator {
    @Override
    public iGameItem createItem() {
        return new MagicArmor();
    }
}
