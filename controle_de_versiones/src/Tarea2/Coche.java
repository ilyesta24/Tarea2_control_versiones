package Tarea2;

public class Coche {
	 private String marca;
	    private String modelo;
	    private int año;

	    public Coche(String marca, String modelo, int año) {
	        this.marca = marca;
	        this.modelo = modelo;
	        this.año = año;
	    }

	    public void mostrarInformacion() {
	        System.out.println("Marca: " + marca);
	        System.out.println("Modelo: " + modelo);
	        System.out.println("Año: " + año);
	    }
	    public int getAño() {
	        return año;
	    }
	}

