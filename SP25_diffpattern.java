class SP25_diffpattern
{
    public static void main(String[] args) {
        int k=1,n=11,m=0;
        for(int i=1; i<=21; i++) {
            if(i<=n)
                m++;
            else
                m--;
            k=m-1;
            for(int j=1; j<=21; j++) {
                if(j>=(n+1)-m && j<=(n-1)+m) { 
                    System.out.print(" "+k%10);
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}