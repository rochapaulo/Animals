package almeida.paulorocha.animals.game;

import almeida.paulorocha.animals.model.Answer;
import almeida.paulorocha.animals.model.Nodo;
import almeida.paulorocha.animals.model.Question;
import almeida.paulorocha.animals.ui.WindowMode;
import almeida.paulorocha.animals.visitor.DefaultGame;


public class Animals implements Runnable {

	public void run() {
		final Nodo base = createBase();
		while (true) {
			base.accept(new DefaultGame(new WindowMode()));
		}
	}
	
	private Question createBase() {
		Question question = new Question("The animal that you thought lives in water?");
		question.setYes(new Answer("Shark", question));
		question.setNo(new Answer("Monkey", question));
		return question;
	}
	
	public static void main(String[] args) {
		new Animals().run();
	}
	
}
