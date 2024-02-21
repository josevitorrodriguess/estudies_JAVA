package poo.retangulo;

import java.util.Locale;

public class Rectangle {

    public double width;
    public double heigh;

    public double area(){

        return width * heigh;
    }

    public double perimeter(){
        return 2 * (width+heigh);
    }

    public double diagonal(){
        return Math.sqrt(Math.pow(width,2) + Math.pow(heigh,2));
    }

    public String toString(){
        return "AREA = " + String.format("%.2f%n",area()) +"PERIMETER = " + String.format("%.2f%n",perimeter()) +
                "DIAGONAL = " + String.format("%.2f%n",diagonal());
    }
}
