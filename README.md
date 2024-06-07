# Praticando Spring Boot: Challenge LiterAlura
**Objetivo:** Desenvolver um Catálogo de Livros que ofereça interação textual (via console) com os usuários, proporcionando no mínimo 5 opções de interação. Os livros serão buscados através de uma API específica.

## Tecnologias
- **Java 17**
- **Maven**
- **Spring Boot**
- **Spring JPA**
- **Biblioteca Jackson**
- **PostgreSQL**
- **Gutendex API**



## Funcionalidades da Aplicação

1.  Buscar livro por título

    ![Captura de tela 2024-06-07 201352.png](..%2F..%2F..%2F..%2FVideos%2FOneDrive%2FImagens%2FCapturas%20de%20tela%2FCaptura%20de%20tela%202024-06-07%20201352.png)

2. Listar livros registrados

   ![Captura de tela 2024-06-07 201558](C:\Users\55639\Videos\OneDrive\Imagens\Capturas de tela\Captura de tela 2024-06-07 201558.png)

3. Listar autores registrados

   ![Captura de tela 2024-06-07 201615](C:\Users\55639\Videos\OneDrive\Imagens\Capturas de tela\Captura de tela 2024-06-07 201615.png)

4. Listar autores vivos em um determinado ano

   ![Captura de tela 2024-06-07 201754](C:\Users\55639\Videos\OneDrive\Imagens\Capturas de tela\Captura de tela 2024-06-07 201754.png)

5. Listar livros em um determinado idioma

   ![Captura de tela 2024-06-07 201825](C:\Users\55639\Videos\OneDrive\Imagens\Capturas de tela\Captura de tela 2024-06-07 201825.png)



## Como rodar o projeto

1. Clone este repositório

   ``````
   https://github.com/KayllaneGPina/literalura-challenge.git
   ``````

2. Entre no diretório principal

   ``` 
   cd literalura
   ```

3. Configure o seu banco de dados no arquivo ***application.properties***:

   ```
   spring.datasource.url=jdbc:postgresql://localhost:5432/literalura
   spring.datasource.username=seu-usuario
   spring.datasource.password=sua-senha
   spring.jpa.hibernate.ddl-auto=update
   spring.jpa.show-sql=true
   ```

4. Execute a aplicação na classe principal ***LiteraluraApplication***