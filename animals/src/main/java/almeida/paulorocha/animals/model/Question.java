package almeida.paulorocha.animals.model;

import almeida.paulorocha.animals.visitor.Visitor;

public class Question extends Nodo {

	private String value;
	private Nodo yes;
	private Nodo no;
	
	public Question(String value) {
		this.value = value;
	}

	public void setYes(Nodo node) {
		yes = node;
	}
	
	public Nodo getYes() {
		return yes;
	}
	
	public void setNo(Nodo node) {
		no = node;
	}
	
	public Nodo getNo() {
		return no;
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
