package com.dp.decorator.decorators;

import com.dp.decorator.Boisson;

public abstract class AbstractDecorator extends Boisson {
	protected Boisson boisson;

	public AbstractDecorator(Boisson boisson) {
		super();
		this.boisson = boisson;
	}

	public abstract String getDescription();

}
