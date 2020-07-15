/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desafio5que2;

/**
 *
 * @author AliraMaria
 */
public class Desafio5que2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 2-	Faça um algoritmo que some os números fornecidos pelo usuário até que o número lido seja igual a zero.
        
        int numero, acuSomaNum;   
         Scanner teclado = new Scanner(System.in);
         numero = 1; acuSomaNum = 0;
         while(numero != 0){
        
             numero =Integer.parseInt(JOptionPane.
                     showInputDialog("Informe um numero ou zero para sair:"));
             acuSomaNum = acuSomaNum + numero;
         }
         JOptionPane.showMessageDialog(null,"A soma de todos os valores digitados é: "
                 +acuSomaNum);
    }
    
}
