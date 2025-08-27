import java.util.Scanner;
import java.util.ArrayList;

public class GroceryListManager5 {

    private ArrayList<ListItem> groceryList = new ArrayList<>();

    public void addItem(String itemName, double cost, String category,int amount){
        groceryList.add(new ListItem(itemName,cost,category,amount));
    }
    public void removeItem(String itemName){
        int rememberIndex = -1;
        for(ListItem listitem : groceryList){
            if(listitem.getName() == itemName ){
                rememberIndex = groceryList.indexOf(listitem);
                //groceryList.remove(groceryList.indexOf(listitem)); doenst work because cant do this inside for lop for some reason has to do with changing the list you are iterating on
            }
        }

        if(rememberIndex >= 0) {
            groceryList.remove(rememberIndex);
        }
    }

    public void updateQuantity(String item, int newquantity){
        for(ListItem listitem : groceryList){
            if(listitem.getName() == item ) {
                listitem.changeAmount(newquantity);
            }
        }
    }

    public void displayAllItems(){
        for(ListItem listitem : groceryList){
            System.out.printf("%-25s %-10.2f %-10s %-10d",listitem.getName(),listitem.getCost(),listitem.getCategory(),listitem.getAmount());
            System.out.println("");
        }
        System.out.println("");
    }
    public void displayCategory(String category){
        for(ListItem listitem : groceryList){
            if(listitem.getCategory() == category ) {
                System.out.printf("%-25s %-10.2f %-10s %-10d",listitem.getName(),listitem.getCost(),listitem.getCategory(),listitem.getAmount());
                System.out.println("");
            }
        }
        System.out.println("");
    }
    public void displayAvailableItems(){
        for(ListItem listitem : groceryList){
            if(listitem.getAmount() > 0) {
                System.out.printf("%-25s %-10.2f %-10s %-10d",listitem.getName(),listitem.getCost(),listitem.getCategory(),listitem.getAmount());
                System.out.println("");
            }
        }
        System.out.println("");
    }

    public boolean isIn(String item){
        for(ListItem listitem : groceryList){
            if(listitem.getName() == item ) {
                return true;
            }
        }
        return false;

    }

    public double calculateTotal(){
        double sum = 0;
        for(ListItem listitem : groceryList){
            for(int i = 1; i <= listitem.getAmount(); i++) {
                sum += listitem.getCost();
            }
        }
        return sum;
    }

    public static void main(String[] args){
        GroceryListManager5 list = new GroceryListManager5();

        // Fruits
        list.addItem("bananas", 1.1, "fruits", 2);
        list.addItem("green grapes", 2.9, "fruits", 3);
        list.addItem("blueberries", 3.4, "fruits", 1);
        list.addItem("strawberries", 2.8, "fruits", 5); // new item

// Bakery
        list.addItem("sourdough bread", 4.2, "bakery", 1);
        list.addItem("croissant", 2.5, "bakery", 4);
        list.addItem("blueberry muffin", 3.0, "bakery", 2);
        list.addItem("chocolate chip cookie", 1.9, "bakery", 6); // new item

// Dairy
        list.addItem("whole milk", 2.7, "dairy", 2);
        list.addItem("cheddar cheese", 4.1, "dairy", 3);
        list.addItem("greek yogurt", 1.8, "dairy", 1);
        list.addItem("butter", 3.5, "dairy", 4);

        System.out.println("");
        list.displayAllItems();

        System.out.println("total cost: "+ list.calculateTotal());
        System.out.println("");



        System.out.println("is croissant in?" +" "+ list.isIn("croissant"));
        System.out.println("");

        list.removeItem("croissant");

        list.displayCategory("bakery");

        System.out.println("total cost: "+ list.calculateTotal());
        System.out.println("");

        list.updateQuantity("cheddar cheese", 2);
        list.displayCategory("dairy");

        System.out.println("total cost: "+ list.calculateTotal());
        System.out.println("");






    }

}

