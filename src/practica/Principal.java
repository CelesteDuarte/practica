package practica;
import java.util.Scanner;

public class Principal {
public static void main(String[]args){

	boolean salir = false;
	String jugador1;
	String jugador2;
	Scanner nombre = new Scanner(System.in);
	String mazo1[] = new String [16];
	String mazo2[] = new String [16];
	
	String cartas[] =  new String [8];
	cartas[0] = "Guard";
	cartas[1] = "Priest";
	cartas[2] = "Baron";
	cartas[3] = "Handmaid";
	cartas[4] = "Prince";
	cartas[5] = "King";
	cartas[6] = "Countess";
	cartas[7] = "Princess";
	
	
do
	{Scanner valor=new Scanner(System.in);
	System.out.println("-=Bienvenido a Love Letter=-");
	System.out.println("(1) Jugar una partida");
	System.out.println("(2) Seleccionar el numero de tokens a jugar");
	System.out.println("(3) Mostrar las reglas de juego");
	System.out.println("(4) Salir");


	System.out.println("Desea hacerlo en modo debug   1)SI     2)NO :	");
int debug = nombre.nextInt();
	switch (debug)
	{
	case 1:
		
	}

System.out.println("Ingrese su opcion:	");
int token;
int opcion = valor.nextInt();
	switch (opcion)
{
	case 1:
		System.out.println("Ingrese nombre del jugador 1: ");
		jugador1 = nombre.next();
		System.out.println("Ingrese nombre del jugador 2: ");
		jugador2 = nombre.next();	
		mazo(mazo1);
		mazo(mazo2);
		for (int i=0; i<mazo1.length; i++){
			System.out.println(mazo1[i]);
		}
		System.out.println("");
		for (int i=0; i<mazo2.length; i++){
			System.out.println(mazo2[i]);
		}
		
	break;
//invocar class Partida
	
	case 2:
		System.out.println("¿Con cuantos tokens desea jugar?");
		Scanner read = new Scanner(System.in);
		try
		{
		token = read.nextInt();
		}
		
		catch (Exception e)
		{
		System.err.println("El valor introducido no es valido, se asumen 3 tokens");
		token = 3;
		}
		
	break;

	case 3:
		System.out.println("Reglas del juego:");
		System.out.println("Love Letter consta de 16 cartas:");
		System.out.println("(1) Guard: Permite adivinar la mano del rival (cartas del 2-8) si adivina, el jugador rival sale del juego.");
		System.out.println("(2) Priest: Permite ver la mano del jugador rival.");
		System.out.println("(3) Baron: Compara manos con el rival, el jugador con la carta mas baja sale del juego. En caso de empate no sucede nada.");
		System.out.println("(4) Handmaid: El jugador que utiliza esta carta es inmune a los ataques de los demas por un 1 turno.");
		System.out.println("(5) Prince: Permite “botar” la mano del jugador o la del rival. Y da una carta nueva del deck.");
		System.out.println("(6) King: Intercambia manos entre jugadores.");
		System.out.println("(7) Countess: Si el jugador tiene un Prince o King en su mano y la Countess debe jugar la Countess.");
		System.out.println("(8) Princess: Si el jugador juega esta carta pierde el juego.");
	break;

	case 4:
		System.out.println("Salir");
	break;
	default:
	System.out.println("Opción no válida");
}
}while (!salir);
	

}

public static String[] mazo(String mazo[]){
	System.out.println("Generando mazo");
	boolean a = false;
	int tamanoactual = 0;
	int guard = 0;
	int priest = 0;
	int baron = 0;
	int handmaid = 0;
	int prince = 0;
	int king = 0;
	int countess = 0;
	int princess = 0;
	
	while (!a){
		double b = (Math.random()*8)+1;
		int numeroaleatorio = (int) b;
		if (guard == 5 && priest == 2 && baron == 2 && handmaid == 2 && prince == 2 && king == 1 && countess == 1 && princess == 1 ){
			System.out.println("Mazo completo");
			a = true;
		}	else{
			System.out.println ("Completando mazo");
			if (numeroaleatorio == 1 && guard < 5){
				mazo[tamanoactual] = "guard";
				tamanoactual++;
				guard = guard + 1;
			}else if (numeroaleatorio == 2 && priest < 2){
				mazo[tamanoactual] = "priest";
				tamanoactual++;
				priest = priest + 1;
			}else if (numeroaleatorio == 3 && baron < 2){
				mazo[tamanoactual] = "baron";
				tamanoactual++;
				baron = baron + 1;
			}else if (numeroaleatorio == 4 && handmaid < 2){
				mazo[tamanoactual] = "handmaid";
				tamanoactual++;
				handmaid = handmaid + 1;
			}else if (numeroaleatorio == 5 && prince < 2){
				mazo[tamanoactual] = "prince";
				tamanoactual++;
				prince = prince + 1;
			}else if (numeroaleatorio == 6 && king < 1){
				mazo[tamanoactual] = "king";
				tamanoactual++;
				king = king + 1;
			}else if (numeroaleatorio == 7 && countess < 1){
				mazo[tamanoactual] = "countess";
				tamanoactual++;
				countess = countess + 1;
			}else if (numeroaleatorio == 8 && princess < 1){
				mazo[tamanoactual] = "princess";
				tamanoactual++;
				princess = princess + 1;
			}
		}
				
		
	}
	
		
	return null;
}

public static void debugOption(int opcionDebug, String[] mazo1, String[] mazo2){
	if(opcionDebug==1){
		//si es el turno del jugador 1 entonces
		for(int i = 0; i < 16; i++){
			System.out.println(mazo2[i]);
		}
		
		
		//si es el turno del jugador 2 entonces
		for(int i = 0; i < 16; i++){
			System.out.println(mazo1[i]);
		}
	}
}

}

