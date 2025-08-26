// ========================================
// EXEMPLOS PRÁTICOS - ARRAYS EM JAVA
// ========================================

import java.util.Scanner;
import java.util.Arrays;

public class ExemplosArrays {
    
    public static void main(String[] args) {
        System.out.println("=== EXEMPLOS DE ARRAYS EM JAVA ===\n");
        
        // Exemplo 1: Array básico
        exemploArrayBasico();
        
        // Exemplo 2: Array com entrada do usuário
        exemploArrayComEntrada();
        
        // Exemplo 3: Busca em array
        exemploBuscaArray();
        
        // Exemplo 4: Ordenação
        exemploOrdenacao();
        
        // Exemplo 5: Array 2D (matriz)
        exemploMatriz();
        
        // Exemplo 6: Desafio completo
        desafioCompleto();
    }
    
    // ========================================
    // EXEMPLO 1: ARRAY BÁSICO
    // ========================================
    public static void exemploArrayBasico() {
        System.out.println("1. ARRAY BÁSICO:");
        
        // Declaração e inicialização
        int[] numeros = {10, 20, 30, 40, 50};
        
        // Percorrendo com for tradicional
        System.out.print("Array original: ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
        System.out.println();
        
        // Percorrendo com for-each
        System.out.print("Array com for-each: ");
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }
        System.out.println();
        
        // Calculando média
        double soma = 0;
        for (int numero : numeros) {
            soma += numero;
        }
        double media = soma / numeros.length;
        System.out.println("Média: " + media);
        System.out.println();
    }
    
    // ========================================
    // EXEMPLO 2: ARRAY COM ENTRADA DO USUÁRIO
    // ========================================
    public static void exemploArrayComEntrada() {
        System.out.println("2. ARRAY COM ENTRADA DO USUÁRIO:");
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Quantos números você quer inserir? ");
        int tamanho = scanner.nextInt();
        
        // Criar array com tamanho definido pelo usuário
        int[] numeros = new int[tamanho];
        
        // Preencher array
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }
        
        // Mostrar array
        System.out.print("Números inseridos: ");
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }
        System.out.println();
        
        // Encontrar maior e menor
        int maior = numeros[0];
        int menor = numeros[0];
        
        for (int numero : numeros) {
            if (numero > maior) {
                maior = numero;
            }
            if (numero < menor) {
                menor = numero;
            }
        }
        
        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);
        System.out.println();
    }
    
    // ========================================
    // EXEMPLO 3: BUSCA EM ARRAY
    // ========================================
    public static void exemploBuscaArray() {
        System.out.println("3. BUSCA EM ARRAY:");
        
        String[] nomes = {"João", "Maria", "Pedro", "Ana", "Carlos"};
        
        // Busca linear
        String busca = "Maria";
        int posicao = -1;
        
        for (int i = 0; i < nomes.length; i++) {
            if (nomes[i].equals(busca)) {
                posicao = i;
                break;
            }
        }
        
        if (posicao != -1) {
            System.out.println("Nome '" + busca + "' encontrado na posição " + posicao);
        } else {
            System.out.println("Nome '" + busca + "' não encontrado");
        }
        
        // Contar nomes que começam com 'M'
        int contador = 0;
        for (String nome : nomes) {
            if (nome.startsWith("M")) {
                contador++;
            }
        }
        System.out.println("Nomes que começam com 'M': " + contador);
        System.out.println();
    }
    
    // ========================================
    // EXEMPLO 4: ORDENAÇÃO
    // ========================================
    public static void exemploOrdenacao() {
        System.out.println("4. ORDENAÇÃO DE ARRAY:");
        
        int[] numeros = {64, 34, 25, 12, 22, 11, 90};
        
        System.out.print("Array original: ");
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }
        System.out.println();
        
        // Ordenação usando Arrays.sort()
        Arrays.sort(numeros);
        
        System.out.print("Array ordenado: ");
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }
        System.out.println();
        
        // Ordenação manual (Bubble Sort)
        int[] numeros2 = {64, 34, 25, 12, 22, 11, 90};
        
        for (int i = 0; i < numeros2.length - 1; i++) {
            for (int j = 0; j < numeros2.length - 1 - i; j++) {
                if (numeros2[j] > numeros2[j + 1]) {
                    // Trocar elementos
                    int temp = numeros2[j];
                    numeros2[j] = numeros2[j + 1];
                    numeros2[j + 1] = temp;
                }
            }
        }
        
        System.out.print("Array ordenado manualmente: ");
        for (int numero : numeros2) {
            System.out.print(numero + " ");
        }
        System.out.println();
        System.out.println();
    }
    
    // ========================================
    // EXEMPLO 5: MATRIZ (ARRAY 2D)
    // ========================================
    public static void exemploMatriz() {
        System.out.println("5. MATRIZ (ARRAY 2D):");
        
        // Criar matriz 3x3
        int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        // Mostrar matriz
        System.out.println("Matriz original:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        
        // Soma da diagonal principal
        int somaDiagonal = 0;
        for (int i = 0; i < matriz.length; i++) {
            somaDiagonal += matriz[i][i];
        }
        System.out.println("Soma da diagonal principal: " + somaDiagonal);
        
        // Transposta da matriz
        System.out.println("Matriz transposta:");
        for (int j = 0; j < matriz[0].length; j++) {
            for (int i = 0; i < matriz.length; i++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    
    // ========================================
    // EXEMPLO 6: DESAFIO COMPLETO
    // ========================================
    public static void desafioCompleto() {
        System.out.println("6. DESAFIO COMPLETO:");
        
        Scanner scanner = new Scanner(System.in);
        
        // Ler 10 números
        int[] numeros = new int[10];
        
        System.out.println("Digite 10 números:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }
        
        // Calcular estatísticas
        double soma = 0;
        int maior = numeros[0];
        int menor = numeros[0];
        int pares = 0;
        int impares = 0;
        
        for (int numero : numeros) {
            // Soma para média
            soma += numero;
            
            // Maior e menor
            if (numero > maior) {
                maior = numero;
            }
            if (numero < menor) {
                menor = numero;
            }
            
            // Contar pares e ímpares
            if (numero % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }
        
        double media = soma / numeros.length;
        
        // Mostrar resultados
        System.out.println("\n=== RESULTADOS ===");
        System.out.println("Números inseridos: ");
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }
        System.out.println();
        System.out.println("Média: " + media);
        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);
        System.out.println("Pares: " + pares);
        System.out.println("Ímpares: " + impares);
        
        // Ordenar e mostrar
        Arrays.sort(numeros);
        System.out.print("Números ordenados: ");
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }
        System.out.println();
        
        scanner.close();
    }
}

// ========================================
// EXERCÍCIOS ADICIONAIS
// ========================================

class ExerciciosArrays {
    
    // Exercício 1: Inverter array
    public static void inverterArray(int[] array) {
        System.out.print("Array original: ");
        for (int numero : array) {
            System.out.print(numero + " ");
        }
        
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        
        System.out.print("\nArray invertido: ");
        for (int numero : array) {
            System.out.print(numero + " ");
        }
        System.out.println();
    }
    
    // Exercício 2: Remover duplicatas
    public static int[] removerDuplicatas(int[] array) {
        if (array.length <= 1) {
            return array;
        }
        
        Arrays.sort(array);
        int[] resultado = new int[array.length];
        int j = 0;
        
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] != array[i + 1]) {
                resultado[j++] = array[i];
            }
        }
        resultado[j++] = array[array.length - 1];
        
        // Criar array com tamanho correto
        int[] finalResult = new int[j];
        for (int i = 0; i < j; i++) {
            finalResult[i] = resultado[i];
        }
        
        return finalResult;
    }
    
    // Exercício 3: Rotacionar array
    public static void rotacionarArray(int[] array, int posicoes) {
        System.out.print("Array original: ");
        for (int numero : array) {
            System.out.print(numero + " ");
        }
        
        int[] resultado = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            int novaPosicao = (i + posicoes) % array.length;
            resultado[novaPosicao] = array[i];
        }
        
        System.out.print("\nArray rotacionado " + posicoes + " posições: ");
        for (int numero : resultado) {
            System.out.print(numero + " ");
        }
        System.out.println();
    }
    
    // Exercício 4: Verificar se array é palíndromo
    public static boolean ehPalindromo(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            if (array[i] != array[array.length - 1 - i]) {
                return false;
            }
        }
        return true;
    }
    
    // Exercício 5: Encontrar segundo maior
    public static int segundoMaior(int[] array) {
        if (array.length < 2) {
            return -1; // Erro
        }
        
        int maior = Integer.MIN_VALUE;
        int segundoMaior = Integer.MIN_VALUE;
        
        for (int numero : array) {
            if (numero > maior) {
                segundoMaior = maior;
                maior = numero;
            } else if (numero > segundoMaior && numero != maior) {
                segundoMaior = numero;
            }
        }
        
        return segundoMaior;
    }
}
