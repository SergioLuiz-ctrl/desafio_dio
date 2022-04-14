/**  Métodos em Java  */

public class index {

    public static void main(String[] args) {
        

        /** Métodos é uma porção de codigo disponibilizado por uma classe, que será executado quando fizer uma requisição a ele. E são responsáveis por definir e realizar um determinado comportamento. */

        //Calculadora
        System.out.println("-----------Calculadora----------------");
        calculadora.soma(10, 30);
        calculadora.subtracao(30, 10);
        calculadora.multiplicacao(20, 5.9);
        calculadora.divisao(3.9, 10);

         //Mensagem do Dia
         System.out.println("-----------Mensagem do Dia-----------");
         saudacao.mensagem(2);
         saudacao.mensagem(17);
         saudacao.mensagem(20);

         //Emprestimo
         System.out.println("-----------Emprestimo----------------");
         emprestimo.calculo(1000, 3);
         emprestimo.calculo(1000, 2);
         emprestimo.calculo(2000, 5);
        
    }

}
