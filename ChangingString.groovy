/**
 * Created by a1132199 on 15/03/17.
 */
class ChangingString {

    int distance(String A, String B, int K) {
        def list = []

        for (int i = 0; i < A.length(); i++) {
            int tempDiff = A.codePointAt(i) - B.codePointAt(i)
            // The difference between char at i in A and char at i in B
            tempDiff = Math.abs(tempDiff)
            if (tempDiff) {
                list.add(tempDiff)
            }
        }
        //Sort the list in decreasing order
        list.sort({a,b->b-a})

        if (K >= list.size()) {
            return K-list.size()
        }
        int sum = 0
        for (int i = K; i < list.size(); i++) {
            sum += list.get(i)
        }
        return sum
    }
}
