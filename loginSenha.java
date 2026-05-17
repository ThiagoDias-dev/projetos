import java.util.*;
import java.util.Scanner; 

public class loginSenha {
    public static void main(String[] args) {
      Scanner scanner = new Scanner (System.in);
            System.out.println("========SISTEMA DE LOGIN========");
            
            String login = "admin";
            String senha = "1234";
            int tentativa = 0;
            
            while (tentativa<3) {
            System.out.println("DIGITE O LOGIN: ");
             String usuarioLogin = scanner.nextLine();
             
             System.out.println("DIGITE A SENHA: ");
             String usuarioSenha = scanner.nextLine();
           
              
             if (usuarioLogin.equals (login) && usuarioSenha.equals (senha)){
                 System.out.println("\nSEJA BEM-VINDO ");
                 break;
                 }
             else {
             System.out.println("LOGIN OU SENHA INVÁLIDO \n");
              System.out.println("Tentativas restantes: " + (3 - tentativa) + "\n");
             tentativa++; }
             
             if (tentativa == 3){
                 System.out.println("SISTEMA BLOQUEADO POR EXCESSO DE TENTATIVA ");
                 break;
             }
              
            }
             
             scanner.close();
             
            }      
                }