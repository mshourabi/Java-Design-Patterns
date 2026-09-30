package net.majid.structural.flywight;

import net.majid.structural.flywight.model.Department;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class DepartmentRepository {

    private Map<Long, Department> departmentMap = new ConcurrentHashMap<>();

    public Department findById(Long id) {
        if (departmentMap.containsKey(id)) {
            return departmentMap.get(id);
        } else {

            // find Department from DataBase
            Department department = new Department(id, "Department-" + id);


            departmentMap.put(id, department);
            return department;
        }

    }
}
