package LABORATORIO_02.PROBLEMA;

public class Alumno {
    // ATRIBUTOS
    private int cod;
    private String nom;
    private float nota;
    // CONSTRUCTOR
    public Alumno() {
    }
    // SETTERS
    public void setCod(int codigo){
    cod=codigo;
    }
    public void setNom(String nombre){
    nom=nombre;
    }
    public void setNota(float calif){
    nota=calif;
    }
    // GETTERS
    public int getCod(){
    return cod;
    }
    public String getNom(){
    return nom;
    }
    public float getNota(){
    return nota;
    }
    // FORMATO DE SALIDA
    public String toString(){
    return cod+" "+nom+" "+nota;
    }
    // SALIDA DEL OBJETO CREADO
    public void mostrarAlu(){
    System.out.printf("%6d", cod);
    System.out.printf("%-15s ", nom);
    System.out.printf("%6.1f\n", nota);
    }
}
