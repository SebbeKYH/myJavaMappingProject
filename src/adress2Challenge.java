import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

public class adress2Challenge {
    public void theChallenge2() {
        //Creating the rooms.
        challengeRoom room1ThePostOffice = new challengeRoom("The reception", "When you enter the building you " + "\n" +
                "start talking to a an old man. He introduces himself as Jonathan and he needs your help. " + "\n" +
                "He has written a letter to his daughter back home in Burma but he is unsure of the spelling. " + "\n" +
                "He never had the luxury of attending school as a child and now he needs your help. Take a look " + "\n" +
                "at his letter for him", "Rewrite Jonathans letter and remember to watchout for spelling errors. " + "\n" +
                "If you make it without making any spelling errors you will be rewarded with valuable points", 0);
        challengeRoom room2ThePostOffice = new challengeRoom("The Post Box ", "Jonathan needs some help fitting the" + "\n" +
                "letter inside the Post Box. If you help him out there may be unexpected rewards later on.", " The Post Box" + "\n" +
                "has an opening of 19*6 cm but his envelope is a bit bigger. Help him trim his letter so if fits.", 0);
        challengeRoom room3ThePostOffice = new challengeRoom("File cabinetts", "Your meeting with Jonathan makes you " + "\n" +
                "curious about the Post Office. In the file cabinetts there are a lot of things to look at", " An" + "\n" +
                "employee cathes you of guard and asks you what your doing here. Try to divert his attention.", 0);
        challengeRoom room4ThePostOffice = new challengeRoom("I dont know", "I dont know", "I dont know", 0);

        //Creating the adress map with different rooms
        String[][] postOfficeMap = {
                {room1ThePostOffice.roomName, room2ThePostOffice.roomName},
                {room3ThePostOffice.roomName, room4ThePostOffice.roomName}};

        //Create while loop for adress loop
        //boolean adress2Loop = true;
        //while (adress2Loop=true) {
        // Introduction to the adress
        welcomeText();
        // Prints visual representation of the map
        readRoomMap("./src/TextFiles/adress2Map", "Could not read the map");

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

                System.out.println("You have entered " + room1ThePostOffice.roomName + room1ThePostOffice.roomDescription +
                        room1ThePostOffice.roomChallenge);
                readJonathansLetter();
                caseOneFinished = true;
                break;
            case 2:
                System.out.println("You have entered " + room2ThePostOffice.roomName + room2ThePostOffice.roomDescription +
                        room2ThePostOffice.roomChallenge);
                System.out.println("Jonathans letter is a big letter sized at 82*69. Type the correct value to be" +
                        "trimmed of his letter to be able to fit in the mailbox.");
                Scanner case2Scanner = new Scanner(System.in);
                System.out.print("> ");
                String case2Value = case2Scanner.nextLine();
                if (case2Value.equalsIgnoreCase("63*60")) {
                    System.out.println("You are correct. If you trim 63*60 from letter it will fit i the mailbox." +
                            " Jonathan is very thankful");
                } else {
                    System.out.println("You better try that calculating buisness one more time");
                }
                caseTwoFinished = true;
                break;
            case 3:
                System.out.println("You have entered " + room3ThePostOffice.roomName + room3ThePostOffice.roomDescription +
                        room3ThePostOffice.roomChallenge);
                System.out.println("Write something clever to make him leave you alone. If you succeed you will " +
                        "be rewarded.");
                Scanner cleverScanner = new Scanner(System.in);
                System.out.print("> ");
                String foolClerk = cleverScanner.nextLine();
                Random random = new Random();
                int takeAChange = random.nextInt(3);
                if (takeAChange >= 1) {
                    System.out.println("You managed to fool the stupid desk clerk and have been rewarded with" +
                            " valuable points.");
                } else {
                    System.out.println("Yoy told him " + foolClerk + " .Unfortunately this man is extremely clever and you weren't able to fool" +
                            "him. He also takes away some of your points as punishment of being in an unauthorized" +
                            "area");
                }
                caseThreeFinished = true;
                break;
            case 4:
                Scanner quizAnswer = new Scanner(System.in);
                System.out.println("You have entered " + room4ThePostOffice.roomName + room4ThePostOffice.roomDescription +
                        room4ThePostOffice.roomChallenge);
                System.out.println("Its time for a quiz about the swedish postal service. We hope you" +
                        "do well");
                System.out.println("What is the name of the swedish postal servic?" + "\n" +
                        "1. Systembolaget" + "\n" +
                        "x. Skatteverket" + "\n" +
                        "2. Postnord");
                System.out.print("> ");
                String firstAnswer = quizAnswer.nextLine();
                System.out.println("What year was the company created?" + "\n" +
                        "1. 1923" + "\n" +
                        "x. 1632" + "\n" +
                        "3. 2009");
                System.out.print("> ");
                String secondAnswer = quizAnswer.nextLine();
                System.out.println("You are doing really well. Keep up the good work!");
                System.out.println("What country shares the ownership of the company with the swedish state?" + "\n" +
                        "1. Norway" + "\n" +
                        "x. Iceland" + "\n" +
                        "2. Denmark");
                System.out.print("> ");
                String thirdAnswer = quizAnswer.nextLine();
                System.out.println("And now for the final question");
                System.out.println("Why is post in sweden never delivered on time?" + "\n" +
                        "1. Swedish postmen are lazy" + "\n" +
                        "x. Were not sure but we suspect it has something to do with the danes" + "\n" +
                        "2. Postnord still delivers mail by bicycle (and considering the weather that's incredible");
                System.out.print("> ");
                String fourthAnswer = quizAnswer.nextLine();
                caseFourFinished = true;
                break;
        }
        welcomeText();
        readRoomMap("./src/TextFiles/adress2Map", "Could not read the map");
    }
            if((caseOneFinished & caseTwoFinished & caseThreeFinished & caseFourFinished) == true){
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
        System.out.println("Welcome to The Post Office. Have a close look at the overlay of the map."+"\n"+
                "You have to complete all 4 challenges in the 4 different rooms to get your reward." +
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

    private void readJonathansLetter() {
        //Read Jonathans letter
        File jonathanLetter=new File("./src/TextFiles/jonathansLetter");
        try {
        Scanner jonathanScanner = new Scanner(jonathanLetter);
        while(jonathanScanner.hasNextLine()){
            System.out.println(jonathanScanner.nextLine());
        }
    }
        catch(FileNotFoundException e){
        System.out.println("Could not read the letter");
    }
    }
}
