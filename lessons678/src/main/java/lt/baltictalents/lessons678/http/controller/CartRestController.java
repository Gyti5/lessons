package lt.baltictalents.lessons678.http.controller;


import lt.baltictalents.lessons678.model.Cart;
import lt.baltictalents.lessons678.repository.auth.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import lombok.val;

@RestController
@RequestMapping("/api")
public class CartRestController {
    @Autowired
    CartRepository cartRepository;

    @RequestMapping(value ="/carts/{orderId}", method= RequestMethod.GET)
    public Cart getOrder(@PathVariable("orderId") long orderId){
        val carts = cartRepository.findById(orderId);

        return carts.get();
    }



}