public class Moto extends VehiculoBase {
    
    public Moto(String categoria) {
        super("Moto", categoria);
    }
    
    @Override
    public int getVelocidadMaxima() {
        switch (categoria) {
            case "Económico": return 100;
            case "Lujo": return 200;
            case "Usado": return 80;
            default: return 100;
        }
    }
    
    @Override
    public double getPrecio() {
        switch (categoria) {
            case "Económico": return 8000000;
            case "Lujo": return 30000000;
            case "Usado": return 5000000;
            default: return 8000000;
        }
    }
    
    @Override
    public String getEquipamiento() {
        switch (categoria) {
            case "Económico": return "Equipamiento básico";
            case "Lujo": return "ABS + control tracción";
            case "Usado": return "Equipamiento estándar";
            default: return "Equipamiento básico";
        }
    }
}
