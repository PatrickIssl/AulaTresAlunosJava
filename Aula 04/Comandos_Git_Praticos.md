# Comandos Git - Guia Prático
## Exemplos e Casos de Uso Reais

---

## 🚀 CONFIGURAÇÃO INICIAL

### Instalar Git
```bash
# Windows: Baixar de https://git-scm.com
# Linux
sudo apt-get install git

# macOS
brew install git
```

### Configurar Identidade
```bash
# Configurar nome e email
git config --global user.name "Seu Nome"
git config --global user.email "seu@email.com"

# Verificar configurações
git config --list

# Configurar editor padrão
git config --global core.editor "code --wait"  # VS Code
git config --global core.editor "notepad"      # Windows
git config --global core.editor "nano"         # Linux/macOS
```

---

## 📁 REPOSITÓRIOS

### Criar Repositório Local
```bash
# Inicializar na pasta atual
git init

# Inicializar em pasta específica
git init nome-do-projeto

# Verificar status
git status
```

### Clonar Repositório
```bash
# Clonar repositório
git clone https://github.com/usuario/projeto.git

# Clonar em pasta específica
git clone https://github.com/usuario/projeto.git minha-pasta

# Clonar branch específica
git clone -b develop https://github.com/usuario/projeto.git

# Clonar com SSH
git clone git@github.com:usuario/projeto.git
```

---

## 📊 STATUS E INFORMAÇÕES

### Ver Status
```bash
# Status completo
git status

# Status resumido
git status --short
git status -s

# Status ignorando arquivos não rastreados
git status --ignored
```

### Ver Histórico
```bash
# Histórico completo
git log

# Histórico resumido
git log --oneline
git log --oneline -10  # Últimos 10 commits

# Histórico com gráfico
git log --graph --oneline --all

# Histórico de arquivo específico
git log -- arquivo.java

# Histórico com autor e data
git log --pretty=format:"%h - %an, %ar : %s"
```

### Ver Diferenças
```bash
# Mudanças não adicionadas
git diff

# Mudanças no staging
git diff --staged
git diff --cached

# Diferença entre commits
git diff commit1 commit2

# Diferença entre branches
git diff main feature-branch

# Diferença de arquivo específico
git diff arquivo.java
```

---

## ➕ ADICIONAR E COMMITAR

### Adicionar Arquivos
```bash
# Adicionar arquivo específico
git add arquivo.java

# Adicionar todos os arquivos
git add .

# Adicionar arquivos modificados
git add -u

# Adicionar arquivos interativamente
git add -i

# Adicionar arquivos por padrão
git add *.java
git add src/
```

### Fazer Commit
```bash
# Commit simples
git commit -m "Adiciona funcionalidade de login"

# Commit com descrição detalhada
git commit -m "feat: adiciona autenticação de usuários" -m "- Implementa validação de senha" -m "- Adiciona criptografia básica"

# Commit de todos os arquivos rastreados
git commit -am "Atualiza documentação"

# Commit vazio (para merge)
git commit --allow-empty -m "Trigger deployment"
```

### Padrões de Commit (Conventional Commits)
```bash
# Nova funcionalidade
git commit -m "feat: adiciona sistema de notificações"

# Correção de bug
git commit -m "fix: corrige cálculo de média"

# Documentação
git commit -m "docs: atualiza README"

# Formatação
git commit -m "style: formata código"

# Refatoração
git commit -m "refactor: reorganiza estrutura de classes"

# Testes
git commit -m "test: adiciona testes unitários"

# Manutenção
git commit -m "chore: atualiza dependências"
```

---

## 🌿 BRANCHES

### Criar e Mudar Branches
```bash
# Criar branch
git branch feature-nova

# Mudar para branch
git checkout feature-nova

# Criar e mudar em um comando
git checkout -b feature-nova

# Comando moderno (Git 2.23+)
git switch feature-nova
git switch -c feature-nova

# Ver todas as branches
git branch

# Ver branches remotas
git branch -r

# Ver todas as branches (locais e remotas)
git branch -a
```

### Trabalhar com Branches
```bash
# Renomear branch atual
git branch -m novo-nome

# Deletar branch local
git branch -d feature-antiga

# Forçar deleção
git branch -D feature-antiga

# Deletar branch remota
git push origin --delete feature-antiga

# Sincronizar branches remotas
git fetch --prune
```

### Merge
```bash
# Merge simples
git merge feature-branch

# Merge com mensagem personalizada
git merge feature-branch -m "Merge feature de login"

# Merge sem fast-forward
git merge --no-ff feature-branch

# Abortar merge
git merge --abort

# Continuar merge após resolver conflitos
git merge --continue
```

---

## 🔄 REPOSITÓRIOS REMOTOS

### Configurar Remote
```bash
# Adicionar remote
git remote add origin https://github.com/usuario/projeto.git

# Ver remotes
git remote -v

# Renomear remote
git remote rename origin github

# Remover remote
git remote remove origin

# Atualizar URL do remote
git remote set-url origin https://github.com/usuario/novo-projeto.git
```

### Push e Pull
```bash
# Primeiro push (configurar upstream)
git push -u origin main

# Push normal
git push origin main

# Push de branch
git push origin feature-branch

# Push de todas as branches
git push --all

# Pull (fetch + merge)
git pull origin main

# Fetch apenas (não faz merge)
git fetch origin

# Pull com rebase
git pull --rebase origin main
```

### Sincronização
```bash
# Baixar mudanças remotas
git fetch origin

# Ver diferenças
git log HEAD..origin/main

# Aplicar mudanças remotas
git merge origin/main

# Ou usar pull
git pull origin main
```

---

## 🔧 COMANDOS AVANÇADOS

### Stash (Guardar Temporariamente)
```bash
# Guardar mudanças
git stash

# Guardar com mensagem
git stash push -m "Trabalho em progresso"

# Ver stashes
git stash list

# Aplicar último stash
git stash pop

# Aplicar stash específico
git stash apply stash@{1}

# Aplicar sem remover
git stash apply

# Deletar stash
git stash drop stash@{0}

# Deletar todos os stashes
git stash clear
```

### Reset (Desfazer)
```bash
# Reset suave (mantém mudanças no staging)
git reset --soft HEAD~1

# Reset misto (remove do staging)
git reset --mixed HEAD~1
git reset HEAD~1  # Padrão

# Reset duro (remove tudo)
git reset --hard HEAD~1

# Reset para commit específico
git reset --hard abc1234

# Reset de arquivo específico
git reset HEAD arquivo.java
```

### Revert (Desfazer Commit)
```bash
# Reverter último commit
git revert HEAD

# Reverter commit específico
git revert abc1234

# Reverter sem commit automático
git revert --no-commit abc1234
```

---

## 🔍 BUSCA E FILTROS

### Buscar no Histórico
```bash
# Buscar por texto
git log --grep="bug"

# Buscar por autor
git log --author="João"

# Buscar por data
git log --since="2024-01-01"
git log --until="2024-12-31"

# Buscar por arquivo
git log -- arquivo.java

# Buscar por conteúdo
git log -S "função"
```

### Filtrar Arquivos
```bash
# Ver arquivos modificados
git diff --name-only

# Ver arquivos adicionados
git diff --name-only --cached

# Ver arquivos em commit
git show --name-only abc1234
```

---

## 🏷️ TAGS

### Criar Tags
```bash
# Tag simples
git tag v1.0.0

# Tag anotada
git tag -a v1.0.0 -m "Versão 1.0.0"

# Tag em commit específico
git tag -a v1.0.0 abc1234 -m "Versão 1.0.0"
```

### Gerenciar Tags
```bash
# Listar tags
git tag

# Ver informações da tag
git show v1.0.0

# Deletar tag local
git tag -d v1.0.0

# Deletar tag remota
git push origin --delete v1.0.0

# Enviar tags para remote
git push origin --tags
```

---

## 🛠️ CONFIGURAÇÕES AVANÇADAS

### Aliases Úteis
```bash
# Configurar aliases
git config --global alias.st status
git config --global alias.co checkout
git config --global alias.br branch
git config --global alias.ci commit
git config --global alias.unstage 'reset HEAD --'

# Usar aliases
git st
git co feature-branch
git br
git ci -m "mensagem"
git unstage arquivo.java
```

### Configurações de Merge
```bash
# Configurar editor de merge
git config --global merge.tool vscode
git config --global mergetool.vscode.cmd 'code --wait $MERGED'

# Configurar diff tool
git config --global diff.tool vscode
git config --global difftool.vscode.cmd 'code --wait --diff $LOCAL $REMOTE'
```

---

## 📋 EXEMPLOS PRÁTICOS

### Fluxo de Trabalho Diário
```bash
# 1. Verificar status
git status

# 2. Baixar mudanças remotas
git pull origin main

# 3. Criar branch para feature
git checkout -b feature/nova-funcionalidade

# 4. Fazer mudanças e commits
git add .
git commit -m "feat: implementa nova funcionalidade"

# 5. Enviar para remote
git push origin feature/nova-funcionalidade

# 6. Voltar para main
git checkout main

# 7. Fazer merge
git merge feature/nova-funcionalidade

# 8. Enviar para remote
git push origin main

# 9. Deletar branch local
git branch -d feature/nova-funcionalidade
```

### Resolver Conflitos
```bash
# 1. Tentar merge
git merge feature-branch

# 2. Git mostra conflitos
# 3. Editar arquivos com conflitos
# 4. Adicionar arquivos resolvidos
git add arquivo-conflitado.java

# 5. Finalizar merge
git commit
```

### Desfazer Mudanças
```bash
# Desfazer mudanças em arquivo
git checkout -- arquivo.java

# Desfazer último commit (mantém mudanças)
git reset --soft HEAD~1

# Desfazer último commit (remove mudanças)
git reset --hard HEAD~1

# Desfazer commit específico
git revert abc1234
```

---

## 🚨 PROBLEMAS COMUNS

### Senha do GitHub
```bash
# Configurar token de acesso pessoal
git config --global credential.helper store

# Ou usar SSH
ssh-keygen -t ed25519 -C "seu@email.com"
# Adicionar chave pública ao GitHub
```

### Branch Desatualizada
```bash
# Atualizar branch local
git fetch origin
git rebase origin/main

# Ou fazer merge
git pull origin main
```

### Commit no Branch Errado
```bash
# Mover commit para branch correto
git reset --soft HEAD~1
git checkout branch-correto
git commit -m "mensagem"
```

---

## 📚 RECURSOS ADICIONAIS

### Documentação
- [Git Book](https://git-scm.com/book)
- [GitHub Guides](https://guides.github.com)
- [Git Cheat Sheet](https://education.github.com/git-cheat-sheet-education.pdf)

### Ferramentas Visuais
- GitKraken
- SourceTree
- GitHub Desktop
- VS Code (extensões Git)

### Próximos Passos
- Git Flow
- Rebase
- Cherry-pick
- Git hooks
- CI/CD com Git
