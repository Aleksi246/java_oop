import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.ArrayList;

public class GroceryListManager2 {


    private HashMap<String, Double> groceryList = new HashMap<>();

    public void addItem(String item,double price){
        groceryList.put(item,price);
    }
    public void removeItem(String item){
        groceryList.remove(item);
    }
    public void displayList(){
        for (Map.Entry<String, Double> entry : groceryList.entrySet()) {
            System.out.println(entry);
        }

    }
    public double calculateTotalCost(){
        double sum = 0;
        for (double i : groceryList.values()) {
            sum += i;
        }
        return sum;

    }

    public boolean checkItem(String item){
        for (String i : groceryList.keySet()) {
            if(item == i){
                return true;
            }

        }
        return false;
    }


    public static void main(String[] args){
        GroceryListManager2 list = new GroceryListManager2();

        list.addItem("appels",2.2);
        list.addItem("milk",2.2);
        list.addItem("bread",5.2);

        list.displayList();

        System.out.println("cost: " + list.calculateTotalCost());

        System.out.println("is milk in the list?"+ list.checkItem("milk"));

        System.out.println("removing milk from list");

        list.removeItem("milk");

        list.displayList();

        System.out.println("cost: " + list.calculateTotalCost());






    }


}
