package UWU2;

public class CommandParser {
    public static Command parse(String line) {
        String[] parts = line.split(",");
        try {
            switch(parts[0]) {
                case "add":
                    int id = Integer.parseInt(parts[1]);
                    String name = parts[2];
                    double salary = Double.parseDouble(parts[3]);
                    String account = parts[4];
                    return new AddEmployeeCommand(id, name, salary, account);
                case "pay":
                    int payId = Integer.parseInt(parts[1]);
                    return new PayCommand(payId);
                case "salary":
                    int salId = Integer.parseInt(parts[1]);
                    double newSalary = Double.parseDouble(parts[2]);
                    return new SalaryCommand(salId, newSalary);
                default:
                    System.out.println("Ogiltigt kommando: " + parts[0]);
                    return null;
            }
        } catch (Exception e) {
            System.out.println("Fel vid tolkning av raden: " + line);
            return null;
        }
    }
}
