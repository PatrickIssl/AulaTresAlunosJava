# Git - Controle de Versão
## Aula Completa - 1 Hora

---

## Agenda da Aula
1. **O que é Git?**
2. **Por que usar Git?**
3. **Conceitos Fundamentais**
4. **Configuração Inicial**
5. **Comandos Básicos**
6. **Branches**
7. **GitHub e Repositórios Remotos**
8. **Fluxo de Trabalho**
9. **Exercícios Práticos**

---

## 1. O que é Git?

### Definição
- **Git**: Sistema de controle de versão distribuído
- **Criado por**: Linus Torvalds (criador do Linux)
- **Ano**: 2005
- **Objetivo**: Rastrear mudanças em arquivos ao longo do tempo

### Analogia
```
Git é como uma "máquina do tempo" para seu código:
- Salva "fotos" do seu projeto em diferentes momentos
- Permite voltar a qualquer versão anterior
- Trabalha em equipe sem perder código
- Mantém histórico completo de mudanças
```

---

## 2. Por que usar Git?

### Problemas sem Git
```
❌ Perder código por acidente
❌ Não saber quem mudou o quê
❌ Dificuldade para trabalhar em equipe
❌ Não conseguir voltar a versões anteriores
❌ Conflitos entre versões
```

### Benefícios com Git
```
✅ Histórico completo de mudanças
✅ Trabalho colaborativo eficiente
✅ Backup automático
✅ Branches para experimentos
✅ Integração com GitHub/GitLab
✅ Rastreamento de bugs
```

---

## 3. Conceitos Fundamentais

### Repository (Repositório)
- **Local**: Pasta no seu computador com histórico Git
- **Remote**: Repositório hospedado (GitHub, GitLab, etc.)

### Commit
- **Snapshot**: "Foto" do projeto em um momento específico
- **Mensagem**: Descrição das mudanças realizadas
- **Hash**: Identificador único do commit

### Branch (Ramo)
- **Main/Master**: Ramo principal do projeto
- **Feature branches**: Ramos para novas funcionalidades

---

## 4. Estados dos Arquivos

### Working Directory
```
📁 Seu projeto
├── arquivo1.java (modificado)
├── arquivo2.java (novo)
└── arquivo3.java (deletado)
```

### Staging Area
```
🎯 Arquivos prontos para commit
├── arquivo1.java ✅
└── arquivo2.java ✅
```

### Repository
```
💾 Histórico de commits
├── commit1: "Primeira versão"
├── commit2: "Adiciona funcionalidade X"
└── commit3: "Corrige bug Y"
```

---

## 5. Configuração Inicial

### Instalação
```bash
# Windows: Baixar do git-scm.com
# Linux: sudo apt-get install git
# macOS: brew install git
```

### Configuração Global
```bash
# Configurar nome
git config --global user.name "Seu Nome"

# Configurar email
git config --global user.email "seu@email.com"

# Verificar configurações
git config --list
```

---

## 6. Comandos Básicos - Inicialização

### Criar Repositório
```bash
# Inicializar repositório na pasta atual
git init

# Verificar status
git status
```

### Clonar Repositório
```bash
# Clonar repositório existente
git clone https://github.com/usuario/projeto.git

# Clonar em pasta específica
git clone https://github.com/usuario/projeto.git minha-pasta
```

---

## 7. Comandos Básicos - Status e Log

### Ver Status
```bash
# Ver estado dos arquivos
git status

# Status resumido
git status --short
```

### Ver Histórico
```bash
# Ver commits
git log

# Log resumido
git log --oneline

# Log com gráfico
git log --graph --oneline
```

---

## 8. Comandos Básicos - Adicionar e Commitar

### Adicionar Arquivos
```bash
# Adicionar arquivo específico
git add arquivo.java

# Adicionar todos os arquivos
git add .

# Adicionar arquivos modificados
git add -u
```

### Fazer Commit
```bash
# Commit com mensagem
git commit -m "Adiciona funcionalidade de login"

# Commit com descrição detalhada
git commit -m "Adiciona funcionalidade de login" -m "Implementa autenticação de usuários com validação de senha"
```

---

## 9. Comandos Básicos - Ver Diferenças

### Ver Mudanças
```bash
# Ver mudanças não adicionadas
git diff

# Ver mudanças no staging
git diff --staged

# Ver diferença entre commits
git diff commit1 commit2
```

### Exemplo de Saída
```diff
- public void metodoAntigo() {
+ public void metodoNovo() {
     System.out.println("Olá mundo");
+    System.out.println("Nova funcionalidade");
 }
```

---

## 10. Exercício 1: Primeiro Repositório

### Passo a Passo
```bash
# 1. Criar pasta do projeto
mkdir meu-projeto
cd meu-projeto

# 2. Inicializar Git
git init

# 3. Criar arquivo
echo "public class Hello { }" > Hello.java

# 4. Verificar status
git status

# 5. Adicionar arquivo
git add Hello.java

# 6. Fazer commit
git commit -m "Primeiro commit: classe Hello"
```

---

## 11. Branches - Conceito

### O que são Branches?
```
🌳 Main (tronco principal)
├── 🌿 feature/login (ramo de login)
├── 🌿 feature/cadastro (ramo de cadastro)
└── 🌿 bugfix/correcao (ramo de correção)
```

### Vantagens
- ✅ Trabalhar em funcionalidades isoladamente
- ✅ Não afetar o código principal
- ✅ Experimentar sem medo
- ✅ Revisão de código antes de integrar

---

## 12. Comandos de Branch

### Criar e Mudar de Branch
```bash
# Criar nova branch
git branch feature-nova

# Mudar para a branch
git checkout feature-nova

# Criar e mudar em um comando
git checkout -b feature-nova

# Ver todas as branches
git branch
```

### Git Switch (Comando Moderno)
```bash
# Mudar para branch
git switch feature-nova

# Criar e mudar
git switch -c feature-nova
```

---

## 13. Merge - Integrando Branches

### Merge Simples
```bash
# Voltar para main
git checkout main

# Integrar branch
git merge feature-nova

# Deletar branch (opcional)
git branch -d feature-nova
```

### Tipos de Merge
```
Fast-forward: Sem conflitos
┌─────────┐    ┌─────────┐
│ commit1 │───▶│ commit2 │
└─────────┘    └─────────┘

Merge commit: Com conflitos
┌─────────┐    ┌─────────┐
│ commit1 │───▶│ commit2 │
└─────────┘    └─────────┘
         \         /
          \       /
           \     /
            \   /
             \ /
        ┌─────────┐
        │ merge   │
        └─────────┘
```

---

## 14. Exercício 2: Trabalhando com Branches

### Cenário
Vamos criar uma funcionalidade de calculadora em branches separadas.

```bash
# 1. Criar branch para soma
git checkout -b feature/soma

# 2. Adicionar método de soma
echo "public int soma(int a, int b) { return a + b; }" >> Calculadora.java

# 3. Commit
git add Calculadora.java
git commit -m "Adiciona método de soma"

# 4. Voltar para main
git checkout main

# 5. Criar branch para multiplicação
git checkout -b feature/multiplicacao

# 6. Adicionar método de multiplicação
echo "public int multiplica(int a, int b) { return a * b; }" >> Calculadora.java

# 7. Commit
git add Calculadora.java
git commit -m "Adiciona método de multiplicação"
```

---

## 15. GitHub - Repositórios Remotos

### O que é GitHub?
- **Plataforma**: Hospedagem de repositórios Git
- **Recursos**: Issues, Pull Requests, Wikis, etc.
- **Social**: Colaboração e networking

### Criar Repositório no GitHub
1. Acessar github.com
2. Clicar em "New repository"
3. Escolher nome e configurações
4. Seguir instruções para conectar

---

## 16. Comandos de Repositório Remoto

### Conectar Repositório Local ao Remoto
```bash
# Adicionar remote
git remote add origin https://github.com/usuario/projeto.git

# Ver remotes
git remote -v

# Enviar para remote
git push -u origin main

# Baixar mudanças
git pull origin main
```

### Push e Pull
```bash
# Enviar commits
git push origin main

# Baixar mudanças
git pull origin main

# Ver branches remotas
git branch -r
```

---

## 17. Clone e Fork

### Clone
```bash
# Clonar repositório público
git clone https://github.com/usuario/projeto.git

# Clonar com SSH
git clone git@github.com:usuario/projeto.git
```

### Fork (no GitHub)
1. Clicar em "Fork" no repositório
2. Criar cópia no seu perfil
3. Clone do seu fork
4. Trabalhar e fazer Pull Request

---

## 18. Exercício 3: GitHub na Prática

### Passo a Passo
```bash
# 1. Criar repositório no GitHub
# 2. Clonar localmente
git clone https://github.com/seu-usuario/meu-projeto.git

# 3. Criar arquivo
echo "# Meu Projeto" > README.md

# 4. Adicionar e commitar
git add README.md
git commit -m "Adiciona README"

# 5. Enviar para GitHub
git push origin main

# 6. Verificar no GitHub
# Acessar: https://github.com/seu-usuario/meu-projeto
```

---

## 19. Fluxo de Trabalho - Git Flow

### Estrutura de Branches
```
main (produção)
├── develop (desenvolvimento)
├── feature/nova-funcionalidade
├── release/v1.0.0
└── hotfix/correcao-urgente
```

### Fluxo Básico
1. **Criar branch** da develop
2. **Desenvolver** funcionalidade
3. **Fazer commits** frequentes
4. **Push** para remote
5. **Pull Request** para develop
6. **Code Review**
7. **Merge** na develop
8. **Release** para main

---

## 20. Comandos Avançados

### Stash (Guardar Temporariamente)
```bash
# Guardar mudanças
git stash

# Ver stashes
git stash list

# Aplicar stash
git stash pop

# Aplicar stash específico
git stash apply stash@{1}
```

### Reset (Desfazer)
```bash
# Reset suave (mantém mudanças)
git reset --soft HEAD~1

# Reset misto (remove do staging)
git reset --mixed HEAD~1

# Reset duro (remove tudo)
git reset --hard HEAD~1
```

---

## 21. Conflitos de Merge

### O que são Conflitos?
```
Quando duas branches modificam a mesma linha:
Branch A: System.out.println("Olá");
Branch B: System.out.println("Hello");
```

### Resolver Conflitos
```bash
# 1. Tentar merge
git merge feature-b

# 2. Git mostra conflitos
# 3. Editar arquivos com conflitos
# 4. Escolher qual versão manter
# 5. Adicionar arquivos
git add .

# 6. Finalizar merge
git commit
```

---

## 22. Exercício 4: Resolvendo Conflitos

### Cenário
```bash
# 1. Criar branch A
git checkout -b branch-a
echo "public void metodoA() { }" > Arquivo.java
git add Arquivo.java
git commit -m "Adiciona método A"

# 2. Voltar para main
git checkout main

# 3. Criar branch B
git checkout -b branch-b
echo "public void metodoB() { }" > Arquivo.java
git add Arquivo.java
git commit -m "Adiciona método B"

# 4. Tentar merge (vai dar conflito)
git merge branch-a
```

### Resolver
```java
// Manter ambos os métodos
public void metodoA() { }
public void metodoB() { }
```

---

## 23. Boas Práticas

### Commits
```bash
# ✅ Boas mensagens
git commit -m "feat: adiciona autenticação de usuário"
git commit -m "fix: corrige bug no cálculo de média"
git commit -m "docs: atualiza README"

# ❌ Mensagens ruins
git commit -m "mudanças"
git commit -m "corrige"
git commit -m "."
```

### Padrões de Commit
- **feat**: Nova funcionalidade
- **fix**: Correção de bug
- **docs**: Documentação
- **style**: Formatação
- **refactor**: Refatoração
- **test**: Testes
- **chore**: Manutenção

---

## 24. .gitignore

### Arquivos a Ignorar
```gitignore
# Arquivos compilados
*.class
*.jar

# Pastas de build
target/
build/

# Arquivos de IDE
.vscode/
.idea/

# Logs
*.log

# Arquivos temporários
*.tmp
*.temp
```

### Criar .gitignore
```bash
# Criar arquivo
touch .gitignore

# Adicionar conteúdo
echo "*.class" >> .gitignore
echo "target/" >> .gitignore

# Commit
git add .gitignore
git commit -m "Adiciona .gitignore"
```

---

## 25. Exercício 5: Projeto Completo

### Cenário
Criar um projeto Java com Git e GitHub.

```bash
# 1. Criar projeto
mkdir calculadora
cd calculadora

# 2. Inicializar Git
git init

# 3. Criar .gitignore
echo "*.class" > .gitignore
echo "bin/" >> .gitignore

# 4. Criar classe principal
cat > Calculadora.java << EOF
public class Calculadora {
    public int soma(int a, int b) {
        return a + b;
    }
    
    public int subtrai(int a, int b) {
        return a - b;
    }
}
EOF

# 5. Primeiro commit
git add .
git commit -m "feat: implementa calculadora básica"

# 6. Criar repositório no GitHub e conectar
git remote add origin https://github.com/seu-usuario/calculadora.git
git push -u origin main
```

---

## 26. Comandos Úteis do Dia a Dia

### Verificar Status
```bash
git status
git log --oneline -5
git diff
```

### Trabalhar com Branches
```bash
git branch
git checkout -b feature/nova
git merge feature/nova
```

### Sincronizar com Remote
```bash
git pull origin main
git push origin main
```

### Desfazer Mudanças
```bash
git checkout -- arquivo.java
git reset HEAD arquivo.java
git stash
```

---

## 27. Ferramentas Visuais

### Git GUI
- **GitKraken**: Interface gráfica popular
- **SourceTree**: Gratuito da Atlassian
- **GitHub Desktop**: Oficial do GitHub
- **VS Code**: Integração nativa

### Vantagens
- ✅ Visualização de branches
- ✅ Histórico gráfico
- ✅ Resolução de conflitos visual
- ✅ Mais intuitivo para iniciantes

---

## 28. Integração com IDEs

### IntelliJ IDEA
- Git integrado
- Interface visual
- Merge tool
- Histórico de mudanças

### Eclipse
- EGit plugin
- Visualização de branches
- Comparação de arquivos

### VS Code
- Extensões Git
- Source Control panel
- GitLens (histórico detalhado)

---

## 29. Resumo - O que Aprendemos

### Conceitos Fundamentais
1. ✅ O que é Git e por que usar
2. ✅ Repositórios locais e remotos
3. ✅ Commits e histórico
4. ✅ Branches e merge
5. ✅ GitHub e colaboração

### Comandos Essenciais
1. ✅ git init, clone, status
2. ✅ git add, commit, push, pull
3. ✅ git branch, checkout, merge
4. ✅ git log, diff, stash
5. ✅ Resolução de conflitos

### Boas Práticas
1. ✅ Mensagens de commit claras
2. ✅ .gitignore adequado
3. ✅ Fluxo de trabalho organizado
4. ✅ Branches para funcionalidades
5. ✅ Commits frequentes

---

## 30. Próximos Passos

### Aprofundar Conhecimentos
- **Git Flow**: Fluxo de trabalho avançado
- **Rebase**: Reorganizar histórico
- **Cherry-pick**: Aplicar commits específicos
- **Git hooks**: Automação
- **CI/CD**: Integração contínua

### Ferramentas Relacionadas
- **GitHub Actions**: Automação
- **GitLab CI**: Pipeline de desenvolvimento
- **Bitbucket**: Alternativa ao GitHub
- **GitKraken**: Interface gráfica

---

## 31. Desafio Final

### Projeto Completo
1. **Criar repositório** no GitHub
2. **Implementar** uma calculadora em Java
3. **Usar branches** para cada operação
4. **Fazer commits** frequentes
5. **Criar Pull Request**
6. **Documentar** o projeto

### Critérios de Avaliação
- ✅ Uso correto do Git
- ✅ Mensagens de commit claras
- ✅ Branches organizadas
- ✅ Documentação adequada
- ✅ Código funcional

---

## 32. Recursos Adicionais

### Documentação Oficial
- [git-scm.com](https://git-scm.com)
- [GitHub Guides](https://guides.github.com)
- [Git Book](https://git-scm.com/book)

### Cursos Online
- Git e GitHub para iniciantes
- Git avançado
- Fluxos de trabalho com Git

### Comunidade
- Stack Overflow
- GitHub Discussions
- Fóruns de programação

---

## 33. Perguntas e Dúvidas

### Tempo para Discussão
- Dúvidas sobre Git
- Casos de uso específicos
- Problemas comuns
- Configurações avançadas
- Integração com projetos

---

## Obrigado!
### Git - Controle de Versão - Aula Completa

**Próxima aula: ArrayList e Coleções em Java**
