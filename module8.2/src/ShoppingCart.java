import java.util.HashMap;

public class ShoppingCart {
    private HashMap<String,Double> cart = new HashMap<>();

    public ShoppingCart(){

    }

    public void addItem(String item, Double price){
        cart.put(item,price);
    }
    public void removeItem(String item){
        cart.remove(item);
    }
    public Double calculateTotal(){
        Double total = 0.0;
        for(Double price: cart.values()){
            total += price;
        }
        return total;
    }
    public int getItemCount(){
        return cart.size();
    }
}
