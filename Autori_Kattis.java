//input: Knuth-Morris-Pratt :- KMP
//Pasko-Patak:- PP     --> I did
// import java.util.Scanner;
// class Autori_Kattis{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter String:");
//         String str=sc.nextLine();
//         String res="";
//         res+=str.charAt(0);
//         for(int i=0;i<str.length();i++){
//             if(str.charAt(i)=='-'){
//                 i++;
//                 res+=str.charAt(i);
//             }   
//         }
//         System.out.print(res);
//     }
// }

// import java.util.Scanner;
// class Autori_Kattis{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter input:");
//         String in[]=sc.nextLine().split("-");
//         for(int i=0;i<in.length;i++){
//             System.out.print(in[i].charAt(0));   
//         }
//         System.out.println();
//     }
// }