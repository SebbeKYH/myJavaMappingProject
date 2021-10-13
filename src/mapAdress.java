public class mapAdress {
    //Declaring class variables
    protected String adressName;
    protected boolean adressRainyWeather;

    //Creating the class constructor
    public mapAdress(String inAdressName, boolean inAdressRainyWeather){
        adressName=inAdressName;
        adressRainyWeather=inAdressRainyWeather;
    }
    //Fetching class information through functions in class
    public String getAdressName(){
        return adressName;
    }
    public boolean getAdressRainyWeather(){
        return adressRainyWeather;
    }
    //Defining class variables through functions in class
    public void setAdressName(String adressName){
        adressName=adressName;
    }
    public void setAdressRainyWeather(boolean adressRainyWeather){
        adressRainyWeather=adressRainyWeather;
    }
}
