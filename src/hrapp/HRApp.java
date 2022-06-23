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
		System.out.println("HR App Starts... Initialization App...");
		Department dep1 = new Department("Sales");
		System.out.println(dep1.toString());
                
                Employee emp1 = new Employee(100, "Alex", 5000, dep1);
                Employee emp2 = new Employee(100, "Alex", 5000, dep1);
                dep1.addEmp(emp1);
                dep1.addEmp(emp2);
                System.out.println(dep1.getEmp().size());
    }
}
