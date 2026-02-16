public class JetSki extends VehiculoBase {
    
    public JetSki(String categoria) {
        super("Jet Ski", categoria);
    }
    
    @Override
    public int getVelocidadMaxima() {
        switch (categoria) {
            case "Económico": return 60;
            case "Lujo": return 100;
            case "Usado": return 50;
            default: return 60;
        }
    }
    
    @Override
    public double getPrecio() {
        switch (categoria) {
            case "Económico": return 15000000;
            case "Lujo": return 40000000;
            case "Usado": return 10000000;
            default: return 15000000;
        }
    }
    
    @Override
    public String getEquipamiento() {
        switch (categoria) {
            case "Económico": return "Motor básico";
            case "Lujo": return "Motor turbo + asientos premium";
            case "Usado": return "Motor estándar";
            default: return "Equipamiento básico";
        }
    }
}
