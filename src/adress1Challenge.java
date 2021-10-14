public class adress1Challenge {
    public void theChallenge1(){
        adress1WelcomeText();

        airportMap();
    }

    private void airportMap() {
        challengeRoom room1TheAirport = new challengeRoom("I dont know", "I dont know", "I dont know");
        challengeRoom room2TheAirport = new challengeRoom("I dont know", "I dont know", "I dont know");
        challengeRoom room3TheAirport = new challengeRoom("I dont know", "I dont know", "I dont know");
        challengeRoom room4TheAirport = new challengeRoom("I dont know", "I dont know", "I dont know");

        String [][] postOfficeMap={
                {room1TheAirport.roomName, room2TheAirport.roomName},
                {room3TheAirport.roomName, room4TheAirport.roomName}
        };
    }

    private void adress1WelcomeText() {
        System.out.println("**************************************************");
        System.out.println("Welcome to The Airport. Have a close look at the overlay of the map."+"\n"+
                "You have to complete all 4 challenges in the 4 different rooms to get your reward. Move to a"+"\n"+
                "specific room by typing it's name");
    }
}
