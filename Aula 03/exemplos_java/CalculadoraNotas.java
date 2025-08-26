/*
 * SOLUÇÃO DA ATIVIDADE PRÁTICA
 * Calculadora de Notas
 * 
 * Prof. Patrick Issler Dal Lago
 * Aula de Métodos e Laços de Repetição
 */

import java.util.Scanner;

public class CalculadoraNotas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== CALCULADORA DE NOTAS ===\n");
        
        // Laço FOR para processar 3 alunos
        for (int i = 1; i <= 3; i++) {
            System.out.println("--- ALUNO " + i + " ---");
            
            // Pedir nome do aluno
            System.out.print("Nome do aluno: ");
            String nome = scanner.nextLine();
            
            // Pedir as 3 notas
            System.out.print("Nota 1: ");
            double nota1 = scanner.nextDouble();
            
            System.out.print("Nota 2: ");
            double nota2 = scanner.nextDouble();
            
            System.out.print("Nota 3: ");
            double nota3 = scanner.nextDouble();
            
            // Consumir a quebra de linha
            scanner.nextLine();
            
            // Calcular média
            double media = calcularMedia(nota1, nota2, nota3);
            
            // Verificar aprovação
            String status = verificarAprovacao(media);
            
            // Exibir resultado
            exibirResultado(nome, media, status);
            
            System.out.println(); // Linha em branco
        }
        
        System.out.println("=== FIM DO PROGRAMA ===");
        scanner.close();
    }
    
    // Método 1: Calcular média de 3 notas
    public static double calcularMedia(double n1, double n2, double n3) {
        return (n1 + n2 + n3) / 3;
    }
    
    // Método 2: Verificar aprovação baseada na média
    public static String verificarAprovacao(double media) {
        if (media >= 7.0) {
            return "Aprovado";
        } else {
            return "Reprovado";
        }
    }
    
    // Método 3: Exibir resultado formatado
    public static void exibirResultado(String nome, double media, String status) {
        System.out.println("\n=== RESULTADO ===");
        System.out.println("Aluno: " + nome);
        System.out.printf("Média: %.2f%n", media);
        System.out.println("Status: " + status);
        
        // Mensagem adicional baseada no status
        if (status.equals("Aprovado")) {
            System.out.println("🎉 Parabéns! Você foi aprovado!");
        } else {
            System.out.println("📚 Estude mais para a próxima vez!");
        }
    }
}

/*
 * EXEMPLO DE EXECUÇÃO:
 * 
 * === CALCULADORA DE NOTAS ===
 * 
 * --- ALUNO 1 ---
 * Nome do aluno: João
 * Nota 1: 8.5
 * Nota 2: 7.0
 * Nota 3: 9.0
 * 
 * === RESULTADO ===
 * Aluno: João
 * Média: 8.17
 * Status: Aprovado
 * 🎉 Parabéns! Você foi aprovado!
 * 
 * --- ALUNO 2 ---
 * Nome do aluno: Maria
 * Nota 1: 6.0
 * Nota 2: 5.5
 * Nota 3: 7.0
 * 
 * === RESULTADO ===
 * Aluno: Maria
 * Média: 6.17
 * Status: Reprovado
 * 📚 Estude mais para a próxima vez!
 * 
 * --- ALUNO 3 ---
 * Nome do aluno: Pedro
 * Nota 1: 9.0
 * Nota 2: 8.5
 * Nota 3: 9.5
 * 
 * === RESULTADO ===
 * Aluno: Pedro
 * Média: 9.00
 * Status: Aprovado
 * 🎉 Parabéns! Você foi aprovado!
 * 
 * === FIM DO PROGRAMA ===
 */

/*
 * VERSÃO ALTERNATIVA SEM SCANNER (PARA TESTE RÁPIDO):
 * 
 * public class CalculadoraNotasTeste {
 *     public static void main(String[] args) {
 *         System.out.println("=== CALCULADORA DE NOTAS (TESTE) ===\n");
 *         
 *         // Dados de teste
 *         String[] nomes = {"João", "Maria", "Pedro"};
 *         double[][] notas = {
 *             {8.5, 7.0, 9.0},  // João
 *             {6.0, 5.5, 7.0},  // Maria
 *             {9.0, 8.5, 9.5}   // Pedro
 *         };
 *         
 *         // Laço FOR para processar os alunos
 *         for (int i = 0; i < 3; i++) {
 *             System.out.println("--- ALUNO " + (i+1) + " ---");
 *             System.out.println("Nome do aluno: " + nomes[i]);
 *             System.out.println("Nota 1: " + notas[i][0]);
 *             System.out.println("Nota 2: " + notas[i][1]);
 *             System.out.println("Nota 3: " + notas[i][2]);
 *             
 *             // Calcular média
 *             double media = calcularMedia(notas[i][0], notas[i][1], notas[i][2]);
 *             
 *             // Verificar aprovação
 *             String status = verificarAprovacao(media);
 *             
 *             // Exibir resultado
 *             exibirResultado(nomes[i], media, status);
 *             
 *             System.out.println();
 *         }
 *         
 *         System.out.println("=== FIM DO PROGRAMA ===");
 *     }
 *     
 *     // Os métodos são os mesmos da versão anterior
 *     public static double calcularMedia(double n1, double n2, double n3) {
 *         return (n1 + n2 + n3) / 3;
 *     }
 *     
 *     public static String verificarAprovacao(double media) {
 *         if (media >= 7.0) {
 *             return "Aprovado";
 *         } else {
 *             return "Reprovado";
 *         }
 *     }
 *     
 *     public static void exibirResultado(String nome, double media, String status) {
 *         System.out.println("\n=== RESULTADO ===");
 *         System.out.println("Aluno: " + nome);
 *         System.out.printf("Média: %.2f%n", media);
 *         System.out.println("Status: " + status);
 *         
 *         if (status.equals("Aprovado")) {
 *             System.out.println("🎉 Parabéns! Você foi aprovado!");
 *         } else {
 *             System.out.println("📚 Estude mais para a próxima vez!");
 *         }
 *     }
 * }
 */
