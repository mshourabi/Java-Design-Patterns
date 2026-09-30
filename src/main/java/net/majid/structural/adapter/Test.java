package net.majid.structural.adapter;

public class Test {
    public static void main(String[] args) {

        EmployeeDao dto = new EmployeeDao();

        EmployeeDto employeeDto = new EmployeeDto(1,"Majid", "Shourabi", "0998989682");

        EmployeeDtoAdapter employeeDtoAdapter = new EmployeeDtoAdapter(employeeDto);

        dto.save(employeeDtoAdapter);

    }
}
