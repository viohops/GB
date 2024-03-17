package Software_Architecture.HW2.Product;

import Software_Architecture.HW2.Interface.iGameItem;

public class Silver implements iGameItem {
    @Override
    public void open() {
        System.out.println("Silver!");
    }

}
