class SP22
{
    public static void main(String[] args) {
        int n;
        char c;
        for(int i=1; i<=4; i++) {
            n=1;
            c='A';
            for(int j=1; j<=7; j++) {
                if(j>=5-i && j<=3+i) { 
                    if(j < 5) {
                        System.out.print(n);
                        n++;
                    }
                    else {
                        System.out.print(c);
                        c++;
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