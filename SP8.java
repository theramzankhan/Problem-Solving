class SP8
{
    public static void main(String args[]) 
    {
        int k;
        for(int i=1; i<=4; i++) {
            k=1;
            for(int j=1; j<=7; j++) {
                if(j >= 5-i && j <= 3+i) {
                    System.out.print(k);
                    k++;
                }
                else {  
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}