package Software_Architecture.HW2.Fabric;

import Software_Architecture.HW2.Interface.iGameItem;

public abstract class ItemGenerator {
    public abstract iGameItem createItem();

    public void openReward() {
        createItem().open();
    }
}
