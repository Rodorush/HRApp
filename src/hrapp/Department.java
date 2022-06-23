/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hrapp;

/**
 *
 * @author Rodolfo Pereira de Andrade <rodolfop.andrade@gmail.com>
 */
public class Department {

    private String name;
    private Employee[] emp;

    public Department(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Employee[] getEmp() {
        return emp;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmp(Employee[] emp) {
        this.emp = emp;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Department{");
        sb.append("name=").append(name);
        sb.append(", emp=").append(emp);
        sb.append('}');
        return sb.toString();
    }
}
