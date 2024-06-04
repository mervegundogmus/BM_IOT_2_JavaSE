package com.mgundogmus.day_1;

// Generics --> Depo
// Meyve Kutusu
// Kitap kutusu

public class Generics {
    //psvm duası
    public static void main(String[] args) {
        Box<Apple> appleBox = new Box<>();
        appleBox.set(new Apple("Green Apple"));
        System.out.println("Kutunun içeriği:" + appleBox.get().getName());
        //System.out.println("Kutunun içeriği:" + appleBox.get().getColor());
        //System.out.println("Kutunun içeriği:" + "Green Apple");

    }
}

// ctrl + alt + L --> formatLa

class Box<T> {
    private T t;

    public void set(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }

}

class Apple {
    private String name;
    private String color;

    public Apple(String name) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

