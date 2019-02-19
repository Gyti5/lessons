package lt.baltictalents.lessons910.model;


import org.junit.Test;
import java.util.HashSet;
import java.util.Set;

import static junit.framework.TestCase.assertTrue;
import static org.assertj.core.api.Assertions.assertThat;

public class CartTest {

    Item item;
    Image image;
    Cart cart;
    @Test
    public void cartTest() {
        item = new Item();
        cart = new Cart();
        item.setName("test");
        Set<Item> a = new HashSet<>();
        a.add(item);
        cart.setItems(a);



        assertThat(cart.getItems().contains(item)==true);
        assertTrue(item.getName()=="test");



    }
}