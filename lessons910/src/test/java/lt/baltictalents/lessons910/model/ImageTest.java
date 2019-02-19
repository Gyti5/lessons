package lt.baltictalents.lessons910.model;


import org.junit.Test;
import java.util.HashSet;
import java.util.Set;

import static junit.framework.TestCase.assertTrue;
import static org.assertj.core.api.Assertions.assertThat;

public class ImageTest {

    Product product;
    Image image;
    @Test
    public void imageTest() {
        product = new Product();
        product.setDescription("Item description");
        product.setName("name");

        image = new Image();
        image.setName("imgname");
        Set<Product> a = new HashSet<>();
        a.add(product);
        image.setProducts(a);



        assertThat(image.getName()).isEqualTo("imgname");
        assertThat(image.getProducts().contains(product)==true);



    }
}