public class DessertShoppe {
    public static final int taxRate = 65;
    public static final String storeName ="M & M Dessert Shoppe";
    public static final int maxSizeItem = 22;
    public static final int maxSizeCost = 11;
    public static String cents2dolloarsAndCentsmethod(int cost){
        String c = String.valueOf(cost*1.0/100);
        return c;

    }

}
