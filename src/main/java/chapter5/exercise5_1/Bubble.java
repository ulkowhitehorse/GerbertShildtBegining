package chapter5.exercise5_1;

public class Bubble {
    public static void main(String[] args) {
        int nums[] = {
                99, -10, 100123, 18, -978,
                5623, 463, -9, 287, 49
        };

        PrintMass.printMass(nums);

        Bubble.sortDown(nums);

        PrintMass.printMass(nums);
    }



    public static void sortDown(int[] mass) {
        int t;

        for(int a = 0; a < mass.length; a++) {
            for(int b = mass.length - 1; b >= a; b--) {
                if(mass[a] > mass[b]){
                    t = mass[a];
                    mass[a] = mass[b];
                    mass[b] = t;
                }
            }
        }
    }
}

class PrintMass {
    public static void printMass(int[] mass) {
        System.out.println("\nМассив: ");
        for(int m: mass) {
            System.out.println("element[]: " + m);
        }
        System.out.println("Конец массива.");
    }
}
