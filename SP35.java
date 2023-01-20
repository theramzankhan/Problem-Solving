class SP35
{
    public static void main(String[] args) {
        int i,k,flag=1;
        for(i=1,k=0; i<=7;i++) {
            if(i<4-k) {
                System.out.print(" ");
            }
            else {
                if(flag==1)
                    System.out.print("*");
                else
                    System.out.print(" ");
                flag=1-flag;
            }
            if(i==4+k) {
                if(i==7)
                    break;
                k++;
                System.out.println();
                i=0;
                flag=1;
            }
        }
    }
}