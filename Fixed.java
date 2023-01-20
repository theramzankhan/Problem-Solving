public class Fixed {
    public static void main(String[] args) {
        String s="1,2,3,44,55,666";
        String conc="";
        int len=20;
        System.out.println(s);
        String s1[]=s.split(",");
        for(int i=0;i<s1.length;i++){
            conc="";
            for(int j=0;j<(len-s1[i].length());j++){
                conc+='x';
            }
            System.out.println(s1[i]+conc);
        }
    }
}


// public class Fixed {
//     public static void main(String[] args) {
//         String s="1,";
//         String conc="";
//         int len=20;
//         System.out.println(s);
//         String s1[]=s.split(",");
//         int i=s1.length;
//         while(i<len){
//                 conc+='x';
//                 i++;
//             }
//             System.out.println(s1[s1.length-1]+conc);
//         }     
//     }

// public class Fixed {
//     public static void main(String[] args) {
//         String s="1,";
//         String conc="";
//         int len=20;
//         System.out.println(s);
//         String s1[]=s.split(",");
//         for(int attr_len=s1.length;attr_len<len;attr_len++){
//             conc+='x';
//         }
//             System.out.println(s1[s1.length-1]+conc);
//         }     
//     }