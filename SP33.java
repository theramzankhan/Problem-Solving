class SP33
{
    public static void main(String[] args) {
        for(int i=1; i<=4; i++) {
            char k='A';
            for(int j=1; j<=7; j++) {
                if(j<=5-i || j>=3+i) {  
                    System.out.print(k);
                }
                else {
                    System.out.print(" ");
                }
                k++;
            }
            System.out.println();
        }
    }
}