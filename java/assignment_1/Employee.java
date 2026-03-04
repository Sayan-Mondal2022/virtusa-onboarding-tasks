/*
    Create class Employee:
        -> id
        -> name
        -> static companyName
        -> static block to initialize companyName
        -> static method to change company name
        -> Display details of employees
*/

public class Employee {
    public String id, name;
    public static String companyName;

    static {
        companyName = "ABC inc";
    }

    public static void changeCompanyName(String newCompanyName) {
        System.out.println("Company name has been changed from '" + companyName + "' to '" + newCompanyName + "'\n");
        companyName = newCompanyName;
    }

    public void displayEmployeeDetails() {
        System.out.printf("Employee Id: %s\nEMployee name: %s\nCompany Name: %s\n\n", this.id, this.name, companyName);
    }

    public static void main(String[] args) {
        Employee e1 = new Employee();

        e1.id = "EP045";
        e1.name = "Sayan";

        e1.displayEmployeeDetails();

        Employee.changeCompanyName("XYZ inc");

        e1.displayEmployeeDetails();
    }
}
