public class Main {
    public static void main(String[] args) {
        System.out.println("Боксеры");
        var boxer1 = 78.2;
        System.out.println("Первый боксер " + boxer1 + "кг. ");
        var boxer2 = 82.7;
        System.out.println("Второй боксер " + boxer2 + "кг. ");
        var totalWeight = boxer1 + boxer2;
        System.out.println("Общий вес " + totalWeight + "кг. ");
        var weightDifference = boxer2 - boxer1;
        System.out.println("Разница в весе " + weightDifference + "кг. ");
        var preponderance = boxer2 % boxer1;
        System.out.println("Второй боксер тяжилее первого на " + preponderance + " кг.");

    }
}
