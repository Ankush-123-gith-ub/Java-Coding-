
public class company {
    private static String companyName;
    private static int totalEmployees = 0;
    private String name;
    private final int id;
    private String designation;

    public company(String name, int id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        totalEmployees++;
    }

    public static void setCompanyName(String name) { companyName = name; }
    public static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }

    public void displayEmployeeDetails() {
        if (this instanceof company) {
            System.out.println("Company Name: " + companyName);
            System.out.println("Employee ID: " + id);
            System.out.println("Name: " + name);
            System.out.println("Designation: " + designation);
        } else {
            System.out.println("The object is not an instance of the Employee class.");
        }
    }

    public String getName() { return name; }
    public int getId() { return id; }
    public String getDesignation() { return designation; }

    public static void main(String[] args) {
        company.setCompanyName("Tech Solutions Inc.");
        company emp1 = new company("Thamarai", 101, "Software Engineer");
        company emp2 = new company("Rohan", 102, "Project Manager");
        company.displayTotalEmployees();
        emp1.displayEmployeeDetails();
        emp2.displayEmployeeDetails();
    }
}
