package br.com.fiap.tdsa1.java;
import br.com.fiap.tdsa1.java.pacote1.ClasseA;
import br.com.fiap.tdsa1.java.pacote2.ClasseB;
public class Programa {
        public static void main(String[] args){
            //comentario
            boolean falso = false;
            boolean verdadeiro = true;
            char letra = 'a';
            char numerico = 65;
            byte numeropequeno = 10;
            short numeroUmPoucoMaiorQueByte = 200;
            int numero = 3000;
            long numeroGrande = 3000000000l; // o l e necessario para definir que o numero e Long
            float numeroComVirgulo = 30000.43435f; // o numero float necessita de F no final
            double numeroGrandeComVirgula = 54154651.7894641d; //o double necessita de D no final
            String nome = "jailso";
            String a = " ";
            String b = new String();
            String c = new String("Valor inicial");
            a = "atribuindo outro valor";
            a = "Outro valor";
            //instanciando objetos de classes de outros pacotes 
            //imports feitos no inicio
            ClasseA obj1 = new ClasseA();
            ClasseB obj2 = new ClasseB();
            //Esta no mesmo package portanto n precisa de import
            ClasseC obj3 = new ClasseC();
            //exemplo de operadores
            int soma = 10+10;
            int subtracao = 10 - 5;
            int multiplicacao = 5 * 2;
            int divisao = 10/10;
            int modulo = 10 % 2;
            soma++; // soma = soma + 1 -> 21
            ++soma; // soma = soma + 1 -> 22
            soma--; // soma = soma - 1 -> 21
            --soma; // soma = soma - 1 -> 20
            
        }
}