package calcu.controller;

import calcu.model.Calculadora;

public class CalculadoraBean {

	private int operando1;
	private int operando2;
	private int resultado;
	
	
	
	public int suma(int op1, int op2){
		Calculadora calc= new Calculadora();
		
		return calc.suma(op1, op2);
	}
	
	public int getOperando1() {
		return operando1;
	}
	public void setOperando1(int operando1) {
		this.operando1 = operando1;
	}
	public int getOperando2() {
		return operando2;
	}
	public void setOperando2(int operando2) {
		this.operando2 = operando2;
	}
	public int getResultado() {
		return resultado;
	}
	public void setResultado(int resultado) {
		this.resultado = resultado;
	}
	
}
