public class Employee {
    private String fio;
    private String position;
    private String email;
    private String number;
    private int salary;
    private int age;

    Employee(String fio, String number){
        this.fio = fio;
        this.number = number;
    }

    Employee(String fio, String position, String email, String number, int salary, int age){
        this(fio, number);
        this.position = position;
        this.email = email;
        this.number = number;
        this.salary = salary;
        this.age = age;
    }

//    Метод для вывода информации по созданному объкту
    public static void getInformation(Employee employee){
        System.out.println(
                "ФИО: " + employee.getFio() + "\n" +
                        "Позиция: " + employee.getPosition() + "\n" +
                        "Email: " + employee.getEmail() + "\n" +
                        "Номер телефона: " + employee.getNumber() + "\n" +
                        "Зарплата: " + employee.getSalary() + "\n" +
                        "Возраст: " + employee.getAge()
        );
        System.out.println();
    }

    public String getFio() {
        return fio;
    }

    public String getPosition() {
        return position;
    }

    public String getEmail() {
        return email;
    }

    public String getNumber() {
        return number;
    }

    public int getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }
}
