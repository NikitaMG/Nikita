public class Task {
    public  int numJewelsInStones(String jewels, String stones) {
        int result = 0;
        for (int i = 0; i < stones.length(); i++) {
            for (int j =0; j < jewels.length(); j++) {
                if (stones.charAt(i) == jewels.charAt(j))
                    result++;
            }
        }
        return result;
    }


    public  int numIdenticalPairs(int[]nums){
        int result = 0;
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j])
                    result++;
            }
        }
        return result;
    }
}
