import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class adress6Challenge {
    public void theChallenge6(){
        adress6WelcomeText();

        localPubMap();
    }

    private void localPubMap() {
        challengeRoom room1LocalPub = new challengeRoom("I dont know", "I dont know", "I dont know", 0);
        challengeRoom room2LocalPub = new challengeRoom("I dont know", "I dont know", "I dont know", 0);
        challengeRoom room3LocalPub = new challengeRoom("I dont know", "I dont know", "I dont know", 0);
        challengeRoom room4LocalPub = new challengeRoom("I dont know", "I dont know", "I dont know", 0);

        String [][] postOfficeMap={
                {room1LocalPub.roomName, room2LocalPub.roomName},
                {room3LocalPub.roomName, room4LocalPub.roomName}
        };
    }

    private void adress6WelcomeText() {
        System.out.println("**************************************************");
        System.out.println("Welcome to The Galopping Zebra - your local pub. Have a close look at the overlay of the map."+"\n"+
                "You have to complete all 4 challenges in the 4 different rooms to get your reward. Move to a"+"\n"+
                "specific room by typing it's name");
        //Reads the map in specified text file and returns it to output
        File readAdress6Map=new File("./src/adress6Map");
        try {
            Scanner mapScanner = new Scanner(readAdress6Map);
            while(mapScanner.hasNextLine()){
                System.out.println(mapScanner.nextLine());
            }
        }
        catch(FileNotFoundException e){
            System.out.println("Could not read the map");
        }
    }
}
