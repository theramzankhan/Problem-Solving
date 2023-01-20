class SP30
{
    public static void main(String[] args) {
        int i,j,k=0;
        for(i=1; i<=9; i++) {
            for(j=1; j<=5; j++) {
                if(i<=3) {  
                    if(j>=6-i)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
                else if(i<=6) {
                    k=0;
                    if(j==3) {
                        k=1;
                        System.out.print("|");
                    }
                    if(j<=(i-(3+1))) {
                        k=1;
                        System.out.print("*"); 
                    }
                    if(j>=i) {
                        k=1;
                        System.out.print("*"); 
                    }
                    if(k==0)
                        System.out.print(" "); 
                    }
                else if(i<=9) {
                    if(j<=10-i)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
            }
            System.out.println();
        }
        }
    }
