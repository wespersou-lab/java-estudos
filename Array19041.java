public class Array19041 {
    public static void main(String[] args) {
    int[] numeros = {10, -5, 30, 7, 2, 18,-2, 25}; 
    int maior = Integer.MIN_VALUE;
    int menor = Integer.MAX_VALUE;
    int soma = 0;
    int pares = 0;
    int impares = 0;
    for (int i = 0; i < numeros.length; i++) {
        soma += numeros[i];
        if (numeros[i] % 2 == 0) {
            pares++;
        } else { impares++;
        }
        if (numeros[i] > maior) {
            maior = numeros[i];
        }
        if (numeros[i] < menor) {
            menor = numeros[i];
        }
    }
        double media = (double) soma / numeros.length;
    for (int num : numeros) {
        System.out.println(num + " ");
    }
    System.out.println("\n\nSoma: " + soma);
        System.out.println("Média: " + media);
        System.out.println("Pares: " + pares);
        System.out.println("Ímpares: " + impares);
        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);
         System.out.println("\nNúmeros maiores que 10:");
        for (int num : numeros) {
            if (num > 10) {
                System.out.print(num + " ");
            }
        }
    }
}
