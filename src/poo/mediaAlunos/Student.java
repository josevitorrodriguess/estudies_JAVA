package poo.mediaAlunos;

public class Student {

    public String nomeAluno;
    public double nota1Trimestre;
    public double nota2Trimestre;
    public double nota3Trimestre;


    public double media() {

        double  somaNotas = nota2Trimestre + nota1Trimestre + nota3Trimestre;
        return somaNotas ;
    }


}
