public class Empleado {
    /*propiedades*/
    String nombre;
    double salario_base;

    /*Contructor*/
    public Empleado(String nombre, double salario_base){
        this.nombre=nombre;
        this.salario_base=salario_base;
    }

    /*Método*/
    public void calcular_salario(){
        System.out.printf("El salario base es: %.2f\n", salario_base);
    }

}
