//Patterns

public class Day07 {
    public static void main(String[] args) {
        //Pattern-01
//        for(int i=0; i<4; i++){
//            for(int j=0; j<4; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

         //Pattern-02
//        for(int i=0; i<4; i++){
//            for(int j=0; j<=i; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        //Pattern-03
//        int n = 8;
//        for(int i=1; i<=n; i++){
//            for(int j=n; j>=i; j--){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        //Pattern-04
//        int n = 4;
//        for(int i=1; i<=n; i++){
//            for(int j=1; j<=n; j++){
//               if(j<=n-i){
//                   System.out.print(" ");
//               }else{
//                   System.out.print("*");
//               }
//            }
//            System.out.println();
//        }

        //or

//        int n = 4;
//        for(int i=1; i<=n; i++){
//            for(int j=1; j<=n-i; j++){
//                System.out.print(" ");
//            }
//            for(int j=1; j<=i; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        //Pattern-05
//        int n=4;
//        int m=5;
//        for(int i=1; i<=n; i++){
//            for(int j=1; j<=m; j++){
//                if(i==1 || i==n || j==1 || j==m){
//                    System.out.print("*");
//                }else{
//                    System.out.print(" ");
//                }
//
//            }
//            System.out.println();
//        }
    }
}
