public class RecrusiveFunction {
        public static int sumOfMultiplesOf7(int n1, int n2) {
            if (n1 > n2) {
                return 0;
            } else if (n1 % 7 == 0) {
                return n1 + sumOfMultiplesOf7(n1 + 7, n2);
            } else {
                return sumOfMultiplesOf7(n1 + 1, n2);
            }
        }

        public static void main(String[] args) {
            int n1 = 1; // Start range
            int n2 = 20; // End range
            int result = sumOfMultiplesOf7(n1, n2);
            System.out.println("Sum of multiples of 7 between " + n1 + " and " + n2 + ": " + result);
        }
    }

