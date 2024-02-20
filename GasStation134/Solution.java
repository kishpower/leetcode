package GasStation134;

public class Solution {
    public static void main(String[] args) {
        System.out.println(canCompleteCircuit(new int[]{1,2,3,4,5}, new int[]{3,4,5,2,1}));
    }
    public static int canCompleteCircuit(int[] gas, int[] cost) {
//        gas  = 0 + 5  = 5;
//        tripTo0= 5 - 2 + 1 = 4;
//        tripTo1 = 4 - 3 + 2 = 3;
//        tripTo2 = 3 - 5 = -2 which is < 0,means we cant travel to station index 2;

        //        gas  = 0 + 5  = 5;
//        tripTo0= 5 - 1 + 1 = 5;
//        tripTo1 = 5 - 3 + 2 = 4;
//        tripTo2 = 4 - 4 + 3 = 3;
//        tripTo3 = 3 - 5 < 0 :(

        int totalGas = 0 ;
        int totalCost = 0;
        for (int i = 0 ; i < gas.length ; i++){
            totalGas += gas[i];
            totalCost += cost[i];
        }

        if (totalCost > totalGas){
            return -1;
        }

        int remainGas = 0;
        int start = 0;
        for (int i = 0 ; i < gas.length ; i++){
            remainGas += gas[i] - cost[i];

            if (remainGas < 0){
                start = i+1;
                remainGas = 0;
            }
        }

        return start;
    }
}
