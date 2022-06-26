/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hrapp;

import java.util.LinkedHashSet;
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
        this.emps = new LinkedHashSet<>();
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
        sb.append("Department: ").append(name);
        return sb.toString();
    }

    public void addEmp(Employee emp) {
        if (this.emps.size() < 10) {
            for (Employee i : emps) {
                if (i.equals(emp)) {
                    System.out.println("Employee already exists in this Department!");
                    return;
                }

            }
            this.emps.add(emp);
            //System.out.println("Employee added sucessfully!");
        } else {
            System.out.println("Department already has 10 employees. Impossible adding more.");
        }
    }

    public void printEmps() {
        //int i = 0;
        for (Employee e : emps) {
            //i++;
            //if(i > 1) break;
            System.out.println(e.toString());

            //if(i != null) System.out.println(i);
            //System.out.println((i.getClass()+1)+"\n"+i.toString()+"\n\n");
        }
    }

    public void printTotalEmp() {
        System.out.println("Total Employees: " + emps.size());
    }

    public double getTotalSal() {
        double total = 0;
        for (Employee e : emps) {
            total += e.getSalary();
        }
        return total;
    }

    public double getAvgSal() {
        double avg = 0;
        for (Employee e : emps) {
            avg += e.getSalary();
        }
        avg = avg / emps.size();
        return avg;
    }

    public void findById(int id) {
        for (Employee e : emps) {
            //System.out.println("Id: "+e.getId());
            if (e.getId() == id) {
                System.out.println("Employee " + id + " is " + e.getName());
                return;
            }
        }
        throw new NullPointerException("Employee didn't found!");
    }
}
