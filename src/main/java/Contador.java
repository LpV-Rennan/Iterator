public class Contador {
    public static Float totalDoCarrinho(Carrinho carrinho){
        float total = 0.00f;
        for (Item item : carrinho){
            total+= item.getSubtotal();
        }
        return total;
    }
}
