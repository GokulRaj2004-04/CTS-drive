public class NumberGuessGame {
    public static void main(String[] args) {
        int secret = 47; 
        int[] guesses = {30, 50, 45, 47};
        for (int guess : guesses) {
            if (guess < secret) {
                System.out.println("Too low");
            } else if (guess > secret) {
                System.out.println("Too high");
            } else {
                System.out.println("Correct! The number was " + secret);
                break;
            }
        }
    }
}
