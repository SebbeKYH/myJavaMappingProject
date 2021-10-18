import java.io.File;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class adress1Challenge {
    public void theChallenge1() {
        adress1WelcomeText();

        airportMap();
    }

    private void airportMap() {
        challengeRoom room1TheAirport = new challengeRoom("I dont know", "I dont know", "I dont know", 0);
        challengeRoom room2TheAirport = new challengeRoom("I dont know", "I dont know", "I dont know", 0);
        challengeRoom room3TheAirport = new challengeRoom("I dont know", "I dont know", "I dont know", 0);
        challengeRoom room4TheAirport = new challengeRoom("I dont know", "I dont know", "I dont know", 0);

        String[][] postOfficeMap = {
                {room1TheAirport.roomName, room2TheAirport.roomName},
                {room3TheAirport.roomName, room4TheAirport.roomName}
        };
    }

    private void adress1WelcomeText() {
        System.out.println("**************************************************");
        System.out.println("Welcome to The Airport. Have a close look at the overlay of the map." + "\n" +
                "You have to complete all 4 challenges in the 4 different rooms to get your reward. Move to a" + "\n" +
                "specific room by typing it's name");
        //Reads the map in specified text file and returns it to output
        File readAdress1Map = new File("./src/TextFiles/adress1Map");
        try {
            Scanner mapScanner = new Scanner(readAdress1Map);
            while (mapScanner.hasNextLine()) {
                System.out.println(mapScanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("Could not read the map");
        }
    }
}
