// Esta es tu "plantilla" o CLASE
public class Mascota {
  // 1. Atributos (variables)
  private String nombre;
  private int edad;

  // 2. Constructor (se usa al crear el objeto)
  public Mascota(String nombre, int edad) {
    this.nombre = nombre;
    this.edad = edad;
  }

  // 3. Métodos (comportamientos)
  public void hacerSonido() {
    System.out.println("¡Guau! ¡Guau!");
  }

  // 4. Getters (para leer atributos privados)
  public String getNombre() {
    return this.nombre;
  }

  // 5. Setters (para cambiar atributos privados)
  public void setNombre(String nuevoNombre) {
    this.nombre = nuevoNombre;
  }
}