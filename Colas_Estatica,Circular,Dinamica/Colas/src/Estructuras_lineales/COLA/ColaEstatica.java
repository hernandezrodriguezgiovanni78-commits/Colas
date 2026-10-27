package Estructuras_lineales.COLA;

public class ColaEstatica {
    private int[] arreglo;
    private int frente;
    private int fin;
    private int capacidad;

    // Constructor
    public ColaEstatica(int tamano) {
        this.capacidad = tamano;
        this.arreglo = new int[this.capacidad];
        this.frente = 0;
        this.fin = -1;
    }

    // Método para agregar un elemento al final de la cola
    public void enqueue(int valor) {
        if (fin == capacidad - 1) {
            System.out.println("Error: La cola está llena.");
        } else {
            fin++;
            arreglo[fin] = valor;
            System.out.println("Entró a la fila: " + valor);
        }
    }

    // Método para sacar al primero de la fila
    public void dequeue() {
        if (frente > fin) {
            System.out.println("Error: La cola está vacía.");
        } else {
            System.out.println("Atendido y fuera: " + arreglo[frente]);
            frente++;
        }
    }

    // Método peek requerido por la práctica (consulta el frente sin extraerlo)
    public int peek() {
        if (frente > fin) {
            System.out.println("La cola estática está vacía.");
            return -1;
        }
        return arreglo[frente];
    }

    // Método para mostrar la fila actual
    public void mostrar() {
        if (frente > fin) {
            System.out.println("La cola está vacía.");
            return;
        }
        System.out.print("Fila actual: ");
        for (int i = frente; i <= fin; i++) {
            System.out.print(arreglo[i] + " ");
        }
        System.out.println();
    }
}
