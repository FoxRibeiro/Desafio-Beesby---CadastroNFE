# Desafio Beesby - CadastroNFE
Este projeto foi criado para demonstrar a implantação de um CRUD de Cadastro de NFE com JAVA, SPRING BOOT e MySQL.

## Requisitos:
Antes de começar a implantar o sistema, verifique se o seguinte software está instalado no seu sistema:
- Java JDK 19
- Maven 3.8.7 ou superior
- MySQL Server 8.0.32 ou superior
- Postman 

## Configuração:
Antes de implantar o sistema, é necessário configurar as seguintes propriedades do banco de dados:


    # Configuração do Banco de Dados
    spring.datasource.url=jdbc:mysql://localhost:3306/CadastroNFe
    spring.datasource.username=root
    spring.datasource.password=minhasenha

As configurações podem ser encontradas no arquivo:

**src/main/resources/application.properties.**

## Implantação

Para implantar o sistema, siga os seguintes passos:

1 - Faça o clone do repositório para o seu computador:

    git clone https://github.com/seu-usuario/meu-projeto.git

2 - Navegue até o diretório do projeto e execute o seguinte comando para compilar o projeto:

    mvn clean package
    
3 - Após a conclusão da compilação, execute o seguinte comando para iniciar o sistema:

    java -jar target/meu-projeto-0.0.1-SNAPSHOT.jar
    
Certifique-se de substituir o nome do arquivo JAR pelo nome do seu arquivo JAR gerado pela compilação.

4 - Acesse o sistema pelo seguinte endereço no seu navegador:

    http://localhost:8080/NFE

## API Endpoints

- **Consultar todas as Notas Fiscais:** http://localhost:8080/NFE/All
- **Consultar Apenas Uma Nota Fiscal:** http://localhost:8080/NFE/1
- **Salvar nova Nota Fiscal:** http://localhost:8080/NFE/novo
- **Deletar Nota Fiscal:** http://localhost:8080/NFE/delete/1
- **Alterar uma Nota Fiscal:** http://localhost:8080/NFE/alterar/1

OBS: Consultar apenas uma nota Fiscal, Deletar e Alterar podem manipular valores diferentes respeitando o número da Nota Fiscal informada no final do Endpoint. Note que o valor mostrado é 1, mas ele poderia ser substituido por qualquer outro número de nota existente.



