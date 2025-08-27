import java.util.Scanner;
import java.util.ArrayList;

public class GroceryListManager {
    private ArrayList<String> groceryList = new ArrayList<>();

    public void addItem(String item){
        groceryList.add(item);
    }
    public void removeItem(String item){
        groceryList.remove(item);
    }
    public void displayList(){
        for(String i : groceryList){
            System.out.println(groceryList.indexOf(i)+1+ ". " + i);
        }
    }
    public boolean checkItem(String item){
        return groceryList.contains(item);
    }


    public static void main(String[] args){
        GroceryListManager list = new GroceryListManager();

        list.addItem("appels");
        list.addItem("milk");
        list.addItem("bread");

        list.displayList();

        System.out.println("is milk in the list?" + list.checkItem("milk"));

        System.out.println("removing milk from list");

        list.removeItem("milk");

        list.displayList();






    }


}
