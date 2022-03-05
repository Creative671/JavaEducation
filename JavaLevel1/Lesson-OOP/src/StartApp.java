public class StartApp {
    public static void main(String[] args){
        Employee [] employeeArrays = new Employee[5];
        employeeArrays[0] = new Employee("Петр Ф. В.", "QA", "petr@test.ru", "8123123123", 32342, 45);
        employeeArrays[1] = new Employee("Анастасия А. Я.", "Product", "nastasya@test.ru", "984375345", 32342, 34);
        employeeArrays[2] = new Employee("Михаил У. А.", "QA", "michail@test.ru", "2340981234", 32342, 25);
        employeeArrays[3] = new Employee("Анатолий Я. Ф.", "QA Manual", "anatoliy@test.ru", "34589723", 32342, 25);
        employeeArrays[4] = new Employee("Светлана М. М.", "Programmer", "svetlana@test.ru", "23984765823", 32342, 39);
        Employee.getInformation(employeeArrays);
    }
}
