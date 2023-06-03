package pro.sky.Spring;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import java.util.*;
import java.util.stream.Collectors;

@Service
@SessionScope

public class CartServiceImpl implements CartService {

    private final Products product;

      public CartServiceImpl(Products product) {
        this.product = product;
    }
@Override
    public List<Integer> add(List<Integer> id) {
        return product.addItems(id);
    }
@Override
    public List<Integer> get() {
        return product.getItems();
    }
}

