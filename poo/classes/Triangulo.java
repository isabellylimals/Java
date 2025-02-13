package poo.classes;

public class Triangulo{
    public double a;
    public double b;
    public double c;// c é atributo

//metodo(função)
    public double area() {
        double p = (a + b + c) / 2.0;
        return Math.sqrt(p * (p- a) * (p- b) * (p- c));
        }
        }

