class SP25
{
    public static void main(String[] args) {
        int k=11,n=11,m=0;
        for(int i=1; i<=21; i++) {
            if(i<=n)
                m++;
            else
                m--;
            if(i<=n)
                k=12-i;
            else
                k=i-10;
            for(int j=1; j<=21; j++) {
                if(j>=(n+1)-m && j<=(n-1)+m) { 
                    System.out.print(" "+k);
                    k++;
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}