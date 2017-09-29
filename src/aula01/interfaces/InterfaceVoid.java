package aula01.interfaces;

@FunctionalInterface // Annotations
public interface InterfaceVoid {
	
	// Metodo abstrato
	public void doIt();
	
	// Metodos default são desconsiderados
	public default Integer metodoDefault01() {
		return 1;
	}
	
	public default String metodoDefault02() {
		return "2";
	}
	
}
