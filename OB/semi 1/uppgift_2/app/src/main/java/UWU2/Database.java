package UWU2;

interface Database {
    boolean addEmployee(int employeeId, String name, String accountNumber);
    boolean setSalary(int employeeId, double salary);
    double getSalary(int employeeId);
    String getAccountNumber(int employeeId);
}

interface PaymentSystem {
    void transfer(String fromAccount, String toAccount, double amount);
}
