public class Auto extends VehiculoBase {
    
    public Auto(String categoria) {
        super("Auto", categoria);
    }
    
    @Override
    public int getVelocidadMaxima() {
        switch (categoria) {
            case "Económico": return 120;
            case "Lujo": return 180;
            case "Usado": return 100;
            default: return 120;
        }
    }
    
    @Override
    public double getPrecio() {
        switch (categoria) {
            case "Económico": return 25000000;
            case "Lujo": return 50000000;
            case "Usado": return 15000000;
            default: return 25000000;
        }
    }
    
    @Override
    public String getEquipamiento() {
        switch (categoria) {
            case "Económico": return "Aire acondicionado básico";
            case "Lujo": return "Aire acondicionado + GPS";
            case "Usado": return "Equipamiento estándar";
            default: return "Equipamiento básico";
        }
    }
}
