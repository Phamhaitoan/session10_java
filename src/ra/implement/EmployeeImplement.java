package ra.implement;

import ra.design.CRUD;
import ra.entity.Employee;

import java.util.Scanner;

public class EmployeeImplement implements CRUD {
    private static Employee[] employee = new Employee[100];
    private int size = 0;


    @Override
    public void create() {
        if (size == 100){
                System.err.println("mảng đầy");
        }else {

                Employee newEmployee = new Employee();
                newEmployee.inputData();
                // thêm vào mang
                employee[size] = newEmployee;
                size++; // tăng số lương
        }

    }

    @Override
    public void display() {
        if (size == 0){
                System.err.println("mảng ko có nhân viên");
        }else {
            for (int i = 0; i < size; i++) {
                    System.out.println(employee[i]);
            }
        }
    }

    @Override
     public void readEmployee(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập ID nhân viên cần xem");
        int employeeID = Integer.parseInt(scanner.nextLine());
        if (size==0){
            System.out.println("không có nhân viên nào");
        } else {
            for (int i = 0; i < size; i++) {
                if ( employee[i].getEmployeeID()== employeeID) {
                    employee[i].displayData();
                } else {
                    System.out.println("xin mời nhập lại");
                }
            }
        }
    }

    @Override
    public void edit() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập ID nhân viên cần sửa thông tin");
        int employeeID = Integer.parseInt(scanner.nextLine());
        if (size==0){
            System.out.println("không có nhân viên nào");
        } else {
            for (int i = 0; i < size; i++) {
                if ( employee[i].getEmployeeID()== employeeID) {
                    employee[i].inputData();
                } else {
                    System.out.println("xin mời nhập lại");
                }
            }
        }
    }

    @Override
    public void delete() {
        int index = -1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập vào id càn xóa");
        int employeeID = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < size; i++) {
            if (size == 0) {
                System.out.println("không có nhan viên nào");
            } else {
                for (int j = 0; j < size; j++) {
                    if (employee[j].getEmployeeID() == employeeID) {
                        index = j;
                        break;
                    } else {
                        System.out.println("không tôn tại id");;
                    }
                }
            }
        }
        if (index != -1) {
            for (int i = index; i < size - 1; i++) {
                employee[i] = employee[i + 1];
            }
            employee[size - 1] = null;
            size--;
        } else {
            System.out.println("không co gi để xóa");
        }
    }
    @Override
    public void search (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập vào tên nhân viên cần tìm kiếm");
        String employeeName = scanner.nextLine();
        if(size == 0){
                System.out.println("không có nhân viên nào");
        } else {
            for (int i = 0; i < size; i++) {
                if (employee[i].getEmployeeName().toLowerCase().equals(employeeName)){
                      employee[i].displayData();
                      break;
                } else {
                    System.out.println("không tìm thấy nhân viên");
                }
            }
        }
    }

    @Override
    public void sort(){
        for (int i = 0; i < size ; i++) {
            for (int j = i+1; j < size; j++) {
                   if (employee[i].getEmployeeName().compareTo(employee[j].getEmployeeName()) > 0){
                            Employee up = employee[i];
                            employee[i]=employee[j];
                            employee[j] =  up;
                   }
            }
        }
     display();
    }
}
