package Software_Architecture.HW2.Product;

import Software_Architecture.HW2.Interface.iGameItem;

public class Gold implements iGameItem {

    @Override
    public void open() {
        System.out.println("Gold!");
    }

}
