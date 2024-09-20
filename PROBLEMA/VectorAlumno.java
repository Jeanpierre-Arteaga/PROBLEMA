package LABORATORIO_02.PROBLEMA;

import java.util.Scanner;
public class VectorAlumno {
    // ATRIBUTO
    private Alumno lista[];
    private Scanner entrada;
    // CONSTRUCTOR
    public VectorAlumno() {
        lista=new Alumno[0];
        entrada = new Scanner (System.in);
    }
    // METODO PARA LEER UN ALUMNO
    public Alumno leerAlumno(){
        int codigo;
        String nombre;
        float nota;
        // Se instancia un alumno
        Alumno a=new Alumno();
        //Se captura los datos de alumno
        System.out.print("Codigo ---> ");
        codigo=entrada.nextInt();
        a.setCod(codigo);
        entrada.nextLine();
        System.out.print("Nombre ---> ");
        nombre= entrada.nextLine();
        a.setNom(nombre);
        System.out.print("Nota ---> ");
        nota=entrada.nextFloat();
        a.setNota(nota);
        return a;
    }
    // METODO PARA AGREGAR EL ALUMNO AL VECTOR
    public void agregarAlumno(){
        redimensionar();
        Alumno a=leerAlumno();
        lista[lista.length-1]=a;
    }
    // METODO PARA INSERTAR AL ALUMNO EN UNA POSICION
    public void insertarlistaPos(Alumno dato, int posi){
        int i;
        redimensionar();
        i=lista.length-1;
        if(posi >=0 && posi<=lista.length){
            while(i>posi){
                lista[i] = lista[i-1];
                i = i-1;
            }
            lista[posi] = dato;
        }
        else{
            System.out.println("Dimension o Posicion fuera de Rango");
        }
    }
    // METODO PARA INCREMENTAR EN UNO EL TAMAÑO DEL VECTOR
    private void redimensionar() {
        Alumno y[]=new Alumno[lista.length+1];
        for(int i=0;i<lista.length;i++){
            y[i]=lista[i];
        }
        lista=y;
    }
    // METODO PARA LA SALIDA Y PRESENTACION DEL VECTOR
    public void mostrarVector(){
        if(lista.length > 0){
            for(int i=0;i<lista.length;i++){
                System.out.println("ALUMNO "+(i+1));
                System.out.println(lista[i]);
        }
        }
        else{
            System.out.println("Vector vacio...");
        }
    }
    // METODO PARA CERRAR EL SCANNER
    public void CerrarScanner() {
        entrada.close(); 
    }
}
