import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String []args){
        Scanner input =new Scanner(System.in);
        //Adresses
        mapAdress adress1=new mapAdress("Green Goblin Street 2", false);
        mapAdress adress2=new mapAdress("Batman goes rogue street 5", false);
        mapAdress adress3=new mapAdress("Hell let Loose 426", false);
        mapAdress adress4=new mapAdress("Zelda is not real street 9", false);
        mapAdress adress5=new mapAdress("Thanos never lost 4", false);
        mapAdress adress6=new mapAdress("Tiny spider steet 1", false);
        mapAdress adress7=new mapAdress("Biggest bear streat 100", false);
        mapAdress adress8=new mapAdress("Gnome Street", false);
        mapAdress adress9=new mapAdress("Wrath of the Irish 4000", false);
        mapAdress adress10=new mapAdress("Rosendalsvägen 9", false);

        // Creating the map in 2d field
        String[][] map={
                {adress1.adressName,adress2.adressName,adress3.adressName,},
                {adress4.adressName,adress5.adressName,adress6.adressName,},
                {adress7.adressName,adress8.adressName,adress9.adressName}
        };
        //Declaring hidden starting position for player which is at Green Goblin Street 2
        int row=0;
        int col=0;

        //Introduce the streets to start from and ask user to pick one
        System.out.println("Welcome the this mapping service. Please enter your starting point from these options: ");
        System.out.println("-"+adress1.adressName+"\n"+"-"+adress2.adressName+"\n"+"-"+adress3.adressName+"\n"+"-"+adress4.adressName
                +"\n"+"-"+adress5.adressName+"\n"+"-"+adress6.adressName+"\n"+"-"+adress7.adressName+"\n"+"-"+adress8.adressName
                +"\n"+"-"+adress9.adressName);
        // User enters a street to start from and is saved in variable startingPoint
        System.out.print("> ");
        String startingPoint=input.nextLine();

        if (startingPoint.equalsIgnoreCase("Green Goblin Street 2")){
            row=0;
            col=0;
        }
        if (startingPoint.equalsIgnoreCase("Batman goes rogue street 5")){
            row=0;
            col=1;
        }
        if (startingPoint.equalsIgnoreCase("Hell let Loose 426")){
            row=0;
            col=2;
        }
        if(startingPoint.equalsIgnoreCase("Zelda is not real street 9")){
            row=1;
            col=0;
        }
        if(startingPoint.equalsIgnoreCase("Thanos never lost 4")){
            row=1;
            col=1;
        }
        if(startingPoint.equalsIgnoreCase("Tiny spider street 1")){
            row=1;
            col=2;
        }
        if(startingPoint.equalsIgnoreCase("Biggest bear street 100")){
            row=2;
            col=0;
        }
        if(startingPoint.equalsIgnoreCase("Gnome Street")){
            row=2;
            col=1;
        }
        if(startingPoint.equalsIgnoreCase("Wrath of the irish 4000")){
            row=2;
            col=2;
        }
        System.out.println("Your starting position is "+map[row][col]);
    }
}
