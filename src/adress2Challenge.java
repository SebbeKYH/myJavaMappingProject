import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class adress2Challenge {
    public void theChallenge2() throws IOException {
        adress2WelcomeText();

        //Creating objects from Room class
        challengeRoom room1ThePostOffice = new challengeRoom("The reception", "When you enter the building you " + "\n" +
                "start talking to a an old man. He introduces himself as Jonathan and he needs your help. " + "\n" +
                "He has written a letter to his daughter back home in Burma but he is unsure of the spelling. " + "\n" +
                "He never had the luxury of attending school as a child and now he needs your help. Take a look " + "\n" +
                "at his letter for him", "Rewrite Jonathans letter and remember to watch out for spelling errors. " + "\n" +
                "If you make it without making any spelling errors you will be rewarded with valuable points", 0);
        challengeRoom room2ThePostOffice = new challengeRoom("The Post Box", "Jonathan needs some help fitting the" + "\n" +
                "letter inside the Post Box. If you help him out there may be unexpected rewards late on", "The Post Box" + "\n" +
                "has an opening of 19*6 cm but his envelope is a bit bigger. Help him trim his letter so if fits.", 0);
        challengeRoom room3ThePostOffice = new challengeRoom("File cabinetts", "Your meeting with Jonathan makes you" + "\n" +
                "curious about the Post Office. In the file cabinetts there are a lot of things to look at", "An" + "\n" +
                "employee cathes you of guard and asks you what your doing here. Try to divert his attention.", 0);
        challengeRoom room4ThePostOffice = new challengeRoom("I dont know", "I dont know", "I dont know", 0);

        //Create the map array
        adress2Map(room1ThePostOffice, room2ThePostOffice, room3ThePostOffice, room4ThePostOffice);

        //Entering the first challenge
        System.out.println("You have entered " + room1ThePostOffice.roomName + " " + room1ThePostOffice.roomChallenge);
        System.out.println("Bellow is the letter that Jonathan wrote");
        System.out.println("\n");

        readChallengeLetter();

        writePlayerLetter();

        System.out.println("Bellow is players input");

        readPlayerLetter();
    }

    private void readPlayerLetter() {
        File playerLetter = new File("./src/TextFiles/playerLetter");
        try {
            Scanner playerLetterScanner = new Scanner(playerLetter);
            while (playerLetterScanner.hasNextLine()) {
                System.out.println(playerLetterScanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("Could not read the letter");
        }
    }

    private void writePlayerLetter() throws IOException {
        Scanner playerLetterInput = new Scanner(System.in);
        String letterText = "";
        while(playerLetterInput.hasNextLine()) {
            letterText=letterText.concat(playerLetterInput.nextLine()+"\n");
        }
        FileWriter writePlayerLetter = new FileWriter("./src/TextFiles/playerLetter");
        writePlayerLetter.write(letterText);
        writePlayerLetter.close();
    }

    private void readChallengeLetter() {
        //Reads Jonathans letter in specified text file and returns it to output
        File readJonathansLetter = new File("./src/TextFiles/jonathansLetter");
        try {
            Scanner jonathansLetterScanner = new Scanner(readJonathansLetter);
            while (jonathansLetterScanner.hasNextLine()) {
                System.out.println(jonathansLetterScanner.nextLine());
                jonathansLetterScanner.close();
            }
        } catch (FileNotFoundException e) {
            System.out.println("Could not read the letter");
        }
    }

    private void adress2Map(challengeRoom room1ThePostOffice, challengeRoom room2ThePostOffice, challengeRoom room3ThePostOffice, challengeRoom room4ThePostOffice) {
        String[][] postOfficeMap = {
                {room1ThePostOffice.roomName, room2ThePostOffice.roomName},
                {room3ThePostOffice.roomName, room4ThePostOffice.roomName}};
    }

    public void adress2WelcomeText () {
            System.out.println("**************************************************");
            System.out.println("Welcome to The Post Office. Have a close look at the overlay of the map." + "\n" +
                    "You have to complete all 4 challenges in the 4 different rooms to get your reward. Move to a" + "\n" +
                    "specific room by typing it's name.");
            //Reads the map in specified text file and returns it to output
            File readAdress2Map = new File("./src/TextFiles/adress2Map");
            try {
                Scanner mapScanner = new Scanner(readAdress2Map);
                while (mapScanner.hasNextLine()) {
                    System.out.println(mapScanner.nextLine());
                }
            } catch (FileNotFoundException e) {
                System.out.println("Could not read the map");
            }
        }
    }

