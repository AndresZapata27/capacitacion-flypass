package com.courses.capacitacionesflypass.sesion1.e.excepciones;

public class CustomExceptionExample {

    public static void main(String[] args) {

        try {
            lanzarCustomExceptionChecked();
        } catch (CustomExceptionChecked e) {

            

        }


        lanzarCustomExceptionUnchecked();


    }

    public static void lanzarCustomExceptionChecked() throws CustomExceptionChecked {

            throw new CustomExceptionChecked("This is a custom exception");
    }


    public static void lanzarCustomExceptionUnchecked()  {
        throw new CustomExceptionUnchecked("This is a custom exception");
    }



}
