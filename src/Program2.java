import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Program2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
        System.out.println("=== TEST 1: seller findById ===");
        Department department = departmentDao.findById(3);
            System.out.println(department);
        System.out.println("=== TEST 3:department findByAll ===");
        List<Department> list;

            list=departmentDao.findAll();
        for (Department obj : list){
            System.out.println(obj);
        }
        System.out.println("=== TEST 4: department insert ===");
       Department newDepartment = new Department(null, "Pesca");
        departmentDao.insert(newDepartment);
        System.out.println("Inserted! new id= "+newDepartment.getId());
        System.out.println("=== TEST 5: department update ===");
        department = departmentDao.findById(3);
        department.setName("Corrida");
        departmentDao.update(department);
        System.out.println("Update Completed!");
        System.out.println("=== TEST 6: department delete ===");
        System.out.println("Enter id for delete teste: ");
        int id =sc.nextInt();
        departmentDao.deleteById(id);
        System.out.println("Delete completed");
    }
    }

