package almeida.paulorocha.animals.visitor;

import almeida.paulorocha.animals.model.Answer;
import almeida.paulorocha.animals.model.Question;

public interface Visitor {

	void visit(Question question);

	void visit(Answer answer);

}
