
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] questions = {
            "1. Which language is used for Android development?",
            "2. Which keyword creates a class in Java?",
            "3. Which method starts a Java program?",
            "4. Which symbol ends a Java statement?",
            "5. Which company developed Java?"
        };

        String[][] options = {
            {"A. HTML", "B. Java", "C. CSS", "D. SQL"},
            {"A. define", "B. function", "C. class", "D. create"},
            {"A. start()", "B. run()", "C. main()", "D. begin()"},
            {"A. :", "B. ;", "C. ,", "D. ."},
            {"A. Microsoft", "B. Apple", "C. Google", "D. Sun Microsystems"}
        };

        char[] answers = {'B', 'C', 'C', 'B', 'D'};
        int score = 0;

        System.out.println("===== JAVA QUIZ APPLICATION =====");
        System.out.println("Choose A, B, C, or D.\n");

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);

            for (String option : options[i]) {
                System.out.println(option);
            }

            System.out.print("Your answer: ");
            String input = sc.next().trim().toUpperCase();

            if (input.length() == 1 &&
                input.charAt(0) == answers[i]) {
                System.out.println("Correct answer!\n");
                score++;
            } else {
                System.out.println(
                    "Wrong! Correct answer: " + answers[i] + "\n"
                );
            }
        }

        System.out.println("===== QUIZ RESULTS =====");
        System.out.println("Total questions: " + questions.length);
        System.out.println("Correct answers: " + score);
        System.out.println("Wrong answers: " +
                           (questions.length - score));
        System.out.println("Final score: " + score +
                           "/" + questions.length);

        double percentage =
            (score * 100.0) / questions.length;

        System.out.printf("Percentage: %.2f%%%n", percentage);
        System.out.println("Thank you for playing!");

        sc.close();
    }
             }
  
