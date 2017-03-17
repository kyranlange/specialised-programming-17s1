/**
 * Created by a1132199 on 15/03/17.
 */
class Bonuses {

    // https://community.topcoder.com/stat?c=problem_statement&pm=1677

    int[] getDivision(int[] points) {
        int totalPoints = points.sum()

        List<Integer> percentage = []
        points.each {percentage.add((it/totalPoints)*100 as Integer)}

        int remainder = 100 - percentage.sum()
        if (remainder > 0) {
            //add 1 to top remainders
            List<Integer> sorted = new ArrayList<>(points.collect()).sort().reverse()

            for (int i = 0; i < remainder; i++) {
                int index = points.findIndexOf {it == sorted[i]}
                points[index] = 0
                percentage[index]++
            }
        }

        percentage as int[]
    }
}
