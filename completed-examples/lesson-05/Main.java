class Main {
  public static void main(String[] args) {
    // 1. "Instancia" (crea) un objeto de tu clase Mascota
    Mascota miMascota = new Mascota("Fido", 3);

    // 2. Imprime el nombre de la mascota usando el getter
    System.out.println("El nombre de mi mascota es: " + miMascota.getNombre());

    // 3. Haz que la mascota "hable"
    miMascota.hacerSonido();

    // 4. Cambia el nombre usando el setter
    miMascota.setNombre("Buddy");
    System.out.println("Mi mascota tiene un nuevo nombre: " + miMascota.getNombre());
  }
}