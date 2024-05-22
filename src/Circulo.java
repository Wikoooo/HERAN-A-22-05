public class Circulo extends Figura{
    private double raio;

    public Circulo(double raio, String cor){
    }
    public void setRaio(double base){
        this.raio = raio;
    }
    public double getRaio(double raio){

        return raio;
    }
    public double area(){
        return raio*raio*3.14;
    }
    public double getDiametro(){
        return raio*2;
    }
    public String toString(){
        return super.toString();
    }
}
