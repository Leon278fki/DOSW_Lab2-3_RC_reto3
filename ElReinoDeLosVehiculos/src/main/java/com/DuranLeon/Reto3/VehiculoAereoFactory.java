public class VehiculoAereoFactory implements VehiculoFactory {
    
    @Override
    public Vehiculo crearVehiculo(String tipo, String categoria) {
        switch (tipo) {
            case "Avión":
                return new Avion(categoria);
            case "Avioneta":
                return new Avioneta(categoria);
            case "Helicóptero":
                return new Helicoptero(categoria);
            default:
                throw new IllegalArgumentException("Tipo de vehículo aéreo no válido: " + tipo);
        }
    }
}
