class Solution {
    public int[] separateDigits(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0;i<nums.length;i++)
        {
            String str =   String.valueOf(nums[i]);
            for(int j=0;j<str.length();j++)
            {
                list.add(str.charAt(j)-'0');
            }
        }
        
        int a[]=new int[list.size()];

        for(int i=0;i<a.length;i++)
        {
            a[i]=list.get(i);
        }
        return a;
    }
}