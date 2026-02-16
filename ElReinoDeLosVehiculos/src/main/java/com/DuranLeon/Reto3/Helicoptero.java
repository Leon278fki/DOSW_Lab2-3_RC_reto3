public class Helicoptero extends VehiculoBase {
    
    public Helicoptero(String categoria) {
        super("Helicóptero", categoria);
    }
    
    @Override
    public int getVelocidadMaxima() {
        switch (categoria) {
            case "Económico": return 200;
            case "Lujo": return 280;
            case "Usado": return 180;
            default: return 200;
        }
    }
    
    @Override
    public double getPrecio() {
        switch (categoria) {
            case "Económico": return 800000000;
            case "Lujo": return 3000000000.0;
            case "Usado": return 500000000;
            default: return 800000000;
        }
    }
    
    @Override
    public String getEquipamiento() {
        switch (categoria) {
            case "Económico": return "Instrumentos básicos de vuelo";
            case "Lujo": return "Aviónica completa + interior de lujo";
            case "Usado": return "Instrumentos estándar";
            default: return "Equipamiento básico";
        }
    }
}
