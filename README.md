# Práctica de Estructura de Datos: Arquitectura Modular y Colas (Estática, Circular y Dinámica)

Práctica desarrollada en Java bajo un enfoque estrictamente modular, implementando operaciones fundamentales de colas y métodos de análisis avanzados.

## Datos de la Práctica
* **Institución:** Instituto Tecnológico Superior de Xalapa
* **Asignatura:** Estructura de Datos
* **Docente:** Víctor Hugo Vásquez Herrera

---

## Descripción del Proyecto
El proyecto implementa y contrasta el comportamiento en memoria de tres variantes de colas lineales en Java:

1. **Cola Estática:** Implementación lineal mediante un arreglo de tamaño fijo con control de desbordamiento.
2. **Cola Estática Circular:** Implementación optimizada con operador módulo para reutilizar el espacio del arreglo.
3. **Cola Dinámica:** Estructura basada en nodos enlazados dinámicamente mediante apuntadores.

---

## Estructura del Código Fuente
El código se encuentra organizado de forma modular en paquetes:

* Estructuras_lineales
  * Nodo.java: Clase base para la gestión de nodos enlazados.
* Estructuras_lineales.COLA
  * ColaEstatica.java: Lógica de la cola estática con el método peek().
  * ColaEstaticaCircular.java: Lógica de la cola circular con el método peek().
  * ColaDinamica.java: Lógica de la cola dinámica con métodos de análisis (peek() y contarElementos()).

---

## Clases Main Independientes
Cada variante cuenta con una clase ejecutable independiente para realizar pruebas directas en consola:
* MainColaEsta
* MainColaCir
* MainColaDina

---

## Instrucciones de Ejecución
1. Clonar o descargar el repositorio.
2. Abrir el proyecto en **IntelliJ IDEA**.
3. Ejecutar de forma independiente cada una de las clases Main ubicadas en el paquete correspondiente para visualizar las pruebas de inserción, extracción y consulta en consola.
4.
