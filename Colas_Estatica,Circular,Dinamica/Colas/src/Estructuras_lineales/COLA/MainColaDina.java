package Estructuras_lineales.COLA;

public class MainColaDina {
    public static void main(String[] args) {
        System.out.println("=== PRUEBA DE COLA DINÁMICA ===");
        ColaDinamica cola = new ColaDinamica();

        cola.encolar(100);
        cola.encolar(200);
        cola.encolar(300);

        cola.mostrar();

        System.out.println("Elemento al frente (peek): " + cola.peek());
        System.out.println("Total de elementos: " + cola.contarElementos());

        System.out.println("Desencolado: " + cola.desencolar());
        cola.mostrar();
        System.out.println("Nuevo total de elementos: " + cola.contarElementos());
    }
}
