public class adress9Challenge {
    public void theChallenge9(){
        adress9WelcomeText();

        challengeRoom room1Cinema = new challengeRoom("I dont know", "I dont know", "I dont know");
        challengeRoom room2Cinema = new challengeRoom("I dont know", "I dont know", "I dont know");
        challengeRoom room3Cinema = new challengeRoom("I dont know", "I dont know", "I dont know");
        challengeRoom room4Cinema = new challengeRoom("I dont know", "I dont know", "I dont know");

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
    }
}
