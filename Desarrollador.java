public class Desarrollador extends Empleado{
    double horas_extras;
    public Desarrollador(String nombre, double salario_base, double horas_extras){
        super(nombre, salario_base);
        this.horas_extras=horas_extras;
    }
    @Override
    public void calcular_salario(){
        System.out.printf("El salario de Desarrolador es: %.2f\n", (salario_base+horas_extras));
    }
}
