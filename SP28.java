class SP28
{
    public static void main(String[] args) {
        int flag, k=1;
        for(int i=1; i<=5; i++) {
            flag=1;
            for(int j=1; j<=9; j++) {
                if(j<=2*i-1) {  
                    if(flag==1)
                        System.out.print(k++);
                    else
                        System.out.print("*");
                    flag=1-flag;
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}