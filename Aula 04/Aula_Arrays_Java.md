# Arrays em Java
## Aula Completa - 1 Hora

---

## Agenda da Aula
1. **O que são Arrays?**
2. **Declaração e Inicialização**
3. **Acesso aos Elementos**
4. **Percorrendo Arrays**
5. **Arrays Multidimensionais**
6. **Métodos Úteis**
7. **Exercícios Práticos**

---

## 1. O que são Arrays?

### Definição
- **Array**: Estrutura de dados que armazena múltiplos valores do mesmo tipo
- **Características**:
  - Tamanho fixo (definido na criação)
  - Índices começam em 0
  - Todos os elementos são do mesmo tipo
  - Acesso direto por índice

### Analogia
```
Imagine uma caixa com compartimentos numerados:
┌─────┬─────┬─────┬─────┬─────┐
│ [0] │ [1] │ [2] │ [3] │ [4] │
├─────┼─────┼─────┼─────┼─────┤
│  10 │  25 │  30 │  15 │  40 │
└─────┴─────┴─────┴─────┴─────┘
```

---

## 2. Declaração e Inicialização

### Sintaxe Básica
```java
// Declaração
tipo[] nomeArray;

// Inicialização
nomeArray = new tipo[tamanho];

// Declaração e inicialização em uma linha
tipo[] nomeArray = new tipo[tamanho];
```

### Exemplos Práticos
```java
// Array de inteiros
int[] numeros = new int[5];

// Array de strings
String[] nomes = new String[3];

// Array de doubles
double[] precos = new double[10];
```

---

## 3. Inicialização com Valores

### Método 1: Inicialização Direta
```java
int[] numeros = {10, 20, 30, 40, 50};
String[] frutas = {"maçã", "banana", "laranja"};
double[] notas = {8.5, 9.0, 7.5, 8.0};
```

### Método 2: Atribuição Individual
```java
int[] numeros = new int[3];
numeros[0] = 10;
numeros[1] = 20;
numeros[2] = 30;
```

---

## 4. Acesso aos Elementos

### Sintaxe
```java
array[indice]
```

### Exemplo Prático
```java
int[] idades = {25, 30, 35, 40, 45};

// Acessando elementos
System.out.println(idades[0]); // 25
System.out.println(idades[2]); // 35
System.out.println(idades[4]); // 45

// Modificando elementos
idades[1] = 32;
System.out.println(idades[1]); // 32
```

---

## 5. Propriedade Length

### Obtendo o Tamanho do Array
```java
int[] numeros = {10, 20, 30, 40, 50};
int tamanho = numeros.length; // 5

System.out.println("O array tem " + tamanho + " elementos");
```

### Útil para Loops
```java
int[] numeros = {10, 20, 30, 40, 50};

for (int i = 0; i < numeros.length; i++) {
    System.out.println("Elemento " + i + ": " + numeros[i]);
}
```

---

## 6. Percorrendo Arrays

### Método 1: For Tradicional
```java
int[] numeros = {10, 20, 30, 40, 50};

for (int i = 0; i < numeros.length; i++) {
    System.out.println("Índice " + i + ": " + numeros[i]);
}
```

### Método 2: For-Each (Enhanced For)
```java
int[] numeros = {10, 20, 30, 40, 50};

for (int numero : numeros) {
    System.out.println("Valor: " + numero);
}
```

---

## 7. Comparando os Métodos

### For Tradicional
```java
// ✅ Acesso ao índice
// ✅ Modificar elementos
// ✅ Percorrer em ordem reversa
for (int i = 0; i < numeros.length; i++) {
    numeros[i] = numeros[i] * 2; // Modifica o array
}
```

### For-Each
```java
// ✅ Sintaxe mais simples
// ✅ Menos propenso a erros
// ❌ Não permite modificar elementos
// ❌ Não tem acesso ao índice
for (int numero : numeros) {
    System.out.println(numero); // Apenas leitura
}
```

---

## 8. Arrays de Strings

### Exemplo Prático
```java
String[] nomes = {"João", "Maria", "Pedro", "Ana"};

// Percorrendo
for (String nome : nomes) {
    System.out.println("Olá, " + nome + "!");
}

// Acessando caracteres
String primeiroNome = nomes[0];
char primeiraLetra = primeiroNome.charAt(0); // 'J'
```

---

## 9. Arrays Multidimensionais

### Conceito
- Arrays que contêm outros arrays
- Úteis para representar tabelas, matrizes, etc.

### Declaração
```java
// Array 2D (matriz)
int[][] matriz = new int[3][4];

// Array 3D
int[][][] cubo = new int[3][3][3];
```

---

## 10. Arrays 2D - Exemplo

### Inicialização
```java
int[][] matriz = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
};
```

### Percorrendo
```java
// For tradicional
for (int i = 0; i < matriz.length; i++) {
    for (int j = 0; j < matriz[i].length; j++) {
        System.out.print(matriz[i][j] + " ");
    }
    System.out.println();
}
```

---

## 11. Exercício 1: Média das Notas

### Problema
Calcular a média das notas de um aluno.

### Solução
```java
public class MediaNotas {
    public static void main(String[] args) {
        double[] notas = {8.5, 9.0, 7.5, 8.0, 9.5};
        double soma = 0;
        
        for (double nota : notas) {
            soma += nota;
        }
        
        double media = soma / notas.length;
        System.out.println("Média: " + media);
    }
}
```

---

## 12. Exercício 2: Maior e Menor Valor

### Problema
Encontrar o maior e menor valor em um array.

### Solução
```java
public class MaiorMenor {
    public static void main(String[] args) {
        int[] numeros = {15, 8, 25, 3, 12, 20};
        
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
    }
}
```

---

## 13. Exercício 3: Busca Linear

### Problema
Verificar se um número existe no array.

### Solução
```java
public class BuscaLinear {
    public static void main(String[] args) {
        int[] numeros = {10, 20, 30, 40, 50};
        int busca = 30;
        boolean encontrou = false;
        
        for (int numero : numeros) {
            if (numero == busca) {
                encontrou = true;
                break;
            }
        }
        
        if (encontrou) {
            System.out.println("Número encontrado!");
        } else {
            System.out.println("Número não encontrado!");
        }
    }
}
```

---

## 14. Exercício 4: Inverter Array

### Problema
Inverter a ordem dos elementos de um array.

### Solução
```java
public class InverterArray {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5};
        
        System.out.println("Array original:");
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }
        
        // Invertendo
        for (int i = 0; i < numeros.length / 2; i++) {
            int temp = numeros[i];
            numeros[i] = numeros[numeros.length - 1 - i];
            numeros[numeros.length - 1 - i] = temp;
        }
        
        System.out.println("\nArray invertido:");
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }
    }
}
```

---

## 15. Exercício 5: Matriz Transposta

### Problema
Calcular a transposta de uma matriz.

### Solução
```java
public class MatrizTransposta {
    public static void main(String[] args) {
        int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6}
        };
        
        int linhas = matriz.length;
        int colunas = matriz[0].length;
        
        int[][] transposta = new int[colunas][linhas];
        
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                transposta[j][i] = matriz[i][j];
            }
        }
        
        // Imprimindo transposta
        for (int i = 0; i < colunas; i++) {
            for (int j = 0; j < linhas; j++) {
                System.out.print(transposta[i][j] + " ");
            }
            System.out.println();
        }
    }
}
```

---

## 16. Erros Comuns

### 1. ArrayIndexOutOfBoundsException
```java
int[] numeros = {1, 2, 3};
System.out.println(numeros[3]); // ERRO! Índice 3 não existe
```

### 2. NullPointerException
```java
int[] numeros = null;
System.out.println(numeros.length); // ERRO! Array é null
```

### 3. Tamanho Fixo
```java
int[] numeros = new int[3];
numeros[3] = 10; // ERRO! Não pode adicionar mais elementos
```

---

## 17. Boas Práticas

### ✅ Recomendado
```java
// Sempre verificar o tamanho
for (int i = 0; i < array.length; i++) {
    // código
}

// Usar for-each quando possível
for (int elemento : array) {
    // código
}

// Verificar se não é null
if (array != null) {
    // usar o array
}
```

### ❌ Evitar
```java
// Não usar números mágicos
for (int i = 0; i < 5; i++) { // ❌

// Não ignorar exceções
try {
    // código
} catch (Exception e) {
    // ❌ Não fazer nada
}
```

---

## 18. Resumo

### O que aprendemos:
1. ✅ Declarar e inicializar arrays
2. ✅ Acessar e modificar elementos
3. ✅ Percorrer arrays (for e for-each)
4. ✅ Trabalhar com arrays multidimensionais
5. ✅ Resolver problemas práticos
6. ✅ Evitar erros comuns

### Próximos passos:
- ArrayList (coleções dinâmicas)
- Métodos de arrays
- Algoritmos de ordenação
- Busca binária

---

## 19. Desafio Final

### Problema
Criar um programa que:
1. Leia 10 números do usuário
2. Armazene em um array
3. Calcule a média
4. Encontre o maior e menor
5. Conte quantos são pares e ímpares

### Dica
Use `Scanner` para entrada de dados e combine todos os conceitos aprendidos!

---

## 20. Perguntas e Dúvidas

### Tempo para discussão
- Dúvidas sobre arrays
- Exercícios adicionais
- Aplicações práticas
- Preparação para a próxima aula

---

## Obrigado!
### Arrays em Java - Aula Completa

**Próxima aula: Git - Controle de Versão**
