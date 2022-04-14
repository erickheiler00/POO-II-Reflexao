package reflexao;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class TesteReflexao {

	public static void main(String[] args) throws ClassNotFoundException {
			
			Scanner s = new Scanner(System.in);

			System.out.println("Digite de qual classe gostaria de ver as informacoes (Carro ou Tanque): ");	
			String classe = s.nextLine();
		 
			Class<?> hm = Class.forName("reflexao." + classe);
			try {			
				Constructor c = hm.getDeclaredConstructors()[0];
				
				try {
				
					System.out.println("---------------------------------------");
					System.out.println("Nome da classe: " + hm.getName());
					System.out.println("Nome simples da classe: " + hm.getSimpleName());
					System.out.println("Tipo da classe: " + hm.getTypeName());
					System.out.println("---------------------------------------");
					
					if (classe.equals("Carro")) {
						
						Carro carro1 = (Carro) c.newInstance();
						carro1.setNome("Celta");
						carro1.setVelocidadeMaxima(200);
						carro1.setQtdPortas(4);
						carro1.setCor("Prata");
						carro1.setQtdLugares(5);
						carro1.setPreco(18000.00);
						
						imprimir(carro1);
					}	
					
					if (classe.equals("Tanque")) {
						
						Tanque tanque1 = (Tanque) c.newInstance();
						tanque1.setNome("WWI Tank");
						tanque1.setVelocidadeMaxima(60);
						tanque1.setQtdPortas(1);
						tanque1.setCor("Verde");
						tanque1.setQtdLugares(4);
						tanque1.setPreco(300000.00);
						tanque1.setMunicao(500);
						tanque1.setArmamento(true);
						imprimir(tanque1);
					}
				
				} catch (InstantiationException | IllegalAccessException 
						| IllegalArgumentException 
						| InvocationTargetException e) {
					e.printStackTrace();
				}							
			} catch (SecurityException e) {
				e.printStackTrace();
		}
	
	}
					
		private static boolean isGetter(Method m) {
			return m.getName().startsWith("get") &&
					m.getReturnType() != void.class &&
					m.getParameterTypes().length == 0;
		}
		
		private static String deGetterParaPropriedade(String nomeGetter) {
			StringBuffer retorno = new StringBuffer();
			retorno.append(nomeGetter.substring(3, 4).toLowerCase());
			retorno.append(nomeGetter.substring(4));
			return retorno.toString();
		}
		
		private static void imprimir(Object instancia) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
			
			Class<?> hm = instancia.getClass();
			
			for (Method m: hm.getMethods()) {
				if (isGetter(m)) {
					String propriedade = deGetterParaPropriedade(m.getName());
					
					Object valor = m.invoke(instancia);
					String tipo = m.getReturnType().getSimpleName();
					
					System.out.println(propriedade + " = " + valor);
					System.out.println("tipo = " + tipo);
					System.out.println("---------------------------------------");				
			}
		}
	}
}
	
