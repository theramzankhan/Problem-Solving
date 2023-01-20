class SP26
{
    public static void main(String[] args) {
        for(int i=1; i<=4; i++) {
            // int l=(char)64+i;
            int l=64+i;
            for(int j=1; j<=4; j++) {
                if(j<=i) {  
                    System.out.print((char)l--);
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}