import java.util.ArrayList;
import java.util.List;

public class Checkout {
    private List<DessertItem> dessertItemList;
    int totalCost;
    int totalTax;
    public Checkout(){
        dessertItemList = new ArrayList<>();
        totalTax = 0;
        totalCost = 0;
    }
    public int numberOfItems(){
        return dessertItemList.size();
    }

    public void enterItem(DessertItem item){
        dessertItemList.add(item);
        totalCost += item.getCost();
        totalTax += item.getCost()*DessertShoppe.taxRate;
    }

    public void clear(){
        dessertItemList.clear();
        totalTax = 0;
        totalCost = 0;
    }

    public int totalCost(){
        return totalCost;
    }

    public int totalTax(){
        return totalTax;
    }

    public String toString() {
        String result = "";
        result += "     " + DessertShoppe.storeName + "\n";
        result += "     " + "---------------------\n";
        for (DessertItem dessertItem:dessertItemList) {
            if (dessertItem instanceof Cookie) {
                result += ((Cookie) dessertItem).number + " @ " +
                        ((Cookie) dessertItem).pricePerDozen + " /dz.\n";
            }
            else if (dessertItem instanceof Candy){
                result += ((Candy) dessertItem).weight + " lbs. @ " +
                        ((Candy) dessertItem).price + " /lb.\n";
            }

            if (dessertItem.getName().length() <= DessertShoppe.maxSizeItem) {
                result += (dessertItem.getName() + " ");
            } else {
                String[] target = dessertItem.getName().split(" ");
                int count = 0;
                String temp = "";
                for (String s:target) {
                    count = temp.length() + s.length();
                    if (count > DessertShoppe.maxSizeItem) {
                        result += temp + "\n";
                        temp = s + " ";
                    }
                    else {
                        temp += s + " ";
                    }
                }
                result += temp;
            }

            result += getCostString(dessertItem.getCost());
        }

        result += "\n";
        result += "Tax";

        result += getCostString(DessertShoppe.taxRate);
        result += "Total Cost";
        result += getCostString(totalCost);

        return result;
    }

    private String getCostString(int value) {
        String s = "";
        String cost = DessertShoppe.cents2dolloarsAndCentsmethod(value);
        int whiteSpaceSize = DessertShoppe.maxSizeCost - cost.length();
        while (whiteSpaceSize >= 0) {
            s += " ";
            whiteSpaceSize--;
        }
        return  s + cost + "\n";
    }
}
