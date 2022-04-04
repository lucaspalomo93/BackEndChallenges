package triangulo;

public class Triangulo {
    private int lado1, lado2, lado3;

    public Triangulo() {
    }
   
    public Triangulo(int lado1, int lado2, int lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    public int getLado1() {
        return lado1;
    }

    public void setLado1(int lado1) {
        this.lado1 = lado1;
    }

    public int getLado2() {
        return lado2;
    }

    public void setLado2(int lado2) {
        this.lado2 = lado2;
    }

    @Override
    public String toString() {
        return "Triangulo{" + "lado2=" + lado2 + ", lado3=" + lado3 + ", lado1=" + lado1 + '}';
    }
    
    public String tipoDeTriangulo(){
        if(this.lado1 == this.lado2 && this.lado1 == this.lado3){
            return "Es un triangulo equilatero";
        }
        else if(this.lado1 != this.lado2 && this.lado1 != this.lado3){
            return "Es un triangulo escaleno";
        }
        else{
            return "Es un triangulo isosceles";
        }                    
    }
    
    
}
