public class Bicicleta extends VehiculoBase {
    
    public Bicicleta(String categoria) {
        super("Bicicleta", categoria);
    }
    
    @Override
    public int getVelocidadMaxima() {
        switch (categoria) {
            case "Económico": return 25;
            case "Lujo": return 35;
            case "Usado": return 20;
            default: return 25;
        }
    }
    
    @Override
    public double getPrecio() {
        switch (categoria) {
            case "Económico": return 500000;
            case "Lujo": return 3000000;
            case "Usado": return 300000;
            default: return 500000;
        }
    }
    
    @Override
    public String getEquipamiento() {
        switch (categoria) {
            case "Económico": return "Básica";
            case "Lujo": return "Fibra de carbono + cambios";
            case "Usado": return "Estándar usado";
            default: return "Equipamiento básico";
        }
    }
}
