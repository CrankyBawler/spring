package pro.sky.Spring;

import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@Repository
public class StoreRepository {

    private int counter = 1;
    private final Map<Integer, Product> map = new HashMap<>();


    @PostConstruct
    public void init() {
        map.put(counter, new Product(counter++,"Молоко"));
        map.put(counter, new Product(counter++,"Хлеб"));
        map.put(counter, new Product(counter++,"Соль"));
        map.put(counter, new Product(counter++,"Лимонад"));
        map.put(counter, new Product(counter++,"Сок"));
        map.put(counter, new Product(counter++,"Чипсы"));
    }


    public Product get(int id) {
        return map.get(id);
    }


}
