package src;
import java.util.Scanner;
import java.util.*;

public class Cpf {
    public static void validatorCpf() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("SEJA BEM-VINDO\n");
        System.out.println("VAMOS CADASTRAR SEUS DADOS: \n");
         System.out.println("***************************************\n");
       
        System.out.println("Me informe seu NOME: ");
            String nome = scanner.nextLine();

        System.out.println("Me informe seu CPF: ");
            String cpf = scanner.nextLine();
            cpf = cpf.replace(".","").replace("-", "");
            if (cpf.length() !=11 || cpf.matches("\\%d+"))
                System.out.println("DADOS INVÁLIDOS \n\n");
            else 
                System.out.println("DADOS CADASTRADOS \n");

            

          
            
            
             {
                
            }{
            };
            
    }

}
