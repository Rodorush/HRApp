/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hrapp;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 *
 * @author Rodolfo Pereira de Andrade <rodolfop.andrade@gmail.com>
 */
public class Department {

    private String name;
    private Set<Employee> emps;

    public Department(String name) {
        this.name = name;
        this.emps = new HashSet<>();
    }

    public String getName() {
        return name;
    }

    public Set<Employee> getEmp() {
        return emps;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmp(Set<Employee> emps) {
        this.emps = emps;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Department{");
        sb.append("name=").append(name);
        sb.append(", emp=").append(emps);
        sb.append('}');
        return sb.toString();
    }

    public void addEmp(Employee emp) {
        if (this.emps.size() < 10) {
            for (Employee i : emps) {
                if(i.equals(emp)) System.out.println("Employee already exists in this Department!");
                return;
            }
            this.emps.add(emp);
        } else {
            System.out.println("Department already has 10 employees. Impossible adding more.");
        }
    }
}
