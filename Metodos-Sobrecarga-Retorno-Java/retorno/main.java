/** Retorno */


public class main {
    
    public static void main(String[] args) {

        System.out.println("------------Quadrilátero Retorno------------");

        double quadrado = quadrilateroRetorno.area(4);
        System.out.println("Àrea do Quadrado: " + quadrado);

        double retangulo = quadrilateroRetorno.area(5, 6);
        System.out.println("Àrea do Retângulo: " + retangulo);

        double trapezio = quadrilateroRetorno.area(8, 8, 4);
        System.out.println("Àrea do Trapézio: " + trapezio);

    }
}
