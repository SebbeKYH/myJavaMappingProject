import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class adress5Challenge {
    public void theChallenge5(){
        adress5WelcomeText();

        alleyMap();
    }

    private void alleyMap() {
        challengeRoom room1Alley = new challengeRoom("I dont know", "I dont know", "I dont know", 0);
        challengeRoom room2Alley = new challengeRoom("I dont know", "I dont know", "I dont know", 0);
        challengeRoom room3Alley = new challengeRoom("I dont know", "I dont know", "I dont know", 0);
        challengeRoom room4Alley = new challengeRoom("I dont know", "I dont know", "I dont know", 0);

        String [][] postOfficeMap={
                {room1Alley.roomName, room2Alley.roomName},
                {room3Alley.roomName, room4Alley.roomName}
        };
    }

    private void adress5WelcomeText() {
        System.out.println("**************************************************");
        System.out.println("Welcome to The Alley in old Town. Have a close look at the overlay of the map."+"\n"+
                "You have to complete all 4 challenges in the 4 different rooms to get your reward. Move to a"+"\n"+
                "specific room by typing it's name");
        //Reads the map in specified text file and returns it to output
        File readAdress5Map=new File("./src/adress5Map");
        try {
            Scanner mapScanner = new Scanner(readAdress5Map);
            while(mapScanner.hasNextLine()){
                System.out.println(mapScanner.nextLine());
            }
        }
        catch(FileNotFoundException e){
            System.out.println("Could not read the map");
        }
    }
}
