public class mapAdress {
    //Declaring class variables
    protected String adressName;
    protected boolean adressBlock;

    //Creating the class constructor
    public mapAdress(String inAdressName, boolean inAdressBlock){
        adressName=inAdressName;
        adressBlock=inAdressBlock;
    }
    //Fetching class information through functions in class
    public String getAdressName(){
        return adressName;
    }
    public boolean getAdressBlock(){
        return adressBlock;
    }
    //Defining class variables through functions in class
    public void setAdressName(String adressName){
        adressName=adressName;
    }
    public void setAdressName(boolean adressBlock){
        adressBlock=adressBlock;
    }
}
