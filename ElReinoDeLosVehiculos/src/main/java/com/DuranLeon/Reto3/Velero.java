public class Velero extends VehiculoBase {
    
    public Velero(String categoria) {
        super("Velero", categoria);
    }
    
    @Override
    public int getVelocidadMaxima() {
        switch (categoria) {
            case "Económico": return 20;
            case "Lujo": return 35;
            case "Usado": return 15;
            default: return 20;
        }
    }
    
    @Override
    public double getPrecio() {
        switch (categoria) {
            case "Económico": return 50000000;
            case "Lujo": return 300000000;
            case "Usado": return 30000000;
            default: return 50000000;
        }
    }
    
    @Override
    public String getEquipamiento() {
        switch (categoria) {
            case "Económico": return "Velas básicas";
            case "Lujo": return "Velas premium + cabina de lujo";
            case "Usado": return "Velas estándar";
            default: return "Equipamiento básico";
        }
    }
}
