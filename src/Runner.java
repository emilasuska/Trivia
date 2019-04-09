import java.util.Scanner;

public class Runner {
    static int numberOfQuestions = 10;

    public static void main (String[] arguments) {
        Question[] questions = new Question[numberOfQuestions];
        String[] guesses = new String[numberOfQuestions];
        int numberOfCorrectAnswers = 0;

        // ask the user for answers to 10 random questions
        for (int i = 0; i < numberOfQuestions; i++) {
            // pick a random question
            Question question = new Question();

            // ask the user the question
            System.out.print((i + 1) + ".) " + question.getQuestion() + " ");

            // get guessed answer from user
            Scanner scanner = new Scanner(System.in);
            String guessedAnswer = scanner.nextLine();

            questions[i] = question;
            guesses[i] = guessedAnswer.trim();

            // count how many are correct
            if (question.isAnswerCorrect(guessedAnswer)) {
                numberOfCorrectAnswers++;
            }
        }

        System.out.println("\nYou got " + numberOfCorrectAnswers + " out of " + numberOfQuestions + " correct!");

        for (int i = 0; i < numberOfQuestions; i++) {
            System.out.println((i + 1) + ".) " + questions[i].getQuestion());
            if (questions[i].isAnswerCorrect(guesses[i])) {
                System.out.println("      Correct guess! : " + questions[i].getAnswer() + ".");
            } else {
                System.out.println("      Your guess     : " + guesses[i] + ".");
                System.out.println("      Correct answer : " + questions[i].getAnswer() + ".");
            }
        }
    }
}
