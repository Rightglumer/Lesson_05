public class Main {

    public static void main(String[] args) {
        Employee[] Employers = new Employee[5];

        Employers[0] = new Employee("Буратино", "Кукла", "buratino@kbc.ru", "1-24-37", 0.0, 1);
        Employers[1] = new Employee("Папа Карло", "Создатель", "fatherKarlo@kbc.ru", "1-24-38", 5.0, 64);
        Employers[2] = new Employee("Карабас Барабас", "Акционер", "kb@kbc.ru", "1-24-01", 100.0, 42);
        Employers[3] = new Employee("Тортилла", "Черепаха", "oldWoman@kbc.ru", "1-24-99", 0.0, 357);
        Employers[4] = new Employee("Дуремар", "Подхалим", "iloveKB@kbc.ru", "", 10.0, 40);

        for (int i = 0; i < Employers.length; i++){
            if (Employers[i].Age >= 40) {
                Employers[i].printInfo();
            }
        }
    }
}
