package ch06.ex06.case05;

import java.time.LocalDate;

public interface Electronic {
	public static final int VOLTAGE = 200; // public static final �ʼ�Ű����
	static final String MAKER_NAME = "LG";
	final int WEIGHT = 10;
	LocalDate PRODUCED_DATE = LocalDate.now();
	
	public abstract void displayMsg(); 	// public abstract �ʼ� �޼ҵ�
	abstract int getTemperature();
	String getModelName();
}
