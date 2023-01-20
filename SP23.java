class SP23
{
    public static void main(String[] args) {
        int k;
        for(int i=1; i<=6; i++) {
            k=1;
            for(int j=1; j<=6; j++) {
                if(j>=1 && j<=i) {  
                    System.out.print(k);
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