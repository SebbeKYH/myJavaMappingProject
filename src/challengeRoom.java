public class challengeRoom {
    protected String roomName;
    protected String roomDescription;
    protected String roomChallenge;

    public challengeRoom(String inRoomName, String inRoomDescription, String inRoomChallenge){
        roomName=inRoomName;
        roomDescription=inRoomDescription;
        roomChallenge=inRoomChallenge;
    }
    public void setRoomName(String roomName){
        roomName=roomName;
    }
    public void setRoomDescription(String roomDescription){
        roomDescription=roomDescription;
    }
    public void setRoomChallenge(String roomChallenge){
        roomChallenge=roomChallenge;
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
}
