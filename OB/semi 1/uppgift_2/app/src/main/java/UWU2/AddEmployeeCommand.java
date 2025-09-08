package UWU2;

public class AddEmployeeCommand implements Command{
    private int employeeId;
    private String name;
    private double salary;
    private String accountNumber;

    public AddEmployeeCommand(int employeeId, String name, double salary, String accountNumber){
        this.employeeId = employeeId;
        this.name = name;
        this.salary = salary;
        this.accountNumber = accountNumber;
    }

    @Override
    public void execute(Database db, PaymentSystem ps) {
        boolean added = db.addEmployee(employeeId, name, accountNumber);
        if (added) {
            db.setSalary(employeeId, salary);
        }else {
            System.out.println("Fel: Kunde inte lägga till anställd " + employeeId);
        }
    }

}
