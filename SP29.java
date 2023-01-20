class SP29
{
    public static void main(String[] args) {
        // char ch=64;
        int k=64;
        for(int i=1; i<=5; i++) {
            // ch=ch+2*(i-1)+1;
            k=k+2*(i-1)+1;
            for(int j=1; j<=5; j++) {
                if(j>=6-i) {  
                    System.out.print((char)k--);
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}