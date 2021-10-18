import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class adress4Challenge {
    public void theChallenge4(){
        adress4WelcomeText();

        geographyMap();
    }

    private void geographyMap() {
        challengeRoom room1Geography = new challengeRoom("I dont know", "I dont know", "I dont know", 0);
        challengeRoom room2Geography = new challengeRoom("I dont know", "I dont know", "I dont know", 0);
        challengeRoom room3Geography = new challengeRoom("I dont know", "I dont know", "I dont know", 0);
        challengeRoom room4Geography = new challengeRoom("I dont know", "I dont know", "I dont know", 0);

        String [][] postOfficeMap={
                {room1Geography.roomName, room2Geography.roomName},
                {room3Geography.roomName, room4Geography.roomName}
        };
    }

    private void adress4WelcomeText() {
        System.out.println("**************************************************");
        System.out.println("Welcome to Institute of Geography and strange wonders of the world. Have a close look at the overlay of the map."+"\n"+
                "You have to complete all 4 challenges in the 4 different rooms to get your reward. Move to a"+"\n"+
                "specific room by typing it's name");
        //Reads the map in specified text file and returns it to output
        File readAdress4Map=new File("./src/TextFiles/adress4Map");
        try {
            Scanner mapScanner = new Scanner(readAdress4Map);
            while(mapScanner.hasNextLine()){
                System.out.println(mapScanner.nextLine());
            }
        }
        catch(FileNotFoundException e){
            System.out.println("Could not read the map");
        }
    }
}
