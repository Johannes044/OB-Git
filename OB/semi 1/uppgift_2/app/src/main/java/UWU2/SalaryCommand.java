package UWU2;

public class SalaryCommand implements Command {
    private int  employeeId;
    private double newSalary;

    public SalaryCommand(int  employeeId,double newSalary){
        this.employeeId =  employeeId;
        this.newSalary = newSalary;
    }

    @Override
    public void execute(Database db, PaymentSystem ps) {
        boolean ok = db.setSalary(employeeId,newSalary);

        if (!ok) {
            System.out.println("Fel: Kunde inte uppdatera lön för anställd " + employeeId);
        } 
    }
}
