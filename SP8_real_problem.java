class SP8_real_problem
{
    public static void main(String args[]) 
    {
        int k;
        for(int i=1; i<=4; i++) {
            k=0;
            for(int j=1; j<=7; j++) {
                if(j >= 5-i && j <= 3+i) {
                    if(j <= 4) {
                        k++;
                        System.out.print(k);

                    }
                    else {
                        k--;
                        System.out.print(k);
                    }
                }
                else {  
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}