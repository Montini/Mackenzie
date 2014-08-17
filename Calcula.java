import java.util.*;

public class Calcula {
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    int sum, sub, mult, divisao, resto;
    
  
    System.out.print("Informe o primeiro numero: ");
    int x = in.nextInt();

    System.out.print("Informe o segundo numero: ");
    int y = in.nextInt();
    
    sum = x + y;

    System.out.println("A soma dos dois eh " + sum);
    
    sub = x - y;
    
    System.out.println("A diferenca eh " + sub);
    
    mult = x * y;
    
    System.out.println("A multiplicacao eh " + mult);
    
    divisao = x / y;
    
    System.out.println("A divisao eh " + divisao);
    
    System.out.print("Entre com o nr r1: ");
    int r1 = in.nextInt();
    
    System.out.print("Entre com o nr r2: ");
    int r2 = in.nextInt();
    
    resto = (r1%r2);
    System.out.println("O resto da divisao eh " + resto);
    
    
  }

  
}
