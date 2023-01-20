//with regex and for loop
class splitFn2 {
    public static void main(String[] args) {
        String str="902-318-8439";
        String parts[]=str.split("-");
        for(String temp:parts)
            // System.out.println(temp);
            System.out.print(temp+" ");
    }
}