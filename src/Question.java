public class Question {
    private static String[] questions = {
            "What is the capital city of Canada?",
            "What is the capital city of Illinois?",
            "What is the capital city of Colorado?",
            "What is the largest river in North America?",
            "What is the largest lake in North America?",
            "What is the tallest mountain in North America?",
            "What is the capital city of Montana?",
            "What is the capital city of Kentucky?",
            "What is the capital city of Maryland?",
            "What is the capital city of Nebraska?"
    };

    private static String[] answers = {
            "Ottawa",
            "Springfield",
            "Denver",
            "Mississippi",
            "Superior",
            "Denali",
            "Helena",
            "Frankfort",
            "Annapolis",
            "Lincoln"
    };

    private String question;
    private String answer;

    // Create a question with given known correct answer.
    public Question(String question, String answer) {
        this.question = question;
        this.answer = answer;
    }

    // Pick at random from a pool of questions with known correct answers.
    public Question() {
        int randomIndex = (int)(Math.random() * questions.length);
        question = questions[randomIndex];
        answer = answers[randomIndex];
    }

    public boolean isAnswerCorrect(String guessedAnswer) {
        return answer.toLowerCase().equals(guessedAnswer.trim().toLowerCase());
    }

    public String getQuestion() {
        return question;
    }

    public String getAnswer() {
        return answer;
    }
}
