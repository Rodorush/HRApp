/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hrapp;

import java.util.Objects;

/**
 *
 * @author Rodolfo Pereira de Andrade <rodolfop.andrade@gmail.com>
 */
public class Employee {

    private int id;
    private String name;
    private double salary;
    private Department dep;

    public Employee(int id, String name, double salary, Department dep) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.dep = dep;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public Department getDep() {
        return dep;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setDep(Department dep) {
        this.dep = dep;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Employee: ").append(id);
        sb.append(" ").append(name);
        sb.append(" ").append(salary);
        return sb.toString();
    }

    /**
     *
     * @param obj
     * @return
     */
    @Override
    public boolean equals(Object obj) {
          
    if(this == obj) return true;
    if(obj == null || obj.getClass()!= this.getClass()) return false;
          
        // type casting of the argument. 
        Employee emp = (Employee) obj;
        return (this.id == emp.id && this.name.equals(emp.name));
    }
    
    /*
    public String getEmpById(int id){
        return getName();
    }
     */

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + this.id;
        hash = 23 * hash + Objects.hashCode(this.name);
        return hash;
    }
}
