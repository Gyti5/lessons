package lt.baltictalents.lessons910.service.auth;

import lombok.val;
import lt.baltictalents.lessons910.model.Cart;
import lt.baltictalents.lessons910.model.Item;
import lt.baltictalents.lessons910.model.Role;
import lt.baltictalents.lessons910.model.User;
import lt.baltictalents.lessons910.repository.auth.UserRepository;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@DataJpaTest
public class UserRepositoryTest {
    User user;
    Cart cart;
    Role role;
    Item item;

    @Autowired
    UserRepository userRepository;

    @Autowired
    UserService userService;

    @BeforeClass
    public static void init() {
        try {
            Class.forName("org.hsqldb.jdbc.JDBCDriver");
        }catch (Exception e){
            System.out.println(e.getStackTrace());
        }
    }

    @Before
    public void setUp() {
        role = new Role();
        cart = new Cart();
        item = new Item();
        user = new User();

        role.setName(Role.RoleName.USER);

        item.setDescription("Item description");
        item.setPrice(15.25F);
        item.setName("Item name");

        Set<Item>  items= new HashSet<>();
        items.add(item);
        cart.setItems(items);

        user.setUsername("username");
        user.setPassword("password");
        user.setDecryptedPassword("password");
        user.setPasswordConfirm("password");

        val roles = new HashSet<Role>(Arrays.asList(role));
        user.setRoles(roles);

        val carts = new HashSet<Cart>(Arrays.asList(cart));
        user.setCart(carts);
    }

    @Test
    public void saveUserAndFindById() {
        val savedUser = userRepository.save(user);


        assertThat(savedUser.getUsername()).isEqualTo(user.getUsername());

    }
}
