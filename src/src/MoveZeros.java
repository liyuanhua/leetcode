/**
 * Created by liyuanhua on 16/4/6.
 */
public class MoveZeros {

    int[] nums = {0, 1, 0, 3, 12};

    public void moveZeroes(int[] nums) {

        for(int i = 0 ;i < nums.length -1;i++){
            for(int j = 0 ; j< nums.length -1 -i;j++){
                if(nums[j] == 0){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
    }

        public static void main(String[] args){

            MoveZeros mz = new MoveZeros();

            mz.moveZeroes(mz.nums);

            for(int i = 0 ;i<mz.nums.length;i++){
                System.out.println(mz.nums[i]);
            }
    }

    }

