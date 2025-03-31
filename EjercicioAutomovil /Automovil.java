

public class Automovil { //se agrega la palabra reservada y en mayuscula la clase 
        
    String marca;
    String color;
    double kilometros;

    public Automovil() {

    }

    public Automovil(String marca,String color,double kilometros) { //definir que tipo de variables son 
            this.marca = marca;
            this.color = color;
            this.kilometros = kilometros;
    }

    public void mostrarMarcaYColor() {// cambie que solo sea void 
          System.out.println("La marca del auto es: " + this.marca + ". El color del auto es: " + this.color
);
    }

public static void main(String[] args) {
    // Crear una instancia de Automovil
    Automovil miAuto = new Automovil("Toyota", "Rojo", 15000);
    
    // Mostrar marca y color
    miAuto.mostrarMarcaYColor();
}
}