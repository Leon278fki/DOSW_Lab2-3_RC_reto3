public class Avioneta extends VehiculoBase {
    
    public Avioneta(String categoria) {
        super("Avioneta", categoria);
    }
    
    @Override
    public int getVelocidadMaxima() {
        switch (categoria) {
            case "Económico": return 250;
            case "Lujo": return 350;
            case "Usado": return 200;
            default: return 250;
        }
    }
    
    @Override
    public double getPrecio() {
        switch (categoria) {
            case "Económico": return 150000000;
            case "Lujo": return 500000000;
            case "Usado": return 100000000;
            default: return 150000000;
        }
    }
    
    @Override
    public String getEquipamiento() {
        switch (categoria) {
            case "Económico": return "Instrumentos básicos de vuelo";
            case "Lujo": return "GPS + piloto automático";
            case "Usado": return "Instrumentos estándar";
            default: return "Equipamiento básico";
        }
    }
}
