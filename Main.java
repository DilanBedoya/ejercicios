
public class Main {
    public static void main(String[] args) {
        /*Intancias*/
        Empleado instancia1=new Empleado("Ejemplo_1",450);
        Gerente instancia2=new Gerente("Ejemplo_2",450,200);
        Desarrollador instancia3=new Desarrollador("Ejemplo_3",450,100);
        /*Llamar métodos*/
        instancia1.calcular_salario();
        instancia2.calcular_salario();
        instancia3.calcular_salario();
    }
}