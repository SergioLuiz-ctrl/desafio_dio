public class saudacao {

    public static void mensagem (int hora){
        switch(hora){
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                 bomDia();
                 break;
             case 12:
             case 13:
             case 14:
             case 15:
             case 16:
             case 17:
                boaTarde();
                break;
             case 18:
             case 19:
             case 20:
             case 21:
             case 22:
             case 23:    
                boaNoite();
                break;
             default:
             System.out.println("Hora invalida tente novamente ");   
        }
    }
    
    public static void bomDia() {
        System.out.println("Bom Dia!");
    }

    public static void boaTarde() {
        System.out.println("Boa Tarde!");
    }
    
    public static void boaNoite() {
        System.out.println("Boa Noite!");
    }
}
