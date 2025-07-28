# Jogo da Forca - Java (Terminal)

Jogo da forca simples feito em Java, com foco em lógica de programação, uso de estruturas de repetição e condicionais, entrada de dados e manipulação de strings.

Projeto desenvolvido como atividade para a disciplina de **Pensamento Computacional e Algoritmos**, no **IFSC - São José**.

---

## Objetivos

- Praticar lógica de programação com Java  
- Implementar estrutura básica de jogo por terminal  
- Reforçar o uso de arrays, loops e condições  
- Explorar leitura de dados com `Scanner`  
- Estruturar projeto em um repositório versionado  

---

## Requisitos

- **Java 8** ou superior instalado

Para verificar se o Java está instalado:

```bash
java -version
```

## Estrutura do Projeto
```text
jogo-da-forca/
├── src/
│   └── Forca.java        # Código principal do jogo
└── README.md
```

## Como Executar
1. Clone o repositório:
   linux:
```bash
git clone https://github.com/seu-usuario/jogo-da-forca.git
cd jogo-da-forca/src
```
2. Compile o arquivo:
```bash
javac Forca.java
```
3. Execute o jogo:
```bash
java Forca
```

windows: 
1. Baixe o .zip
2. Crie um arquivo .bat contendo o seguinte conteúdo
```bash
@echo off
cd src
javac Forca.java
if %errorlevel% neq 0 (
    echo Erro na compilação.
    pause
    exit /b
)
java Forca
pause
```
3. Inclua esse arquivo .bat na pasta .zip extraída

4. Execute o .bat
