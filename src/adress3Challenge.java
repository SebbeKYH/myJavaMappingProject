import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class adress3Challenge {
    public void theChallenge3(){
        adress3WelcomeText();

        programmerSchoolMap();
    }

    private void programmerSchoolMap() {
        challengeRoom room1ProgrammerSchool = new challengeRoom("I dont know", "I dont know", "I dont know", 0);
        challengeRoom room2ProgrammerSchool = new challengeRoom("I dont know", "I dont know", "I dont know", 0);
        challengeRoom room3ProgrammerSchool = new challengeRoom("I dont know", "I dont know", "I dont know", 0);
        challengeRoom room4ProgrammerSchool = new challengeRoom("I dont know", "I dont know", "I dont know", 0);

        String [][] postOfficeMap={
                {room1ProgrammerSchool.roomName, room2ProgrammerSchool.roomName},
                {room3ProgrammerSchool.roomName, room4ProgrammerSchool.roomName}};
    }

    private void adress3WelcomeText() {
        System.out.println("**************************************************");
        System.out.println("Welcome to The Programmer School. Have a close look at the overlay of the map."+"\n"+
                "You have to complete all 4 challenges in the 4 different rooms to get your reward. Move to a"+"\n"+
                "specific room by typing it's name");
        //Reads the map in specified text file and returns it to output
        File readAdress3Map=new File("./src/TextFiles/adress3Map");
        try {
            Scanner mapScanner = new Scanner(readAdress3Map);
            while(mapScanner.hasNextLine()){
                System.out.println(mapScanner.nextLine());
            }
        }
        catch(FileNotFoundException e){
            System.out.println("Could not read the map");
        }
    }
}
