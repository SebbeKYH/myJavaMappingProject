public class adress4Challenge {
    public void theChallenge4(){
        adress4WelcomeText();

        geographyMap();
    }

    private void geographyMap() {
        challengeRoom room1Geography = new challengeRoom("I dont know", "I dont know", "I dont know");
        challengeRoom room2Geography = new challengeRoom("I dont know", "I dont know", "I dont know");
        challengeRoom room3Geography = new challengeRoom("I dont know", "I dont know", "I dont know");
        challengeRoom room4Geography = new challengeRoom("I dont know", "I dont know", "I dont know");

        String [][] postOfficeMap={
                {room1Geography.roomName, room2Geography.roomName},
                {room3Geography.roomName, room4Geography.roomName}
        };
    }

    private void adress4WelcomeText() {
        System.out.println("**************************************************");
        System.out.println("Welcome to Institute of Geography and strange wonders of the world. Have a close look at the overlay of the map."+"\n"+
                "You have to complete all 4 challenges in the 4 different rooms to get your reward. Move to a"+"\n"+
                "specific room by typing it's name");
    }
}
