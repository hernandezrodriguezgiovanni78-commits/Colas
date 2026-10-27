package Estructuras_lineales.COLA;

public class MainColaEsta {
    public static void main(String[] args) {
        System.out.println("=== PRUEBA DE COLA ESTÁTICA ===");
        ColaEstatica miCola = new ColaEstatica(3);

        miCola.enqueue(10);
        miCola.enqueue(20);
        miCola.enqueue(30);

        System.out.println("\nVemos cómo queda la fila:");
        miCola.mostrar();

        System.out.println("\nElemento al frente (peek): " + miCola.peek());

        System.out.println("\nAtendemos al primero:");
        miCola.dequeue();

        System.out.println("\nVemos cómo quedó la fila después de atender:");
        miCola.mostrar();
        System.out.println("Nuevo elemento al frente (peek): " + miCola.peek());
    }
}
