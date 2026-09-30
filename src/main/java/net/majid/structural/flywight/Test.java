package net.majid.structural.flywight;

import net.majid.structural.flywight.model.Department;

public class Test {
    public static void main(String[] args) {
        DepartmentRepository departmentRepository = new DepartmentRepository();


        Department department = departmentRepository.findById(10L);
        System.out.println(department.hashCode());

        department =  departmentRepository.findById(10L);
        System.out.println(department.hashCode());

        department =  departmentRepository.findById(20L);
        System.out.println(department.hashCode());

    }
}
