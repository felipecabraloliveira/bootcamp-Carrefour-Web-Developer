# Desafio de projeto sobre Git/GitHub
Repositório criado para o desafio de projeto.

## Links úteis
[Sintaxa básica MarkDown](https://www.markdownguide.org/basic-syntax/)

[Download Git](https://git-scm.com/downloads)

[Sintaxe Git](https://comandosgit.github.io/)

## Git - Comandos básicos

**Setar usuário**
>git config --global user.name "Felipe Cabral"

**Setar email**
>git config --global user.email "felipecabral33@gmail.com"

**Setar arquivos a serem ignorados**
>git config --global core.excludesfile ~/.gitignore

**Listar configurações**
>git config --list

### Repositório Local

**Criar novo repositório**
>git init

**Clonar um repositório**
>git clone git://github.com/schacon/grit.git

**Verificar estado dos arquivos/diretórios**
>git status

**Adicionar um arquivo em específico**
>git add arquivo.txt

**Adicionar um diretório em específico**
>git add meu_diretorio

**Adicionar todos os arquivos/diretórios**
>git add .
> 
>git add *

**Adicionar um arquivo que esteja listado no .gitignore (geral ou do repositório)**
>git add -f arquivo_no_gitignore.txt


### Comitar arquivo/diretório

**Comitar um arquivo**
>git commit arquivo.txt

**Comitar vários arquivos**
>git commit meu_arquivo.txt meu_outro_arquivo.txt

**Comitar informando mensagem**
>git commit meuarquivo.txt -m "Mensagem de commit"


### Remover arquivo/diretório

**Remover arquivo**
>git rm meu_arquivo.txt

**Remover diretório**
>git rm -r diretorio

**Mover arquivo**
>git mv arquivo_origem arquivo_destino

**Atualizar repositório local**
>git pull origin main

**Enviar arquivo para repositório remoto**
>git push origin main

### Visualizar histórico

**Exibir histórico**
>git log

**Exibir histórico com diff das duas últimas alterações**
>git log -p -2
