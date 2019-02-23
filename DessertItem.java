import com.sun.org.apache.bcel.internal.generic.RETURN;

public abstract class DessertItem {
    protected String name;
    public DessertItem(String name){
        this.name = name;
    }

    public final String getName(){
        return name;
    }

    public abstract int getCost();
}

class Candy extends DessertItem{
    double weight;
    int  price;
    public Candy(String name, double weight,int price){
        super(name);
        this.weight= weight;
        this.price = price;
    }

    public int getCost(){
        return (int) Math.round(weight*price);
    }
}

class IceCream extends DessertItem{
    int cost;
    public IceCream(String name, int cost) {
        super(name);
        this.cost= cost;
    }

    public int getCost() {
        return cost;
    }
}

class Sundae extends IceCream {
    int costOfTopping;
    String toppingName;
    Sundae (String iceCreamName, int iceCreamCost, String toppingName, int costOfTopping){
        super(toppingName + " Sundae with " + iceCreamName, iceCreamCost);
        this.costOfTopping = (int)Math.round(costOfTopping*100);
        this.toppingName = toppingName;
    }

    public int getCost() {
        return super.getCost() + costOfTopping;
    }
}

class Cookie extends DessertItem{
    int number;
    int pricePerDozen;

    public Cookie(String name, int number, int pricePerDozen) {
        super(name);
        this.number = number;
        this.pricePerDozen = pricePerDozen;
    }

    @Override
    public int getCost() {
        return (int)Math.round(number*pricePerDozen*1.0/12);
    }
}


