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
        var totalWorkingHours = 640;
        System.out.println("Общее рабочее время в компании " + totalWorkingHours + " часов");
        var workingHoursOfOneEmployee = 8;
        System.out.println("Рабочее время одного сотрудника " + workingHoursOfOneEmployee + " часов");
        var numberOfEmployees = totalWorkingHours / workingHoursOfOneEmployee;
        System.out.println("Общее число сотрудников в компании " + numberOfEmployees + " человек.");
        var newEmployees = 94;
        System.out.println("Новых сотрудников " + newEmployees + " человека.");
        var newTotalNumberOfEmployees = numberOfEmployees + newEmployees;
        System.out.println("Новое количество сотрудников " + newTotalNumberOfEmployees + " человека.");
        var newTotalWorkingHours = newTotalNumberOfEmployees * workingHoursOfOneEmployee;
        System.out.println("Общее количество рабочих часов в компании " + newTotalWorkingHours + " часов.");
        var workingHours = newTotalWorkingHours / newTotalNumberOfEmployees;
        System.out.println("Если в компании работает всего 174 человека, то всего 1392 часа может быть поделено между сотрудниками. В итоге получим  " + workingHours + " часов на одного человека");

    }
}
