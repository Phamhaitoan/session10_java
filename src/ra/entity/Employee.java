package ra.entity;

import ra.config.InputMethods;

import java.time.Instant;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Pattern;

import static java.util.regex.Pattern.matches;

public class Employee {
    private int EmployeeID;
    private String EmployeeName;
    private Date dayOfBirth;
    private String Adress;
    private int NumberPhone;
    private double basicSalary;
    private double productivityCoefficient;

    public Employee() {
    }

    public Employee(int employeeID, String employeeName, Date dayOfBirth, String adress, int numberPhone, double basicSalary, double productivityCoefficient) {
        EmployeeID = employeeID;
        EmployeeName = employeeName;
        this.dayOfBirth = dayOfBirth;
        Adress = adress;
        NumberPhone = numberPhone;
        this.basicSalary = basicSalary;
        this.productivityCoefficient = productivityCoefficient;
    }

    public int getEmployeeID() {
        return EmployeeID;
    }

    public void setEmployeeID(int employeeID) {
        EmployeeID = employeeID;
    }

    public String getEmployeeName() {
        return EmployeeName;
    }

    public void setEmployeeName(String employeeName) {
        EmployeeName = employeeName;
    }

    public Date getDayOfBirth() {
        return dayOfBirth;
    }

    public void setDayOfBirth(Date dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    public String getAdress() {
        return Adress;
    }

    public void setAdress(String adress) {
        Adress = adress;
    }

    public int getNumberPhone() {
        return NumberPhone;
    }

    public void setNumberPhone(int numberPhone) {
        NumberPhone = numberPhone;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public double getProductivityCoefficient() {
        return productivityCoefficient;
    }

    public void setProductivityCoefficient(double productivityCoefficient) {
        this.productivityCoefficient = productivityCoefficient;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "EmployeeID=" + EmployeeID +
                ", EmployeeName='" + EmployeeName + '\'' +
                ", dayOfBirth=" + dayOfBirth +
                ", Adress='" + Adress + '\'' +
                ", NumberPhone=" + NumberPhone +
                ", basicSalary=" + basicSalary +
                ", productivityCoefficient=" + productivityCoefficient +
                '}';
    }


    public void inputData(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập mã nhân viên");
        EmployeeID = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập tên nhân viên");
        EmployeeName = scanner.nextLine();
        System.out.println("nhập ngày sinh nhân viên");
        dayOfBirth = InputMethods.getDate();
        System.out.println("nhập địa chỉ ");
        Adress = scanner.nextLine();
        System.out.println("nhập số điện thoại");
        NumberPhone = Integer.parseInt(scanner.nextLine());
//        public NumberPhone = matches((84|0[3|5|7|8|9])+([-9]{8}));
        System.out.println("hãy nhập hệ số lương cơ bản");
        basicSalary = Double.parseDouble(scanner.nextLine());
        System.out.println("hãy nhập hệ số nắng suất");
        productivityCoefficient = Double.parseDouble(scanner.nextLine());

    }


    public void displayData(){
        System.out.println("Employee{" +
                "EmployeeID=" + EmployeeID +
                ", EmployeeName='" + EmployeeName + '\'' +
                ", dayOfBirth=" + dayOfBirth +
                ", Adress='" + Adress + '\'' +
                ", NumberPhone=" + NumberPhone +
                ", basicSalary=" + basicSalary +
                ", productivityCoefficient=" + productivityCoefficient +
                '}');
    }


}
