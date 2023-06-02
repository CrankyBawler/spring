package pro.sky.Spring;

import java.util.List;

public interface ShoppingCartService {

    void add(List<Integer> id);

    List<Product> get();
}
