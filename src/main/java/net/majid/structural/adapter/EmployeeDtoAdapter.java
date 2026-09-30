package net.majid.structural.adapter;

public class EmployeeDtoAdapter extends Employee {

    private EmployeeDto employeeDto;

    public EmployeeDtoAdapter(EmployeeDto employeeDto) {
        this.employeeDto = employeeDto;
    }

    @Override
    public long getId() {
        return this.employeeDto.getId();
    }

    @Override
    public String getFullName() {
        return this.employeeDto.getFirstName() + " " + this.employeeDto.getLastName();
    }

    @Override
    public String getCode() {
        return this.employeeDto.getCode();
    }

}
