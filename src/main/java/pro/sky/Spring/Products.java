package pro.sky.Spring;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Component
@SessionScope
public class Products {
    private final List<Integer> items;
    public Products (){
        this.items = new ArrayList<>();
    }

    public List<Integer> addItems(List<Integer> itemsList) {
        items.addAll(itemsList);
        return itemsList;
    }

    public List<Integer> getItems(){
        return Collections.unmodifiableList(items);
    }
}
