package almeida.paulorocha.animals.visitor;

import almeida.paulorocha.animals.model.Answer;
import almeida.paulorocha.animals.model.Question;
import almeida.paulorocha.animals.ui.UIMode;
import almeida.paulorocha.animals.ui.UIMode.UIAnswer;

public class DefaultGame implements Visitor {

	private final UIMode ui;
	
	public DefaultGame(UIMode mode) {
		ui = mode;
	}
	
	public void visit(Question question) {
		final UIAnswer uiAnswer = ui.show(question);
		if (uiAnswer.equals(UIAnswer.YES)) {
			question
				.getYes()
				.accept(this);
		} else if(uiAnswer.equals(UIAnswer.NO)) {
			question
				.getNo()
				.accept(this);
		}
	}

	public void visit(Answer answer) {
		if (ui.show(answer).equals(UIAnswer.NO)) {
			
			final Question question = ui.createQuestion();
			
			question.setNo(answer);
			
			answer
				.getParent()
				.setNo(question);
		}
	}

}
