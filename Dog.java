import java.util.Date;

public class Dog extends Pet implements Boardable{
    private String size;
    private Date BoardingEnd,BoardingStart;
    Dog(String petName, String ownerName, String color, String size){
        super(petName, ownerName, color);
        this.size = size;
    }

    private class Date{
        int month, day, year;
        Date(int month, int day, int year){
            this.month= month;
            this.day= day;
            this.year= year;
        }
        public boolean lessThan(Date date){
            if (this.year < date.year) return true;
            else if(this.year==date.year) {
                if (this.month< date.month) return true;
                else if (this.month==date.month&&this.day<=date.day) return true;
            }
            return false;
        }

        public boolean greatThan(Date date){
            if (this.year > date.year) return true;
            else if(this.year==date.year) {
                if (this.month > date.month) return true;
                else if (this.month==date.month&&this.day>=date.day) return true;
            }
            return false;
        }
    }

    public String getSize(){
        return size;
    }

    @Override
    public String toString(){
        return super.toString()+"Size:"+ this.getSize() +"\n";
    }

    @Override
    public void setBoardStart(int month, int day, int year){
        Date BoardingStart = new Date(month,day,year);
    }

    @Override
    public void setBoardEnd(int month,int day, int year){
        Date BoardingEnd = new Date(month,day,year);
    }

    @Override
    public boolean boarding(int month, int day, int year){
        Date boarding = new Date(month, day, year);
        return (boarding.lessThan(BoardingEnd)&& boarding.greatThan(BoardingStart));
    }
}
