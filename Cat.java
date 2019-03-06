import java.util.Calendar;
import java.util.Date;

public class Cat extends Pet implements Boardable{
    private String hairLength;
    private Date boardingStart, boardingEnd;

    public Cat(String petName, String ownerName, String color,String hairLength){
        super(petName, ownerName,color);
        this.hairLength = hairLength;
    }

    private class Date{
        private int Day, Month, Year;
        public Date(int Day, int Month, int Year){
            this.Day= Day;
            this.Month = Month;
            this.Year = Year;
        }

        public boolean lessThan(Date date){
            if (this.Year < date.Year)
                return true;
            else if (this.Year==date.Year){
                if(this.Month< date.Month)
                    return true;
                else if(this.Month==date.Month&& this.Day <= date.Day){
                    return true;
                }
            }
            return false;
        }

        public boolean greaterThan(Date date){
            if (this.Year > date.Year)
                return true;
            else if (this.Year==date.Year){
                if(this.Month> date.Month)
                    return true;
                else if(this.Month==date.Month&& this.Day >= date.Day){
                    return true;
                }
            }
            return false;

        }

    }

    String getHairLength(){
        return hairLength;
    }

    @Override
    public String toString(){
        return super.toString() + "Hair:" + this.getHairLength() +"\n";

    }

    @Override
    public void  setBoardStart(int month, int day, int year){
        boardingStart = new Date(day,month,year);
    }

    @Override
    public void setBoardEnd(int month,int day, int year){
        boardingEnd = new Date(day,month,year);

    }

    @Override
    public boolean boarding(int month, int day, int year){
        Date boarding = new Date(day, month, year);
        return (boarding.greaterThan(boardingStart)&& boarding.lessThan(boardingEnd));


    }



}
