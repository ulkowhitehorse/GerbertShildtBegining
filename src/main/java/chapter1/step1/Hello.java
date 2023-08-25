package chapter1.step1;

import java.util.Scanner;

public class Hello {
    int count = 1;
    int $count = 2;
    int count27 = 3;
    final float forceOfGravity = 0.17f;
    private float weight;
//    int 67count = 4;

    public Hello (float weight1) {
        setWeight(weight1);
    }

    void setWeight(float weight1) {
        weight = weight1;
    }

    float calculateWeightOnTheMoon() {
        return forceOfGravity * weight;
    }

    @Override
    public String toString() {
        return "Hello{" +
                "count=" + count +
                ", $count=" + $count +
                ", count27=" + count27 +
                '}';
    }

    public static void main(String[] args) {
        System.out.println("hello, world");
        System.out.println("Введите ваш вес: ");
        Scanner console = new Scanner(System.in);
        float t = console.nextFloat();
        Hello h = new Hello(t);
        System.out.println("Ваш вес на луне был бы: " + h.calculateWeightOnTheMoon());
    }
}
