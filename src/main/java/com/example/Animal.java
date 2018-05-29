package com.example;

public class Animal {
    String name;
    String voice;
    int age;

    public Animal(String name, String voice, int age) {
        this.name = name;
        this.voice = voice;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getVoice() {
        return voice;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVoice(String voice) {
        this.voice = voice;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        Animal animal = new Animal("Dog", "Woof", 5);
        System.out.println(animal.hashCode());
        System.out.println(animal.getAge());

        animal.setAge(4);
        System.out.println(animal.getAge());
        System.out.println(animal.hashCode());
    }
}