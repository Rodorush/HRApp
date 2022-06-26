/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hrapp;

/**
 *
 * @author Rodolfo Pereira de Andrade <rodolfop.andrade@gmail.com>
 */
public class HRApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
		System.out.println("HR App Starts");

                Department dep1 = new Department("Department Education");
                System.out.println(dep1.toString());

                Employee emp1 = new Employee(101, "Ann", 1234.56);
                //System.out.println(emp1.toString());
                dep1.addEmp(emp1);

                Employee emp2 = new Employee(102, "Bob", 1200.34);
                //System.out.println(emp2.toString());
                dep1.addEmp(emp2);
 
                Employee emp3 = new Employee(103, "Ray", 1122.33);
                //System.out.println(emp3.toString());
                dep1.addEmp(emp3);

                dep1.printEmps();
                System.out.println("Total Salary: " + dep1.getTotalSal());
                System.out.println("Average Salary: " + dep1.getAvgSal());
                dep1.printTotalEmp();
                dep1.findById(103);
    }
}
