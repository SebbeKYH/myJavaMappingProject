import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class adress9Challenge {
    public void theChallenge9(){
        adress9WelcomeText();

        challengeRoom room1Cinema = new challengeRoom("I dont know", "I dont know", "I dont know", 0);
        challengeRoom room2Cinema = new challengeRoom("I dont know", "I dont know", "I dont know", 0);
        challengeRoom room3Cinema = new challengeRoom("I dont know", "I dont know", "I dont know", 0);
        challengeRoom room4Cinema = new challengeRoom("I dont know", "I dont know", "I dont know", 0);

        String [][] postOfficeMap={
                {room1Cinema.roomName, room2Cinema.roomName},
                {room3Cinema.roomName, room4Cinema.roomName}
        };
    }

    private void adress9WelcomeText() {
        System.out.println("**************************************************");
        System.out.println("Welcome to The Cinema. Have a close look at the overlay of the map."+"\n"+
                "You have to complete all 4 challenges in the 4 different rooms to get your reward. Move to a"+"\n"+
                "specific room by typing it's name");
        //Reads the map in specified text file and returns it to output
        File readAdress9Map=new File("./src/adress9Map");
        try {
            Scanner mapScanner = new Scanner(readAdress9Map);
            while(mapScanner.hasNextLine()){
                System.out.println(mapScanner.nextLine());
            }
        }
        catch(FileNotFoundException e){
            System.out.println("Could not read the map");
        }
    }
}
