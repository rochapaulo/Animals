package almeida.paulorocha.animals.ui;

import static javax.swing.JOptionPane.NO_OPTION;
import static javax.swing.JOptionPane.YES_NO_OPTION;
import static javax.swing.JOptionPane.YES_OPTION;
import static javax.swing.JOptionPane.showConfirmDialog;
import static javax.swing.JOptionPane.showInputDialog;
import almeida.paulorocha.animals.model.Answer;
import almeida.paulorocha.animals.model.Question;

public class WindowMode implements UIMode {

	public UIAnswer show(Question question) {
		return parseAnswer(showConfirmDialog(null, question, "Question", YES_NO_OPTION));
	}

	public UIAnswer show(Answer answer) {
		return parseAnswer(showConfirmDialog(null, answer, "Answer", YES_NO_OPTION));
	}
	
	private UIAnswer parseAnswer(int answer) {
		if (answer == YES_OPTION) {
			return UIAnswer.YES;
		} else if (answer == NO_OPTION) {
			return UIAnswer.NO;
		} 
		return UIAnswer.CANCEL;
	}

	public Question createQuestion() {
		String phrase = null;
		while (phrase == null || phrase.isEmpty()) {
			phrase = showInputDialog("Question Phrase");
		}
		
		String positiveAnswer = null;
		while (positiveAnswer == null || positiveAnswer.isEmpty()) {
			positiveAnswer = showInputDialog("Positive Answer");
		}

		Question question = new Question(phrase);
		question.setYes(new Answer(positiveAnswer, question));
		
		return question;
	}

}
