import com.java_basics.*;

public class Main {
    public static void main(String[] args) {
        int res=calculateHighScorePosition(1500);
        String name="John";
        displayHighScorePosition(name, res);
        res=calculateHighScorePosition(900);
        displayHighScorePosition("wick", res);
        res=calculateHighScorePosition(400);
        displayHighScorePosition("shyam", res);
        res=calculateHighScorePosition(50);
        displayHighScorePosition("rangella", res);
        Hello_World hell=new Hello_World();
        System.out.println(hell.hello());
        method_overloading mthd= new method_overloading();
        System.out.println(mthd.calcFeetAndInchesToCentimeters(100));
    }

    public static void displayHighScorePosition(String name, int position){
        System.out.println(name + " "+"Managed to get the position" +" "+ position +" "+ "On the high score table");
    }
    public static int calculateHighScorePosition(int score){
        if(score>=1000){
            return 1;
        } else if (score >=500 && score<1000) {
            return 2;
        } else if (score>=100 && score<500) {
            return 3;
        }
        else{
            return 4;
        }
    }

}