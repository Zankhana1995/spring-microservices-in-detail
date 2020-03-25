package com.demo.microservice.limitsservice.bean;

public class LimitComfiguration {
	private int maximum;
	private int minimum;
	
	protected LimitComfiguration()
	{
		
	}
	public LimitComfiguration(int maximum, int minimum) {
		super();
		this.maximum = maximum;
		this.minimum = minimum;
	}
	
	public int getMaximum() {
		return maximum;
	}

	public int getMinimum() {
		return minimum;
	}
	

}
