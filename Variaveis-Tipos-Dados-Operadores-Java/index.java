/**
 * index
 */
public class index {

    public static void main(String[] args) {
        
       /** UM POUCO SOBRE VARIAVEIS
        * 
        * Variáveis são espaços reservados na memória do computador, 
          aonde se pode armazenar valores.
          Para criar variáveis devemos seguir algumas regras.

             Evitar cifrão underline, ou seja, caracteres especiais.

             A diferença entre letras maiusculas e minúsculas case-sensitive.

             Sem espaços 

             Não usar palavras reservadas da linguagem. 

             Legibilidade, coerência nos nomes, e variáveis repetidas.


        */


        int l;

        int L;       // L e diferente de l por fato da linguagem ser case-sensitive

       // int 1a;       o Java não permite as variaveis começar com numeros 

        int _1a;     // nesse caso não dara nenhum erro de programação mais não é uma boa pratica, e  qual o sentido desse nome.

        int $aq;     // caracteres especiais devem ser evitados

       // int l = 10;  Variaveis não podem ter o mesmo nome

      // int double = 20; O uso de palavras reservadas e proibido.

    
        l = 12;
        L = 23;      
        _1a = 34;
        $aq = 65;

        final int A = 5; //  Constante
       // A = 11;            Como A e uma Constante não pode ser alterada
       // int meia entrada;  Espaços não são permitidos
       // int asdf_fdo$ui= 2; Deve ser evitado caracteres especiais
       int qtdDia = 4;  //   Variavel valida no entanto deve ser mais coerente possivel na criação de variaveis.


       int quantidadesProdutos = 23; // Seguindo uma boa pratica chamada de CamelCase, e de facil entendimento

       final int NUMERO_TENTATIVA = 10; // O uso do underline para criar espaços, e a constante sendo declarada em maiusculo.
       System.out.println("------------------------------");
       System.out.println("          Variaveis           ");
       System.out.println(" l = " + l);
       System.out.println(" L = " + L);
       System.out.println(" _1a = " + _1a);
       System.out.println(" $aq = " + $aq);

       System.out.println(" Constante = " + A);
       System.out.println(" qtdDia = " + qtdDia);

       System.out.println(" quantidadesProdutos = " + quantidadesProdutos);
       System.out.println(" NUMERO_TENTATIVA = " + NUMERO_TENTATIVA);

      /** TIPOS DE DADOS 
       * 
       * São valores e operações que as variaves podem assumir.
       * os pricipais tipos de dados
       * Textual - char | String
       * Numeral - byte | short | int | long | float | double
       * Lógico  - boolean
       * Objeto  - Esse tipo de dado e voltado a Orientação a Obejetos 
       * 
      */

      // Numeral
      // Cada Numeral possui sua capacidade de armazenamento.

      byte b = 12; // o byte aceita -128 até 127
      short s = 1994; // short aceita -32.768 até  32.762
      int i = 9888456; // int -2.147.483.648 ate 2.147.483647
      long lo = 54324677890L; // -9.223.372.036.854.775.808 até 9.223.372.036.854.775.807
      float fl = 3.56f; // mais ou menos 3.40282347
      double d = 4.78; // 1.79769313486231570

      // Textual
      // Quando trabalhamos com caracteres devemos usar aspas simples '' char, dupla "" String.

      char c = 'P'; // Caracteres 16-bit unicode
      String st ="texto"; 

      // Lógico 
      // Esse tipo de dado armazena 2 valores verdadeiro e falso

      boolean bo = 2 == 2; // Comparando se 2 é igual a 2
      boolean ba = 3 == 5; // Comparando se 3 é igual a 5

      System.out.println("------------------------------");
      System.out.println("        Tipos de Dados        ");
      System.out.println(" b = " + b);
      System.out.println(" s = " + s);
      System.out.println(" i = " + i);
      System.out.println(" long = " + lo);
      System.out.println(" float= " + fl);
      System.out.println(" double = " + d);
      System.out.println(" char = " + c);
      System.out.println(" String = " + st);
      System.out.println(" 2 == 2 = " + bo);
      System.out.println(" 3 == 5 = " + ba);
 
      /** OPERADORES ARITMÉTICOS 
       * 
       * De forma simples Operadores são simbolos que possui a capacidade de realizar ações especificas em operandos, que em seguida retorna um resultado.
       * TIPOS
       * Pós-fixado: X++ | X--
       * Prefixado:  ++X | --X
       * Aritmético:  + | - | * | / | %
       * Atribuiçõo:  = | +=| -=| *=| %=
      **/

      int x = 5, y = 5;  // Atribuição Simples 
      int som = 1 + 1;   // Soma
      int sub = 2 - 1;   // Subtração 
      int mult = 2 * 2;  // Multiplicação 
      double div = 47 / 7; // Divisão 
      int mod = 20 % 5; // Modulo e o resto da divisão de 20 / 5

      int t = 10; // Atribuição Simples 
      double dd = 4.8; // Atribuição Simples 
      t += 2; // t = t + 2  
      t -= 4; // t = t - 4
      dd /= 10.9; // dd = dd / 10.9
      t *= 9; // t = t * 9
      t %=  5; // t = t % 5
      

      System.out.println("------------------------------");
      System.out.println("     Operadores Aritméticos   ");

      /** ++x vai incrementar o valor de x e me retornar o valor já  incrementado.
        y++ vai me retornar o valor de y no momento em que é chamado e depois incrementar esse valor.

        --x vai subtrair 1 do valor de x = 6 e me retornar o valor 5.
        y-- ira mostrar o valor atual de y = 6 em seguida ira decremeta o valor que ficara 5.
      **/

      System.out.println(" ++x = " + ++x); // imprime 6 
      System.out.println(" --x = " + --x); // imprime 5
      System.out.println("   x = " + x); // imprime 5

      System.out.println(" y++ = " + y++); // imprime 5 
      System.out.println(" y-- = " + y--); // imprime 6 
      System.out.println(" y = " + y); // imprime 5

      
      System.out.println("1 + 1 = " + som); 
      System.out.println("2 - 1 = " + sub);
      System.out.println("2 x 2 = " + mult);
      System.out.println("47 /  7 = " + div);
      System.out.println("20 % 5 = " + mod);

      
      /** CONVERSÕES CASTING
       * É a tranformação de uma determinada  variável de tipo menos  específico  para um tipo mais específico.
       * Tipos
       * Upcast (cima) - implícito
       * Downcast (baixo) - explícito
       * 
       *  E todo os casting obedece o tamanho fixo de cada variável 
       */

       long j;    int n = 7;     j = n;  // Upcast implícito pois não foi preciso dizer para que tipo de dado ele ira receber.

       int q;     long g = 500;  q = (int) g; // Downcast explícito pois  aqui precisei dizer que o int irá receber uma variável maior o long, mesmo o int suportando 500 imagina um valor muto maior terá perda de dados.

       double e;  float o = 23.8f;  e = o;  // Upcast implícito

       float f;   double u = 13.7;  f = (float) u;  // Downcast explícito

       int tt; float ft = 44.6f;  tt = (int) ft; // Downcast explícito



       /** Lembrando que aqui foi apenas o que eu aprendi, e são apenas exemplos, em projetos reais devemos cuidar de
        * .Legibilidade, Coerência
          .Indentação
          .Erros de sintaxe e logica
          etc. lembre-se você não escreve só para você.
        **/
    }
}