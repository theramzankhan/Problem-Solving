class splitFn1 {
    public static void main(String[] args) {
        String str="902-318-8439";
        String parts[]=str.split("-");
        String part1=parts[0];
        String part2=parts[1];
        String part3=parts[2];
        System.out.println(part1 + " " + part2+ " " + part3);
    }
}