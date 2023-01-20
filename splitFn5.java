//Limit is set to zero: This will exclude the trailing empty strings.
public class splitFn5{
  public static void main(String args[]){
    // Input String
    String str = new String("hello/hi/bye///");

    System.out.println("Substrings when limit is Zero:");

    //Zero limit
    String strArr[]= str.split("/", 0);
    int i=1;
    for (String temp: strArr){
      System.out.print(i+". ");
      System.out.println(temp);
      i++;
    }
  }
}