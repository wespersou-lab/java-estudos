import java.util.ArrayList;
import java.util.Scanner;
public class ArrayList295 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> notas = new ArrayList<>();    
        double soma = 0;    
        for (int i = 0; i < 5; i++) {
            System.out.println("Digite a nota: ");
            notas.add(sc.nextDouble()); }
            
            for (double nota : notas) {
                soma += nota; }

            for (double nota : notas) {
                System.out.println(nota);
            }

                double media = soma / notas.size();
                
                System.out.println("\nTodas as notas: " + notas);
                System.out.println("Média de todas as notas: " + media);
                sc.close();
            }
            }
