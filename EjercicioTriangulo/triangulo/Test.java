package triangulo;

public class Test {
    public static void main(String[] args) {
        Triangulo triangulo1 = new Triangulo(2, 8, 10);
        Triangulo triangulo2 = new Triangulo(4,4,4);
        Triangulo triangulo3 = new Triangulo(5,5,10);
        
        System.out.println(triangulo1.tipoDeTriangulo());
        System.out.println(triangulo2.tipoDeTriangulo());
        System.out.println(triangulo3.tipoDeTriangulo());
    }
}
