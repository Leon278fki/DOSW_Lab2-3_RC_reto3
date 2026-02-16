import java.util.*;
import java.util.stream.Collectors;

public class Reto3ReinoVehiculos {
    private static final Scanner scanner = new Scanner(System.in);
    
    public static void ejecutar() {
        System.out.println("=== BIENVENIDO AL REINO DE LOS VEHÍCULOS ===\n");
        
        Map<String, VehiculoFactory> factories = new HashMap<>();
        factories.put("Tierra", new VehiculoTerrestreFactory());
        factories.put("Acuático", new VehiculoAcuaticoFactory());
        factories.put("Aéreo", new VehiculoAereoFactory());
        
        List<Vehiculo> vehiculosSeleccionados = new ArrayList<>();
        
        boolean continuar = true;
        while (continuar) {
            System.out.println("\nSeleccione el tipo de vehículo:");
            System.out.println("1. Tierra");
            System.out.println("2. Acuático");
            System.out.println("3. Aéreo");
            System.out.print("Ingrese opción: ");
            int tipoOpcion = scanner.nextInt();
            scanner.nextLine();
            
            String tipoVehiculo = obtenerTipoVehiculo(tipoOpcion);
            if (tipoVehiculo == null) {
                System.out.println("Opción inválida");
                continue;
            }
            
            System.out.println("\nSeleccione la categoría del vehículo:");
            System.out.println("1. Económico");
            System.out.println("2. Lujo");
            System.out.println("3. Usado");
            System.out.print("Ingrese opción: ");
            int categoriaOpcion = scanner.nextInt();
            scanner.nextLine();
            
            String categoria = obtenerCategoria(categoriaOpcion);
            if (categoria == null) {
                System.out.println("Opción inválida");
                continue;
            }
            
            System.out.println("\nSeleccione el modelo de vehículo:");
            mostrarModelosDisponibles(tipoVehiculo);
            System.out.print("Ingrese opción: ");
            int modeloOpcion = scanner.nextInt();
            scanner.nextLine();
            
            String modelo = obtenerModelo(tipoVehiculo, modeloOpcion);
            if (modelo == null) {
                System.out.println("Opción inválida");
                continue;
            }
            
            VehiculoFactory factory = factories.get(tipoVehiculo);
            Vehiculo vehiculo = factory.crearVehiculo(modelo, categoria);
            vehiculosSeleccionados.add(vehiculo);
            
            System.out.println("\n--- VEHÍCULO AGREGADO ---");
            vehiculo.mostrarInfo();
            
            System.out.print("\n¿Desea agregar otro vehículo? (si/no): ");
            String respuesta = scanner.nextLine();
            continuar = respuesta.equalsIgnoreCase("si");
        }
        
        mostrarResumenCompra(vehiculosSeleccionados);
    }
    
    private static String obtenerTipoVehiculo(int opcion) {
        switch (opcion) {
            case 1: return "Tierra";
            case 2: return "Acuático";
            case 3: return "Aéreo";
            default: return null;
        }
    }
    
    private static String obtenerCategoria(int opcion) {
        switch (opcion) {
            case 1: return "Económico";
            case 2: return "Lujo";
            case 3: return "Usado";
            default: return null;
        }
    }
    
    private static void mostrarModelosDisponibles(String tipo) {
        switch (tipo) {
            case "Tierra":
                System.out.println("1. Auto");
                System.out.println("2. Bicicleta");
                System.out.println("3. Moto");
                break;
            case "Acuático":
                System.out.println("1. Lancha");
                System.out.println("2. Velero");
                System.out.println("3. Jet Ski");
                break;
            case "Aéreo":
                System.out.println("1. Avión");
                System.out.println("2. Avioneta");
                System.out.println("3. Helicóptero");
                break;
        }
    }
    
    private static String obtenerModelo(String tipo, int opcion) {
        switch (tipo) {
            case "Tierra":
                switch (opcion) {
                    case 1: return "Auto";
                    case 2: return "Bicicleta";
                    case 3: return "Moto";
                    default: return null;
                }
            case "Acuático":
                switch (opcion) {
                    case 1: return "Lancha";
                    case 2: return "Velero";
                    case 3: return "Jet Ski";
                    default: return null;
                }
            case "Aéreo":
                switch (opcion) {
                    case 1: return "Avión";
                    case 2: return "Avioneta";
                    case 3: return "Helicóptero";
                    default: return null;
                }
            default: return null;
        }
    }
    
    private static void mostrarResumenCompra(List<Vehiculo> vehiculos) {
        System.out.println("\n\n--- RESUMEN DE COMPRA ---");
        
        // Mostrar cada vehículo usando forEach con lambda
        vehiculos.forEach(v -> {
            System.out.println("\nVehículo " + (vehiculos.indexOf(v) + 1) + ":");
            System.out.println("Tipo: " + v.getTipo());
            System.out.println("Categoría: " + v.getCategoria());
            System.out.println("Velocidad máxima: " + v.getVelocidadMaxima() + " km/h");
            System.out.println("Precio: $" + String.format("%,.0f", v.getPrecio()));
            System.out.println("Equipamiento: " + v.getEquipamiento());
        });
        
        // Calcular subtotal usando streams
        double subtotal = vehiculos.stream()
                                   .mapToDouble(Vehiculo::getPrecio)
                                   .sum();
        
        double descuento = 0;
        double total = subtotal - descuento;
        
        System.out.println("\n--------------------------------");
        System.out.printf("Subtotal: $%,.0f%n", subtotal);
        System.out.printf("Descuento aplicado: $%,.0f%n", descuento);
        System.out.printf("Total a pagar: $%,.0f%n", total);
        System.out.println("--------------------------------");
        System.out.println("\n¡Gracias por su compra en el Reino de los Vehículos!");
        
        // Estadísticas adicionales usando streams y lambdas
        mostrarEstadisticas(vehiculos);
    }
    
    private static void mostrarEstadisticas(List<Vehiculo> vehiculos) {
        System.out.println("\n--- ESTADÍSTICAS DE COMPRA ---");
        
        // Agrupar por categoría usando streams
        Map<String, Long> porCategoria = vehiculos.stream()
                .collect(Collectors.groupingBy(
                        Vehiculo::getCategoria, 
                        Collectors.counting()
                ));
        
        System.out.println("\nVehículos por categoría:");
        porCategoria.forEach((categoria, cantidad) -> 
                System.out.println("  " + categoria + ": " + cantidad));
        
        // Vehículo más caro usando streams
        vehiculos.stream()
                .max(Comparator.comparingDouble(Vehiculo::getPrecio))
                .ifPresent(v -> System.out.println("\nVehículo más caro: " + v.getTipo() + 
                        " - $" + String.format("%,.0f", v.getPrecio())));
        
        // Vehículo más rápido usando streams
        vehiculos.stream()
                .max(Comparator.comparingInt(Vehiculo::getVelocidadMaxima))
                .ifPresent(v -> System.out.println("Vehículo más rápido: " + v.getTipo() + 
                        " - " + v.getVelocidadMaxima() + " km/h"));
        
        // Precio promedio usando streams
        double promedio = vehiculos.stream()
                                   .mapToDouble(Vehiculo::getPrecio)
                                   .average()
                                   .orElse(0);
        System.out.printf("Precio promedio: $%,.0f%n", promedio);
    }
    
    public static void main(String[] args) {
        ejecutar();
    }
}
