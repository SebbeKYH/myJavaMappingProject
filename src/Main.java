import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String []args){
        // Creating scanner object
        Scanner input =new Scanner(System.in);
        //Creating random object
        Random random = new Random();
        //Adresses
        mapAdress adress1=new mapAdress("The Airport", random.nextBoolean());
        mapAdress adress2=new mapAdress("The Post Office", random.nextBoolean());
        mapAdress adress3=new mapAdress("Programmer school", random.nextBoolean());
        mapAdress adress4=new mapAdress("Institute of Geography and strange wonders of the world", random.nextBoolean());
        mapAdress adress5=new mapAdress("Alley in Old Town", random.nextBoolean());
        mapAdress adress6=new mapAdress("Galopping Zebras basement local pub", random.nextBoolean());
        mapAdress adress7=new mapAdress("The Zoo", random.nextBoolean());
        mapAdress adress8=new mapAdress("The Gym", random.nextBoolean());
        mapAdress adress9=new mapAdress("Cinema", random.nextBoolean());

        // Creating the map in 2d field
        String[][] map={
                {adress1.adressName,adress2.adressName,adress3.adressName,},
                {adress4.adressName,adress5.adressName,adress6.adressName,},
                {adress7.adressName,adress8.adressName,adress9.adressName}
        };
        //Declaring a random starting position for player which is at The Airport
        int row=random.nextInt(map.length-0)+0;     //TEST THIS LATER
        int col=random.nextInt(map.length-0)+0;     //TEST THIS LATER

        //Introduce the streets to start from and ask user to pick one
        System.out.println("Welcome the this mapping service. Here are the places you can visit in the city. Each " +
                "destination has special missions to accomplish. Let's see if you can do them all.");
        System.out.println("-"+adress1.adressName+"\n"+"-"+adress2.adressName+"\n"+"-"+adress3.adressName+"\n"+"-"+adress4.adressName
                +"\n"+"-"+adress5.adressName+"\n"+"-"+adress6.adressName+"\n"+"-"+adress7.adressName+"\n"+"-"+adress8.adressName
                +"\n"+"-"+adress9.adressName);
        // User enters a street to start from and is saved in variable startingPoint
        System.out.println("Your starting position is random for every game. This time you started at "+map[row][col]+".");

        // See if its raining at your current position. If it does you have to do the challenge right away.
        if(map[row][col]==adress1.adressName && (adress1.adressRainyWeather==true)){            //TESTA
            System.out.println("Since it's raining right nog you have to go inside and do the challenge now. " +
                    "Too bad you didn't bring and umbrella.");
            //Starting process of challenge from class
            adress1Challenge runTheChallenge = new adress1Challenge();
            runTheChallenge.theChallenge1();
        }
        if(map[row][col]==adress2.adressName && (adress2.adressRainyWeather==true)) {            //TESTA
            System.out.println("Since it's raining right nog you have to go inside and do the challenge now. " +
                    "Too bad you didn't bring and umbrella.");
            //Starting process of challenge from class
            adress2Challenge runTheChallenge=new adress2Challenge();
            runTheChallenge.theChallenge2();
        }
        if(map[row][col]==adress3.adressName && (adress3.adressRainyWeather==true)) {            //TESTA
            System.out.println("Since it's raining right nog you have to go inside and do the challenge now. " +
                    "Too bad you didn't bring and umbrella.");
            //Starting process of challenge from class
            adress3Challenge runTheChallenge=new adress3Challenge();
            runTheChallenge.theChallenge3();
        }
        if(map[row][col]==adress4.adressName && (adress4.adressRainyWeather==true)) {            //TESTA
            System.out.println("Since it's raining right nog you have to go inside and do the challenge now. " +
                    "Too bad you didn't bring and umbrella.");
            //Starting process of challenge from class
            adress4Challenge runTheChallenge=new adress4Challenge();
            runTheChallenge.theChallenge4();
        }
        if(map[row][col]==adress5.adressName && (adress5.adressRainyWeather==true)) {            //TESTA
            System.out.println("Since it's raining right nog you have to go inside and do the challenge now. " +
                    "Too bad you didn't bring and umbrella.");
            //Starting process of challenge from class
            adress5Challenge runTheChallenge=new adress5Challenge();
            runTheChallenge.theChallenge5();
        }
        if(map[row][col]==adress6.adressName && (adress6.adressRainyWeather==true)) {            //TESTA
            System.out.println("Since it's raining right nog you have to go inside and do the challenge now. " +
                    "Too bad you didn't bring and umbrella.");
            //Starting process of challenge from class
            adress6Challenge runTheChallenge=new adress6Challenge();
            runTheChallenge.theChallenge6();
        }
        if(map[row][col]==adress7.adressName && (adress7.adressRainyWeather==true)) {            //TESTA
            System.out.println("Since it's raining right nog you have to go inside and do the challenge now. " +
                    "Too bad you didn't bring and umbrella.");
            //Starting process of challenge from class
            adress7Challenge runTheChallenge=new adress7Challenge();
            runTheChallenge.theChallenge7();
        }
        if(map[row][col]==adress8.adressName && (adress8.adressRainyWeather==true)) {            //TESTA
            System.out.println("Since it's raining right nog you have to go inside and do the challenge now. " +
                    "Too bad you didn't bring and umbrella.");
            //Starting process of challenge from class
            adress8Challenge runTheChallenge=new adress8Challenge();
            runTheChallenge.theChallenge8();
        }
        if(map[row][col]==adress9.adressName && (adress9.adressRainyWeather==true)) {            //TESTA
            System.out.println("Since it's raining right nog you have to go inside and do the challenge now. " +
                    "Too bad you didn't bring and umbrella.");
            //Starting process of challenge from class
            adress9Challenge runTheChallenge=new adress9Challenge();
            runTheChallenge.theChallenge9();
        }
        System.out.println("Do you want to enter  "+map[row][col]+"?");

    }
}
