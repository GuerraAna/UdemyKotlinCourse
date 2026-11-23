# UdemyKotlinCourse

Exercícios práticos do curso de Kotlin da Udemy — coleção de arquivos `.kt` soltos cobrindo os fundamentos da linguagem e POO.

## Conteúdo

Cada arquivo `pratica*.kt` é um exercício autocontido com `main()` executável:

- Construtores (primário e secundário)
- Herança, interfaces e modificadores de acesso
- Data class, enum, objetos
- Overload / override
- Collections e constantes/variáveis

## Pré-requisitos

- Kotlin (`brew install kotlin`) ou IntelliJ IDEA / Android Studio

## Como rodar

```bash
# compilar um exercício e executar
kotlinc src/praticaHeranca.kt -include-runtime -d /tmp/ex.jar
java -jar /tmp/ex.jar
```

Ou abrir a pasta no IntelliJ — o projeto já tem `.idea/` configurado (módulo `udemyPOO`) e cada arquivo roda pelo botão ▶️ no `main()`.
