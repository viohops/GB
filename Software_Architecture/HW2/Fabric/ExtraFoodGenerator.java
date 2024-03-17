package Software_Architecture.HW2.Fabric;

import Software_Architecture.HW2.Interface.iGameItem;
import Software_Architecture.HW2.Product.ExtraFood;

public class ExtraFoodGenerator extends ItemGenerator{

        @Override
        public iGameItem createItem() {
            return new ExtraFood();
        }
    }
