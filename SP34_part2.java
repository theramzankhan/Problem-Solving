class SP34_part2
{
    public static void main(String[] args) {
        int i,j,p,k=1;
        for(i=1; i<=5; i++) {
            p=k;
            for(j=1; j<=5; j++) {
                if(j<=i) {  
                    System.out.print("  "+p);
                    int l=5-(i-j); //line 10-11 my logic worked 
                    p=p-l;
                    // p=p-(5-i+j); my sirg's logic
                }
                else {
                    System.out.print(" ");
                }
            }
            k=k+(5+1)-i;
            System.out.println();
        }
    }
}