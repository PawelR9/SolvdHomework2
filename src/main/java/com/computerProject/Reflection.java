package com.computerProject;

import com.computerProject.devices.Laptop;
import com.computerProject.devices.Warranty;
import com.computerProject.devices.CPU;
import com.computerProject.devices.GPU;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Reflection {

    public static void main(String[] args) {
        try {
            Class<?> laptopClass = Class.forName("com.computerProject.devices.Laptop");

            System.out.println("Class: " + laptopClass.getName());
            System.out.println("Modifiers: " + Modifier.toString(laptopClass.getModifiers()));

            System.out.println("\nFields:");
            Field[] fields = laptopClass.getDeclaredFields();
            for (Field field : fields) {
                System.out.println("Field: " + field.getName());
                System.out.println("Type: " + field.getType().getName());
                System.out.println("Modifiers: " + Modifier.toString(field.getModifiers()));
                System.out.println();
            }

            System.out.println("\nConstructors:");
            Constructor<?>[] constructors = laptopClass.getDeclaredConstructors();
            for (Constructor<?> constructor : constructors) {
                System.out.println("Constructor: " + constructor.getName());
                System.out.println("Parameters: ");
                Class<?>[] parameterTypes = constructor.getParameterTypes();
                for (Class<?> param : parameterTypes) {
                    System.out.println("  " + param.getName());
                }
                System.out.println("Modifiers: " + Modifier.toString(constructor.getModifiers()));
                System.out.println();
            }

            System.out.println("\nMethods:");
            Method[] methods = laptopClass.getDeclaredMethods();
            for (Method method : methods) {
                System.out.println("Method: " + method.getName());
                System.out.println("Return type: " + method.getReturnType().getName());
                System.out.println("Parameters: ");
                Class<?>[] methodParameterTypes = method.getParameterTypes();
                for (Class<?> param : methodParameterTypes) {
                    System.out.println("  " + param.getName());
                }
                System.out.println("Modifiers: " + Modifier.toString(method.getModifiers()));
                System.out.println();
            }

            Constructor<?> constructor = laptopClass.getDeclaredConstructor(
                    String.class, String.class, double.class, String.class, CPU.class, GPU.class, Warranty.class);
            Warranty warrantyInstance = new Warranty();
            CPU cpuInstance = new CPU("AMD Ryzen™ 5 5500H", 4);
            GPU gpuInstance = new GPU("NVIDIA GeForce RTX 2050", 4);
            Laptop laptopInstance = (Laptop) constructor.newInstance(
                    "Lenovo", "IdeaPad", 15.6, "OLED", cpuInstance, gpuInstance, warrantyInstance);

            Method displayInfoMethod = laptopClass.getMethod("displayInfo");
            displayInfoMethod.invoke(laptopInstance);

            Method toStringMethod = laptopClass.getMethod("toString");
            String result = (String) toStringMethod.invoke(laptopInstance);
            System.out.println("\nResult of toString method: " + result);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
