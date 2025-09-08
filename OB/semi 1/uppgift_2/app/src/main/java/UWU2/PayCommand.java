package UWU2;

public class PayCommand implements Command {
    private int  employeeId;
    private static final String COMPANY_ACCOUNT = "60-220-816";

    public PayCommand(int  employeeId){
        this.employeeId =  employeeId;
    }

    @Override
    public void execute(Database db, PaymentSystem ps) {
        double salary = db.getSalary(employeeId);
        String toAccount = db.getAccountNumber(employeeId);

        if (toAccount != null) {
            ps.transfer(COMPANY_ACCOUNT,toAccount,salary);
        } else {
            System.out.println("Fel: Anställd " + employeeId + " finns inte");
        }

    }
}
