package src;
import java.util.*;
import java.util.Scanner; 

public class Main { 
    public static void main(String[] args) {
        System.out.println("-----SECURITY SYSTEM-----");
        Scanner scanner = new Scanner (System.in);
    int opcao;
    do{
        System.out.println("ESCOLHA UMA DAS OPÇÕES: \n");

        System.out.println("1- CADASTRAR SEUS DADOS ");
        System.out.println("2- CRIAR LOGIN/SENHA DE ACESSO ");
        System.out.println("3- FAZER LOGIN ");
        System.out.println("4- SAIR ");
        
        System.out.println("ESCOLHA UMA OPÇÃO: ");
        
        opcao = scanner.nextInt();
       
        switch (opcao) { 
        case 1:
            Cpf.validatorCpf();             
                break;
        case 2:
            Senha.PasswordGenerator();              
                break;
        case 3:
            Login.LoginGenerator();                 
                break;
        case 4:
           System.out.println("SEE YOU LATER ");                 
                break;    
        default:
                System.out.println("OPÇÃO INVÁLIDA!");
                break;}    
            } while (opcao != 4);   
            }
        }
        
    

    


