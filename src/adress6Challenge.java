public class adress6Challenge {
    public void theChallenge6(){
        adress6WelcomeText();

        localPubMap();
    }

    private void localPubMap() {
        challengeRoom room1LocalPub = new challengeRoom("I dont know", "I dont know", "I dont know");
        challengeRoom room2LocalPub = new challengeRoom("I dont know", "I dont know", "I dont know");
        challengeRoom room3LocalPub = new challengeRoom("I dont know", "I dont know", "I dont know");
        challengeRoom room4LocalPub = new challengeRoom("I dont know", "I dont know", "I dont know");

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
    }
}
