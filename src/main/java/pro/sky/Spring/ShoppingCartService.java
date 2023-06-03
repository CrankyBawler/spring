package pro.sky.Spring;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import java.util.*;
import java.util.stream.Collectors;

@Service
@SessionScope

public class ShoppingCartService {

    private final List<Integer> items;

    public ShoppingCartService(List<Integer> items) {
        this.items = items;
    }

    public void add(List<Integer> ids) {
        items.addAll(ids);
    }

    public List<Integer> get() {
        return Collections.unmodifiableList(items);
    }
}

