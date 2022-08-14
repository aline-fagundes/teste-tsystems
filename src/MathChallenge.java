public class MathChallenge {

    public static int MathChallenge(int num1, int num2) {

        int minimum = (num1 < num2) ? num1 : num2;

        int gcf = 1;

        for(int i = 1; i <= minimum; i++) {

            if((num1 % i == 0) && (num2 % i == 0)) {

                gcf = i;
            }
        }

        return gcf;
    }
}
