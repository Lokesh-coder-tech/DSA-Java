//Recursion
public class Day18 {

//    static void dream(){
//        System.out.println("Dreaming");
//        dream();
//    }

    static void dream(int time){
        if(time > 8){
            System.out.println("Woke up at " + time);
            return;
        }
        System.out.println("Dreaming at " + time);
        dream(time + 1);
    }

    public static void main(String[] args) {
        dream(5);
    }
}
