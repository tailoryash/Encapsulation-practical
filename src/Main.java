import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Employee e = new Employee();

        System.out.print("Enter Employee name : ");
        String name = scn.nextLine();
        e.setName(name);

        System.out.print("Enter Employee Id : ");
        int id = scn.nextInt();
        e.setEmpid(id);

        System.out.print("Enter Employee Dept : ");
        String dept = scn.next();
        e.setDept(dept);

        System.out.println("Welcome to Simform Family !!");
        System.out.println("Employee ID : " + e.getEmpid());
        System.out.println("Employee name : " + e.getName());
        System.out.println("Employee Dept : " + e.getDept());

    }
}