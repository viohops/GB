package Software_Architecture.HW2.Fabric;

import Software_Architecture.HW2.Interface.iGameItem;
import Software_Architecture.HW2.Product.MagicWeapon;

public class MagicWeaponGenerator extends ItemGenerator {

    @Override
    public iGameItem createItem() {
        return new MagicWeapon();
    }

}
