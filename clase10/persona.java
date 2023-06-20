package clase10;

import java.util.Scanner;

public class persona {
    private int id;
    private String nombre;
    private int edad;
    private String fechaNacimiento;
    private String DNI;
    boolean adulto;

    public persona (){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }




    public void mostrar(){
        System.out.println("\nID: "+this.id);
        System.out.println("Nombre: "+this.nombre);
        System.out.println("Edad: "+this.edad);
        System.out.println("Fecha de Nacimiento: "+this.fechaNacimiento);
        System.out.println("DNI: "+this.DNI);
        if(adulto){
            System.out.println("Es mayor de edad");
        }else{
            System.out.println("No es mayor de edad");
        }
    }

    public void ingresarDatos(){
        Scanner teclado = new Scanner(System.in);
        Scanner teclado2 = new Scanner(System.in);
        System.out.print("\nIngresa el ID: ");
        this.id=teclado.nextInt();
        System.out.print("Ingresa el nombre: ");
        this.nombre=teclado2.nextLine();
        System.out.print("Ingresa la edad: ");
        this.edad=teclado.nextInt();
        adulto= this.edad >= 18;
        System.out.print("Ingresa la fecha de nacimiento: ");
        this.fechaNacimiento=teclado2.nextLine();
        System.out.print("Ingresa el DNI: ");
        this.DNI=teclado2.nextLine();
    }


}
