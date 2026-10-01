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

        //Check Palindrome----------------->
//        String str = "madam";
//        int left = 0;
//        int right = str.length()-1;
//        boolean isPalindrome = true;
//        while(left < right){
//            if(str.charAt(left) != str.charAt(right)){
//                isPalindrome = false;
//                break;
//            }
//            left++;
//            right--;                  //TC: O(n), SC: O(1)
//        }
//        if(isPalindrome ){
//            System.out.println("Yes it is a palindrome");
//        }else{
//            System.out.println("No it is not a palindrome");
//        }

        //Remove Duplicate---------->
//        String str = "programming";
//        StringBuilder result = new StringBuilder();
//        for(int i = 0; i<str.length(); i++){
//          char ch = str.charAt(i);
//          if(result.toString().indexOf(ch) == -1){
//             result.append(ch);
//          }                             //TC: O(n²), SC: O(n)
//        }
//        System.out.println(result);

        //Reverse each word of a sentence---------->
//        String src = "I love coding";
//        StringBuilder sb = new StringBuilder(src);
//        int wordStart = 0;
//        for(int i=0; i<sb.length(); i++){
//            if(sb.charAt(i) == ' '){
//                int left = wordStart;
//                int right = i - 1;
//
//                while(left < right){
//                    char temp = sb.charAt(left);
//                    sb.setCharAt(left, sb.charAt(right));
//                    sb.setCharAt(right, temp);
//                    left++;
//                    right--;
//                }
//                wordStart = i + 1;
//            }
//        }
//        int left = wordStart;
//        int right = sb.length() - 1;
//        while(left < right){
//            char temp = sb.charAt(left);
//            sb.setCharAt(left, sb.charAt(right));
//            sb.setCharAt(right, temp);                    //TC: O(n), SC: O(n)
//            left++;
//            right--;
//        }
//
//        System.out.println(sb);

        //Compress a string------------->
//        String str = "aaabbcccd";
//        StringBuilder result = new StringBuilder(); //a3b2c3d1
//        for(int i=0; i<str.length(); i++){
//            char ch = str.charAt(i);
//            int count = 1;
//            while(i+1 < str.length() && str.charAt(i+1) == ch){
//                count++;
//                i++;
//            }
//            result.append(ch);
//            result.append(count);       //TC: O(n), SC: O(n)
//        }
//        System.out.println(result);




    }
}
