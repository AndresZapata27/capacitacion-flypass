package com.courses.capacitacionesflypass.sesion1.f.tipsandtricks.manipulacioncadenas;

public class TextBlockExample {

    public static void main(String[] args) {


        String textBlock = """
                Esta es una cadena de texto multilínea.
                Permite que el texto se distribuya en varias líneas
                sin necesidad de caracteres de escape.
                """;

        System.out.println(textBlock);



        String html = """
                <html>
                    <body>
                        <h1>Bienvenido</h1>
                        <p>Este es un ejemplo de HTML usando Text Blocks en Java.</p>
                    </body>
                </html>
                """;

        System.out.println(html);


        String query = """
                SELECT id, name, email
                FROM users
                WHERE age > 18
                ORDER BY name ASC;
                """;

        System.out.println(query);

        String json = """
                {
                    "name": "John",
                    "age": 30,
                    "email": "john.doe@example.com"
                }
                """;

        System.out.println(json);



        String name = "John";
        int age = 30;

        String message = """
                Hola, %s.
                Tienes %d años.
                """.formatted(name, age);

        System.out.println(message);
    }
}
