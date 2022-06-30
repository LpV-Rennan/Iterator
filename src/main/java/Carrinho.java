import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Carrinho implements  Iterable<Item>{
    private List<Item> itens = new ArrayList<Item>();

    public Carrinho(Item... itens) {
        this.itens = Arrays.asList(itens);
    }

    @Override
    public Iterator<Item> iterator() {
        return itens.iterator();
    }
}
