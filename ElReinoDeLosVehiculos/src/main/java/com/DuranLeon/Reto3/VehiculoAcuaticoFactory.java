public class VehiculoAcuaticoFactory implements VehiculoFactory {
    
    @Override
    public Vehiculo crearVehiculo(String tipo, String categoria) {
        switch (tipo) {
            case "Lancha":
                return new Lancha(categoria);
            case "Velero":
                return new Velero(categoria);
            case "Jet Ski":
                return new JetSki(categoria);
            default:
                throw new IllegalArgumentException("Tipo de vehículo acuático no válido: " + tipo);
        }
    }
}
