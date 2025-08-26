import java.util.Scanner;

public class CalculadoraNotas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Usando laço FOR para processar 3 alunos
        for (int i = 1; i <= 3; i++) {
            System.out.println("\n=== ALUNO " + i + " ===");
            
            // Entrada de dados
            System.out.print("Nome do aluno: ");
            String nome = scanner.nextLine();
            
            System.out.print("Nota 1: ");
            double nota1 = scanner.nextDouble();
            
            System.out.print("Nota 2: ");
            double nota2 = scanner.nextDouble();
            
            System.out.print("Nota 3: ");
            double nota3 = scanner.nextDouble();
            
            // Limpar o buffer
            scanner.nextLine();
            
            // Cálculos usando métodos
            double media = calcularMedia(nota1, nota2, nota3);
            String status = verificarAprovacao(media);
            
            // Exibir resultado
            exibirResultado(nome, media, status);
        }
        
        scanner.close();
        System.out.println("\n=== FIM DO PROGRAMA ===");
    }
    
    // Método para calcular a média
    public static double calcularMedia(double n1, double n2, double n3) {
        return (n1 + n2 + n3) / 3;
    }
    
    // Método para verificar aprovação
    public static String verificarAprovacao(double media) {
        if (media >= 7.0) {
            return "Aprovado";
        } else {
            return "Reprovado";
        }
    }
    
    // Método para exibir resultado formatado
    public static void exibirResultado(String nome, double media, String status) {
        System.out.println("\n--- RESULTADO ---");
        System.out.println("Aluno: " + nome);
        System.out.printf("Média: %.2f%n", media);
        System.out.println("Status: " + status);
        System.out.println("----------------");
    }
}
