package aula01;

import aula01.interfaces.Interface1ParamReturn;

public class Segredos03 {

	private String atributo;
	
	private final String atributoFinal = "";
	
	public void segredosDolambda(Integer x) {
		
		Integer variavelLocal = 10;
		
		// Interface1ParamReturn
		Interface1ParamReturn interface1Param =  y -> y % 2 == 0 ? "Par" : "Impar";
		
	} 

	public String getAtributo() {
		return atributo;
	}

	public void setAtributo(String atributo) {
		this.atributo = atributo;
	}

	public String getAtributoFinal() {
		return atributoFinal;
	}
	
}
