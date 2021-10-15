public class adress7Challenge {
    public void theChallenge7(){
        adress7WelcomeText();

        zooMap();
    }

    private void zooMap() {
        challengeRoom room1TheZoo = new challengeRoom("I dont know", "I dont know", "I dont know");
        challengeRoom room2TheZoo = new challengeRoom("I dont know", "I dont know", "I dont know");
        challengeRoom room3TheZoo = new challengeRoom("I dont know", "I dont know", "I dont know");
        challengeRoom room4TheZoo = new challengeRoom("I dont know", "I dont know", "I dont know");

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
    }
}
