package Estructuras_lineales.COLA;

public class ColaEstaticaCircular {
    private int[] arreglo;
    private int capacidad;
    private int frente;
    private int fin;
    private int tamaño; // Control exacto de elementos para evitar que 'fin' colapse

    // Constructor
    public ColaEstaticaCircular(int capacidad) {
        this.capacidad = capacidad;
        this.arreglo = new int[capacidad];
        this.frente = 0;
        this.fin = -1;
        this.tamaño = 0;
    }

    // Método para meter gente (enqueue)
    public void enqueue(int valor) {
        if (tamaño == capacidad) {
            System.out.println("Error: La cola está llena.");
            return;
        }
        fin = (fin + 1) % capacidad;
        arreglo[fin] = valor;
        tamaño++;
        System.out.println("Entró a la fila: " + valor);
    }

    // Método para atender gente (dequeue)
    public int dequeue() {
        if (tamaño == 0) {
            System.out.println("Error: La cola está vacía");
            return -1;
        }
        int atendido = arreglo[frente];
        frente = (frente + 1) % capacidad;
        tamaño--;
        System.out.println("Atendido y fuera: " + atendido);
        return atendido;
    }

    // Método peek requerido por la práctica para cola circular
    public int peek() {
        if (tamaño == 0) {
            System.out.println("La cola circular está vacía.");
            return -1;
        }
        return arreglo[frente];
    }

    // Método para mostrar la fila actual
    public void mostrar() {
        if (tamaño == 0) {
            System.out.println("La cola está vacía.");
            return;
        }
        System.out.print("Fila actual: ");
        for (int i = 0; i < tamaño; i++) {
            int indice = (frente + i) % capacidad;
            System.out.print(arreglo[indice] + " ");
        }
        System.out.println();
    }
}