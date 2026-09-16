package net.majid.behavioral.iterator;

class EmployeeCollection {

    private final Employee[] employees;

    public EmployeeCollection(Employee[] employees) {
        this.employees = employees;
    }

    public Iterator<Employee> iterator() {
        return new EmployeeIterator(employees);
    }
}
