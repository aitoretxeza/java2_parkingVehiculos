package com.zubiri.parking;

import java.util.ArrayList;
import java.util.Scanner;

public class ParkingVehiculos {
	
	private static ArrayList<Vehiculo> vehiculos = new ArrayList<Vehiculo>();
	
	//Constructores
		
		public ParkingVehiculos (ArrayList<Vehiculo> vehiculosIntroducido){
			this.vehiculos = vehiculosIntroducido;
		}
	
	//Métodos getter y setter
		
		public static ArrayList<Vehiculo> getVehiculos() {			
			return vehiculos;
		}

		public void setVehiculos (ArrayList<Vehiculo> vehiculosIntroducidos) {			
			this.vehiculos = vehiculosIntroducidos;
		}
	
	//Otros métodos
		
		public static ArrayList<Vehiculo> introducirVehiculos(Scanner sc){
			
			int numCantidad;
			System.out.println("¿Cuantos vehiculos desea introducir?");
			numCantidad = sc.nextInt();
			for(int x = 0; x < numCantidad; x++){
				vehiculos.add(new Vehiculo(sc));
			}
			
			return vehiculos;
			
		}
		
		public String formatted (ArrayList<Vehiculo> vehiculos){
			String formatted = null;
			
			for (int x = 0; x < vehiculos.size(); x++) {
				
				formatted = vehiculos.get(x).formatted();
			}

			return formatted;	
		}
}
