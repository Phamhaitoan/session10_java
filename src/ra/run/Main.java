package ra.run;

import ra.config.InputMethods;
import ra.design.CRUD;
import ra.implement.EmployeeImplement;

public class Main {
    public static CRUD employeeImplement = new EmployeeImplement();

    public static void main(String[] args) {
        while (true){
            System.out.println("--------------------MENU-------------------");
            System.out.println("1. Thêm mới 1 nhân viên ");
            System.out.println("2. Hiển thị danh sách thông tin nhân viên ");
            System.out.println("3.Xem thông tin nhân viên theo mã nhân viên");
            System.out.println("4.Cập nhật thông tin nhân viên");
            System.out.println("5.Xóa nhân viên");
            System.out.println("6.Tìm kiếm nhân viên theo tên (tương đối)");
            System.out.println("7.Sắp xếp và hiển thị danh sách nhân viên theo tên từ a - z");
            System.out.println("8.Thoát");
            System.out.println("Nhạp chuc năng");
            byte choice = InputMethods.getByte(); // -128 -> 127
            switch (choice){
                case 1:
                    employeeImplement.create();
                    break;
                case 2:
                    employeeImplement.display();
                    break;
                case 3:
                    employeeImplement.readEmployee();
                    break;
                case 4:
                    employeeImplement.edit();
                    break;
                case 5:
                    employeeImplement.delete();
                    break;
                case 6:
                    employeeImplement.search();
                    break;
                case 7:
                     employeeImplement.sort();
                    break;
                case 8:
                    System.out.println("Thoat");
                    return;
                default:
                    System.err.println("Nhap sai");
            }

        }
    }
}