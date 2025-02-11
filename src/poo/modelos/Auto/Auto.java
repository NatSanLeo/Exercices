package poo.modelos.Auto;

public class Auto {
    String marca;
    String modelo;
    Integer anio;

    public Auto() {
      marca = "Desconocida";
      modelo = "Desconocida";
      anio = 0;
    }

    public Auto(String marca) {
      this.marca = marca;
      modelo = "Desconocida";
      anio = 0;
    }

    public Auto(String marca, String modelo) {
      this.marca = marca;
      this.modelo = modelo;
      anio = 0;
    }

    public Auto(String marca, String modelo, Integer anio) {
      this.marca = marca;
      this.modelo = modelo;
      this.anio = anio;
    }

    public void imprimirDatos(){
      System.out.println("La marca del auto es: " + marca +
          "\nEl modelo del auto es: " + modelo +
          "\nDel año: " + anio + "\n");
    }

}
