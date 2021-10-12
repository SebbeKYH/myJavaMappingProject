import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String []args){
        //Y axis adresses
        mapAdress yAdress1=new mapAdress("Green Goblin Street 2", false);
        mapAdress yAdress2=new mapAdress("Batman goes rouge street 5", false);
        mapAdress yAdress3=new mapAdress("Hell let Loose 426", false);
        mapAdress yAdress4=new mapAdress("Zelda is not real street 9", false);
        mapAdress yAdress5=new mapAdress("Thanos never lost 4", false);
        //X axis adresses
        mapAdress xAdress1=new mapAdress("Tiny sptider steet 1", false);
        mapAdress xAdress2=new mapAdress("Biggest bear streat 100", false);
        mapAdress xAdress3=new mapAdress("Gnome Street", false);
        mapAdress xAdress4=new mapAdress("Wrath of the Irish 4000", false);
        mapAdress xAdress5=new mapAdress("Rosendalsvägen 9", false);

        // Creating the map in 2d field
        mapAdress[][]map={
                {yAdress1,yAdress2,yAdress3,yAdress4,yAdress5},
                {xAdress1,xAdress2,xAdress3,xAdress4,xAdress5}
        };

    }
}
