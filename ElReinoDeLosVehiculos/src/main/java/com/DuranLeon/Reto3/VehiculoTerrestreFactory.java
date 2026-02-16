public class VehiculoTerrestreFactory implements VehiculoFactory {
    
    @Override
    public Vehiculo crearVehiculo(String tipo, String categoria) {
        switch (tipo) {
            case "Auto":
                return new Auto(categoria);
            case "Bicicleta":
                return new Bicicleta(categoria);
            case "Moto":
                return new Moto(categoria);
            default:
                throw new IllegalArgumentException("Tipo de vehículo terrestre no válido: " + tipo);
        }
    }
}
