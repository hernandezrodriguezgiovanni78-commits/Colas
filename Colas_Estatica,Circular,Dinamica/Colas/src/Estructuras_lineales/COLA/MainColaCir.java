package Estructuras_lineales.COLA;

public class MainColaCir {
    public static void main(String[] args) {
        System.out.println("=== PRUEBA DE COLA ESTÁTICA CIRCULAR ===");
        ColaEstaticaCircular cola = new ColaEstaticaCircular(5);

        cola.enqueue(10);
        cola.enqueue(20);
        cola.enqueue(30);
        cola.enqueue(40);
        cola.enqueue(50);

        System.out.println("\n--- Fila actual ---");
        cola.mostrar();

        System.out.println("\nElemento al frente (peek): " + cola.peek());

        System.out.println("\n--- Atendiendo (Dequeue) ---");
        cola.dequeue();
        cola.dequeue();

        System.out.println("\n--- Fila después de atender ---");
        cola.mostrar();

        System.out.println("\n--- Agregando más (Efecto circular) ---");
        cola.enqueue(60);
        cola.enqueue(70);

        System.out.println("\n--- Estado final ---");
        cola.mostrar();
        System.out.println("Elemento al frente actual (peek): " + cola.peek());
    }
}
