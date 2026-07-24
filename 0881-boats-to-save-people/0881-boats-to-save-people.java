class Solution {
    public int numRescueBoats(int[] people, int limit) {

        Arrays.sort(people);

        int left = 0;
        int right = people.length - 1;
        int boat = 0;

        while(left < right)
        {
            if(people[left] + people[right] > limit){
                boat++;
                right--;
            }
            else{
                boat++;
                left++;
                right--;
            }

            if(left == right)
                boat++;
        }

        return boat;
        // int boat = 1;
        // int sum = 0;
        // int left =0;
        // for(int right = 0;right<people.length ; right++){
        //     sum += people[right];
        //     if(sum > limit){
        //         boat++;
        //         sum -= people[left];
        //         left++;
        //     }
        // }
        // return boat;
    }
}