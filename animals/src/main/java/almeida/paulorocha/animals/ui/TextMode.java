package almeida.paulorocha.animals.ui;

import java.util.Scanner;

import almeida.paulorocha.animals.model.Answer;
import almeida.paulorocha.animals.model.Question;

public class TextMode implements UIMode {
	
	private final Scanner reader = new Scanner(System.in);

	public UIAnswer show(Question question) {
		System.out.println(question + " [yes/no]");
		return parseAnswer(reader.nextLine());
	}

	public UIAnswer show(Answer answer) {
		System.out.println(answer + " [yes/no]");
		return parseAnswer(reader.nextLine());
	}
	
	private UIAnswer parseAnswer(String value) {
		if ("yes".equals(value)) {
			return UIAnswer.YES;
		}
		return UIAnswer.NO;
	}

	public Question createQuestion() {
		System.out.println("phrase: ");
		String phrase = reader.nextLine();
		
		System.out.println("positive answer: ");
		String positiveAnswer = reader.nextLine();
		
		Question question = new Question(phrase);
		question.setYes(new Answer(positiveAnswer, question));
		
		return question;
	}

}
