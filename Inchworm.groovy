/**
 * Created by a1132199 on 15/03/17.
 */
class Inchworm {

    int lunchtime(int branch, int rest, int leaf) {
        branch / lcm(rest, leaf) + 1
    }

    int lcm(int a, int b) {
        a*b/gcd(a,b)
    }

    int gcd(int a, int b) {
        int temp = a%b
        if (temp != 0) {
            return gcd(b, temp)
        } else {
            return b
        }
    }
}
