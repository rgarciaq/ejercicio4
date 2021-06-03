package examen;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.IOException;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class MainPedirDatos {
	private final static Logger LOGGER = Logger.getLogger("MainPedirDatos");
	public static void main(String[] args) {
		Handler consoleHandler = new ConsoleHandler();
		SimpleFormatter simpleFormatter = new SimpleFormatter();
		LOGGER.addHandler(consoleHandler);
		consoleHandler.setLevel(Level.ALL);
		
		List lista = new ArrayList();
		Scanner teclado = new Scanner(System.in);
		
		int valor;
		do {
			System.out.println("Introduzca un valor: (0 para salir)");
			valor = teclado.nextInt();
			LOGGER.log(Level.INFO,"SE HA INTRODUCIDO UN VALOR");
			Nodo nodo = new Nodo(valor);
			if(valor!=0) {
				lista.add(nodo);
			}
			try {
				if (valor%2 != 0) {
					Handler fileHandler = new FileHandler("RAUL_LOGS_3EVA.log",true);
					fileHandler.setFormatter(simpleFormatter);
					LOGGER.addHandler(fileHandler);
					fileHandler.setLevel(Level.ALL);
					LOGGER.log(Level.INFO, "SE HA INTRODUCIDO VALOR IMPAR");
					
				}
			}catch (IOException ex) {


	        } catch (SecurityException ex) {

	        	LOGGER.log(Level.SEVERE,"SE HA PRODUCIDO UN ERROR");


	        }
		}while(valor!=0);
	}
}