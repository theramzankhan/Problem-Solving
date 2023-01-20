class ArrayProb1{
    public static void main(String[] args) {
        int nums[]={7,2,10,9};
        int len=nums.length;
        int max=0,min=0,res=0;
        for(int i=0;i<len;i++){
            min=100;
            min=Math.min(min,nums[i]);
            max=Math.max(max,nums[i]);
        }
        res=max-min;
        System.out.println(max);
        System.out.println(min);
        System.out.println(res);
    }
}