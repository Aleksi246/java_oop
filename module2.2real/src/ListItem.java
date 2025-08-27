public class ListItem {
    private double cost;
    private String itemName;
    private int amount;
    private String category;

    public ListItem(String itemName, double cost, String category,int amount){
        this.itemName = itemName;
        this.cost = cost;
        this.category = category;
        this.amount = amount;
    }

    public ListItem(String itemName, double cost, String category){
        this.itemName = itemName;
        this.cost = cost;
        this.category = category;
        amount = 1;
    }

    public void changeAmount(int change){
        amount = change;
    }
    public String getName(){
        return itemName;
    }
    public String getCategory(){
        return category;
    }
    public double getCost(){
        return cost;
    }
    public int getAmount(){
        return amount;
    }
}
