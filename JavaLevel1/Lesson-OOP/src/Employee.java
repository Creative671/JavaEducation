public class Employee {
    String fio;
    String position;
    String email;
    String number;
    int salary;
    int age;

    Employee(String fio, String position, String email, String number, int salary, int age){
        this.fio = fio;
        this.position = position;
        this.email = email;
        this.number = number;
        this.salary = salary;
        this.age = age;
    }

//    Метод для вывода информации по созданному объкту
    public static void getInformation(Employee [] employee){
        for (int i = 0; i < employee.length; i++){
            System.out.println(
                    "ФИО: " + employee[i].fio + "\n" +
                            "Позиция: " + employee[i].position + "\n" +
                            "Email: " + employee[i].email + "\n" +
                            "Номер телефона: " + employee[i].number + "\n" +
                            "Зарплата: " + employee[i].salary + "\n" +
                            "Возраст: " + employee[i].age
            );
            System.out.println();
        }
    }
}
