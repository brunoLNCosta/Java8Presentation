package aula01;

import aula01.interfaces.Interface1ParamReturn;
import aula01.interfaces.Interface2ParamReturn;
import aula01.interfaces.InterfaceVoid;

public class Lambda02 {

//	public void metodoAnnoymousInnerClass() {
//		
//		InterfaceVoid interfaceVoid = new InterfaceVoid() {
//			@Override
//			public void doIt() {
//				System.out.println("Eu acabei de dar new em uma interface!!?");
//			}
//		};
//		interfaceVoid.doIt();
//	}
	
	// Rescrevendo com o lambda.
	public void metodoAnnoymousInnerClass() {
		
		InterfaceVoid interfaceVoid = () -> System.out.println("Eu acabei de dar new em uma interface!!?");
		interfaceVoid.doIt();
	}
	
	public void criandoLambdas() {
		
		// Interface2ParamReturn Full
		Interface2ParamReturn interface2Param = (Integer x, Integer y) -> { 
			Integer resultado = x + y;
			return resultado;
		};
				
		// Em uma linha
		interface2Param = (Integer x, Integer y) -> {return x + y;};
		
		// Abstraindo tipo dos parametros
		interface2Param = (x, y) -> {return x + y;};
		
		// Omitindo sintax de retorno
		interface2Param = (x ,y) -> x + y;
		
		
		// InterfaceVoid sem return
		InterfaceVoid interfaceVoid = () -> {
				System.out.println("Primeira linha de codigo");
				System.out.println("Segunda linha de codigo");
		};
		
		interfaceVoid = () -> System.out.println("Primeira linha de codigo");
		
		// Interface1Param simple
		Interface1ParamReturn interface1ParamReturn = x -> x % 2 == 0 ? "Par" : "Impar";
		
		// Consumir o metodo funcional das duas formas
		this.metodoFuncional("O resultado é:", interface2Param, 10, 10);
		this.metodoFuncional("O resultado é:", (x ,y) -> x + y, 10, 10);
	}
	
	// Metodo Funcional
	public void metodoFuncional(String prefixo, Interface2ParamReturn interface2Param, Integer x, Integer y) {
		System.out.println(prefixo + " " + interface2Param.returnIt(x, y));
	}
	
}
