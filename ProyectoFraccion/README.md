# Documentación para la clase Fraccion y la aplicación FraccionApp1

## Clase Fraccion
La clase `Fraccion` representa una fracción matemática y proporciona varios métodos para manipularla, incluyendo suma, resta, multiplicación y división.

### Atributos:
- `numerador` (int): El numerador de la fracción.
- `denominador` (int): El denominador de la fracción.

### Métodos:
- `__init__(self, numerador: int, denominador: int)`: Inicializa la fracción con un numerador y un denominador.
- `suma(self, otra)`: Suma otra fracción a esta fracción.
- `resta(self, otra)`: Resta otra fracción a esta fracción.
- `multiplicacion(self, otra)`: Multiplica esta fracción por otra fracción.
- `division(self, otra)`: Divide esta fracción por otra fracción.
- `__str__(self)`: Devuelve una representación de cadena de la fracción en el formato numerador/denominador.

## Aplicación FraccionApp1
`FraccionApp1` es una aplicación diseñada para interactuar con la clase `Fraccion`. Permite a los usuarios:
- Crear fracciones.
- Realizar operaciones aritméticas entre fracciones.
- Mostrar resultados de forma intuitiva.

### Características:
- Interfaz de línea de comandos intuitiva.
- Validación de entrada para fracciones.
- Visualización clara de los resultados de cada operación realizada.
