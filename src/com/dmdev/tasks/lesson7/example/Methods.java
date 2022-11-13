package com.dmdev.tasks.lesson7.example;

public class Methods {

    public static String SURNAME = "Kamelchukov";
    public int age = 21;
    //Данный метод относится к классу Methods непосредственно. Т.е., неважно создан ли его экземпляр.
    public static void staticPrintName(String name) {
        System.out.println(name);
    }
    //Данный метод относится к экземпляру ( или созданному объекту) данного класса.
    public void nonStaticPrintName(String name) {
        System.out.println(name);
    }
}
