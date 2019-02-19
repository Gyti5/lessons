package lt.baltictalents.lessons910.model;


import lombok.val;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;

import static org.assertj.core.api.Assertions.assertThat;

public class UserTest {
    User user;
    Cart cart;
    Role role;
    Item item;

    @Test
    public void userTest() {
        role = new Role();
        cart = new Cart();
        item = new Item();
        user = new User();

        role.setName(Role.RoleName.USER);

        item.setDescription("Item description");
        item.setPrice(15.25F);
        item.setName("Item name");


        user.setUsername("username");
        user.setPassword("password");
        user.setPasswordConfirm("password");
        user.setDecryptedPassword("password");

        val roles = new HashSet<Role>(Arrays.asList(role));
        user.setRoles(roles);

        val carts = new HashSet<Cart>(Arrays.asList(cart));
        user.setCart(carts);

        assertThat(user.getUsername()).isEqualTo("username");
        assertThat(user.getRoles()).isEqualTo(roles);
    }
}