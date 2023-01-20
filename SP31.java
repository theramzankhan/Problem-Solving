class SP31
{
    public static void main(String[] args) {
        int num;
        char alpha;
        for(int i=1; i<=4; i++) {
            int k=1;
            num=1;
            alpha='A';
            for(int j=1; j<=7; j++) {
                if(j>=5-i && j<=3+i) {  
                    if(k==1) {
                        if(i%2==1) {
                            System.out.print(num);
                            num++;
                        }
                        else {
                            System.out.print(alpha++);
                        }
                    }
                    else
                        System.out.print(" ");
                    k=1-k;
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}



// class SP31
// {
//     public static void main(String[] args) {
//         int k=0;
//         for(int i=1; i<=4; i++) {
//             for(int j=1; j<=7; j++) {
//                 if(j>=5-i && j<=3+i && k==1) {  
//                     System.out.print("*");
//                 }
//                 else {
//                     System.out.print(" ");
//                 }
//                 k=1-k;
//             }
//             System.out.println();
//         }
//     }
// }