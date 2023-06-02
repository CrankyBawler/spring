package pro.sky.Spring;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ShoppingCartServiceImpl implements ShoppingCartService {
    private final Basket basket;
    private final StoreRepository storeRepository;

    public ShoppingCartServiceImpl(Basket basket, StoreRepository storeRepository) {
        this.basket = basket;
        this.storeRepository = storeRepository;
    }


    @Override
    public void add(List<Integer> id) {
        basket.add(id);
    }

    @Override
    public List<Product> get() {
        return basket.get().stream()
                .map(storeRepository::get)
                .collect(Collectors.toList());
    }
}

