import java.util.Scanner; // Importamos la herramienta Scanner

class Main {
  public static void main(String[] args) {
    // 1. Crea un objeto Scanner
    Scanner miScanner = new Scanner(System.in);

    // 2. Pregunta el nombre del usuario
    System.out.println("¿Cómo te llamas?");

    // 3. Lee la respuesta
    String nombre = miScanner.nextLine();

    // 4. Llama al método saludar
    saludar(nombre);
  }

  // 5. Este es un método que acepta un parámetro (String)
  public static void saludar(String nombreUsuario) {
    System.out.println("¡Hola, " + nombreUsuario + "! Bienvenido.");
  }
}