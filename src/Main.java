import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Employee e = new Employee();
        String name = scn.nextLine();
        int id = scn.nextInt();

        String dept = scn.next();
        e.setEmpid(id);
        e.setName(name);
        e.setDept(dept);
        System.out.println("Welcome to Simform !");
        System.out.println("Employee ID : " + e.getEmpid());
        System.out.println("Employee name : " + e.getName());
        System.out.println("Employee Dept : " + e.getDept());

    }
}