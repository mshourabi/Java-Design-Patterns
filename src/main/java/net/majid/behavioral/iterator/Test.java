package net.majid.behavioral.iterator;

public class Test {
    public static void main(String[] args) {

        EmployeeCollection collection = new EmployeeCollection(
                        new Employee[]{
                                new Employee("Ali"),
                                new Employee("Reza"),
                                new Employee("Majid")
                        });


        Iterator<Employee> iterator = collection.iterator();
        while (iterator.hasNext()) {
            Employee employee = iterator.next();
            System.out.println(employee.getName());
        }
    }
}
