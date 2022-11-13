package com.dmdev.tasks.lesson7.example;

import java.lang.invoke.MethodHandle;

public class Demo {
    public static void main(String[] args) {
        Methods.staticPrintName("Artem");
        var surname = Methods.SURNAME;

        var methodsObject = new Methods();
        var age = methodsObject.age;
        methodsObject.nonStaticPrintName("Artem");
    }
}
