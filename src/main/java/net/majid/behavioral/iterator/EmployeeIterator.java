package net.majid.behavioral.iterator;

class EmployeeIterator implements Iterator<Employee> {

    private final Employee[] employees;

    private int index = 0;

    public EmployeeIterator(Employee[] employees) {
        this.employees = employees;
    }

    @Override
    public boolean hasNext() {
        return index < employees.length;
    }

    @Override
    public Employee next() {
        return employees[index++];
    }
}
