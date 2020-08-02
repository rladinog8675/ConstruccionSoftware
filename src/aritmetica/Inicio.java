package aritmetica;

import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.swing.JOptionPane;

public class Inicio {

	public static void main(String[] args) throws IOException {
		
		guia1();
		
	}
	
	public static void guia1() throws IOException {
		
		CacularVariables calCacularVariables = new CacularVariables();
		double valorUno;
        double valorDos;
        double valorTres;
        double valorCuatro;
        
        System.out.println("Seleccione una opción para iniciar\n 1: Suma. \n 2: Resta. \n 3: Producto. \n 4: División. \n 5: Residuo de división.");
        System.out.println(" 6: Logaritmo. \n 7: Potencia. \n 8: Eficiencia de combustible. \n 9: Distancia entre dos punto de la tierra.");
        System.out.println(" 10: Área y volumen. \n 11: Capacidad calórica. \n 12: Área de un polígo rectangular. \n 13: Viaje a Sasaima.");
        System.out.println(" 14: El colectivo. \n 15: El paseo. \n 16: Tronco de cono.");
        
	    BufferedReader reader =   new BufferedReader(new InputStreamReader(System.in));
        String opcion = reader.readLine();
       
        switch (opcion) {
		case "1":
			System.out.println("Ingrese dos valores para la suma ");
			 valorUno = Double.valueOf(reader.readLine());
	         valorDos = Double.valueOf(reader.readLine());
			System.out.println("El resultado es: "+  calCacularVariables.sumar(valorUno, valorDos));
			System.out.println("\n");
			System.out.println("Volver al menu");
			reader.readLine();
			for (int i = 0; i < 15; i++) {
				System.out.println("\n");
			}
			guia1();
			break;

		case "2":
			System.out.println("Ingrese dos valores para la resta ");
			 valorUno = Double.valueOf(reader.readLine());
	         valorDos = Double.valueOf(reader.readLine());
			System.out.println("El resultado es: "+  calCacularVariables.restaB(valorUno, valorDos));
			System.out.println("\n");
			System.out.println("Volver al menu");
			reader.readLine();
			for (int i = 0; i < 15; i++) {
				System.out.println("\n");
			}
			guia1();
			break;
			
		case "3":
			System.out.println("Ingrese dos valores para obtener el producto");
			 valorUno = Double.valueOf(reader.readLine());
	         valorDos = Double.valueOf(reader.readLine());
			System.out.println("El resultado es: "+  calCacularVariables.producto(valorUno, valorDos));
			System.out.println("\n");
			System.out.println("Volver al menu");
			reader.readLine();
			for (int i = 0; i < 15; i++) {
				System.out.println("\n");
			}
			guia1();
			break;
			
		case "4":
			System.out.println("Ingrese dos valores para obtener la división");
			 valorUno = Double.valueOf(reader.readLine());
	         valorDos = Double.valueOf(reader.readLine());
			System.out.println("El resultado es: "+  calCacularVariables.divisionB(valorUno, valorDos));
			System.out.println("\n");
			System.out.println("Volver al menu");
			reader.readLine();
			for (int i = 0; i < 15; i++) {
				System.out.println("\n");
			}
			guia1();
			break;
			
		case "5":
			System.out.println("Ingrese dos valores para obtener el residuo de la división");
			 valorUno = Double.valueOf(reader.readLine());
	         valorDos = Double.valueOf(reader.readLine());
			System.out.println("El resultado es: "+  calCacularVariables.residuoB(valorUno, valorDos));
			System.out.println("\n");
			System.out.println("Volver al menu");
			reader.readLine();
			for (int i = 0; i < 15; i++) {
				System.out.println("\n");
			}
			guia1();
			break;
			
		case "6":
			System.out.println("Ingrese un valor, para concer su Logaritmo");
			 valorUno = Double.valueOf(reader.readLine());
			System.out.println("El resultado es: "+  calCacularVariables.logaritmoA(valorUno));
			System.out.println("\n");
			System.out.println("Volver al menu");
			reader.readLine();
			for (int i = 0; i < 15; i++) {
				System.out.println("\n");
			}
			guia1();
			break;
			
		case "7":
			System.out.println("Ingrese dos valores para potencia, primero la base y despues el exponente");
			 valorUno = Double.valueOf(reader.readLine());
	         valorDos = Double.valueOf(reader.readLine());
			System.out.println("El resultado es: "+  calCacularVariables.potencia(valorUno, valorDos));
			System.out.println("\n");
			System.out.println("Volver al menu");
			reader.readLine();
			for (int i = 0; i < 15; i++) {
				System.out.println("\n");
			}
			guia1();
			break;

		case "8":
			System.out.println("Ingrese el valor en millas por galon, para concer su equivalente en litros por kilometro");
			 valorUno = Double.valueOf(reader.readLine());
			System.out.println("El resultado en (KPL) es: "+  calCacularVariables.conversionMPGtoLPK(valorUno));
			System.out.println("\n");
			System.out.println("Volver al menu");
			reader.readLine();
			for (int i = 0; i < 15; i++) {
				System.out.println("\n");
			}
			guia1();
			break;
			
		case "9":
			System.out.println("Ingrese dos coordenadas (en latitud y logiyud), para concer la distancia entre ellos sobre la tierra");
			 valorUno = Double.valueOf(reader.readLine());
			 valorDos = Double.valueOf(reader.readLine());
			 valorTres = Double.valueOf(reader.readLine());
			 valorCuatro = Double.valueOf(reader.readLine());
			System.out.println("El resultado en (KM) es: "+  calCacularVariables.distancia2PuntosTierraKM(valorUno, valorDos, valorTres, valorCuatro));
			System.out.println("\n");
			System.out.println("Volver al menu");
			reader.readLine();
			for (int i = 0; i < 15; i++) {
				System.out.println("\n");
			}
			guia1();
			break;
			
		case "10":
			System.out.println("Ingrese un radio para conocer su area y volumen de su esfera");
			 valorUno = Double.valueOf(reader.readLine());
			System.out.println("El area es: "+  calCacularVariables.areaDeRadio(valorUno));
			System.out.println("El volumen de la espera es : "+  calCacularVariables.volumenDeRadio(valorUno));
			System.out.println("\n");
			System.out.println("Volver al menu");
			reader.readLine();
			for (int i = 0; i < 15; i++) {
				System.out.println("\n");
			}
			guia1();
			break;
			
		case "11":
			System.out.println("Ingrese las gramos y la temperatura en centigrados, para conocer su capacidad calorica");
			 valorUno = Double.valueOf(reader.readLine());
			 valorDos = Double.valueOf(reader.readLine());
			System.out.println("La capacidad calorica en gramos/centrigrados es : "+  calCacularVariables.capacidadCalorica(valorUno, valorDos));
			System.out.println("\n");
			System.out.println("Volver al menu");
			reader.readLine();
			for (int i = 0; i < 15; i++) {
				System.out.println("\n");
			}
			guia1();
			break;
			
		case "12":
			System.out.println("Ingrese la base y altura de los triangulos de un poligo , para conocer su area total");
			 valorUno = Double.valueOf(reader.readLine());
			 valorDos = Double.valueOf(reader.readLine());
			System.out.println("El area es de : "+  calCacularVariables.areaPoligonoRectangular(valorUno, valorDos));
			System.out.println("\n");
			System.out.println("Volver al menu");
			reader.readLine();
			for (int i = 0; i < 15; i++) {
				System.out.println("\n");
			}
			guia1();
			break;
			
			case "13":
			System.out.println("Ingrese los siguintes datos para saber los gastos de Viaje");
			System.out.println("Ingrese kilos totales a trasportar");
			valorUno = Double.valueOf(reader.readLine());
			System.out.println("Ingrese kilos de capacidad del camion"); 
			valorDos = Double.valueOf(reader.readLine());
			System.out.println("Ingrese el rendimiento de galones por kilometro del camion");
			valorTres = Double.valueOf(reader.readLine());
			System.out.println("Ingrese la distancia a recorrer por viaje");
			valorCuatro = Double.valueOf(reader.readLine());
			double totalViajes = calCacularVariables.viajesParaKilos(valorUno, valorDos);
			System.out.println("El numero de viajes para llevar toda la carga es : "+  totalViajes);
			double totalGalones = calCacularVariables.galonesParaViaje(valorTres, totalViajes, valorCuatro);
			System.out.println("Los galones necesarios para completar los viajes son : "+  totalGalones);
			System.out.println("La gasolina costara : "+  calCacularVariables.costoGasolinaTotalViaje(totalGalones));
			System.out.println("\n");
			System.out.println("Volver al menu");
			reader.readLine();
			for (int i = 0; i < 15; i++) {
				System.out.println("\n");
			}
			guia1();
			break;
			
			case "14":
			System.out.println("Ingrese los siguintes datos para saber los gastos de Viaje");
			System.out.println("Capacidad del colectivo");
			valorUno = Double.valueOf(reader.readLine());
			System.out.println("Ingrese total de pasajeros"); 
			valorDos = Double.valueOf(reader.readLine());
			double totalViajesCol = calCacularVariables.viajesColectivo(valorUno, valorDos);
			System.out.println("El numero de viajes para llevar todos los paajeros es : "+  totalViajesCol);
			System.out.println("El valor de los viajes para todos los pasajeros es : "+  calCacularVariables.valorColectivoTotalPersonas(valorDos));
			System.out.println("El dinero para el propietario es : "+  calCacularVariables.valorConductoPropietarioPorViajes(totalViajesCol));
			System.out.println("\n");
			System.out.println("Volver al menu");
			reader.readLine();
			for (int i = 0; i < 15; i++) {
				System.out.println("\n");
			}
			guia1();
			break;
			
			case "15":
			System.out.println("Ingrese los siguintes datos para saber los gastos de Viaje");
			System.out.println("Numero de estudiantes gordos");
			valorUno = Double.valueOf(reader.readLine());
			System.out.println("Numero de estudiantes flacos"); 
			valorDos = Double.valueOf(reader.readLine());
			System.out.println("Dias de viaje"); 
			valorTres = Double.valueOf(reader.readLine());
			double totalBuses = calCacularVariables.numeroBusesEstudiantes(valorUno, valorDos);
			System.out.println("El numero de buses requeridos es : "+  totalBuses);
			double totalPlatos = calCacularVariables.numeroPlatosEstudiantes(valorUno, valorDos, valorTres);
			System.out.println("El numero total de platos requeridos es : "+  totalPlatos);
			System.out.println("El valor de todos los platos es de : "+  calCacularVariables.valorPlatosViaje(totalPlatos));
			double totalHabitaciones = calCacularVariables.habitacionesEstudiantes(valorUno, valorDos);
			System.out.println("El numero total de habitaciones es de : "+  totalHabitaciones);
			double valorHabitacionesDia = calCacularVariables.valorHabitacionesPorDia(totalHabitaciones);
			System.out.println("El valor de las habitaciones por un dia es : "+  valorHabitacionesDia);
			System.out.println("El valor de las habitaciones por todos los dias es : "+  calCacularVariables.valorHabitacionesViaje(valorHabitacionesDia, valorTres));
			System.out.println("\n");
			System.out.println("Volver al menu");
			reader.readLine();
			for (int i = 0; i < 15; i++) {
				System.out.println("\n");
			}
			guia1();
			break;
			
			case "16":
			System.out.println("Ingrese los siguintes datos para saber el volumne del troco de un cono");
			System.out.println("Radio y altura del cono completo");
			valorUno = Double.valueOf(reader.readLine());
			valorDos = Double.valueOf(reader.readLine()); 
			System.out.println("Radio y altura del cono deficiente");
			valorTres = Double.valueOf(reader.readLine());
			valorCuatro = Double.valueOf(reader.readLine());			
			System.out.println("El volumen del tronoc del cono es: " + calCacularVariables.volumenTrocoCono(valorUno, valorDos, valorTres, valorCuatro)); 
			
			System.out.println("\n");
			System.out.println("Volver al menu");
			reader.readLine();
			for (int i = 0; i < 15; i++) {
				System.out.println("\n");
			}
			guia1();
			break;
			
		default:
			break;
		}

	}
	


	
	
	
}
