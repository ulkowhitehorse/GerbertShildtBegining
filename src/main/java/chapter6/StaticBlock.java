package chapter6;

public class StaticBlock {
    static double rootOf2;
    static double rootOf3;

    // Статический блок
    // выполняется при загрузке класса
    static {
        System.out.println("Внутри статического блока");
        rootOf2 = Math.sqrt(2.0);
        rootOf3 = Math.sqrt(3.0);
    }

    StaticBlock(String msg) {
        System.out.println(msg);
    }
}
