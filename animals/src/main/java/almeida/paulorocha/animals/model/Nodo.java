package almeida.paulorocha.animals.model;

import almeida.paulorocha.animals.visitor.Visitor;

public abstract class Nodo {

	public abstract void accept(Visitor visitor);
	
}
