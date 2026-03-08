# 📚 Programación Orientada a Objetos (POO)

## 🎓 Sobre este repositorio

Este repositorio contiene los **trabajos prácticos y proyectos realizados** en las clases de **Programación Orientada a Objetos** de la carrera **Ingeniería en Sistemas** de mi universidad. Aquí encontrarás una colección de ejercicios que demuestran la aplicación de los conceptos fundamentales de POO en Java.

---

## 📖 Introducción a la Programación Orientada a Objetos

### ¿Qué es la POO?

La **Programación Orientada a Objetos (POO)** es un paradigma de programación que se basa en la creación y manipulación de "objetos". Estos objetos son entidades que combinan **datos** (atributos) y **comportamientos** (métodos) en un solo paquete, permitiendo una organización más clara y mantenible del código.

### Conceptos Básicos Fundamentales

#### 1. **Clases y Objetos**
- **Clase**: Es un plano o plantilla que define la estructura y el comportamiento de un tipo de objeto.
- **Objeto**: Es una instancia (ejemplar) de una clase con valores específicos para sus atributos.

```java
// Ejemplo: Clase Punto
public class Punto {
    private int x;
    private int y;
    
    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
// Crear un objeto (instancia) de la clase Punto
Punto p = new Punto(5, 10);
```

#### 2. **Atributos (Propiedades)**
Son las características o datos que posee un objeto. Representan el estado del objeto.

```java
public class Empleado {
    private String nombre;      // Atributo
    private double salario;     // Atributo
    private int cedula;         // Atributo
}
```

#### 3. **Métodos (Comportamientos)**
Son las acciones o funciones que puede realizar un objeto. Definen qué puede hacer el objeto.

```java
public class Empleado {
    public void trabajar() {
        System.out.println("El empleado está trabajando");
    }
    
    public double calcularSalario() {
        return salario * 1.1; // Calcula salario con aumento
    }
}
```

#### 4. **Encapsulación**
Principio que consiste en ocultar los detalles internos de un objeto y proporcionar una interfaz controlada para acceder a ellos mediante métodos públicos (getters y setters).

```java
public class Empleado {
    private double salario;  // Privado - no accesible directamente
    
    // Método público para obtener el salario
    public double getSalario() {
        return salario;
    }
    
    // Método público para establecer el salario
    public void setSalario(double nuevoSalario) {
        if (nuevoSalario > 0) {
            this.salario = nuevoSalario;
        }
    }
}
```

#### 5. **Herencia**
Permite que una clase (clase hija) herede atributos y métodos de otra clase (clase padre), promoviendo la reutilización de código.

```java
public class Gerente extends Empleado {
    private int empleadosAcargo;
    
    // Gerente hereda todos los métodos y atributos de Empleado
}
```

#### 6. **Polimorfismo**
Capacidad de un objeto de tomar múltiples formas. Permite que métodos con el mismo nombre realicen acciones diferentes según el objeto que los ejecute.

```java
public class Animal {
    public void hacerSonido() { }
}

public class Perro extends Animal {
    @Override
    public void hacerSonido() {
        System.out.println("Guau guau");
    }
}

public class Gato extends Animal {
    @Override
    public void hacerSonido() {
        System.out.println("Miau");
    }
}
```

---

## 📁 Estructura del Repositorio

El repositorio está organizado en las siguientes carpetas, cada una conteniendo una clase con su correspondiente aplicación práctica:

### 📂 **ProyectoAlumno**
Implementación de una clase que representa un estudiante universitario con sus atributos y métodos.
- **Clase**: Representa los datos y operaciones de un alumno
- **Aplicación**: Ejemplos de uso y pruebas de funcionalidad
- Para más detalles, consulta el [README de ProyectoAlumno](./ProyectoAlumno/README.md)

### 📂 **ProyectoFraccion**
Implementación de operaciones matemáticas con fracciones, demostrando uso de métodos y cálculos.
- **Clase**: Define la estructura y operaciones de una fracción
- **Aplicación**: Realiza operaciones como suma, resta, multiplicación y división de fracciones
- Para más detalles, consulta el [README de ProyectoFraccion](./ProyectoFraccion/README.md)

### 📂 **ProyectoPunto**
Implementación de una clase para representar puntos en un plano cartesiano con operaciones geométricas.
- **Clase**: Define puntos en el espacio bidimensional
- **Aplicación**: Calcula distancias, desplazamientos y otras operaciones geométricas
- Para más detalles, consulta el [README de ProyectoPunto](./ProyectoPunto/README.md)

---

## 💡 Cómo Usar Este Repositorio

1. **Explorar las carpetas**: Cada carpeta contiene un proyecto independiente con su propia lógica y aplicaciones.
2. **Leer los READMEs**: Cada carpeta tiene un archivo README.md que explica el funcionamiento del código y los métodos disponibles.
3. **Compilar y Ejecutar**: Los proyectos están escritos en Java y pueden compilarse con:
   ```bash
   javac NombreClase.java
   java NombreClase
   ```

---

## 📚 Recursos de Aprendizaje

- **Programación en Java**: Oracle Java Documentation
- **POO en Java**: Tutoriales y ejercicios prácticos
- **Ejercicios Prácticos**: Cada proyecto en este repositorio

---

## 👨‍💻 Autor

**Zoront22** - Estudiante de Ingeniería en Sistemas

---

## 📝 Notas

Este repositorio es parte del proceso de aprendizaje en programación orientada a objetos. Los códigos aquí presentados son ejercicios educativos que demuestran la aplicación práctica de los conceptos fundamentales de la POO.

**Última actualización**: 2026-03-08