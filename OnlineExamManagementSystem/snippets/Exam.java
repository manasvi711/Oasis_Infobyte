package oasis;
import java.util.Scanner;
public class Exam {
	private final String[] questions = {
			"1. What is the capital of India? A)Hyderabad b)Patna c)Gandhinagar d)New Delhi",
			"2. Which is the largest planet? A) Earth b) Mars c) Jupiter d) Saturn",
			"3. Which is the widest river of India? A)Brahmaputra B)Gomti C)Ganga D)Chambal",
			"4. Kalpana Chawla was the citizen of? A)India B)U.S.A C)Both India and U.S.A D)only U.S.A"
	};
	private final char[] answers = {'d', 'c', 'a','c'};
	public void startExam(Scanner scanner, User user) {
		char[] userAnswers = new char[questions.length];
		Long startTime = System.currentTimeMillis();
		Long endTime = startTime + 60 * 1000; // 1 minute timer
 	for (int i = 0; i < questions.length; i++) {
 		if (System.currentTimeMillis() > endTime) {
 			System.out.println("Time’s up! Auto-submitting…");
 			break;
 		}
 		System.out.println(questions[i]);
 		System.out.print("Your answer: ");
 		userAnswers[i] = scanner.next().charAt(0);
 	}
 	evaluate(userAnswers);
	}
	private void evaluate(char[] userAnswers) {
		int score = 0;
		for (int i = 0; i < answers.length; i++) {
			if (userAnswers[i] == answers[i]) {
				score++;
			}
		}
		System.out.println("\n Your score is: " + score + "/" + answers.length+"\n");
	}
}