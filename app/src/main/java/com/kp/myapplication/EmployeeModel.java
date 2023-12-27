package com.kp.myapplication;

public class EmployeeModel {
    String emp_id;
    String emp_name;
    String emp_role;

    public EmployeeModel(String emp_id, String emp_name, String emp_role) {
        this.emp_id = emp_id;
        this.emp_name = emp_name;
        this.emp_role = emp_role;
    }

    public String getEmp_id() {
        return emp_id;
    }

    public String getEmp_name() {
        return emp_name;
    }

    public String getEmp_role() {
        return emp_role;
    }
}
