package HW_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Shop {
    private List<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
    }

    public List<Product> getProducts() {
        return products;
    }

    public void sortProductsByPrice() {
        Collections.sort(products, (p1, p2) -> Double.compare(p2.getPrice(), p1.getPrice()));
    }

    public Product getMostExpensiveProduct() {
        if (products.isEmpty()) {
            return null;
        }
        return Collections.max(products, (p1, p2) -> Double.compare(p1.getPrice(), p2.getPrice()));
    }
}

public class ShopTest {
    @Test
    public void testSortProductsByPrice() {
        Shop shop = new Shop();
        shop.addProduct(new Product("Product A", 50.0));
        shop.addProduct(new Product("Product B", 30.0));
        shop.addProduct(new Product("Product C", 70.0));

        shop.sortProductsByPrice();

        List<Product> sortedProducts = shop.getProducts();
        Assertions.assertThat(sortedProducts)
            .containsExactly(
                new Product("Product C", 70.0),
                new Product("Product A", 50.0),
                new Product("Product B", 30.0)
            );
    }

    @Test
    public void testGetMostExpensiveProduct() {
        Shop shop = new Shop();
        shop.addProduct(new Product("Product A", 50.0));
        shop.addProduct(new Product("Product B", 30.0));
        shop.addProduct(new Product("Product C", 70.0));

        Product mostExpensiveProduct = shop.getMostExpensiveProduct();
        Assertions.assertThat(mostExpensiveProduct)
            .isEqualTo(new Product("Product C", 70.0));
    }

    @Test
    public void testGetMostExpensiveProductEmptyShop() {
        Shop shop = new Shop();
        Product mostExpensiveProduct = shop.getMostExpensiveProduct();
        Assertions.assertThat(mostExpensiveProduct)
            .isNull();
    }
}
