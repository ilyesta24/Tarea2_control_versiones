package Tarea2;

public class CocheDeportivo extends Coche {
    private int caballosDeFuerza;

    public CocheDeportivo(String marca, String modelo, int año, int caballosDeFuerza, double precio) {
        super(marca, modelo, año, precio);
        this.caballosDeFuerza = caballosDeFuerza;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Caballos de fuerza: " + caballosDeFuerza);
    }
}