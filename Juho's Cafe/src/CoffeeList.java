import java.util.ArrayList;

public class CoffeeList {
	private ArrayList<String> foodList = new ArrayList<String>();

    public void addItem(String item) {

        foodList.add(item);
    }


    public ArrayList<String> getfoodList() {
        return foodList;
    }

    public void printFoodList() {
        System.out.println("You have " + foodList.size() + " items in your grocery list");
        for(int i=0; i< foodList.size(); i++) {
            System.out.println((i+1) + ". " + foodList.get(i));
        }
    }

    public void modifyFood(String currentItem, String newItem) {
        int position = findItem(currentItem);
        if(position >= 0) {
            modifyFood(position, newItem);
        }

    }
    private void modifyFood(int position, String newItem) {
        foodList.set(position, newItem);
        System.out.println("Grocery item " + (position+1) + " has been modified.");
    }

    public void removeFood(String item) {
        int position = findItem(item);
        if(position >= 0) {
            removeFood(position);
        }
    }
    private void removeFood(int position) {
        foodList.remove(position);
    }

    private int findItem(String searchItem) {
        return foodList.indexOf(searchItem);
    }

    public boolean onFile(String searchItem) {
        int position = findItem(searchItem);
        if(position >=0) {
            return true;
        }

        return false;
    }
}

