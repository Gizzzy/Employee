/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Isaac
 */
public class Employee {
      
    private String EmployeeFirstName;
    private String EmployeeLastName;
    private String EmployeeID;
    private double EmployeeMonthlySalary;

  public Employee(String first, String last, String id, double salary) {
    EmployeeFirstName = first;
    EmployeeLastName  = last;
    EmployeeID = id;
    EmployeeMonthlySalary = salary;
  }
  
  // Getter
  public String getEmployeeFirstName() {
    return EmployeeFirstName;
  }  
  // Setter
  public void setEmployeeFirstName(String firstName) {  
    this.EmployeeFirstName = firstName;
  }
  
   // Getter
  public String getEmployeeLastName() {
    return EmployeeLastName;
  }  
  // Setter
  public void setEmployeeLastName(String lastName) {
    this.EmployeeLastName = lastName;
  }
  
   // Getter
  public String getEmployeeID() {
    return EmployeeID;
  }  
  // Setter
  public void setEmployeeID(String id) {
    this.EmployeeID = id;
  }
  
   // Getter
  public Double getEmployeeMonthlySalary() {
    return EmployeeMonthlySalary;
  }
  // Setter
  public void setEmployeeMonthlySalary(double salary) {
    this.EmployeeMonthlySalary = salary;
  }
  
  public String printEmployeeInfo(){
      return  "\nFirst Name: " + EmployeeFirstName 
              + "\nLast Name: " + EmployeeLastName 
              + "\nID: " + EmployeeID;
              //+ "\nSalary: " + EmployeeMonthlySalary;
  }
  
  public Double printMonthlySalary(){
     return EmployeeMonthlySalary; 
  }
  
  public Double printMonthlySalary(double bonus){
      return EmployeeMonthlySalary + bonus; 
  }
  

    public static void main(String[] args) {
        //1.Create 5 Employee objects and set their names, ids, and salaries. 
        Employee Denno = new Employee("", "", "", 0);
        Denno.setEmployeeFirstName("Dennis");
        Denno.setEmployeeLastName("Gakubu");
        Denno.setEmployeeID("EMP234");
        Denno.setEmployeeMonthlySalary(8000.90);
        
        Employee Alice = new Employee("Alice", "Gathondu", "EMP234", 5000.00);
        Employee Stella = new Employee("Stella", "Mwangi", "EMP234", 70000.00);
        Employee Sam = new Employee("Sam", "Gee", "EMP234", 30000.00);
        
        //2.Declare a Vector or an ArrayList and insert all these 5 objects.
        ArrayList<Employee> arrayOfEmployee = new ArrayList<>();
        arrayOfEmployee.add(Denno);
        arrayOfEmployee.add(Alice);
        arrayOfEmployee.add(Stella);
        arrayOfEmployee.add(Sam);
        
        //3. 3.	Using a loop, print all the employee’s information.
        System.out.println("\nEmployee Details:");
        int i = 1;
        for (Employee employee: arrayOfEmployee) {
            System.out.println("Employee No. "+i+"\n"+employee.printEmployeeInfo()+"\nSalary "+employee.printMonthlySalary()+"\n");
            ++i;
        }
        
        //4.Using a loop, Increase salary (10%) for all the employees
        System.out.println("\nIncreased Salary for ");
        for (Employee employee: arrayOfEmployee) {
            System.out.println(employee.EmployeeFirstName+" "+employee.EmployeeLastName+" is "+employee.printMonthlySalary() * 1.1);
        }
        
        //5.Finally, ask the user for an employee name (ex: Scott), then search this name within all employees
        System.out.println("\n");
        Scanner scanner = new Scanner (System.in);
        System.out.print("Enter Name either First or Last name: ");
        String enteredName = scanner.nextLine();
        int matchFound = 0;
        for (Employee employee: arrayOfEmployee) {
            if(enteredName.toString().toLowerCase().equals(employee.EmployeeFirstName.toString().toLowerCase()) || enteredName.toString().toLowerCase().equals(employee.EmployeeLastName.toString().toLowerCase())){
                System.out.println(employee.printMonthlySalary(1000));
                System.out.println(employee.printEmployeeInfo());
                //System.out.println("The entered name "+enteredName+" the array first name "+employee.EmployeeFirstName+" the array last name "+employee.EmployeeLastName);

                matchFound = 1;
                break;
                //System.exit(0);
            }
        }
        
        //If no match found, print “No employee found” and exit the program
        if(matchFound==0){
         //No employee found
         System.out.println("No employee found"); 
         System.exit(0);
        }
        
                
    
    }
    
}
