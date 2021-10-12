import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String []args){
        //Y axis adresses
        mapAdress adress1=new mapAdress("Green Goblin Street 2", false);
        mapAdress adress2=new mapAdress("Batman goes rouge street 5", false);
        mapAdress adress3=new mapAdress("Hell let Loose 426", false);
        mapAdress adress4=new mapAdress("Zelda is not real street 9", false);
        mapAdress adress5=new mapAdress("Thanos never lost 4", false);
        mapAdress adress6=new mapAdress("Tiny spider steet 1", false);
        mapAdress adress7=new mapAdress("Biggest bear streat 100", false);
        mapAdress adress8=new mapAdress("Gnome Street", false);
        mapAdress adress9=new mapAdress("Wrath of the Irish 4000", false);
        mapAdress adress10=new mapAdress("Rosendalsvägen 9", false);

        // Creating the map in 2d field
        mapAdress[][]map={
                {adress1,adress2,adress3,},
                {adress4,adress5,adress6,},
                {adress7,adress8,adress9}
        };
        //Declaring starting position for user, which is outside the map
        int row=0;
        int col=0;
    }
    
}
