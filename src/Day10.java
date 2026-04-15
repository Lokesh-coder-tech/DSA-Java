// String Basics
import java.util.Scanner;
public class Day10 {
    public static void main(String[] args) {

//        String str = "Lokesh";
//        System.out.println(str);
//        String str = new String("Lokesh");
//        System.out.println(str);

        //Excess of characters-->
//        String str = "Dhurandar";
//        System.out.println(str.charAt(0));
//        System.out.println(str.charAt(3));
//        System.out.println(str.charAt(5));
//        System.out.println(str.charAt(7));
//
//        for(int i=0; i<str.length(); i++){
//            System.out.println(str.charAt(i));
//        }

        //String is Immutable--->
//        String str = "Lokesh";
//        str = "Lucky";
//        System.out.println(str);

        //Comparing String--->
//        String name1 = "Lucky";
//        String name2 = "Lucky";
//        if(name1 == name2){
//            System.out.println("Both strings are equal");
//        }else{
//            System.out.println("Both strings are unequal");
//        }

//        if(name1.equals(name2)){
//            System.out.println("Both strings are equal");
//        }else{
//            System.out.println("Both strings are unequal");
//        }
//
//        String name1 = "lucky";
//        String name2 = "LUcKy";
//        if(name1.equalsIgnoreCase(name2)){
//            System.out.println("Both strings are equal");
//        }else{
//            System.out.println("Both strings are unequal");
//        }

        //String Input--->
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Please provide String content");
//        String str2 = sc.nextLine();
//        System.out.println("value of next line: " + str2);
//        System.out.println("Please provide String content");
//        String str = sc.next();
//        System.out.println("value of next: " + str);

        //String Methods---->
//        String str = "Lokesh";
//        String str2 = "sharma";
//        System.out.println(str.length());
//        System.out.println(str.charAt(3));
//        System.out.println(str.substring(2, 5));
//        System.out.println(str.toLowerCase());
//        System.out.println(str2.toUpperCase());

//        String str2 = "My name is Lokesh";
//        System.out.println(str2.contains("name"));
//        System.out.println(str2.contains("sharma"));

//        String name = "   Lucky   ";
//        System.out.println(name.length());
//        name = name.trim();

//        System.out.println(name.length());
//          String input = "My,name,is,lokesh,sharma";
//          String[] words = input.split(",");
//          for(String str: words){
//              System.out.println(str);
//
//          }

//        String name = "Dhurandar";
//        char[] ch = name.toCharArray();
//
//        for(char crr: ch){
//            System.out.println("value of char is: " + crr);
//        }

       //Count length of String without length()--->
//        String str = "jayhind";
//        int count = 0;
//        for(char c: str.toCharArray()){
//            count++;
//        }
//        System.out.println("Length: " + count);

       //Count vowels in a String--->
//       String name = "Lokesh";
//       int counter = 0;
//       for(char chars: name.toCharArray()){
//         if("aeiou".contains(String.valueOf(chars))){
//             counter++;
//         }
//       }
//        System.out.println("number of vowels is the String is: " + counter);

        //or

//        String name = "Lokesh";
//        int counter = 0;
//        for(char chars: name.toCharArray()){
//            if(chars == 'a'|| chars == 'e' || chars == 'i' || chars == 'o' || chars == 'u'){
//                counter++;
//            }
//        }
//        System.out.println("number of vowels is the String is: " + counter);


    }
}
