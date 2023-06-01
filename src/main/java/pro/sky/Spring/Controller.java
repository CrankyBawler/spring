package pro.sky.Spring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/store/order/")
public class Controller {

    private final StoreService service;

    public Controller(StoreService service) {
        this.service = service;
    }

    @GetMapping("/add")
    public ShopingCart addShopingCart(@RequestParam Integer number){
        return service.add(Integer number, String good);
}

