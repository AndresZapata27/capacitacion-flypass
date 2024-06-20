package com.courses.capacitacionesflypass.sesion2.j.designpattern.estructurales;

// Interfaz del sujeto
interface Image {
    void display();
}

// Sujeto real
class RealImage implements Image {
    private String filename;

    public RealImage(String filename) {
        this.filename = filename;
        loadImageFromDisk();
    }

    private void loadImageFromDisk() {
        System.out.println("Loading " + filename);
    }

    @Override
    public void display() {
        System.out.println("Displaying " + filename);
    }
}

// Proxy
class ProxyImage implements Image {
    private RealImage realImage;
    private String filename;

    public ProxyImage(String filename) {
        this.filename = filename;
    }

    @Override
    public void display() {
        System.out.println("esto es un comportamiento adicional antes de realizar la accion principal");
        if (realImage == null) {
            realImage = new RealImage(filename);
        }
        realImage.display();

        System.out.println("esto es un comportamiento adicional despues de realizar la accion principal");
    }
}

// Cliente
public class ProxyExample {
    public static void main(String[] args) {
        Image image = new ProxyImage("test.jpg");

        // Carga la imagen desde el disco
        image.display();
        System.out.println("");

        // No carga la imagen desde el disco
        image.display();
    }
}
