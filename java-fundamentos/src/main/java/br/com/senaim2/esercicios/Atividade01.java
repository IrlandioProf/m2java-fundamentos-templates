package br.com.senaim2.esercicios;

public class Atividade01 {

		public static void main(String[] args) {
			boolean  bo;
	        char     c;
	        byte     b;
	        short    s;
	        int      i;
	        long     l;
	        float    f;
	        double   d;
	        
	        // CHAR 
	        /*
	        c = 65;
	        System.out.println("=============================");
	        System.out.println("char : "+ c);
	        */

	        /*
	        b = 10;
	        s = b;
	        i = s;
	        
	        System.out.println("=============================");
	        System.out.println("inteiros");
	        System.out.println("=============================");
	        System.out.println("i = s = b = " + i);
	        */


//	      Agora multiplicamos i por 100 e atribuimos o total dessa multiplicação ao próprio i.
	        /*
	        i = 10;
	        i *= 100;
	        
	        System.out.println("novo valor de i = "+i);
	        System.out.println("=============================");
	        */

	        System.out.println("ponto flutuante");
	        System.out.println("*** double ***");
	        
	        d = 125.32;
	        System.out.println("valor de d com double normal = " + d);
	        d = 125.32d;
	        System.out.println("valor de d com double explícito = " + d);
	        d = 125.32f;
	        System.out.println("valor de d com float explícito 'casting'= " + d);
	        
	        System.out.println("*** float ***");
	        f = (float)125.32;
	        System.out.println("valor de f com casting para float = " + d);
	        f = 125.32f; // tenho que colocar o "f" quando é float
	        System.out.println("valor de f com float normal= " + d);
	        f = (float)125.32d;
	        System.out.println("valor de f com casting para float e um pré-casting para double = " + d);
	        System.out.println("-----------------------------");
	        
	        /*  No primeiro caso atribuimos 125.32 à variavel d. sem problemas. 
	            Funciona legal, como podemos ver na Saída da impressão.
	            Logo depois atribuimos 125.32d. Mas pra que serve esse "d" depois do valor? 
	            Indica que estou afirmando para o Java que a constante (125.32) é um double.

	            Os dois casos acima são idênticos. Como assim? Para o Java, o tipo padrão de um literal com ponto
	            flutuante é double. Portanto, não precisa colocar o "d" depois do literal se quiser que ela seja double.

	            literal --> 125.32

	            Mas o terceiro caso é interessante. Atribuimos à variável d o seguinte valor: 125.32f. 
	            Dessa vez estamos inserindo um float num double. problema nenhum, pois o float é 32 bit e o double é 64 bit. 
	            Mas, observe a Saída da impressão.        
	        /*
	        Abordaremos agora o tipo booleano.
	        */
	        System.out.println("=============================");
	        System.out.println("booleano");
	        System.out.println("=============================");
	        bo = true;
	        System.out.println("valor de bo = " + bo);
	        bo = (1 > 2);
	        System.out.println("valor de bo = " + bo);
	        bo = (f == d);
	        System.out.println("valor de bo = " + bo);
	        System.out.println("-----------------------------");
	        
	        /*
	        i = 1000;
	        System.out.println("Brincando com os tipos -- Parte 1");
	        System.out.println("=================================");
	        System.out.println("posso converter int para float?");
	        System.out.println("i antes da conversao = " + i);
	        System.out.println("f antes da conversao = " + f);
	        f = i;
	        System.out.println("i depois da conversao = " + i);
	        System.out.println("f depois da conversao = " + f);
	        System.out.println("--");
	        */
	        i = 1000;
	        System.out.println("Brincando com os tipos -- Parte 2");
	        System.out.println("=================================");
	        f = (float)d;
	        System.out.println("posso converter float para int?");
	        System.out.println("i antes da conversao = " + i);
	        System.out.println("f antes da conversao = " + f);
	        i = (int)f;
	        System.out.println("i depois da conversao = " + i);
	        System.out.println("f depois da conversao = " + f);
	        System.out.println("-----------------------------");        
	    }
}
