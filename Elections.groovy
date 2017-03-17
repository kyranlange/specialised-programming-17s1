/**
 * Created by a1132199 on 15/03/17.
 */
class Elections {


    int visit(String[] likelihoods) {
        double min = Double.MAX_VALUE
        int minIndex = -1

        for (int i = 0; i < likelihoods.length; i++) {
            String s = likelihoods[i]
            int ones = s.toCharArray().count('1')
            double percentage = ones/s.length()
            if (percentage < min) {
                min = percentage
                minIndex = i
            }
        }

        return minIndex
    }
}
