class SP11
{
    public static void main(String[] args) {
        int k=0;
        for(int i=1; i<=7; i++) {
            if(i < 5)
                k++;
            else
                k--;
            for(int j=1; j<=7; j++) {
                if(j >= 1 && j <= k) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}