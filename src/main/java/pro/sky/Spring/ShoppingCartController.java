package pro.sky.Spring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/store/order")
public class ShoppingCartController {

    private final ShoppingCartService service;

    public ShoppingCartController(ShoppingCartService service) {
        this.service = service;
    }
    @GetMapping(path = "/add")
    public void addProduct(@RequestParam("id")List<Integer> ids) {
        service.add(ids);
    }
    @GetMapping(path = "/get")
    public Collection<Integer> get() {
        return service.get();
    }


}
