class SP20
{
    public static void main(String[] args) {
        char k; int n;
        for(int i=1; i<=4; i++) {
            k='A';
            n=1;
            for(int j=1; j<=8; j++) {
                if(j>=5-i && j<=4+i) {
                    if(j < 5) {
                        System.out.print(k);
                        k++;
                    }  
                    else {
                        System.out.print(n);
                        n++;
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