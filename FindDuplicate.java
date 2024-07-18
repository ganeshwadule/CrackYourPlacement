import java.util.HashSet;

public class FindDuplicate {
        public int findDuplicate(int[] nums) {
            HashSet<Integer> set = new HashSet<>();
            for(int i:nums){
                if(set.contains(i)){
                    return i;
                }
                set.add(i);
            }
            return 0;

        }
}
