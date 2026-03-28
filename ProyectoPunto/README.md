# Documentación de la clase Punto y sus aplicaciones

## Clase Punto
La clase `Punto` representa un punto en un espacio 2D. Incluye métodos para:
- Inicializar el punto con las coordenadas x e y.
- Calcular la distancia a otro punto.
- Mostrar las coordenadas del punto.

### Métodos:
- `__init__(self, x, y)`: Inicializa un nuevo punto con las coordenadas (x, y).
- `distance_to(self, other)`: Calcula la distancia a otra instancia de `Punto`.
- `__str__(self)`: Devuelve una representación de cadena del punto.

## PuntoApp1
`PuntoApp1` es una aplicación que utiliza la clase `Punto` para realizar operaciones básicas con puntos. Sus características incluyen:
- Crear puntos.
- Calcular distancias entre puntos.
- Mostrar resultados en un formato intuitivo.

## PuntoApp2
`PuntoApp2` amplía la funcionalidad de `PuntoApp1` y añade características adicionales como:
- Interfaz de línea de comandos interactiva para la entrada de datos del usuario.
- Representación gráfica de puntos mediante matplotlib.
- Exportación de puntos a un archivo para su posterior análisis.
