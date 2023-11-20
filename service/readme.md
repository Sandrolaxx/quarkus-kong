# service

This project uses Quarkus, the Supersonic Subatomic Java Framework.

If you want to learn more about Quarkus, please visit its website: https://quarkus.io/ .

## Running the application in dev mode

You can run your application in dev mode that enables live coding using:
```shell script
./mvnw compile quarkus:dev
```

> **_NOTE:_**  Quarkus now ships with a Dev UI, which is available in dev mode only at http://localhost:8080/q/dev/.

## Para criar imagem

1º Fazer o build do projeto
./mvnw package -DskipTests

2º Criar a imagem
docker build -f src/main/docker/Dockerfile.jvm -t quarkus/service .
