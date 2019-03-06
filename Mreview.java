import java.util.ArrayList;
import java.util.Comparator;

public class Mreview implements Comparable<Mreview> {
    private String title;
    private ArrayList<Integer> ratings;

    Mreview(String title){
        this.title = title;
    }
    Mreview(String ttl, int firstRating){
        this.title = ttl;
        ratings = new ArrayList<>();
        ratings.add(firstRating);
    }

    public String getTitle() {
        return title;
    }

    public void addRating(int r){
        ratings.add(r);
    }

    public double aveRating(ArrayList<Integer> ratings){
        Integer sum = 0;
        if(!ratings.isEmpty()){
            for(Integer r : ratings){
                sum += r;
            }
            return sum.doubleValue()/ratings.size();
        }
        return 0;
    }

    public int numRatings(){
        return ratings.size();
    }

    public int compareTo(Mreview obj){
       return this.getTitle().compareTo(obj.getTitle());

    }

    @Override
    public boolean equals(Object obj){
        if(this==obj) return true;
        if(obj==null||obj.getClass()!=this.getClass()) {
            return false;
        }
        Mreview mreview = (Mreview) obj;
        return (mreview.title ==this.title);
    }

    @Override
    public String toString() {
        return this.title + ", average" + aveRating(ratings)+"out of "+numRatings() +"ratings";
    }

    public static void main(String[] args){
        Mreview review1 = new Mreview("Titanic", 5);
        review1.addRating(4);
        review1.addRating(5);
        review1.toString();
    }
}
