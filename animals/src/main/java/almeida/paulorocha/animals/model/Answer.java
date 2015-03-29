package almeida.paulorocha.animals.model;

import almeida.paulorocha.animals.visitor.Visitor;

public class Answer extends Nodo {

	private Question parent;
	private String value;
	
	public Answer(String value, Question parent) {
		this.parent = parent;
		this.value = value;
	}
	
	public Question getParent() {
		return parent;
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

	@Override
	public String toString() {
		return value;
	}
	
}
