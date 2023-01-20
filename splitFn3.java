//with regex and limit
class splitFn3 {
    public static void main(String[] args) {
        String str="902-318-8439";
        // String parts[]=str.split("-",1);
        String parts[]=str.split("-",2);
        // String parts[]=str.split("-",3);
        for(String temp:parts)
            System.out.println(temp);
    }
}