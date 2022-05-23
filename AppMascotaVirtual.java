import java.util.Scanner;

public class AppMascotaVirtual {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		int cont;
		int op;
		cont = 0;
		op = 0;
		
		
		MascotaVirtual m1 = new MascotaVirtual("Espi", 7, 10, "rosada", "tirar bolas de fuego");
 
		
		while(cont == 0) {
			System.out.println("Selecciona la opción que deseas:");
			System.out.println("1 para hacer dormir a Espi");
			System.out.println("2 para alimentar a Espi");
			System.out.println("3 para que Espi juegue");
			System.out.println("4 para que Espi haga un nuevo amigo o nueva amiga");
			System.out.println("5 para que Espi tome un descanso");
			
		
			System.out.println("6 para que Espi despierte");
			System.out.println("7 para que Espi deje de comer");
			System.out.println("8 para que Espi deje de jugar");
			System.out.println("9 para que Espi no haga otro amigo, por ahora");
			System.out.println("10 para que Espi deje de descansar, ya es suficiente");
			System.out.println("11 para salir del juego y dejar sola a Espi :(");
			
			op = leer.nextInt();	
			
			switch(op) {
			case 1:
				m1.duerma();
				break;
			case 2:
				m1.comer();
				break;
			case 3:
				m1.jugar();
				break;
			case 4:
				m1.amistades();
				break;
			case 5:
				m1.descanso();
				break;
			case 6:
				m1.despierte();
				break;
			case 7:
					m1.satisfecha();
				break;
			case 8:
					m1.noJugar();
				break;
			case 9:
					m1.noAmistades();
				break;
			case 10:
					m1.noDescanso();
				break;
			case 11:
				System.out.println("Saliste, Espi quedará sola pero estará feliz cuando vuelvas");
				cont = 1;
				break;
				default:
					System.out.println("No existe esa opción");
				
				
			}
			
			}
	}

}
