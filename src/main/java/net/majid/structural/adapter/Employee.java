package net.majid.structural.adapter;

public class Employee {

    private long id;
    private String fullName;
    private String code;

    public Employee() {
    }

    public Employee(long id, String fullName, String code) {
        this.id = id;
        this.fullName = fullName;
        this.code = code;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
