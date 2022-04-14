public class emprestimo {
    
    public static int getDuasParcelas (){
        return 2;
    }

    public static int getTresParcelas (){
        return 3;
    }

    public static double getTaxaDuasParcelas (){
        return 0.3;
    }

    public static double getTaxaTresParcelas () {
        return 0.45;
    }

    public static void calculo(double valor, int parcelas){
        
        if (parcelas == 2){

            double valorFinal = valor + (valor + getDuasParcelas());

            System.out.println("O valor total para 2 parcelas ficará: R$: " + valorFinal);

        }else if (parcelas == 3){
            double valorFinal = valor + (valor + getTaxaTresParcelas());

            System.out.println("O valor total para 3 parcelas ficará: R$: " + valorFinal);
        }else {
            System.out.println("As quantidades de parcelas são invalidas. ");
        }
    }

}
