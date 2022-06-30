import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TesteIterator {
    Produto a,b,c,d,e;

    @BeforeEach
    public void  setUp(){
        a = new Produto("a", 2.5f);
        b = new Produto("b",7f);
        c = new Produto("c",10f);
        d = new Produto("d",5f);
        e = new Produto("e",12f);
    }

    @Test
    void deveRetornarTotalDoCarrinho(){
        Carrinho carrinho = new Carrinho(
                new Item(2,a),
                new Item(1,b),
                new Item(3,c),
                new Item(1,d),
                new Item(1,e)
        );
        assertEquals(59f,Contador.totalDoCarrinho(carrinho));
    }


}