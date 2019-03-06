public class Pet {
    private String petName;
    private String ownerName;
    private String color;
    public static final int MALE=1, FEMALE=2, SPAYED = 3, NEUTERED=4;
    private enum sex{MALE,FEMALE,SPAYED, NEUTERED};
    protected sex petSex;

    public Pet(String petName, String ownerName, String color){
        this.petName = petName;
        this.ownerName = ownerName;
        this.color = color;
    }

    public String getPetName(){
        return petName;
    }

    public String getOwnerName(){
        return ownerName;
    }

    public String getColor(){
        return color;
    }

    public void setSex(int sexid){
       if (sexid ==1){
           petSex = sex.MALE;
       }
       if(sexid==2){
           petSex = sex.FEMALE;
       }
       if(sexid==3){
           petSex=sex.SPAYED;
       }
       if(sexid==4){
           petSex=sex.NEUTERED;
       }

    }

    public String getSex(){
        return petSex.toString();
    }

    public String toString(){
        String type = this.getClass().getName().toUpperCase();
        return type.substring(type.lastIndexOf(".")+1)+"\n"+getPetName() +"owned by"+ getOwnerName() +"\n"+"Color:" + getColor()+"\n"+"Sex:"+getSex()+"\n";
    }

}
