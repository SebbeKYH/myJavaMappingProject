public class adress5Challenge {
    public void theChallenge5(){
        adress5WelcomeText();

        alleyMap();
    }

    private void alleyMap() {
        challengeRoom room1Alley = new challengeRoom("I dont know", "I dont know", "I dont know");
        challengeRoom room2Alley = new challengeRoom("I dont know", "I dont know", "I dont know");
        challengeRoom room3Alley = new challengeRoom("I dont know", "I dont know", "I dont know");
        challengeRoom room4Alley = new challengeRoom("I dont know", "I dont know", "I dont know");

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
    }
}
