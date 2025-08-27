import java.util.Scanner;
import java.util.ArrayList;

public class GroceryListManager3 {
    private ArrayList<ListItem> groceryList = new ArrayList<>();

    public void addItem(String itemName, double cost, String category){
        groceryList.add(new ListItem(itemName,cost,category));
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

    public void displayAllItems(){
        for(ListItem listitem : groceryList){
            System.out.println(listitem.getName() +" "+ listitem.getCost()+" "+listitem.getCategory());
            }
        System.out.println("");
        }
    public void displayCategory(String category){
        for(ListItem listitem : groceryList){
            if(listitem.getCategory() == category ) {
                System.out.println(listitem.getName() +" "+ listitem.getCost()+" "+listitem.getCategory());
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
            sum += listitem.getCost();
        }
        return sum;
    }

    public static void main(String[] args){
        GroceryListManager3 list = new GroceryListManager3();

        // Fruits
        list.addItem("bananas", 1.1, "fruits");
        list.addItem("green grapes", 2.9, "fruits");
        list.addItem("blueberries", 3.4, "fruits");

// Bakery
        list.addItem("sourdough bread", 4.2, "bakery");
        list.addItem("croissant", 2.5, "bakery");
        list.addItem("blueberry muffin", 3.0, "bakery");
        list.addItem("bagel pack", 3.6, "bakery");

// Dairy
        list.addItem("whole milk", 2.7, "dairy");
        list.addItem("cheddar cheese", 4.1, "dairy");
        list.addItem("greek yogurt", 1.8, "dairy");

        list.displayAllItems();

        System.out.println("total cost: "+ list.calculateTotal());
        System.out.println("");

        System.out.println("is croissant in?" +" "+ list.isIn("croissant"));
        System.out.println("");

        list.removeItem("croissant");

        list.displayCategory("bakery");

        System.out.println("total cost: "+ list.calculateTotal());







    }

}
