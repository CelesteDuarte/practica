package practica;

import java.util.Scanner;

public class Principal {
public static void main(String[]args){

	boolean salir = false;
do
{	Scanner valor=new Scanner(System.in);
System.out.println("-=Bienvenido a Love Letter=-");
System.out.println("(1) Jugar una partida");
System.out.println("(2) Seleccionar el numero de tokens a jugar");
System.out.println("(3) Mostrar las reglas de juego");
System.out.println("(4) Salir");

System.out.println("Ingrese su opcion:	");
int opcion = valor.nextInt();
	switch (opcion)
{
case 1:
	Partida clase= new Partida();
	break;
//invocar class Partida
	
case 2:
	System.out.println("¿Con cuantos tokens desea jugar?");
	opcion = valor.nextInt();
	break;

case 3:
	System.out.println("Reglas del juego:");
	System.out.println("Love Letter consta de 16 cartas:");
	System.out.println("(1) Guard: Permite adivinar la mano del rival (cartas del 2-8) si adivina, el jugador rival sale del juego. (5 en el mazo)");
	System.out.println("(2) Priest: Permite ver la mano del jugador rival. (2 en el mazo)");
	System.out.println("(3) Baron: Compara manos con el rival, el jugador con la carta mas baja sale del juego. En caso de empate no sucede nada. (2 en el mazo)");
 	System.out.println("(4) Handmaid: El jugador que utiliza esta carta es inmune a los ataques de los demas por un (1) turno. (2 en el mazo)");
	System.out.println("(5) Prince: Permite “botar” la mano del jugador o la del rival. Y da una carta nueva del deck. (2 en el mazo)");
	System.out.println("(6) King: Intercambia manos entre jugadores.(1 en el mazo)");
	System.out.println("(7) Countess: Si el jugador tiene un Prince o King en su mano y la Countess debe jugar la Countess. (1 en el mazo)");
	System.out.println("(8) Princess: Si el jugador juega esta carta pierde el juego. (1 en el mazo)");
	break;

case 4:
	System.out.println("Salir");
	break;
default:
	System.out.println("Opción no válida");
}
}while (!salir);
	
			
}

}

