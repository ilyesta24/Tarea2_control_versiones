package Tarea2;

public class Coche {
	 private String marca;
	    private String modelo;
	    private int año;
	    private double precio;

	    public Coche(String marca, String modelo, int año, double precio) {
	        this.marca = marca;
	        this.modelo = modelo;
	        this.año = año;
	        this.precio = precio;
	    }

	    public void mostrarInformacion() {
	        System.out.println("Marca: " + marca);
	        System.out.println("Modelo: " + modelo);
	        System.out.println("Año: " + año);
	        System.out.println("Precio: " + precio +"€");
	    }
	    public int getAño() {
	        return año;
	    }
	    
	    public double getPrecio() {
	        return precio;
	    }
	}

