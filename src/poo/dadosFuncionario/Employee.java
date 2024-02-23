package poo.dadosFuncionario;

public class Employee {

    public String name;
    public double grossSalary;
    public double tax;


    public double nextSalary(){

        return grossSalary - tax;
    }

    public void increaseSalary(double percentage){
        percentage = percentage/100;
        grossSalary = grossSalary * (1 +percentage);
    }

    public String toString(){
        return "Employee: " + name + ", " + "$ " + String.format("%.2f",nextSalary());
    }
}
