public class adress8Challenge {
    public void theChallenge8(){
        adress8WelcomeText();

        gymMap();
    }

    private void gymMap() {
        challengeRoom room1Gym = new challengeRoom("I dont know", "I dont know", "I dont know");
        challengeRoom room2Gym = new challengeRoom("I dont know", "I dont know", "I dont know");
        challengeRoom room3Gym = new challengeRoom("I dont know", "I dont know", "I dont know");
        challengeRoom room4Gym = new challengeRoom("I dont know", "I dont know", "I dont know");

        String [][] postOfficeMap={
                {room1Gym.roomName, room2Gym.roomName},
                {room3Gym.roomName, room4Gym.roomName}
        };
    }

    private void adress8WelcomeText() {
        System.out.println("Welcome to The Gym. Have a close look at the overlay of the map."+"\n"+
                "You have to complete all 4 challenges in the 4 different rooms to get your reward. Move to a"+"\n"+
                "specific room by typing it's name");
    }
}
