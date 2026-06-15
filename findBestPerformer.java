public class findBestPerformer {
    public static int secondBestPerformer(int[] finishTime) {
        int bestSoFarIndex = bestPerformer(finishTime);
        
        // create a new array without bestSoFar
        int[] withoutBest = new int[finishTime.length - 1];
        int j = 0; // withoutBest need a different iterator, for i need to jump a discarded result
        for (int i = 0; i < finishTime.length; i++) {
            if (i != bestSoFarIndex) { // exclude any result that == bestSoFar, avoiding ties
                withoutBest[j++] = finishTime[i];
            }
        }
        // finding the best in withOutBest
        int secondBest = bestPerformer(withoutBest);
       
        // int secondBest is a value, i need to find the index of this value in finishTime array, not withoutBest array
        int minIndex = 0;
        for (int i = 0; i < finishTime.length; i++) {
            if (secondBest == finishTime[i]) {
                minIndex = i;
                break;
            }
        }

        return minIndex;
    }
    public static int bestPerformer(int[] finishTime) {
        // safety check
        if (finishTime == null || finishTime.length == 0) {
            System.err.println("empty finish time array");
            return -1;
        }
        // initialize required parameters
        int minValue = 0;
        int minIndex = 0;

        for (int i = 0; i < finishTime.length; i++) {
            if (finishTime[i] < minValue || minValue == 0) {
                minValue = finishTime[i];
                minIndex = i;
            }
        }

        return minIndex;
    }

    public static void main(String[] args) {
        int[] finishTime = {300, 250, 350, 500, 320, 280}; //marathon result, unit minutes
        System.out.println("[index, result]");
        System.out.println(bestPerformer(finishTime) + 1);
        System.out.println(secondBestPerformer(finishTime) + 1);
    }
}
