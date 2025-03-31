
import java.util.ArrayList;


public  class  carreraDeLaSelva {

    public static void main(String[] args) {
        
        String[] categorias ={ "Circuito chico", "Circuito medio","Circuito avanzado"};
        String[] descripciones ={
            "2 km por selva y arrollo", "5km por selva, arroyos y barro", 
            "10km por selva, arroyos y barro y escalada en piedra"
        };
        int [][] inscripcionesImporte ={ {1300,1500}, {2000,2300},{0,2800}};

        ArrayList<String>[]inscriptos = new ArrayList[categorias.length];
        for (int i=0; i< categorias.length; i++){
            inscriptos[i]= new ArrayList<>();
        }
        // datos de un pasajero
        String dniUno ="1234556";
        String nombreUno = "Juan";
        String apellidoUno = "Pérez";
        int edadUno = 25;
        int celularUno = 123456789;
        int numeroEmergenciaUno = 987654321;
        String grupoSanguineoUno = "0*";
        String categoriaUno = "Circuito medio";
        int inscripcionesImporteUno = 0;
   
    if (categoriaUno.equals(categorias[inscripcionesImporteUno])){

        int monto = (edadUno <18)? inscripcionesImporte[inscripcionesImporteUno][0]: inscripcionesImporte[inscripcionesImporteUno][1];

        inscriptos[inscripcionesImporteUno].add("Numero de inscriptos"+ (inscriptos[inscripcionesImporteUno].size()+1) + "dni" + dniUno + "nombre" + nombreUno + "apellido" + apellidoUno + "edad" + edadUno + "celular" + celularUno + "numeroEmergencia" + numeroEmergenciaUno + "grupoSanguineo" + grupoSanguineoUno);



    };
     // datos de un pasajero dos
     String dniDos ="1234556";
     String nombreDos = "Juan";
     String apellidoDos = "Pérez";
     int edadDos = 25;
     int celularDos = 123456789;
     int numeroEmergenciaDos = 987654321;
     String grupoSanguineoDos = "0*";
     String categoriaDos = "Circuito avanzado";
     int inscripcionesImporteDos = 0;

    if (categoriaDos.equals(categorias[inscripcionesImporteDos])){

        int monto = (edadDos <18)? inscripcionesImporte[inscripcionesImporteDos][0]: inscripcionesImporte[inscripcionesImporteDos][1];

        inscriptos[inscripcionesImporteDos].add("Numero de inscriptos"+ (inscriptos[inscripcionesImporteDos].size()+1) + "dni" + dniDos + "nombre" + nombreDos + "apellido" + apellidoDos + "edad" + edadDos + "celular" + celularDos + "numeroEmergencia" + numeroEmergenciaDos + "grupoSanguineo" + grupoSanguineoDos);
    };
        // datos de un pasajero tres
        String dniTres ="1234556";
        String nombreTres = "Juan";
        String apellidoTres = "Pérez";
        int edadTres = 25;
        int celularTres = 123456789;
        int numeroEmergenciaTres = 987654321;
        String grupoSanguineoTres = "0*";
        String categoriaTres = "Circuito chico";
        int inscripcionesImporteTres = 0;

if (categoriaTres.equals(categorias[inscripcionesImporteTres])){

    int monto = (edadTres <18)? inscripcionesImporte[inscripcionesImporteTres][0]: inscripcionesImporte[inscripcionesImporteTres][1];

    inscriptos[inscripcionesImporteTres].add("Numero de inscriptos"+ (inscriptos[inscripcionesImporteTres].size()+1) + "dni" + dniTres + "nombre" + nombreTres + "apellido" + apellidoTres + "edad" + edadTres + "celular" + celularTres + "numeroEmergencia" + numeroEmergenciaTres + "grupoSanguineo" + grupoSanguineoTres);
};

System.out.println("Inscriptos en el circuito chico: ");
for (String participante : inscriptos[0]) {
    System.out.println(participante);
};
System.out.println("Inscriptos en el circuito medio: ");
for (String participante : inscriptos[1]) {
    System.out.println(participante);
};
System.out.println("Inscriptos en el circuito avanzado: ");     
for (String participante : inscriptos[2]) {
    System.out.println(participante);
};

//desinscribir a un participante 
int numeroInscripcion = 1; 
categoriaUno = "Circuito medio";
    
if(inscriptos[inscripcionesImporteUno].size()>= numeroInscripcion){
    System.out.println("Desinscribiendo:" + inscriptos[inscripcionesImporteUno].get(numeroInscripcion-1));
    inscriptos[inscripcionesImporteUno].remove(numeroInscripcion-1);
};
//imprimir lisnta de inscriptos luego de la desinscripcion
System.out.println("inscriptos en el circuito chico: ");
for (String participante: inscriptos[inscripcionesImporteUno]){
System.out.println(participante);
};

int totalImporte = 0;
System.err.println("Monto recaudado por categoria");
for (int i=0; i< categorias.length; i++){
    int totalCategioria = 0;
    for (String participante : inscriptos [i]){
        String [] partes = participante.split(" ,");
        String montoStr =partes[partes.length-1].split(":\\$")[1];
        totalCategioria += Integer.parseInt(montoStr);
    };
    totalImporte += totalCategioria;
    System.out.println(categorias[i]+ ":$" + totalCategioria);
    System.out.println("Total recaudado por la carrera: $" + totalImporte);
}
};};