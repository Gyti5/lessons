package lt.baltictalents.lessons678.http.controller;


import lt.baltictalents.lessons678.model.Item;
import lt.baltictalents.lessons678.repository.auth.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import lombok.val;

@RestController
@RequestMapping("/api")
public class ItemRestController {
    @Autowired
    ItemRepository itemRepository;

    @RequestMapping(value ="/items/{Id}", method= RequestMethod.GET)
    public Item getOrder(@PathVariable("Id") long Id){
        val items = itemRepository.findById(Id);

        return items.get();
    }
}