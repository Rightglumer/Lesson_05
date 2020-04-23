public class Employee {

    String FIO;
    String Position;
    String Email;
    String Phone;
    Double Salary;
    int Age;

    public Employee(String nFIO, String nPosition, String nEmail, String nPhone, Double nSalary, int nAge){
        this.Age = nAge;
        this.Email = nEmail;
        this.FIO = nFIO;
        this.Phone = nPhone;
        this.Position = nPosition;
        this.Salary = nSalary;
    }

    public void printInfo(){
        System.out.println("\n--------------------------------------");
        System.out.printf("Info about: %s%n", FIO);
        System.out.printf("Position: %s. Age: %d%n", Position, Age);
        System.out.printf("Email: %s; Phone: %s%n", Email, Phone);
        System.out.printf("Salary: %.2f%n", Salary);
        System.out.println("--------------------------------------");
    }
}
