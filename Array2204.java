public class Array2204{
    public static void main(String[] args) {
        int[] numeros = {12,2,37,42,32,11,5,74,3,23};
        int maior = numeros[0];
        int menor = numeros[0];
        int soma = 0;
        int par = 0;
        int impares = 0;
        for (int i = 0; i < numeros.length; i++){
            int num = numeros[i];
            if (num > maior) {
                maior = num;
            }
            if (num < menor) {
                menor = num;
            }
            soma += num;
            if (num % 2 == 0) {
                par++;
            } else {
                impares++;
            }
        }
        double media = (double) soma / numeros.length;
        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);
        System.out.println("Pares: " + par);
        System.out.println("Ímpares: " + impares);
        System.out.println("Média: " + media);

    }
}