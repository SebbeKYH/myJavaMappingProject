import java.io.File;
import java.util.Random;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class adress1Challenge {
    public void theChallenge1() {
        //Creating the rooms.
        challengeRoom room1TheAirport = new challengeRoom("The terminal for taking a flight to Cuba ", "Entering the" +
                "terminal you see a clerk asking for your attention. Do you want to buy a ticket?",
                "The total cost of leaving for Cuba is 50. Do you want to go?", 0);
        challengeRoom room2TheAirport = new challengeRoom("The terminal for taking a flight to Moscow. ", "Entering the" +
                "terminal you see a clerk asking for your attention. Do you want to buy a ticket? ", " The total cost " +
                "for traveling to Moscow is 75. Do you want to go?", 0);
        challengeRoom room3TheAirport = new challengeRoom("The terminal for taking a flight to Stockholm ", "Entering the" +
                "terminal you see a clerk asking for you attention. Do you want to buy your ticket? ", " The " +
                "total cost for traveling to Stockholm is 100. Do ypu want to go?", 0);
        challengeRoom room4TheAirport = new challengeRoom("The terminal for taking a flight to HOME.2",
                "Entering the terminal you see a clerk asking for your attention. Do you want to buy a ticket? ",
                "The total cost of going home is 200. Do you want to go?", 0);

        //Creating the adress map with different rooms
        String[][] postOfficeMap = {
                {room1TheAirport.roomName, room2TheAirport.roomName},
                {room3TheAirport.roomName, room4TheAirport.roomName}};

        // Introduction to the adress
        welcomeText();
        // Prints visual representation of the map
        readRoomMap("./src/TextFiles/adress1Map", "Could not read the map");

        //Cases depending on which room you are in.
        System.out.print("> ");
        Scanner roomInput = new Scanner(System.in);
        boolean caseOneFinished = false;
        boolean caseTwoFinished = false;
        boolean caseThreeFinished = false;
        boolean caseFourFinished = false;
        while ((caseOneFinished & caseTwoFinished & caseThreeFinished & caseFourFinished) == false){
            switch (roomInput.nextInt()) {
                case 1:

                    System.out.println("You have entered " + room1TheAirport.roomName + room1TheAirport.roomDescription +
                            room1TheAirport.roomChallenge);
                    // HERE IS MORE ABOUT WHAT HAPPENS
                    caseOneFinished = true;
                    break;
                case 2:
                    System.out.println("You have entered " + room2TheAirport.roomName + room2TheAirport.roomDescription +
                            room2TheAirport.roomChallenge);
                    //HERE IS MORE ABOUT WHAT HAPPENS
                    caseTwoFinished = true;
                    break;
                case 3:
                    System.out.println("You have entered " + room3TheAirport.roomName + room3TheAirport.roomDescription +
                            room3TheAirport.roomChallenge);
                    //HERE IS MORE ABOUT WHAT HAPPENS
                    caseThreeFinished = true;
                    break;
                case 4:
                    System.out.println("You have entered " + room4TheAirport.roomName + room4TheAirport.roomDescription +
                            room4TheAirport.roomChallenge);
                    //HERE IS MORE ABOUT WHAT HAPPENS
                    caseFourFinished = true;
                    //when all four are true the while case is over.
                    break;
            }
            welcomeText();
            readRoomMap("./src/TextFiles/adress2Map", "Could not read the map");
        }
        if((caseOneFinished & caseTwoFinished & caseThreeFinished & caseFourFinished) == true){
            //Entering the staring map again/overlay of the city
            backToBigMap();
        }
    }

    private void backToBigMap() {
        System.out.println("If you want to exit this building type EXIT");
        Scanner adressScanner = new Scanner(System.in);
        String backToBigMap = adressScanner.nextLine();
        if(backToBigMap.equalsIgnoreCase("exit")){
            gameLoop bigMap = new gameLoop();
            bigMap.gameLoop();
        }
    }

    private void welcomeText() {
        System.out.println("**************************************************");
        System.out.println("Welcome to The Airport. Have a close look at the overlay of the map."+"\n"+
                "When you visit the rooms you have a shot at taking home some valuable points." +
                " Enter which room you want to enter next. Type the corresponding number to go to room.");
    }

    private void readRoomMap(String s, String s2) {
        //Reads the map in specified text file and returns it to output
        File readAdress2Map = new File(s);
        try {
            Scanner mapScanner = new Scanner(readAdress2Map);
            while (mapScanner.hasNextLine()) {
                System.out.println(mapScanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println(s2);
        }
    }
}

