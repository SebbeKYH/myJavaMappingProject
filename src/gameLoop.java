import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

public class gameLoop {
    public void gameLoop() {

        //Creating random object
        Random random= new Random();

        //Adresses
        mapAdress adress1 = new mapAdress("The Airport", random.nextBoolean());
        mapAdress adress2 = new mapAdress("The Post Office", random.nextBoolean());
        mapAdress adress3 = new mapAdress("Programmer school", random.nextBoolean());
        mapAdress adress4 = new mapAdress("Institute of Geography and strange wonders of the world", random.nextBoolean());
        mapAdress adress5 = new mapAdress("Alley in Old Town", random.nextBoolean());
        mapAdress adress6 = new mapAdress("Galopping Zebras basement local pub", random.nextBoolean());
        mapAdress adress7 = new mapAdress("The Zoo", random.nextBoolean());
        mapAdress adress8 = new mapAdress("The Gym", random.nextBoolean());
        mapAdress adress9 = new mapAdress("Cinema", random.nextBoolean());

        String[][] map = adressMap(adress1, adress2, adress3, adress4, adress5, adress6, adress7, adress8, adress9);

        //Row and col get random numbers for different start positions every time
        int row = random.nextInt(map.length - 0) + 0;     //TEST THIS LATER
        int col = random.nextInt(map.length - 0) + 0;     //TEST THIS LATER

        //What is the starting position
        startingPosition(adress1.adressName+adress2.adressName+adress3.adressName+adress4.adressName
                +adress5.adressName+adress6.adressName+adress7.adressName+adress8.adressName
                +adress9.adressName, map[row][col]);

        //Method for determining if its raining or not
        isItRaining(adress1, adress2, adress3, adress4, adress5, adress6, adress7, adress8, adress9, map, row, col);

        //Method for determining if its NOT raining
        isItNotRaining(adress1, adress2, adress3, adress4, adress5, adress6, adress7, adress8, adress9, map, row, col);


    }

    private String[][] adressMap(mapAdress adress1, mapAdress adress2, mapAdress adress3, mapAdress adress4, mapAdress adress5, mapAdress adress6, mapAdress adress7, mapAdress adress8, mapAdress adress9) {
        String[][] map = {
                {adress1.adressName, adress2.adressName, adress3.adressName,},
                {adress4.adressName, adress5.adressName, adress6.adressName,},
                {adress7.adressName, adress8.adressName, adress9.adressName}};
        return map;
    }

    private void isItNotRaining(mapAdress adress1, mapAdress adress2, mapAdress adress3, mapAdress adress4, mapAdress adress5, mapAdress adress6, mapAdress adress7, mapAdress adress8, mapAdress adress9, String[][] map, int row, int col) {
        Scanner notRainingScanner = new Scanner (System.in);
        if(map[row][col] == adress1.adressName && (adress1.adressRainyWeather == false)) {
            System.out.println("Do you want to enter  " + map[row][col] + "?");
            System.out.print(">");
            String adressChoice1=notRainingScanner.nextLine();
            if(adressChoice1.equalsIgnoreCase("yes")){
                adress1Challenge runTheChallenge = new adress1Challenge();
                runTheChallenge.theChallenge1();
            }
            else {
                System.out.println("Are you cheating? Try again");
            }
        }
        if(map[row][col] == adress2.adressName && (adress2.adressRainyWeather == false)) {
            System.out.println("Do you want to enter  " + map[row][col] + "?");
            System.out.print(">");
            String adressChoice2=notRainingScanner.nextLine();
            if(adressChoice2.equalsIgnoreCase("yes")){
                adress2Challenge runTheChallenge = new adress2Challenge();
                runTheChallenge.theChallenge2();
            }
            else {
                System.out.println("Are you cheating? Try again");
            }
        }
        if(map[row][col] == adress3.adressName && (adress3.adressRainyWeather == false)) {
            System.out.println("Do you want to enter  " + map[row][col] + "?");
            System.out.print(">");
            String adressChoice3=notRainingScanner.nextLine();
            if(adressChoice3.equalsIgnoreCase("yes")){
                adress3Challenge runTheChallenge = new adress3Challenge();
                runTheChallenge.theChallenge3();
            }
            else {
                System.out.println("Are you cheating? Try again");
            }
        }
        if(map[row][col] == adress4.adressName && (adress4.adressRainyWeather == false)) {
            System.out.println("Do you want to enter  " + map[row][col] + "?");
            System.out.print(">");
            String adressChoice4=notRainingScanner.nextLine();
            if(adressChoice4.equalsIgnoreCase("yes")){
                adress4Challenge runTheChallenge = new adress4Challenge();
                runTheChallenge.theChallenge4();
            }
            else {
                System.out.println("Are you cheating? Try again");
            }
        }
        if(map[row][col] == adress5.adressName && (adress5.adressRainyWeather == false)) {
            System.out.println("Do you want to enter  " + map[row][col] + "?");
            System.out.print(">");
            String adressChoice5=notRainingScanner.nextLine();
            if(adressChoice5.equalsIgnoreCase("yes")){
                adress5Challenge runTheChallenge = new adress5Challenge();
                runTheChallenge.theChallenge5();
            }
            else {
                System.out.println("Are you cheating? Try again");
            }
        }
        if(map[row][col] == adress6.adressName && (adress6.adressRainyWeather == false)) {
            System.out.println("Do you want to enter  " + map[row][col] + "?");
            System.out.print(">");
            String adressChoice6=notRainingScanner.nextLine();
            if(adressChoice6.equalsIgnoreCase("yes")){
                adress6Challenge runTheChallenge = new adress6Challenge();
                runTheChallenge.theChallenge6();
            }
            else {
                System.out.println("Are you cheating? Try again");
            }
        }
        if(map[row][col] == adress7.adressName && (adress7.adressRainyWeather == false)) {
            System.out.println("Do you want to enter  " + map[row][col] + "?");
            System.out.print(">");
            String adressChoice7=notRainingScanner.nextLine();
            if(adressChoice7.equalsIgnoreCase("yes")){
                adress7Challenge runTheChallenge = new adress7Challenge();
                runTheChallenge.theChallenge7();
            }
            else {
                System.out.println("Are you cheating? Try again");
            }
        }
        if(map[row][col] == adress8.adressName && (adress8.adressRainyWeather == false)) {
            System.out.println("Do you want to enter  " + map[row][col] + "?");
            System.out.print(">");
            String adressChoice8=notRainingScanner.nextLine();
            if(adressChoice8.equalsIgnoreCase("yes")){
                adress8Challenge runTheChallenge = new adress8Challenge();
                runTheChallenge.theChallenge8();
            }
            else {
                System.out.println("Are you cheating? Try again");
            }
        }
        if(map[row][col] == adress9.adressName && (adress9.adressRainyWeather == false)) {
            System.out.println("Do you want to enter  " + map[row][col] + "?");
            System.out.print(">");
            String adressChoice9=notRainingScanner.nextLine();
            if(adressChoice9.equalsIgnoreCase("yes")){
                adress9Challenge runTheChallenge = new adress9Challenge();
                runTheChallenge.theChallenge9();
            }
            else {
                System.out.println("Are you cheating? Try again");
            }
        }
    }

    private void startingPosition(String s, String s9) {
        //Introduce the streets to start from and ask user to pick one
        System.out.println("Welcome to this city sightseeing game. Here are the places you can visit in the city. Each " +
                "destination has special missions to accomplish. Let's see if you can do them all.");
        //Reads the map in specified text file and returns it to output
        File readBigMap=new File("./src/TextFiles/bigMap");
        try {
            Scanner mapScanner = new Scanner(readBigMap);
            while(mapScanner.hasNextLine()){
                System.out.println(mapScanner.nextLine());
            }
        }
        catch(FileNotFoundException e){
            System.out.println("Could not read the map");
        }
        // User enters a street to start from and is saved in variable startingPoint
        System.out.println("Your starting position is random for every game. This time you started at " + s9 + ".");
    }

    private void isItRaining(mapAdress adress1, mapAdress adress2, mapAdress adress3, mapAdress adress4, mapAdress adress5, mapAdress adress6, mapAdress adress7, mapAdress adress8, mapAdress adress9, String[][] map, int row, int col) {
        // See if its raining at your current position. If it does you have to do the challenge right away.
        if (map[row][col] == adress1.adressName && (adress1.adressRainyWeather == true)) {            //TESTA
            System.out.println("Since it's raining right nog you have to go inside and do the challenge now. " +
                    "Too bad you didn't bring and umbrella.");
            //Starting process of challenge from class
            adress1Challenge runTheChallenge = new adress1Challenge();
            runTheChallenge.theChallenge1();
        }
        if (map[row][col] == adress2.adressName && (adress2.adressRainyWeather == true)) {            //TESTA
            System.out.println("Since it's raining right nog you have to go inside and do the challenge now. " +
                    "Too bad you didn't bring and umbrella.");
            //Starting process of challenge from class
            adress2Challenge runTheChallenge = new adress2Challenge();
            runTheChallenge.theChallenge2();
        }
        if (map[row][col] == adress3.adressName && (adress3.adressRainyWeather == true)) {            //TESTA
            System.out.println("Since it's raining right nog you have to go inside and do the challenge now. " +
                    "Too bad you didn't bring and umbrella.");
            //Starting process of challenge from class
            adress3Challenge runTheChallenge = new adress3Challenge();
            runTheChallenge.theChallenge3();
        }
        if (map[row][col] == adress4.adressName && (adress4.adressRainyWeather == true)) {            //TESTA
            System.out.println("Since it's raining right nog you have to go inside and do the challenge now. " +
                    "Too bad you didn't bring and umbrella.");
            //Starting process of challenge from class
            adress4Challenge runTheChallenge = new adress4Challenge();
            runTheChallenge.theChallenge4();
        }
        if (map[row][col] == adress5.adressName && (adress5.adressRainyWeather == true)) {            //TESTA
            System.out.println("Since it's raining right nog you have to go inside and do the challenge now. " +
                    "Too bad you didn't bring and umbrella.");
            //Starting process of challenge from class
            adress5Challenge runTheChallenge = new adress5Challenge();
            runTheChallenge.theChallenge5();
        }
        if (map[row][col] == adress6.adressName && (adress6.adressRainyWeather == true)) {            //TESTA
            System.out.println("Since it's raining right nog you have to go inside and do the challenge now. " +
                    "Too bad you didn't bring and umbrella.");
            //Starting process of challenge from class
            adress6Challenge runTheChallenge = new adress6Challenge();
            runTheChallenge.theChallenge6();
        }
        if (map[row][col] == adress7.adressName && (adress7.adressRainyWeather == true)) {            //TESTA
            System.out.println("Since it's raining right nog you have to go inside and do the challenge now. " +
                    "Too bad you didn't bring and umbrella.");
            //Starting process of challenge from class
            adress7Challenge runTheChallenge = new adress7Challenge();
            runTheChallenge.theChallenge7();
        }
        if (map[row][col] == adress8.adressName && (adress8.adressRainyWeather == true)) {            //TESTA
            System.out.println("Since it's raining right nog you have to go inside and do the challenge now. " +
                    "Too bad you didn't bring and umbrella.");
            //Starting process of challenge from class
            adress8Challenge runTheChallenge = new adress8Challenge();
            runTheChallenge.theChallenge8();
        }
        if (map[row][col] == adress9.adressName && (adress9.adressRainyWeather == true)) {            //TESTA
            System.out.println("Since it's raining right nog you have to go inside and do the challenge now. " +
                    "Too bad you didn't bring and umbrella.");
            //Starting process of challenge from class
            adress9Challenge runTheChallenge = new adress9Challenge();
            runTheChallenge.theChallenge9();
        }
    }
}