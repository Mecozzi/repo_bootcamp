//package ClaseDosJava;
public class ejercicioClasedos {
    public static void main(String[] args) {
        int serviciosCli[] = {1,1,2,2,2,1,2}; //vector de 7 posiciones con tipos de servicios
        double totalFactura= 0.0;
        double precioServicio1 = 100.0; //precio del servicio 1
        double precioServicio2 = 150.0; //precio del servicio 2
        for (int i =0; i<serviciosCli.length; i++){
            int tipoServicio = serviciosCli[i];
        if (serviciosCli[i] == 1){
            totalFactura += precioServicio1;

     System.out.println ("El tipo de servicio es: " + serviciosCli[i]);
     System.out.println ("El monto de la factura es de: " + totalFactura);
    }
    else if (tipoServicio == 2){
        totalFactura += precioServicio2;
         System.out.println ("El tipo de servicio es: " + serviciosCli[i]);
     System.out.println ("El monto de la factura es de: " + totalFactura);
  }
}

}}
