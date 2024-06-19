package com.courses.capacitacionesflypass.sesion2.b.serializationdeserialization;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Arrays;

public class MainSerializer {

    public static void main(String[] args) throws IOException {
            simpleSystemOut();
            byteArraySave();

    }

    static void simpleSystemOut() throws IOException {
        Persona persona = new Persona(30,"juan", "perez");

        ObjectOutputStream out = new ObjectOutputStream( System.out );

        out.writeObject( persona );
        out.close();
    }

    static void byteArraySave(){

        Persona persona = new Persona(30, "juan", "perez");

        // Serialización a byte[]
        byte[] serializedData;
        try (ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream)) {

            objectOutputStream.writeObject(persona);
            objectOutputStream.flush();
            serializedData = byteArrayOutputStream.toByteArray();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // Mostrar la longitud del array de bytes como ejemplo
        System.out.println("Serialized data length: " + serializedData.length);

        // Mostrar la longitud del array de bytes como ejemplo
        System.out.println("Serialized data: " + Arrays.toString(serializedData));
    }
}

