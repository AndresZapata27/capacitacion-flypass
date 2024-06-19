package com.courses.capacitacionesflypass.sesion2.b.serializationdeserialization;

import java.io.*;
import java.util.Arrays;

public class MainDeserializer {

    public static void main(String[] args) {
        try {
            // Serialización
            Persona persona = new Persona(30, "juan", "perez");

            byte[] serializedData = serialize(persona);
            System.out.println("Serialized data length: " + serializedData.length);
            System.out.println("Serialized data: " + Arrays.toString(serializedData));
            
            // Deserialización
            Persona deserializedPersona = deserialize(serializedData);
            System.out.println("Deserialized Persona: " + deserializedPersona);


        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static byte[] serialize(Object obj) throws IOException {
        try (ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream)) {
            objectOutputStream.writeObject(obj);
            objectOutputStream.flush();
            return byteArrayOutputStream.toByteArray();
        }
    }

    public static <T> T deserialize(byte[] data) throws IOException, ClassNotFoundException {
        try (ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(data);
             ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream)) {
            return (T) objectInputStream.readObject();
        }
    }
}
