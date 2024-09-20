package LABORATORIO_02.PROBLEMA;
import java.util.Scanner;
public class TVectorAlumno {
    public static void main(String ar[]) {
        // CLASE PARA REALIZAR LAS PRUEBAS
        Scanner entrada = new Scanner(System.in);
        int opc,pos;
        VectorAlumno va=new VectorAlumno();
        do{
            System.out.println("\nMENU DE OPCIONES:");
            System.out.println("1. Agregar un alumno");
            System.out.println("2. Insertar alumno en una posicion");
            System.out.println("3. Mostrar el Vector de alumnos");
            System.out.println("4. Salir");
            System.out.print("Ingrese una opcion: ");
            opc = entrada.nextInt();
            switch(opc){
                case 1: va.agregarAlumno(); break;
                case 2: System.out.print("Ingrese la posicion: ");
                        pos = entrada.nextInt();
                        va.insertarlistaPos(va.leerAlumno(),pos);
                        break;
                case 3: System.out.println("\nPRESENTACION DEL VECTOR DE ALUMNOS: ");
                        va.mostrarVector();
                case 4: break;
                default: System.out.println("Ingrese una opción correcta.");
            }
        }while(opc!=4);
        va.CerrarScanner();
        entrada.close();
    }
}
