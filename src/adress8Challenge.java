import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class adress8Challenge {
    public void theChallenge8(){
        adress8WelcomeText();

        gymMap();
    }

    private void gymMap() {
        challengeRoom room1Gym = new challengeRoom("I dont know", "I dont know", "I dont know", 0);
        challengeRoom room2Gym = new challengeRoom("I dont know", "I dont know", "I dont know", 0);
        challengeRoom room3Gym = new challengeRoom("I dont know", "I dont know", "I dont know", 0);
        challengeRoom room4Gym = new challengeRoom("I dont know", "I dont know", "I dont know", 0);

        String [][] postOfficeMap={
                {room1Gym.roomName, room2Gym.roomName},
                {room3Gym.roomName, room4Gym.roomName}
        };
    }

    private void adress8WelcomeText() {
        System.out.println("Welcome to The Gym. Have a close look at the overlay of the map."+"\n"+
                "You have to complete all 4 challenges in the 4 different rooms to get your reward. Move to a"+"\n"+
                "specific room by typing it's name");
        //Reads the map in specified text file and returns it to output
        File readAdress8Map=new File("./src/TextFiles/adress8Map");
        try {
            Scanner mapScanner = new Scanner(readAdress8Map);
            while(mapScanner.hasNextLine()){
                System.out.println(mapScanner.nextLine());
            }
        }
        catch(FileNotFoundException e){
            System.out.println("Could not read the map");
        }
    }
}
