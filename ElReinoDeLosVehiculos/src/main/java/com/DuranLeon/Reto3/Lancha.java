public class Lancha extends VehiculoBase {
    
    public Lancha(String categoria) {
        super("Lancha", categoria);
    }
    
    @Override
    public int getVelocidadMaxima() {
        switch (categoria) {
            case "Económico": return 50;
            case "Lujo": return 80;
            case "Usado": return 40;
            default: return 50;
        }
    }
    
    @Override
    public double getPrecio() {
        switch (categoria) {
            case "Económico": return 30000000;
            case "Lujo": return 150000000;
            case "Usado": return 20000000;
            default: return 30000000;
        }
    }
    
    @Override
    public String getEquipamiento() {
        switch (categoria) {
            case "Económico": return "Motor básico";
            case "Lujo": return "Motor potente + GPS marino";
            case "Usado": return "Motor estándar";
            default: return "Equipamiento básico";
        }
    }
}
