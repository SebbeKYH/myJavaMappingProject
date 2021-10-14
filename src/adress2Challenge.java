public class adress2Challenge {
    public void theChallenge2(){
        adressWelcomeText();

        challengeRoom room1ThePostOffice = new challengeRoom("The reception", "When you enter the building you "+"\n"+
                "start talking to a an old man. He introduces himself as Jonathan and he needs your help. "+"\n"+
                "He has written a letter to his daughter back home in Burma but he is unsure of the spelling. "+"\n"+
                "He never had the luxury of attending school as a child and now he needs your help. Take a look "+"\n"+
                "at his letter for him","Rewrite Jonathans letter and remember to watchout for spelling errors. "+"\n"+
                "If you make it without making any spelling errors you will be rewarded with valuable points");
        challengeRoom room2ThePostOffice = new challengeRoom("The Post Box","Jonathan needs some help fitting the"+"\n"+
                "letter inside the Post Box. If you help him out there may be unexpected rewards late on","The Post Box"+"\n"+
                "has an opening of 19*6 cm but his envelope is a bit bigger. Help him trim his letter so if fits.");
        


    }

    private void adressWelcomeText() {
        System.out.println("**************************************************");
        System.out.println("Welcome to The Post Office. Have a close look at the overlay of the map."+"\n"+
                "You have to complete all 4 challenges in the 4 different rooms to get your reward. Move to a"+"\n"+
                "specific room by typing it's name");
    }
}
