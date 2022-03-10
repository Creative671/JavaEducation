public class Employee {
    public String fio;
    public String position;
    public String email;
    public String number;
    public int salary;
    public int age;

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
    public void getInformation(){
        System.out.println(
                "ФИО: " + fio + "\n" +
                        "Позиция: " + position + "\n" +
                        "Email: " + email + "\n" +
                        "Номер телефона: " + number + "\n" +
                        "Зарплата: " + salary + "\n" +
                        "Возраст: " + age
        );
        System.out.println();
    }
}
