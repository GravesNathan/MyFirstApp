package com.example.main.appcontrolcalculator;

public class Addition implements appcontrolcalculator.doMath {
	public void execute(Integer input1, Integer input2){
		Integer addition = input1 + input2;
		System.out.println(addition);
	}
	
	public int addition(int i, int j) {
		return i + j;
	}
}
