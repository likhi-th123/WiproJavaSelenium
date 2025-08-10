package newpack;

public class EmpImp {
    public static void main(String[] args) {
        Emp emp1 = new Emp(101, "Likhith", "HR", 50000);
        System.out.println(emp1);

        Emp emp2 = new Emp(102, "Krish", "IT", 60000);
        System.out.println(emp2);

        Emp emp3 = new Emp(103, "Pavan", "Finance", 55000);
        System.out.println(emp3);

        Emp emp4 = new Emp(104, "Kiara", "Marketing", 58000);
        System.out.println(emp4);

        Emp emp5 = new Emp(105, "Ravi", "Testing", 52000);
        System.out.println(emp5);
        
        Emp emp6 = new Emp();
        emp6.setId(106);
        emp6.setName("Chintu");
        emp6.setDepartment("IT");
        emp6.setSalary(62000);

        Emp emp7 = new Emp();
        emp7.setId(107);
        emp7.setName("Lucky");
        emp7.setDepartment("Development");
        emp7.setSalary(50000);

        Emp emp8 = new Emp();
        emp8.setId(108);
        emp8.setName("Pavan");
        emp8.setDepartment("HR");
        emp8.setSalary(57000);

        Emp emp9 = new Emp();
        emp9.setId(109);
        emp9.setName("Kiara");
        emp9.setDepartment("Testing");
        emp9.setSalary(49000);

        Emp emp10 = new Emp();
        emp10.setId(110);
        emp10.setName("loki");
        emp10.setDepartment("Marketing");
        emp10.setSalary(52000);

        System.out.println(emp6);
        System.out.println(emp7);
        System.out.println(emp8);
        System.out.println(emp9);
        System.out.println(emp10);
    }
        
    }
    