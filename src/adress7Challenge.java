import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class adress7Challenge {
    public void theChallenge7(){
        adress7WelcomeText();

        zooMap();
    }

    private void zooMap() {
        challengeRoom room1TheZoo = new challengeRoom("I dont know", "I dont know", "I dont know", 0);
        challengeRoom room2TheZoo = new challengeRoom("I dont know", "I dont know", "I dont know", 0);
        challengeRoom room3TheZoo = new challengeRoom("I dont know", "I dont know", "I dont know", 0);
        challengeRoom room4TheZoo = new challengeRoom("I dont know", "I dont know", "I dont know", 0);

        String [][] postOfficeMap={
                {room1TheZoo.roomName, room2TheZoo.roomName},
                {room3TheZoo.roomName, room4TheZoo.roomName}
        };
    }

    private void adress7WelcomeText() {
        System.out.println("**************************************************");
        System.out.println("Welcome to The Zoo. Have a close look at the overlay of the map."+"\n"+
                "You have to complete all 4 challenges in the 4 different rooms to get your reward. Move to a"+"\n"+
                "specific room by typing it's name");
        //Reads the map in specified text file and returns it to output
        File readAdress7Map=new File("./src/adress7Map");
        try {
            Scanner mapScanner = new Scanner(readAdress7Map);
            while(mapScanner.hasNextLine()){
                System.out.println(mapScanner.nextLine());
            }
        }
        catch(FileNotFoundException e){
            System.out.println("Could not read the map");
        }
    }
}
