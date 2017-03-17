/**
 * Created by a1132199 on 15/03/17.
 */
class InsertionSortCount {

    int countMoves(int[] A) {

        /*
           initialize a new empty sequence R
           for each number N in A (in the original order) do:
              determine the index i in R where N should be inserted so that R remains sorted
              move each element in R with index greater than or equal to i to the following index
              set R[i]=N
           return R
         */

        def sorted = A
        int swapCount = 0;
        for (int i = 0; i < A.length; i++) {
            int j = i
            while (j > 0 && A[j-1] > A[j]) {
                A.swap(j, j-1)
                swapCount++
                j = j-1
            }
        }

        swapCount
    }

}
