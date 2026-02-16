# El Reino de los Vehículos

## Descripción del Proyecto

**El Reino de los Vehículos** es una aplicación Java que implementa el patrón de diseño **Abstract Factory** para la creación dinámica de diferentes tipos de vehículos. Este proyecto corresponde al **Punto 3** del Laboratorio 2-3 de Diseño Orientado a Servicios Web (DOSW).

El sistema permite a los usuarios seleccionar y configurar vehículos de tres categorías principales (terrestres, acuáticos y aéreos), con diferentes modelos y categorías económicas, simulando un sistema de compra de vehículos.

---

## Información Académica

- **Institución:** Escuela Colombiana de Ingeniería Julio Garavito
- **Asignatura:** Diseño Orientado a Servicios Web (DOSW 401)
- **Laboratorio:** Laboratorio 2-3 - Reto 3
- **Autores:**
  - Camilo Alfonso León Acosta
  - Roger Mauricio Durán Guacaneme

---

## Arquitectura del Proyecto

### Patrón de Diseño: Abstract Factory

El proyecto implementa el patrón **Abstract Factory** para crear familias de objetos relacionados (vehículos) sin especificar sus clases concretas.

### Estructura de Clases

```
com.DuranLeon.Reto3
│
├── Vehiculo (Interface)
│   └── Define el contrato para todos los vehículos
│
├── VehiculoBase (Abstract Class)
│   └── Implementación base para todos los vehículos
│
├── VehiculoFactory (Interface)
│   └── Define el contrato para las fábricas de vehículos
│
├── Fábricas Concretas
│   ├── VehiculoTerrestreFactory
│   ├── VehiculoAcuaticoFactory
│   └── VehiculoAereoFactory
│
├── Vehículos Terrestres
│   ├── Auto
│   ├── Bicicleta
│   └── Moto
│
├── Vehículos Acuáticos
│   ├── Lancha
│   ├── JetSki
│   └── Velero
│
├── Vehículos Aéreos
│   ├── Avion
│   ├── Avioneta
│   └── Helicoptero
│
└── Reto3ReinoVehiculos (Clase principal)
    └── Gestiona la lógica de negocio y la interacción con el usuario
```

---

## Características Principales

### Tipos de Vehículos

1. **Terrestres:**
   - Auto
   - Bicicleta
   - Moto

2. **Acuáticos:**
   - Lancha
   - JetSki
   - Velero

3. **Aéreos:**
   - Avión
   - Avioneta
   - Helicóptero

### Categorías Disponibles

- **Económico:** Vehículos básicos con equipamiento estándar
- **Lujo:** Vehículos premium con equipamiento avanzado
- **Usado:** Vehículos de segunda mano con precios reducidos

### Atributos de Cada Vehículo

- **Tipo:** Clasificación del vehículo (Auto, Lancha, Avión, etc.)
- **Categoría:** Económico, Lujo o Usado
- **Velocidad Máxima:** Expresada en km/h
- **Precio:** Valor en pesos colombianos
- **Equipamiento:** Características y accesorios incluidos

---

## Instalación y Ejecución

### Requisitos Previos

- **Java JDK:** Versión 8 o superior
- **Maven:** Versión 3.6 o superior
- **Sistema Operativo:** Windows, Linux o macOS

### Pasos de Instalación

1. **Clonar el repositorio:**
   ```bash
   git clone <url-del-repositorio>
   cd DOSW_Lab2-3_RC_reto3/ElReinoDeLosVehiculos
   ```

2. **Compilar el proyecto:**
   ```bash
   mvn clean compile
   ```

3. **Ejecutar las pruebas:**
   ```bash
   mvn test
   ```

4. **Empaquetar el proyecto:**
   ```bash
   mvn package
   ```

5. **Ejecutar la aplicación:**
   ```bash
   mvn exec:java -Dexec.mainClass="com.DuranLeon.Reto3.App"
   ```

   O alternativamente, después de empaquetar:
   ```bash
   java -cp target/ElReinoDeLosVehiculos-1.0.0.jar com.DuranLeon.Reto3.App
   ```

---

## Uso del Sistema

### Flujo de Interacción

1. El sistema presenta un menú principal con las opciones de tipo de vehículo
2. El usuario selecciona el tipo (Tierra, Acuático o Aéreo)
3. El sistema solicita la categoría del vehículo (Económico, Lujo, Usado)
4. El usuario elige el modelo específico disponible para ese tipo
5. El sistema crea el vehículo usando la fábrica correspondiente
6. Se muestra la información completa del vehículo
7. El usuario puede agregar más vehículos o finalizar
8. Al finalizar, se presenta un resumen de la compra con el total

### Ejemplo de Ejecución

```
=== BIENVENIDO AL REINO DE LOS VEHÍCULOS ===

Seleccione el tipo de vehículo:
1. Tierra
2. Acuático
3. Aéreo
Ingrese opción: 1

Seleccione la categoría del vehículo:
1. Económico
2. Lujo
3. Usado
Ingrese opción: 2

Seleccione el modelo de vehículo:
1. Auto
2. Bicicleta
3. Moto
Ingrese opción: 1

--- VEHÍCULO AGREGADO ---
Tipo: Auto
Categoría: Lujo
Velocidad máxima: 180 km/h
Precio: $50,000,000
Equipamiento: Aire acondicionado + GPS

¿Desea agregar otro vehículo? (si/no): no

=== RESUMEN DE COMPRA ===
...
```

---

## Objetivos de Aprendizaje

Este proyecto permite demostrar y aplicar:

1. **Patrón Abstract Factory:** Creación de familias de objetos relacionados
2. **Herencia y Polimorfismo:** Jerarquía de clases con comportamiento polimórfico
3. **Interfaces:** Definición de contratos para clases concretas
4. **Encapsulamiento:** Ocultamiento de detalles de implementación
5. **SOLID Principles:** Aplicación de principios de diseño orientado a objetos
6. **Maven:** Gestión de dependencias y ciclo de vida del proyecto

---

## Estructura del Proyecto

```
ElReinoDeLosVehiculos/
├── pom.xml                        # Configuración de Maven
├── src/
│   ├── main/
│   │   └── java/
│   │       └── com/
│   │           └── DuranLeon/
│   │               └── Reto3/
│   │                   ├── App.java                           # Punto de entrada
│   │                   ├── Vehiculo.java                      # Interface principal
│   │                   ├── VehiculoBase.java                  # Clase base abstracta
│   │                   ├── VehiculoFactory.java               # Interface Factory
│   │                   ├── VehiculoTerrestreFactory.java      # Factory terrestre
│   │                   ├── VehiculoAcuaticoFactory.java       # Factory acuático
│   │                   ├── VehiculoAereoFactory.java          # Factory aéreo
│   │                   ├── Auto.java                          # Vehículo concreto
│   │                   ├── Bicicleta.java                     # Vehículo concreto
│   │                   ├── Moto.java                          # Vehículo concreto
│   │                   ├── Lancha.java                        # Vehículo concreto
│   │                   ├── JetSki.java                        # Vehículo concreto
│   │                   ├── Velero.java                        # Vehículo concreto
│   │                   ├── Avion.java                         # Vehículo concreto
│   │                   ├── Avioneta.java                      # Vehículo concreto
│   │                   ├── Helicoptero.java                   # Vehículo concreto
│   │                   └── Reto3ReinoVehiculos.java           # Lógica principal
│   └── test/
│       └── java/
│           └── com/
│               └── DuranLeon/
│                   └── Reto3/
│                       └── AppTest.java                       # Pruebas unitarias
└── target/                                                    # Archivos compilados
```

---

## Testing

El proyecto incluye pruebas unitarias con JUnit 4.11. Las pruebas verifican:

- Creación correcta de vehículos mediante las fábricas
- Valores correctos de atributos según la categoría
- Comportamiento polimórfico de las clases

Para ejecutar las pruebas:
```bash
mvn test
```

---

## Tecnologías Utilizadas

- **Lenguaje:** Java 7+
- **Build Tool:** Apache Maven 3.x
- **Testing:** JUnit 4.11
- **IDE Recomendado:** IntelliJ IDEA, Eclipse, o VS Code con extensiones Java

---

## Notas Adicionales

### Ventajas del Patrón Abstract Factory

- **Aislamiento de clases concretas:** El cliente solo conoce las interfaces
- **Facilita el intercambio de familias de productos:** Se puede cambiar fácilmente la fábrica
- **Promueve la consistencia:** Todos los vehículos de una categoría son compatibles

### Posibles Extensiones

- Agregar más tipos de vehículos (espaciales, subterráneos, etc.)
- Implementar persistencia de datos (base de datos, archivos)
- Crear una interfaz gráfica (GUI) con JavaFX o Swing
- Añadir sistema de descuentos y promociones
- Implementar servicio REST para acceso remoto

---

## Licencia

Este proyecto es de uso académico para la Escuela Colombiana de Ingeniería Julio Garavito.

---

## Contacto

Para dudas o sugerencias sobre el proyecto, contactar a los autores:

- **Camilo Alfonso León Acosta**
- **Roger Mauricio Durán Guacaneme**

---

**© 2026 - Escuela Colombiana de Ingeniería Julio Garavito**
