// public class test {
//     public static void main(String[] args) {
//         int len=20;
//         String conc="";
//         String s="d,g,w,5,h,w";
//         System.out.println(s);
//         String s1[]=s.split(",");
//         for(int i=0;i<s1.length;i++){
//             conc="";
//             for(int j=0;j<(len-s1[i].length());j++){
//                 conc+='x';
//             }
//             System.out.println(conc);
//         }
        
//     }
// }



// public class test {
//     public static void main(String[] args) {
//         int arr[]={1,2,3};
//         int val=2;
//         for(int i=1;i<arr.length-1;i++){
//             System.out.println(Math.max(arr[i-1],arr[i+1]));
//         }

//     }
// }


// public class test {
//     public static void main(String[] args) {
//         int arr1[];
//         int arr2[];
//         int nums[]={1,0,0,0,1};
//         int index1=0;
//         int index2=0;
//         for(int i=0;i<nums.length;i++){
//             if(nums[i]==0)
//                 index1++;
//             else
//                 index2++;
//         }
//         arr1=new int[index1];
//         arr2=new int[index2];
//         System.out.println(index1+" "+index2);
//         System.out.println(arr1.length+" "+arr2.length);

//         for(int i=0;i<nums.length;i++){
//             if(nums[i]==0)
//                 arr1[i]=nums[i];
//             // else    
//             //     arr2[arr2.length-i]=nums[i];
//             System.out.print(arr1[i]);
//             // System.out.print(arr2[i]);
//         }
//         // System.out.println(arr1);
//         // System.out.println(arr2);
//     }
// }


// public class test {
//     public static void main(String[] args) {
//         int nums[]={7,0,1,0,0,7};
//         int mx=0;
//         for(int i=0;i<nums.length-1;i++){
//             if(nums[i]==0){
//               for(int j=i+1;j<nums.length;j++){
//                 if(nums[j]%2!=0){
//                   mx=nums[j];
//                   for(int k=j+1;k<nums.length;k++){
//                     if(nums[k]%2!=0){
//                       mx=Math.max(mx,nums[k]);
//                     }
//                   }
//                 }
//             }
//         }
//     }
//     System.out.println(mx);
// }
// }


// public class test {
//   public static void main(String[] args) {
//     int nums[]={1,2,1,1,3};
//     int countJ=0;
//     int max=0;
//     for(int i=0;i<nums.length;i++){
//       for(int j=nums.length-1;j>=i;j--){
//         if(nums[i]==nums[j]){
//           countJ++;
//           System.out.println(countJ);
//         }
//         countJ++;
//         System.out.println(countJ);
//       }
//       if(max<countJ){
//         max=countJ;
//       }
//     }
//     System.err.println(max);
//   }
// }


// public class test {
//   public static void main(String[] args) {
//     // int nums[]={1,2,1,1,3};
//     // int nums[]={1, 4, 2, 1, 4, 1, 4};
//     int nums[]={1, 4, 2, 1, 4, 4, 4};
//     int countJ=0;
//     int max=0;
//     for(int i=0;i<nums.length;i++){
//       // countJ=1;
//       for(int j=i+1;j<nums.length;j++){
//         if(nums[i]==nums[j]){
//           countJ++;
//           System.out.println(countJ);
//         }
//       }
//       if(max<countJ){
//         max=countJ;
//       }
//     }
//     System.err.println(max);
//   }
// }

// public class test {
//   public static void main(String[] args) {
//     int nums[]={1,2,1,1,3};
//     // int nums[]={1, 4, 2, 1, 4, 1, 4};
//     // int nums[]={1, 4, 2, 1, 4, 4, 4};
//     int countJ=0;
//     int max=0;
//     for(int i=0;i<nums.length;i++){
//       countJ=0;
//       for(int j=nums.length-1;j>=i;j--){
//         if(j==i)
//             break;
//         if(nums[i]==nums[j] || j!=i){
//           countJ++;
//           System.out.println(countJ);         
//         }
//       }
//       if(max<countJ){
//         max=countJ;
//       }
//     }
//     System.err.println(max);
//   }
// }

// public class test {
//   public static void main(String[] args) {
//     int nums[]={1,3,1,4};
//     for(int i=0;i<nums.length;i++){
//       if(nums[i]==3){
//       for(int j=i+1;j<nums.length;j++){
//         if(nums[j]==4){
//           nums[i+1]=nums[j];
//         }
//       }
//     }
//     }
//   }
// }

// public class test {
//   public static void main(String[] args) {
//     int nums[]={1,3,1,4};
//     for(int i=0;i<nums.length;i++){
//       if(nums[i]==3){
//         for(int j=i+1;j<nums.length;j++){
//           int temp=0;
//           if(nums[j]==4){
//             temp=nums[i+1];
//             nums[i+1]=4;
//           }
//           else{
//             nums[i+2]=temp;
//           }
//         }
//       }
//     }
    
//   }
// }


// public class test {
//   public static void main(String[] args) {
//     int nums[]={4,2,2,5};
//     for(int i=0;i<nums.length;i++){
//       if(nums[i]==4){
//         for(int j=0;j<nums.length;j++){
//           if(nums[j]==5){
//             int temp=nums[i+1];
//             nums[i+1]=nums[j];
//             nums[j]=temp;
//             System.out.println(nums[i]+""+nums[i+1]+""+nums[i+2]+""+nums[i+3]);
//           }
//       }
//     }
//   }
// }
// }


// public class test {
//   public static void main(String[] args) {
//     int nums[]={5,4,5,4,1};
//     for(int i=0;i<nums.length;i++){
//       if(nums[i]==4){
//         for(int j=0;j<nums.length;j++){
//           if(nums[j]==5 && nums[i+1]!=5){
//             int temp=nums[i+1];
//             nums[i+1]=nums[j];
//             nums[j]=temp;
//             System.out.println(nums[i-1]+""+nums[i]+""+nums[i+1]+""+nums[i+2]+""+nums[i+3]);
//           }
//         }
//       }
//     }
//   }
// }

// public class test {
//   public static void main(String[] args) {
//     int nums[]={2,1,1,1,4};
//     int sumI=0,sumJ=0;
//     for(int i=0;i<nums.length;i++){
//       for(int j=nums.length-1;j>=0;j--){
//         if(j!=i){
//           sumI+=nums[i];
//           sumJ+=nums[j];
//           System.out.println("sumI:"+sumI);
//           System.out.println("sumJ:"+sumJ);
//           j--;
//           break;
//         }
//       }
//     }
//     System.out.println(sumI/2+" "+sumJ/2);
//   }
// }


// public class test {
//   public static void main(String[] args) {
//     int nums[]={2,1,1,1,4};
//     int sumI=0,sumJ=0;
//     for(int i=0;i<nums.length;i++){
//           sumI+=nums[i];
//           sumJ+=nums[i];
//     }
//     if(sumI%2==0 && sumJ%2==0)  
//       System.out.println(true);
//     else  
//       System.out.println(false);
//   }
// }

//how to convert integer array to arraylist
// public class test {
//   public static void main(String[] args) {
//     int nums[]={2,1,1,1,4};
//     List<Integer> intList = new ArrayList<Integer>(nums.length);
//     for (int i : nums)
//     {
//         System.out.println(i);  
//     }
//   }
// }

// public class test {
//   public static void main(String[] args) {
//     int nums1[]={2,1,1,1,4};
//     int nums2[]={2,1};
//     boolean res=true;
//     List<Integer> intList1 = new ArrayList<Integer>(nums1.length);
//     List<Integer> intList2 = new ArrayList<Integer>(nums2.length);
//     for(int i=0;i<intList1.size();i++){
//       if(intList1.contains(intList2.get(i)))
//         System.out.println("jjjj");
//     }
//     System.out.println(res);
//   }
// }


// public class test {
//   public static void main(String[] args) {
//     int n=3;
//     int arr[]=new int[n*n];
//     arr[0]=1;
//     arr[1]=2;
//     arr[2]=3;
//     arr[3]=4;
//     arr[4]=5;
//     arr[5]=6;
//     arr[6]=7;
//     arr[7]=8;
//     arr[8]=9;
//     for(int i=0;i<arr.length;i++)
//       System.out.println(arr[i]);
//   }
// }


// public class test {
//   public static void main(String[] args) {
//     int n=3;
//     int k;
//     int arr[]=new int[n*n];
//     for(int i=0;i<arr.length/3;i++){
//       int iCount=arr.length/3-1-i;
//       k=3;
//       for(int j=arr.length/3-1;j>=iCount;j--){
//         System.out.print(k);
//         k--;
//       }
//       System.out.println();
//   }
//   }
// }


// public class test {
//   public static void main(String[] args) {
//     int n=2;
//     int k;
//     int j;
//     int arr[]=new int[n*n];
//     for(int i=0;i<arr.length/n;i++){
//       int iCount=arr.length/n-1-i;
//       k=1;
//       for(j=arr.length/n-1;j>=iCount;j--){
//         System.out.print(k);
//         k++;
//       }
//       for(int l=j;l>=0;l--){
//         System.out.print(0);
//       }
//       System.out.println();
//   }
//   }
// }


// public class test {
//   public static void main(String[] args) {
//     String[] sArray = {"i", "love", "you"};
//     String s = "";
//     for (String n:sArray)
//         s+= n;
//     System.out.println(s);
//     char[] c = s.toCharArray();
//     System.out.println(c);

//   }
// }


// public class test {
//   public static void main(String[] args) {
//     int count=0;
//     String str="day fez";
//     for(int i=0;i<str.length();i++){
//       if(str.charAt(i)==' '){
//         if(str.charAt(i-1)=='y' || str.charAt(i-1)=='z')
//           count++;
//       }
//       else if(i>str.length()/2 && (str.charAt(str.length()-1)=='y' || str.charAt(str.length()-1)=='z')) {
//         count++;
//         break;
//       }
//     }
//     System.out.println(count);
//   }
// }

// public class test {
//   public static void main(String[] args) {
//     int count=0;
//     String str="!!day--yaz!!";
//     for(int i=0;i<str.length();i++){
//       if(!Character.isLetter(str.charAt(i))){
//         if(str.charAt(i-1)=='y' || str.charAt(i-1)=='z')
//           count++;
//       }
//       else if(i>str.length()/2 && (str.charAt(str.length()-1)=='y' || str.charAt(str.length()-1)=='z')) {
//         count++;
//         break;
//       }
//     }
//     System.out.println(count);
//   }
// }

// public class test {
//   public static void main(String[] args) {
//     String base="Hello there";
//     String remove="e";
//     if(base.contains(remove)){
//       int idx=base.indexOf(remove);
//       int new_len=idx+remove.length();
//       String s1=base.substring(0,idx);
//       String s2=base.substring(new_len);
//       System.out.println(s1+s2);
//     }
//   }
// }

// public class test {
//   public static void main(String[] args) {
//     String base="Hello there";
//     String remove="e";
//     char c1;
//     char c2;
//     String s="";
//     for(int i=0;i<base.length();i++){
//       c1=base.charAt(i);
//       int j=0;
//       while(j<remove.length()){
//         s+=c1;
//       }
//     }
//   }
// }

// public class test {
//   public static void main(String[] args) {
//     String s="Ramzan Khan";
//     System.out.println(s.substring(2+3,5+5));
//   }
// }

// public class test {
//   public static void main(String[] args) {
//     String str="rr";
//     for(int i=0;i<str.length()-1;i++){
//       System.out.println(str.charAt(i)==str.charAt(i+1));
//     }
//   }
// }

// public class test {
//   public static void main(String[] args) {
//     String str="aa1bc2d3";
//     int sum=0,val=0;
//     char[] ch=new char[str.length()];
//     for(int i=0;i<str.length();i++){
//       ch[i] = str.charAt(i);
//       if(Character.isDigit(ch[i])){
//         val=Integer.parseInt(String.valueOf(ch[i]));
//         sum+=val;
//       }
//     }
//     System.out.println(sum);
//   }
// }

// public class test {
//   public static void main(String[] args) {
//     String str="abXYab";
//     String temp="";
//     for(int i=0;i<str.length();i++){
//       if(str.charAt(i)!=str.charAt(i=i+1)){
//         temp+=str.charAt(i);
//       }
//       if(str.contains(temp))
//         System.out.println("you did half logic man!"+temp);
//     }
//   }
// }

// public class test {
//   public static void main(String[] args) {
//     String string="abXYZba";
//     String tmp="";
//     char singleVal;
//     int len=string.length();
//     int tmpLen;
//     String rev="";
//     String rev1="";
//     String store="";
//     for(int i=0;i<string.length();i++){
//       tmp+=string.charAt(i);
//       tmpLen=tmp.length();
//       singleVal=string.charAt(i);
//       rev=string.substring(len-tmpLen,len);
//       System.out.print(rev);
//         for(int j=rev.length();j>0;--j)               
//         {  
//            rev1+=rev.charAt(j-1);             
//         }
//         // System.out.println(rev1);
//         if(tmp.equals(rev1)){
//           store+=singleVal;
//       }
//     }
//   }
// }

// public class test {
//   public static void main(String[] args) {
//     String str="hoopppla";
//     int count=0;
//     int tmpcount=1;
//     for(int i=0;i<str.length()-1;i++){
//       for(int j=i+1;j<str.length();j++){
//         if(str.charAt(i)==str.charAt(j))
//           tmpcount++;
//         else  
//           tmpcount=1;
//         if(tmpcount>count)
//           count=tmpcount;
//       }
//     }
//     System.out.println(count);
//   }
// }

// public class test {
//   public static void main(String[] args) {
//     String str="hoopppla";
//     int len=0;
//     String temp="";
//     for(int i=0;i<str.length();i++){
//       temp=str.substring(i,i+1);
//       if(temp.equals(str.substring(i+1))){
//         len=str.lastIndexOf(temp);
//       }
//     }
//     System.out.println(len);
//   }
// }

// public class test {
//   public static void main(String[] args) {
//     String str="abc345ab10c";
//     for(int i=0;i<str.length();i++){
//       if(Character.isDigit(str.charAt(i))){
//         System.out.println(Character.isDigit(str.charAt(i)));
//       }
//     }
//   }
// }

// public class test {
//     public static void main(String[] args) {
//       String str="abc345ab10c";
//       // int aNo=0;
//       int sum=0;
//       String aNo="";
//       int no=0;
//       for(int i=0;i<str.length();i++){
//         if(Character.isDigit(str.charAt(i))){
//           aNo=aNo+""+str.charAt(i);
//         }
//         else{
//           if(aNo.length()<1){
//             no=0;
//             System.out.println("no in else"+no);
//           }
//           else{
//             no=Integer.parseInt(aNo);
//             System.out.println("no in else"+no);
//           }
//           // sum=sum+no;
//         }
//       }
//       sum=sum+no;
//       // sum=sum+Integer.parseInt(aNo);
//       System.out.println(sum);
//   }
// }

// public class test {
//   public static void main(String[] args) {
//     // String str="This is nice";
//     String str="nice is";
//     String result="";
//     for(int i=0;i<str.length();i++){
//         if(str.substring(i,i+4).equals(" is ")){
//             System.out.println(str.substring(0,i) + str.substring(i,i+4) + "not " + str.substring(i+4));
//         }
//         //not working this condition because how the string will append?
//         // else if(str.substring(i,i+3).equals(" is")){
//         //     System.out.println(str.substring(0,i) + str.substring(i,i+3) + " not");
//         //     // result=str + " not";
//         //     // System.out.println(result);
//         // }
//         else if(str.substring(i,i+3).equals("is ") && i==0){
//             System.out.println(str.substring(0,i) + str.substring(i,i+3) + "not " + str.substring(i+3));
//         }
//     }
//   }
// }




//working for sorting purpose
// import java.util.*;
// public class test {
//   public static void main(String[] args) {
//     // char[] s = {'c', 'e', 'a', 'd', 'b'}; 
//     int[] s = {4,65,23,76,32,86,121,4444};
//     Arrays.sort(s);  
//     System.out.print(Arrays.toString(s));
//   }
// }

//failed
// public class test {
//   public static void main(String[] args) {
//     char[] s = {'a', 'b', 'c', 'd', 'e'}; 
//     char[] c=new char[s.length];
//     for(int i=s.length-1;i>=0;i--){
//       c[i]=s[i];
//     }
//     System.out.println(c);
//   }
// }

//passed
// public class test {
//   public static void main(String[] args) {
//     char[] s = {'a', 'b', 'c', 'd', 'e'}; 
//     char[] c=new char[s.length];
//     int j=0;
//     for(int i=s.length-1;i>=0;i--){
//       c[j]=s[i];
//       j++;
//     }
//     System.out.println(c);
//   }
// }

// public class test {
//   public static void main(String[] args) {
//       int count=0;
//       String str = "GeeksforGeeks:A Computer Science Portal";
//       String[] arrOfStr = str.split(":");
//       String arrOfStr1="";
//       for(int i=0;i<arrOfStr.length;i++){   
//         arrOfStr1= arrOfStr[i];
//         System.out.print(" "+arrOfStr[i]);
//       }
//       String[] newStr = arrOfStr1.split(" ");
//       for (String a : newStr){
//         count++;
//         System.out.println(a);
//         // System.out.println(count);
//         System.out.println(count+1);
//       }
//   }
// }


  
// import java.util.*;
// public class test {
//   public static void main(String[] args) {
//     String res[]=new String[4];
//     String s="is2 sentence4 This1 a3";
//     String words[]=s.split(" ");
//         for(int i=0;i<words.length;i++){
//             System.out.println(words[i]);
//             // System.out.println(res[i]+=words[i]);
//         }
//         // System.out.println(res[1]);
//   }
// }

// import java.util.*;
// public class test {
//   public static void main(String[] args) {
//     String res[]=new String[4];
//     String s="is2 sentence4 This1 a3";
//     String words[]=s.split(" ");
//         for(int i=0;i<words.length;i++){
//             // if(words[i].length()-1==2){
//             // if(Character.isDigit(charAt(i))){
//                 System.out.println(words[i]);
//             // }
//             // System.out.println(res[i]+=words[i]);
//         }
//         // System.out.println(res[1]);
//   }
// }


// import java.util.*;
// public class test {
//   public static void main(String[] args) {
//     // String res[]=new String[4];
//     String s="is2 sentence4 This1 a3";
//     String words[]=s.split(" ");
//     String w="";
//     String res="";
//     for(String n:words){
//       w=n;
//       System.out.print(w);
//     }
//     char[] ch=w.toCharArray();
//     for(int i=0;i<ch.length;i++){
//       if(Character.isDigit(ch[i]))
//         break;
//       else
//         res+=ch[i];
//     }
//     System.out.println(res);
//   }
// }


// import java.util.*;
// public class test {
//   public static void main(String[] args) {
//     // String res[]=new String[4];
//     String s="is2 sentence4 This1 a3";
//     String words[]=s.split(" ");
//     String w="";
//     String res="";
//     for(String n:words){
//       w+=n;
//       // System.out.print(w);
//     }
//     System.out.print(w);

//     for(int i=0;i<w.length();i++){
//       if(Character.isDigit(w.charAt(i)))
//         continue;
//       else
//         res+=w.charAt(i);
//     }
//     System.out.println(res);
//   }
// }


//near to soluton
// import java.util.*;
// public class test {
//   public static void main(String[] args) {
//     // String res[]=new String[4];
//     String s="is2 sentence4 This1 a3";
//     String words[]=s.split(" ");
//     String w="";
//     String res="";
//     for(String n:words){
//       w+=n;
//     }
//     System.out.println("w: "+w);

//     for(int i=0;i<w.length();i++){
//       if(Character.isDigit(w.charAt(i)))
//         w.replaceAll("[0-9]","");
//       else
//         res+=w.charAt(i);
//     }
//     System.out.println(res);
//   }
// }


// import java.util.*;
// public class test {
//   public static void main(String[] args) {
//     String s="is2 sentence4 This1 a3";
//     String words[]=s.split(" ");
//     // String ss[]=new String[s.length()];
//     String sss="";
//     for(int i=0;i<words.length;i++){
//       // ss[i]=words[i].substring(0,words[i].length()-1);
//       sss+=words[i].substring(0,words[i].length()-1);
//       sss+=" ";
//       // ss[i]=words[i];
//       // System.out.println(words[i]);
//       // Arrays.sort(words);
//       // System.out.println(Arrays.toString(words));
//     }
//     // System.out.println(sss);
//     // char[] c = sss.toCharArray();        // convert to array of chars 
//     // java.util.Arrays.sort(c);          // sort
//     // String newString = new String(c);  // convert back to String
//     // System.out.println(newString);     // "abcde"
//   }
// }


// import java.util.*;
// public class test {
//   public static void main(String[] args) {
//     char ch='a';
//     for(int i=0;i<26;i++){
//         System.out.println(ch++);
//     }
//   }
// }

// import java.util.*;
// public class test {
//   public static void main(String[] args) {
//     char ch='a';
//     char sen='b';
//     boolean res=false;
//     for(int i=0;i<26;i++){
//         ch++;
//         if(ch==sen)
//             res=true;
//         else    
//             res=false;
//     }
//     System.out.println(res);
//   }
// }


// import java.util.*;
// public class test {
//   public static void main(String[] args) {
//     char ch='a';
//     String sentence="thequickbrownfoxjumpsoverthelazydog";
//     boolean res=false;
//     char[] chars=sentence.toCharArray();
//     int count=0;
//     for(int i=0;i<chars.length;i++){
//         if(ch==chars[i]){
//             count++;
//             res=true;
//             System.out.println(chars[i]);
//             System.out.println(count);
//             ch++;
//             i=0;
//             if(count==26){
//                 System.out.println("true");
//                 break;
//             }
//         }
//         else    
//             res=false;
//     }
//     System.out.println(res);
//   }
// }


// public class test {
//   public static void main(String[] args) {
//     String[] words={"gin","zen","gig","msg"};
//     String morse_code[]={".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
//     String[] res=new String[words.length];
//     String val="";
//     for(int i=0;i<words.length;i++){
//       // System.out.println(words[i]);
//       char letters[]=words[i].toCharArray();
//       for(int j=0;j<letters.length;j++){
//         // System.out.println(letters[j]);
//         int idx=letters[j]-'a';
//         // res[j]+=morse_code[idx];
//         // System.out.println(res[j]);
//         val+=morse_code[idx];
//       }
//     }
//     System.out.println(val);
//   }
// }


// public class test {
//   public static void main(String[] args) {
//     String[] words={"gin","zen","gig","msg"};
//     String morse_code[]={".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
//     String[] res=new String[words.length];
//     String val="";
//     for(int i=0;i<words.length;i++){
//       // System.out.println(words[i]);
//       char letters[]=words[i].toCharArray();
//       for(int j=0;j<letters.length;j++){
//         // System.out.println(letters[j]);
//         int idx=letters[j]-'a';
//         val+=morse_code[idx];
//       }
//       res[i]+=val;
//       val="";
//       System.out.println(res[i]);
//     }
    
//   }
// }


public class test {
  public static void main(String[] args) {
    // String[] words={"gin","zen","gig","msg"};
    String words[]={"a"}; //second test case
    String morse_code[]={".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
    String[] res=new String[words.length];
    String val="";
    int count=0;
    for(int i=0;i<words.length;i++){
      // System.out.println(words[i]);
      char letters[]=words[i].toCharArray();
      for(int j=0;j<letters.length;j++){
        if(words.length==1){
          count=1;
          break;
        }
        // System.out.println(letters[j]);
        int idx=letters[j]-'a';
        val+=morse_code[idx];
      }
      res[i]+=val;
      for(int k=0;k<res.length-1;k++){
        if(res[k]==res[k+1])
          count++;
          k++;
      }
      val="";
      // System.out.print(res[i]);
      // System.out.println(count);
    }
    System.out.println(count);
  }
}