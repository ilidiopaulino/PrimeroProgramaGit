/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primeiroprogramagit;
import java.util.Scanner;
/**
 * @author IJIP productions
 */
public class PrimeiroProgramaGit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // declarando as variaveis
        // atribuimos o valor zero a variavel soma, subtracao porque qualquer numero somando ou sub com sero nao altera o resultado
        //atribuimos o valor um a variavel multiplicacao porque qualquer numero mult com um nao altera o resultado
        int inserir_numero, soma = 0, subtracao = 0, multiplicacao = 1;// variaveis do tipo inteiro
        //atribuimos o valor um a variavel divisao porque qualquer numero div com um nao altera o resultado
        float divisao = 1;//variavel do tipo decimal
        boolean fim = true;// vairiavel logica
        System.out.println("Digite seus numeros e quando achar que terminou aperte zero(0)!");
        int k = 0;
        while (fim) {// comparacao se o retorno e falso ou verdadeiro
            Scanner num = new Scanner(System.in);//recebendo o numero digitado pelo usuario no teclado
            inserir_numero = num.nextInt();//guardando o numero digitado na variavel inserir_numero

            if (inserir_numero != 0) {// esta comparacao serve para verificar se ele deseja sair ou nao, se o valor digitado for zero entao ele terminou de 
                //digitar
                k++;

                if (k != 1) {
                    soma += inserir_numero;// somando automanticamente os numero digitados
                    subtracao -= inserir_numero;// subtrair automaticamente os numeros digitados
                    multiplicacao *= inserir_numero;// mult automaticamente os numeros digitados
                    divisao /= inserir_numero;// div automaticamente os numeros digitados

                } else {
                    soma = inserir_numero;
                    subtracao = inserir_numero;
                    multiplicacao = inserir_numero;
                    divisao = inserir_numero;
                }

            } else {
                fim = false;// se caso ele digitar zero entao o loop ou estrutura de repeticao termina
            }
        }

        System.out.println("A soma dos numero e " + soma);
        System.out.println("A sub dos numero e " + subtracao);
        System.out.println("A mul dos numero e " + multiplicacao);
        System.out.println("A div dos numero e " + divisao);
    }
    
}
