public class challengeRoom {
    protected String roomName;
    protected String roomDescription;
    protected String roomChallenge;
    protected int gameCurrency;

    public challengeRoom(String inRoomName, String inRoomDescription, String inRoomChallenge, int inGameCurrency){
        roomName=inRoomName;
        roomDescription=inRoomDescription;
        roomChallenge=inRoomChallenge;
        gameCurrency=inGameCurrency;
    }
    public static void setRoomName(String roomName){
        roomName=roomName;
    }
    public void setRoomDescription(String roomDescription){
        roomDescription=roomDescription;
    }
    public void setRoomChallenge(String roomChallenge){
        roomChallenge=roomChallenge;
    }
    public void setGameCurrency(int gameCurrency){
        gameCurrency=gameCurrency;
    }
    public String getRoomName(){
        return roomName;
    }
    public String getRoomDescription(){
        return roomDescription;
    }
    public String getRoomChallenge(){
        return roomChallenge;
    }
    public int getGameCurrency(){
        return gameCurrency;
    }
}
