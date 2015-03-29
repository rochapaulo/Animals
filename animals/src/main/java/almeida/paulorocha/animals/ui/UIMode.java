package almeida.paulorocha.animals.ui;

import almeida.paulorocha.animals.model.Answer;
import almeida.paulorocha.animals.model.Question;

public interface UIMode {

	UIAnswer show(Question question);

	UIAnswer show(Answer answer);

	public enum UIAnswer { YES, NO, CANCEL }

	Question createQuestion();


}
