public class Avion extends VehiculoBase {
    
    public Avion(String categoria) {
        super("Avión", categoria);
    }
    
    @Override
    public int getVelocidadMaxima() {
        switch (categoria) {
            case "Económico": return 800;
            case "Lujo": return 900;
            case "Usado": return 750;
            default: return 800;
        }
    }
    
    @Override
    public double getPrecio() {
        switch (categoria) {
            case "Económico": return 5000000000.0;
            case "Lujo": return 15000000000.0;
            case "Usado": return 3000000000.0;
            default: return 5000000000.0;
        }
    }
    
    @Override
    public String getEquipamiento() {
        switch (categoria) {
            case "Económico": return "Instrumentos básicos de vuelo";
            case "Lujo": return "Aviónica avanzada + cabina ejecutiva";
            case "Usado": return "Instrumentos estándar";
            default: return "Equipamiento básico";
        }
    }
}
