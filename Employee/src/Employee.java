/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Isaac
 */
public class Employee {
      
    private String EmployeeFirstName;
    private String EmployeeLastName;
    private String EmployeeID;
    private double EmployeeMonthlySalary;

  public Employee(String first, String last, String id, double salary ) {
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
  public void setEmployeeMonthlySalary(Float salary) {
    this.EmployeeMonthlySalary = salary;
  }
  
  public void printEmployeeInfo(){
      System.out.println("Employee Details: "
              + "\nFirst Name " + EmployeeFirstName 
              + "\nLast Name " + EmployeeLastName 
              + "\nID " + EmployeeID 
              + "\nSalary " + EmployeeMonthlySalary);
  }
  
  public void printMonthlySalary(){
     System.out.println(EmployeeFirstName + " " + EmployeeLastName + " monthly Salary: " + EmployeeMonthlySalary); 
  }
  
  public void printMonthlySalary(double bonus){
      System.out.println(EmployeeFirstName + " " + EmployeeLastName + " cumulative salary: " + EmployeeMonthlySalary + bonus); 
  }


    public static void main(String[] args) {
        Employee Denno = new Employee("Dennis", "Gakubu", "EMP234", 7000.40);
        Denno.setEmployeeFirstName("Sam");
        Denno.setEmployeeLastName("Gee");
        Denno.printEmployeeInfo();
    }
    
}
