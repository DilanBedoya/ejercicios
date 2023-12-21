public class Gerente extends Empleado{
    double bono_gerente;
    public Gerente(String nombre, double salario_base, double bono_gerente){
        super(nombre, salario_base);
        this.bono_gerente=bono_gerente;
    }

    @Override
    public void calcular_salario(){
        System.out.printf("El salario de Gerente es: %.2f\n", (salario_base+bono_gerente));
    }

}
