package Tarea2;

public class CocheDeportivo extends Coche {
    private int caballosDeFuerza;

    public CocheDeportivo(String marca, String modelo, int año, int caballosDeFuerza) {
        super(marca, modelo, año);
        this.caballosDeFuerza = caballosDeFuerza;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Caballos de fuerza: " + caballosDeFuerza);
    }
}