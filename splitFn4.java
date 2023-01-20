//If limit is specified as a negative number: As you can see that when the limit is negative, it included the trailing empty strings 
//in the output. See the output screenshot below.
public class splitFn4{
  public static void main(String args[]){
    // Input String
    String str = new String("hello/hi/bye///");

    System.out.println("Substrings when limit is negative:");

    //negative limit
    String strArr[]= str.split("/",-1);
    int i=1;
    for (String temp: strArr){
      System.out.print(i+". ");
      System.out.println(temp);
      i++;
    }
  }
}