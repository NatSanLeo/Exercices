package JavaU.animales;

public class Animal {

  public void comer() {
    System.out.println("Como muchas veces al día");
  }

  public void dormir() {
    System.out.println("Duermo muchas horas");
  }

  public void hacerSonido() {
    System.out.println("El animal hace un sonido");
  }

}

class Perro extends Animal {

  @Override
  public void hacerSonido() {
    System.out.println("El perro hace wauf");
  }

  @Override
  public void dormir() {
    System.out.println("Duermo durante 15 horas al día.");
    System.out.println("Metodo de la clase padre.");
    super.dormir();

  }
}

class Gato extends Animal {

  @Override
  public void hacerSonido() {
    System.out.println("el gato hace miau.");
  }
}

class pruebaAnimal {

  //metodo polimorfico por que recibe un tipo de dato generico
  public static void imprimirSonido(Animal animal) {
    animal.hacerSonido();
  }

  public static void main(String[] args) {
    Animal animal = new Animal();
    imprimirSonido(animal);

    Perro perro = new Perro();
    imprimirSonido(perro);

    Gato gato = new Gato();
    imprimirSonido(gato);

  }
}