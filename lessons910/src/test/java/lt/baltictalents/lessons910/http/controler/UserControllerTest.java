package lt.baltictalents.lessons910.http.controler;

import lombok.val;

import lt.baltictalents.lessons910.http.controller.UserRestController;
import lt.baltictalents.lessons910.model.Cart;
import lt.baltictalents.lessons910.model.Item;
import lt.baltictalents.lessons910.model.Role;
import lt.baltictalents.lessons910.model.User;
import lt.baltictalents.lessons910.repository.auth.UserRepository;
import org.assertj.core.util.Lists;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;


import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

@RunWith(SpringRunner.class)
@WebMvcTest(UserRestController.class)
public class UserControllerTest {
    User user;
    Cart cart;
    Role role;
    Item item;

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private UserRepository userRepository;

    @Before
    public void setup() {
        role = new Role();
        cart = new Cart();
        item = new Item();
        user = new User();

        role.setName(Role.RoleName.USER);



        user.setUsername("username");
        user.setPassword("password");
        user.setPasswordConfirm("password");
        user.setDecryptedPassword("password");


    }

    @Test
    public void testShowUsersListHtml() throws Exception {
        mockMvc.perform(get("/users"))
                .andExpect(model().attributeExists("users"))
                .andExpect(view().name("users"));
    }

    @Test
    public void testShowUsersResourceList() throws Exception {
        ResultActions actions = mockMvc.perform(get("/api/users")
                .accept(MediaType.APPLICATION_JSON)).andExpect(status().isOk());
        actions.andExpect(content().contentType("application/json;charset=UTF-8"))
                .andExpect(jsonPath("$.users[0].name").value("username"));
    }
}