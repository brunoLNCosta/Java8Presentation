package aula01;

import aula01.interfaces.InterfaceVoid;

public class NestedClasses01 {

	// Inner classes
	public class InnerClass {
		
		private String atributo;

		public String getAtributo() {
			return atributo;
		}

		public void setAtributo(String atributo) {
			this.atributo = atributo;
		}
	}
	
	// Static Nested Class
	public static class StaticNestedClass {
		
		private String atributo;

		public String getAtributo() {
			return atributo;
		}

		public void setAtributo(String atributo) {
			this.atributo = atributo;
		}
		
	}
	
	// Local Inner Class
	public void metodoLocalInnerClass() {
		
		class LocalInnerClass {
			
			private String atributo;

			public String getAtributo() {
				return atributo;
			}

			public void setAtributo(String atributo) {
				this.atributo = atributo;
			}
			
		}
		
		LocalInnerClass localClass = new LocalInnerClass();
		localClass.setAtributo("teste");
		System.out.println(localClass.getAtributo());
	}
	
	// Annoymous Inner
	public void metodoAnnoymousInnerClass() {
		
		InterfaceVoid interfaceVoid = new InterfaceVoid() {
			@Override
			public void doIt() {
				System.out.println("Eu acabei de dar new em uma interface!!?");
			}
		};
		interfaceVoid.doIt();
	}
	
}