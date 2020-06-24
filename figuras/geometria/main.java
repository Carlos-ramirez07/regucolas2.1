package geometria;
import java.io.*; 

public class main {
	static LeerDato objLeer =  new LeerDato();
	static cola_generica objCola = new cola_generica();
	
	public static int menu(int op, int cont)throws IOException {
		do {
			System.out.println(" ");
			System.out.println("Bienvenido a este programa que calcula perimetros.");
			System.out.println(" ");
			System.out.println("¿Que figura "+cont+" deseas calcular?");
			System.out.println("1) Rombo, 2) Rectangulo, 3) Cuadrado, 4) Circulo y  5) triangulo equi");
			System.out.println("6.- imprimir");
			System.out.println("Elige una opcion -- > ");
			op = Integer.parseInt(objLeer.leer());
		    if(op < 1 || op > 6)
		      System.out.println("\n¡¡¡Error!!! Las opciones van de 1 a 6");
		   }while(op < 1 || op > 6);
		return(op);
	}

	public static void main(String[] args) throws IOException {
		int op=0, Max=9, cont = 0;
		cola_generica<Object> cola_generica = new cola_generica<>();
		Cuadrado objCuadrado = new Cuadrado();
		Circulo objCirculo = new Circulo();
		Triangulo objTriangulo = new Triangulo();
		Rectangulo objRectangulo = new Rectangulo();
		Rombo objRombo=new Rombo();
		
		do {

			cont = cont+1;
			op=menu(op, cont);
			switch(op){
			case 1:
				System.out.println("Dame uno de sus lados");
				objCola.encolar(objRombo, op, cont);
				break;
			case 2:
				System.out.println("Dame su lado mas corto");
				objCola.encolar(objRectangulo, op, cont);
				break;
			case 3:
				System.out.println("Dame uno de sus lados");
				objCola.encolar(objCuadrado, op, cont);
				break;
			case 4:
				System.out.println("Dame su diametro");
				objCola.encolar(objCirculo, op, cont);
				break;
			case 5:
				System.out.println("Dame uno de sus lados");
				objCola.encolar(objTriangulo, op, cont);
				break;
			case 6:
				System.out.println("\n IMPRESION");
				objCola.mostrar();
				break;
			}
		}while(op!=6);
	}

}
