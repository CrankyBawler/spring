package pro.sky.Spring;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Basket {

    private final List<Integer> basket = new ArrayList<>();


    public void add(List<Integer> prd) {
        basket.addAll(prd);
    }

    public List<Integer> get() {
        return Collections.unmodifiableList(basket);
    }


}
