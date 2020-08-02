package aritmetica;

import javax.naming.spi.DirStateFactory.Result;

public class CacularVariables {
	
	public double sumar(double a, double b) {
		
		return a + b;		
	}
	
	public double restaB(double a, double b) {
		
		return b - a;		
	}

	public double producto(double a, double b) {
		
		return a * b;		
	}
	
	public double divisionB(double a, double b) {
		
		return a / b;		
	}
	
	public double residuoB(double a, double b) {
		
		return  a % b;		
	}
	
	public double logaritmoA(double a) {
		
		return Math.log(a);		
	}
	
	public double potencia(double a, double b) {
		
		return Math.pow(a,b);		
	}

	public double conversionMPGtoLPK(double eficienciaMPG) {
		
		return (eficienciaMPG / 2.3521458357139);
				
	}
	
	public double distancia2PuntosTierraKM(double lat1, double lon1, double lat2, double lon2) {
		
		// Se tradujo a lenguaje de programación la siguiente formula:
		// D = 6378.137 * ACos( Cos( Lat1 ) * Cos( Lat2 ) * Cos( Lon2 - Lon1 ) + Sin( Lat1 ) * Sin( Lat2 )
		
	double constConvertGrados = Math.PI / 180;
	lat1 = lat1 * constConvertGrados;
	lon1 = lon1 * constConvertGrados;
	lat2 = lat2 * constConvertGrados;
	lon2 = lon2 * constConvertGrados;
	
	//radio de la tierra en KM
	double radio = 6378.137;
	double dlon = lon2 - lon1;
	double resultado = Math.acos(Math.sin(lat1) * Math.sin(lat2) + Math.cos(lat1) * Math.cos(lat2) * Math.cos(dlon)) * radio;
	 
	return resultado;
	}
	
	public double areaDeRadio(double radio) {
		
		
		return Math.PI * (radio * radio);
	}
	
	public double volumenDeRadio(double radio) {
		
		
		return (4.0/3.0) * Math.PI * (radio * radio * radio);
	}
	
	public double capacidadCalorica(double gramos, double temperatura) {
		
		return gramos / temperatura;		
	}
	
	public double areaPoligonoRectangular(double base, double altura) {
		
		return (5.0 * base * altura) / 2.0;		
	}
	
	public double viajesParaKilos(double kilosCarga, double KilosCapacidad) {
		
		return kilosCarga / KilosCapacidad;		
	}
	
	public double galonesParaViaje(double rendimientoKmGalon, double viajes, double distancia ) {
		
		double distanciaTotal = distancia * viajes;
		double galonesNecesarios = distanciaTotal / rendimientoKmGalon;
		
		return galonesNecesarios / viajes;
	}
	
	public double costoGasolinaTotalViaje(double galonesNecesarios) {
		
		return galonesNecesarios * 10000.0;
	}
	
	public double viajesColectivo(double capacidadaColectivo, double personas) {
		
		return personas / capacidadaColectivo;
	}
	
	public double valorColectivoTotalPersonas(double personas) {
		
		return personas * 10000.0;
	}
	
	public double valorConductoPropietarioPorViajes(double viajes) {
		
		return viajes * 2000.0;
	}
	
	public double numeroBusesEstudiantes(double estudiantesGordos, double estudiantesFlacos) {
		double sillasEstuGordos = estudiantesGordos * 2.0;
			
		return (sillasEstuGordos + estudiantesFlacos) / 60;
	}
	
	public double numeroPlatosEstudiantes(double estudiantesGordos, double estudiantesFlacos, double diasViaje) {
		double platosEstuGordos = estudiantesGordos * 5.0;
		double platosEstuFlacos = estudiantesGordos * 3.0;
			
		return (platosEstuGordos + platosEstuFlacos) * diasViaje;
	}
	
	public double valorPlatosViaje(double numeroPlatos) {
		
		return numeroPlatos * 10000.0;
	}
	
	public double habitacionesEstudiantes(double estudiantesGordos, double estudiantesFlacos) {
			
		return (estudiantesGordos + estudiantesFlacos) / 4.0;
	}
	
	public double valorHabitacionesPorDia(double habitaciones) {
		
		return habitaciones  * 25000.0;
	}
	
	public double valorHabitacionesViaje(double valorHabitacionesDia, double diasViaje) {
		
		return valorHabitacionesDia  * diasViaje;
	}
	
	public double volumenTrocoCono(double r1, double h1, double r2, double h2) {
		
		double volumen1 = (Math.PI * (r1*r1)) * h1;
		double volumen2 = (Math.PI * (r2*r2)) * h2;
		
		return volumen1  - volumen2;
	}
	
	

	
	
}