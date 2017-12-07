package com.example.main.appcontrolcalculator;
import java.util.HashMap;

public class Controller {
	public static HashMap<String, appcontrolcalculator.doMath> key = new HashMap <String, appcontrolcalculator.doMath>();
	
	public void Controller(){
		
	}
	
	public static void handleOperator(String operator, Integer input1, Integer input2){
		key.put("+", new Addition());
		key.put("-", new appcontrolcalculator.Subtraction());
		key.put("/", new appcontrolcalculator.Division());
		key.put("*", new appcontrolcalculator.Multiplication());
		
		appcontrolcalculator.doMath handler = key.get(operator);
		handler.execute(input1, input2);
	}
}
