package Tarea2;

public class crearCoche {

		public static void main(String[] args) {
	        Coche coche1 = new Coche("Toyota", "Corolla", 2022);
	        coche1.mostrarInformacion();

	        Coche coche2 = new Coche("Honda", "Civic", 2021);
	        coche2.mostrarInformacion();
	        
	        System.out.println("--------------------------");
	        System.out.println("Coches Deportivos");
	        System.out.println("--------------------------");

	        CocheDeportivo deportivo1 = new CocheDeportivo("Ford", "Mustang", 2023, 450);
	        deportivo1.mostrarInformacion();
	        
	        CocheDeportivo deportivo2 = new CocheDeportivo("Chevrolet", "Camaro", 2022, 420);
	        deportivo2.mostrarInformacion();
	    }
		
	
	}

 
