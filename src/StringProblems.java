public class StringProblems {
    public static void main(String[] args) {
        //Counts Vowels, Consonants, Digits, and Spaces----------->
//        String str = "Lokesh Sha rma";
//        int count = 0;
//        int vowelCount = 0;
//        int consonantCount = 0;
//        int digits = 0;
//        for(int i=0; i<str.length(); i++){
//          if(str.charAt(i) == ' '){
//              count++;
//          }
//          if( str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u' ){
//              vowelCount++;
//          }
//          if(Character.isLetter(str.charAt(i)) && !(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') ){
//              consonantCount++;
//          }
//          if(Character.isLetter(str.charAt(i))){
//              digits++;
//          };                                           //tc: o(n), sc: o(1)
//        }
//        System.out.println("Number of spaces: "+ count);
//        System.out.println("Number pf vowels: " + vowelCount);
//        System.out.println("Number of consonants: " + consonantCount);
//        System.out.println("Number of character/digits: " + digits);

        //Rverse a String witohut any Built-in reverse function--------------->
//        String str = "Hello";
//        StringBuilder sb = new StringBuilder(str);
//        int left = 0;
//        int right = str.length() - 1;
//        while(left < right){
//            char temp = sb.charAt(left);
//            sb.setCharAt(left, sb.charAt(right));
//            sb.setCharAt(right, temp);
//
//            left++;
//            right--;
//        };                                //tc: o(n), sc: o(n)
//        System.out.println(sb);

    }
}
