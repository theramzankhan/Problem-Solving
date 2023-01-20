// class ArrayProblemTrial{
//   public static void main(String[] args) {
//     String[] res= {'1','2','3','4','5'};
//     for(int i=0;i<5;i++){
//       res[i]=String.valueOf(i);
//     }
//     System.out.println(res);
//   }
// }




// // class ArrayProblemTrial{
// //   public static void main(String[] args) {
// //     int nums[]={1, 2, 2, 2};int sum=0;int count=0;
// //     for(int i=0;i<nums.length;i++){
// //       if(nums[i]==2)
// //         count++;
// //     }
// //     sum=count*2;
// //     if(sum==8)
// //       System.out.println(true);
// //     else  
// //       System.out.println(false);
// //   }
// // }


// // class ArrayProblemTrial{
// //   public static void main(String[] args) {
// //     int nums[]={1, 2, 2};
// //     boolean found=false;
// //     for(int i=0;i<nums.length-1;i++){
// //       if(nums[i]==2){
// //         if(nums[i+1]==2){
// //           found=true;
// //         }
// //       }
// //       found=false;
// //     }
// //     System.out.println(found);
// //   }
// // }







// // referred from stackoverflow
// // class ArrayProblemTrial{
// //   public static void main(String[] args) {
// //     int nums[]={1, 2, 2, 6, 99, 99, 7};int sum=0;
// //     for(int i=0;i<nums.length;i++){
// //       if(nums[i]==6){
// //         for(int j=i+1;j<nums.length;j++){
// //           if(nums[j]==7){  
// //             i=j;
// //             break;
// //           }
// //         }
// //       }
// //       else
// //         sum+=nums[i];
// //     }
// //     System.out.println(sum);
// //   }
// // }

// // public int sum67(int[] nums) {
// //   02
// //     int sum = 0;
// //   03
// //     boolean stop = false;
// //   04
     
// //   05
// //     for (int i = 0; i < nums.length; i++) {
// //   06
// //       if (nums[i] == 6)
// //   07
// //         stop = true;
// //   08
// //       if (stop == false)
// //   09
// //         sum += nums[i];
// //   10
// //       if (nums[i] == 7 && stop == true)
// //   11
// //         stop = false;
// //   12
// //     }
// //   13
// //     return sum;
// //   14
// //   }
  



// //failing just trying to write the below python to java, inital my logic
// // class ArrayProblemTrial{
// //   public static void main(String[] args) {
// //     int nums[]={1, 2, 2, 6, 99, 99, 7};int sum=0;
// //     for(int i=0;i<nums.length;i++){
// //       if(nums[i]==6){
// //         for(int j=i+1;j<nums.length;j++){
// //           if(nums[j]!=7)
// //             continue;
// //         }
// //       }
// //         if(i<nums.length && nums[i]!=6)
// //          sum+=nums[i];
// //       }
// //       System.out.println(sum);
// //     }
    
// //   }

//   // def sum67(nums):
//   // total = 0
//   // i=0  
//   // while i < len(nums):
//   //   if nums[i] == 6:
//   //     while nums[i] != 7:
//   //       i+=1
//   //     i+=1
//   //   if i<len(nums) and nums[i]!=6:  
//   //     total+=nums[i]
//   //     i+=1
//   // return total



// //working fine
// // class ArrayProblemTrial{
// //     public static void main(String[] args) {
// //       int nums[]={1,2,13,1};int sum=0;
// //       // if(nums.length==0)
// //       //   return nums;
// //       for(int i=0;i<nums.length;i++){
// //         if(nums[i]!=13)
// //           sum+=nums[i];
// //         else  
// //           i++;
// //       }
// //       System.out.println(sum);
// //     }
// //   }

// // class ArrayProblemTrial{
// //     public static void main(String[] args) {
// //         int nums[]={4, 4, 4, 4, 5};
// //                 int len=nums.length;
// //   int sum=0,res=0,count=0;
// //   int min=nums[0];
// //   int max=nums[0];
// //   for(int i=0;i<nums.length;i++){
// //     min=Math.min(min,nums[i]);
// //     max=Math.max(max,nums[i]);
// //   }
// //   for(int i=0;i<len-1;i++){
// //     if(nums[i]==max || nums[i]==min)
// //       continue;
// //     else{
// //       count++;
// //       sum+=nums[i];
// //       res=sum/count;
// //     }
// //   }
// //         System.out.println(max);
// //         System.out.println(min);
// //         System.out.println(sum);
// //         System.out.println(count);
// //         System.out.println(res);
// //     }
// // }